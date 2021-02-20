package typings.jupyterlabCells

import typings.jupyterlabCells.inputareaMod.InputArea.IContentFactory
import typings.jupyterlabCells.inputareaMod.InputArea.IOptions
import typings.jupyterlabCells.modelMod.ICellModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.mod.CodeEditorWrapper
import typings.luminoWidgets.mod.Widget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputareaMod {
  
  @JSImport("@jupyterlab/cells/lib/inputarea", "InputArea")
  @js.native
  class InputArea protected () extends Widget {
    /**
      * Construct an input area widget.
      */
    def this(options: IOptions) = this()
    
    var _editor: js.Any = js.native
    
    var _prompt: js.Any = js.native
    
    var _rendered: js.Any = js.native
    
    /**
      * The content factory used by the widget.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * Get the CodeEditor used by the cell.
      */
    def editor: IEditor = js.native
    
    /**
      * Get the CodeEditorWrapper used by the cell.
      */
    def editorWidget: CodeEditorWrapper = js.native
    
    /**
      * The model used by the widget.
      */
    val model: ICellModel = js.native
    
    /**
      * Get the prompt node used by the cell.
      */
    def promptNode: HTMLElement = js.native
    
    /**
      * Render an input instead of the text editor.
      */
    def renderInput(widget: Widget): Unit = js.native
    
    /**
      * Set the prompt of the input area.
      */
    def setPrompt(value: String): Unit = js.native
    
    /**
      * Show the text editor.
      */
    def showEditor(): Unit = js.native
  }
  object InputArea {
    
    /**
      * Default implementation of `IContentFactory`.
      *
      * This defaults to using an `editorFactory` based on CodeMirror.
      */
    @JSImport("@jupyterlab/cells/lib/inputarea", "InputArea.ContentFactory")
    @js.native
    /**
      * Construct a `ContentFactory`.
      */
    class ContentFactory () extends IContentFactory {
      def this(options: typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions) = this()
      
      var _editor: js.Any = js.native
      
      /**
        * Return the `CodeEditor.Factory` being used.
        */
      @JSName("editorFactory")
      def editorFactory_MContentFactory: Factory = js.native
    }
    /**
      * A namespace for the input area content factory.
      */
    object ContentFactory {
      
      /**
        * Options for the content factory.
        */
      @js.native
      trait IOptions extends StObject {
        
        /**
          * The editor factory used by the content factory.
          *
          * If this is not passed, a default CodeMirror editor factory
          * will be used.
          */
        var editorFactory: js.UndefOr[Factory] = js.native
      }
      object IOptions {
        
        @scala.inline
        def apply(): typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions]
        }
        
        @scala.inline
        implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
          
          @scala.inline
          def setEditorFactoryUndefined: Self = StObject.set(x, "editorFactory", js.undefined)
        }
      }
    }
    
    /**
      * The default `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells/lib/inputarea", "InputArea.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
    
    /**
      * The default editor factory singleton based on CodeMirror.
      */
    @JSImport("@jupyterlab/cells/lib/inputarea", "InputArea.defaultEditorFactory")
    @js.native
    val defaultEditorFactory: Factory = js.native
    
    /**
      * An input area widget content factory.
      *
      * The content factory is used to create children in a way
      * that can be customized.
      */
    @js.native
    trait IContentFactory extends StObject {
      
      /**
        * Create an input prompt.
        */
      def createInputPrompt(): IInputPrompt = js.native
      
      /**
        * The editor factory we need to include in `CodeEditorWratter.IOptions`.
        *
        * This is a separate readonly attribute rather than a factory method as we need
        * to pass it around.
        */
      val editorFactory: Factory = js.native
    }
    object IContentFactory {
      
      @scala.inline
      def apply(
        createInputPrompt: () => IInputPrompt,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createInputPrompt = js.Any.fromFunction0(createInputPrompt), editorFactory = js.Any.fromFunction1(editorFactory))
        __obj.asInstanceOf[IContentFactory]
      }
      
      @scala.inline
      implicit class IContentFactoryMutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateInputPrompt(value: () => IInputPrompt): Self = StObject.set(x, "createInputPrompt", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to create an `InputArea`.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The content factory used by the widget to create children.
        *
        * Defaults to one that uses CodeMirror.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.native
      
      /**
        * The model used by the widget.
        */
      var model: ICellModel = js.native
      
      /**
        * Whether to send an update request to the editor when it is shown.
        */
      var updateOnShow: js.UndefOr[Boolean] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(model: ICellModel): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
        
        @scala.inline
        def setModel(value: ICellModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateOnShow(value: Boolean): Self = StObject.set(x, "updateOnShow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateOnShowUndefined: Self = StObject.set(x, "updateOnShow", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/inputarea", "InputPrompt")
  @js.native
  class InputPrompt () extends IInputPrompt {
    
    var _executionCount: js.Any = js.native
    
    /**
      * The execution count for the prompt.
      */
    @JSName("executionCount")
    def executionCount_MInputPrompt: String | Null = js.native
  }
  
  @js.native
  trait IInputPrompt extends Widget {
    
    /**
      * The execution count of the prompt.
      */
    var executionCount: String | Null = js.native
  }
}

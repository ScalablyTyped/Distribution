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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputareaMod {
  
  @JSImport("@jupyterlab/cells/lib/inputarea", "InputArea")
  @js.native
  class InputArea protected () extends Widget {
    /**
      * Construct an input area widget.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _editor: js.Any = js.native
    
    /* private */ var _prompt: js.Any = js.native
    
    /* private */ var _rendered: js.Any = js.native
    
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
    class ContentFactory ()
      extends StObject
         with IContentFactory {
      def this(options: typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions) = this()
      
      /* private */ var _editor: js.Any = js.native
      
      /**
        * Create an input prompt.
        */
      /* CompleteClass */
      override def createInputPrompt(): IInputPrompt = js.native
      
      /**
        * The editor factory we need to include in `CodeEditorWratter.IOptions`.
        *
        * This is a separate readonly attribute rather than a factory method as we need
        * to pass it around.
        */
      /* CompleteClass */
      override val editorFactory: Factory = js.native
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
      trait IOptions extends StObject {
        
        /**
          * The editor factory used by the content factory.
          *
          * If this is not passed, a default CodeMirror editor factory
          * will be used.
          */
        var editorFactory: js.UndefOr[Factory] = js.undefined
      }
      object IOptions {
        
        inline def apply(): typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions]
        }
        
        extension [Self <: typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions](x: Self) {
          
          inline def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
          
          inline def setEditorFactoryUndefined: Self = StObject.set(x, "editorFactory", js.undefined)
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
    trait IContentFactory extends StObject {
      
      /**
        * Create an input prompt.
        */
      def createInputPrompt(): IInputPrompt
      
      /**
        * The editor factory we need to include in `CodeEditorWratter.IOptions`.
        *
        * This is a separate readonly attribute rather than a factory method as we need
        * to pass it around.
        */
      val editorFactory: Factory
    }
    object IContentFactory {
      
      inline def apply(
        createInputPrompt: () => IInputPrompt,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createInputPrompt = js.Any.fromFunction0(createInputPrompt), editorFactory = js.Any.fromFunction1(editorFactory))
        __obj.asInstanceOf[IContentFactory]
      }
      
      extension [Self <: IContentFactory](x: Self) {
        
        inline def setCreateInputPrompt(value: () => IInputPrompt): Self = StObject.set(x, "createInputPrompt", js.Any.fromFunction0(value))
        
        inline def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to create an `InputArea`.
      */
    trait IOptions extends StObject {
      
      /**
        * The content factory used by the widget to create children.
        *
        * Defaults to one that uses CodeMirror.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
      
      /**
        * The model used by the widget.
        */
      var model: ICellModel
      
      /**
        * Whether to send an update request to the editor when it is shown.
        */
      var updateOnShow: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply(model: ICellModel): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
        
        inline def setModel(value: ICellModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setUpdateOnShow(value: Boolean): Self = StObject.set(x, "updateOnShow", value.asInstanceOf[js.Any])
        
        inline def setUpdateOnShowUndefined: Self = StObject.set(x, "updateOnShow", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/inputarea", "InputPrompt")
  @js.native
  class InputPrompt () extends IInputPrompt {
    
    /* private */ var _executionCount: js.Any = js.native
    
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

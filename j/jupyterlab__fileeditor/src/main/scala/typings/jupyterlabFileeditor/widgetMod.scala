package typings.jupyterlabFileeditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabCodeeditor.mod.CodeEditorWrapper
import typings.jupyterlabCodeeditor.tokensMod.IEditorServices
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.CodeContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.jupyterlabFileeditor.widgetMod.FileEditor.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditor")
  @js.native
  class FileEditor protected () extends Widget {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
    
    var _context: Context = js.native
    
    /**
      * Ensure that the widget has focus.
      */
    var _ensureFocus: js.Any = js.native
    
    var _mimeTypeService: js.Any = js.native
    
    /**
      * Handle a change to the path.
      */
    var _onPathChanged: js.Any = js.native
    
    /**
      * Get the context for the editor widget.
      */
    def context: Context = js.native
    
    var editor: IEditor = js.native
    
    var editorWidget: js.Any = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the widget's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    var model: IModel = js.native
    
    /**
      * A promise that resolves when the file editor is ready.
      */
    def ready: js.Promise[Unit] = js.native
  }
  object FileEditor {
    
    /**
      * The options used to create an editor widget.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The document context associated with the editor.
        */
      var context: CodeContext = js.native
      
      /**
        * A code editor factory.
        */
      var factory: Factory = js.native
      
      /**
        * The mime type service for the editor.
        */
      var mimeTypeService: IEditorMimeTypeService = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        context: CodeContext,
        factory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
        mimeTypeService: IEditorMimeTypeService
      ): IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], factory = js.Any.fromFunction1(factory), mimeTypeService = mimeTypeService.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContext(value: CodeContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
        
        @scala.inline
        def setMimeTypeService(value: IEditorMimeTypeService): Self = StObject.set(x, "mimeTypeService", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditorCodeWrapper")
  @js.native
  class FileEditorCodeWrapper protected () extends CodeEditorWrapper {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
    
    var _context: Context = js.native
    
    /**
      * Handle a change to the collaborators on the model
      * by updating UI elements associated with them.
      */
    var _onCollaboratorsChanged: js.Any = js.native
    
    /**
      * Handle a change in context model content.
      */
    var _onContentChanged: js.Any = js.native
    
    /**
      * Handle actions that should be taken when the context is ready.
      */
    var _onContextReady: js.Any = js.native
    
    var _ready: js.Any = js.native
    
    /**
      * Get the context for the editor widget.
      */
    def context: Context = js.native
    
    /**
      * A promise that resolves when the file editor is ready.
      */
    def ready: js.Promise[Unit] = js.native
  }
  
  @JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditorFactory")
  @js.native
  class FileEditorFactory protected ()
    extends ABCWidgetFactory[
          IDocumentWidget[FileEditor, typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel], 
          ICodeModel
        ] {
    /**
      * Construct a new editor widget factory.
      */
    def this(options: typings.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions) = this()
    
    var _services: js.Any = js.native
  }
  object FileEditorFactory {
    
    /**
      * The options used to create an editor widget factory.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The editor services used by the factory.
        */
      var editorServices: IEditorServices = js.native
      
      /**
        * The factory options associated with the factory.
        */
      var factoryOptions: IWidgetFactoryOptions[
            IDocumentWidget[FileEditor, typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel]
          ] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        editorServices: IEditorServices,
        factoryOptions: IWidgetFactoryOptions[
              IDocumentWidget[FileEditor, typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel]
            ]
      ): typings.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions = {
        val __obj = js.Dynamic.literal(editorServices = editorServices.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEditorServices(value: IEditorServices): Self = StObject.set(x, "editorServices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFactoryOptions(
          value: IWidgetFactoryOptions[
                  IDocumentWidget[FileEditor, typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel]
                ]
        ): Self = StObject.set(x, "factoryOptions", value.asInstanceOf[js.Any])
      }
    }
  }
}

package typings.jupyterlabNotebook

import typings.jupyterlabApputils.tokensMod.ISessionContextDialogs
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.jupyterlabNotebook.panelMod.NotebookPanel.IContentFactory
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typings.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory.IOptions
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetfactoryMod {
  
  @JSImport("@jupyterlab/notebook/lib/widgetfactory", "NotebookWidgetFactory")
  @js.native
  class NotebookWidgetFactory protected () extends ABCWidgetFactory[NotebookPanel, INotebookModel] {
    /**
      * Construct a new notebook widget factory.
      *
      * @param options - The options used to construct the factory.
      */
    def this(options: IOptions[NotebookPanel]) = this()
    
    var _editorConfig: js.Any = js.native
    
    var _notebookConfig: js.Any = js.native
    
    var _sessionDialogs: js.Any = js.native
    
    /**
      * The content factory used by the widget factory.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * A configuration object for cell editor settings.
      */
    def editorConfig: IEditorConfig = js.native
    def editorConfig_=(value: IEditorConfig): Unit = js.native
    
    /**
      * The service used to look up mime types.
      */
    val mimeTypeService: IEditorMimeTypeService = js.native
    
    /**
      * A configuration object for notebook settings.
      */
    def notebookConfig: INotebookConfig = js.native
    def notebookConfig_=(value: INotebookConfig): Unit = js.native
    
    val rendermime: IRenderMimeRegistry = js.native
  }
  object NotebookWidgetFactory {
    
    /**
      * The interface for a notebook widget factory.
      */
    @js.native
    trait IFactory extends IWidgetFactory[NotebookPanel, INotebookModel] {
      
      /**
        * A configuration object for cell editor settings.
        */
      var editorConfig: IEditorConfig = js.native
      
      /**
        * A configuration object for notebook settings.
        */
      var notebookConfig: INotebookConfig = js.native
      
      /**
        * Whether the kernel should be shutdown when the widget is closed.
        */
      @JSName("shutdownOnClose")
      var shutdownOnClose_IFactory: Boolean = js.native
    }
    
    /**
      * The options used to construct a `NotebookWidgetFactory`.
      */
    @js.native
    trait IOptions[T /* <: NotebookPanel */] extends IWidgetFactoryOptions[T] {
      
      /**
        * A notebook panel content factory.
        */
      var contentFactory: IContentFactory = js.native
      
      /**
        * The notebook cell editor configuration.
        */
      var editorConfig: js.UndefOr[IEditorConfig] = js.native
      
      /**
        * The service used to look up mime types.
        */
      var mimeTypeService: IEditorMimeTypeService = js.native
      
      /**
        * The notebook configuration.
        */
      var notebookConfig: js.UndefOr[INotebookConfig] = js.native
      
      var rendermime: IRenderMimeRegistry = js.native
      
      /**
        * The session context dialogs.
        */
      var sessionDialogs: js.UndefOr[ISessionContextDialogs] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T /* <: NotebookPanel */](
        contentFactory: IContentFactory,
        fileTypes: js.Array[String],
        mimeTypeService: IEditorMimeTypeService,
        name: String,
        rendermime: IRenderMimeRegistry
      ): IOptions[T] = {
        val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[_], T /* <: NotebookPanel */] (val x: Self with IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorConfig(value: IEditorConfig): Self = StObject.set(x, "editorConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorConfigUndefined: Self = StObject.set(x, "editorConfig", js.undefined)
        
        @scala.inline
        def setMimeTypeService(value: IEditorMimeTypeService): Self = StObject.set(x, "mimeTypeService", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotebookConfig(value: INotebookConfig): Self = StObject.set(x, "notebookConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotebookConfigUndefined: Self = StObject.set(x, "notebookConfig", js.undefined)
        
        @scala.inline
        def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionDialogs(value: ISessionContextDialogs): Self = StObject.set(x, "sessionDialogs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionDialogsUndefined: Self = StObject.set(x, "sessionDialogs", js.undefined)
      }
    }
  }
}

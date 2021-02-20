package typings.jupyterlabNotebook

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typings.jupyterlabDocregistry.mod.DocumentWidget
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.SaveState
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.jupyterlabNotebook.panelMod.NotebookPanel.IConfig
import typings.jupyterlabNotebook.widgetMod.Notebook
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel")
  @js.native
  class NotebookPanel protected () extends DocumentWidget[Notebook, INotebookModel] {
    /**
      * Construct a new notebook panel.
      */
    def this(options: IOptions[Notebook, INotebookModel]) = this()
    
    /**
      * Whether we are currently in a series of autorestarts we have already
      * notified the user about.
      */
    var _autorestarting: js.Any = js.native
    
    /**
      * Handle a change in the kernel by updating the document metadata.
      */
    var _onKernelChanged: js.Any = js.native
    
    def _onSave(sender: Context, state: SaveState): Unit = js.native
    
    var _onSessionStatusChanged: js.Any = js.native
    
    /**
      * Update the kernel language.
      */
    var _updateLanguage: js.Any = js.native
    
    /**
      * Update the kernel spec.
      */
    var _updateSpec: js.Any = js.native
    
    /**
      * The notebook used by the widget.
      */
    @JSName("content")
    val content_FNotebookPanel: Notebook = js.native
    
    /**
      * The model for the widget.
      */
    def model: INotebookModel | Null = js.native
    
    /**
      * The session context used by the panel.
      */
    def sessionContext: ISessionContext = js.native
    
    /**
      * Update the options for the current notebook panel.
      *
      * @param config new options to set
      */
    def setConfig(config: IConfig): Unit = js.native
  }
  object NotebookPanel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typings.jupyterlabNotebook.widgetMod.Notebook.ContentFactory
         with IContentFactory {
      def this(options: typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
    }
    
    /**
      * A content factory interface for NotebookPanel.
      */
    @js.native
    trait IContentFactory
      extends typings.jupyterlabNotebook.widgetMod.StaticNotebook.IContentFactory {
      
      /**
        * Create a new content area for the panel.
        */
      def createNotebook(options: typings.jupyterlabNotebook.widgetMod.Notebook.IOptions): Notebook = js.native
    }
    object IContentFactory {
      
      /**
        * The notebook renderer token.
        */
      @JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.IContentFactory")
      @js.native
      val ^ : Token[IContentFactory] = js.native
      
      @scala.inline
      implicit class IContentFactoryMutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateNotebook(value: typings.jupyterlabNotebook.widgetMod.Notebook.IOptions => Notebook): Self = StObject.set(x, "createNotebook", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Default content factory for the notebook panel.
      */
    @JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
    
    /**
      * Notebook config interface for NotebookPanel
      */
    @js.native
    trait IConfig extends StObject {
      
      /**
        * A config object for cell editors
        */
      var editorConfig: IEditorConfig = js.native
      
      /**
        * Whether to shut down the kernel when closing the panel or not
        */
      var kernelShutdown: Boolean = js.native
      
      /**
        * A config object for notebook widget
        */
      var notebookConfig: INotebookConfig = js.native
    }
    object IConfig {
      
      @scala.inline
      def apply(editorConfig: IEditorConfig, kernelShutdown: Boolean, notebookConfig: INotebookConfig): IConfig = {
        val __obj = js.Dynamic.literal(editorConfig = editorConfig.asInstanceOf[js.Any], kernelShutdown = kernelShutdown.asInstanceOf[js.Any], notebookConfig = notebookConfig.asInstanceOf[js.Any])
        __obj.asInstanceOf[IConfig]
      }
      
      @scala.inline
      implicit class IConfigMutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEditorConfig(value: IEditorConfig): Self = StObject.set(x, "editorConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKernelShutdown(value: Boolean): Self = StObject.set(x, "kernelShutdown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotebookConfig(value: INotebookConfig): Self = StObject.set(x, "notebookConfig", value.asInstanceOf[js.Any])
      }
    }
  }
}

package typings.jupyterlabNotebook

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabCells.headerfooterMod.ICellFooter
import typings.jupyterlabCells.headerfooterMod.ICellHeader
import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabCells.mod.MarkdownCell
import typings.jupyterlabCells.mod.RawCell
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typings.jupyterlabDocregistry.mod.DocumentWidget
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.SaveState
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.jupyterlabNotebook.panelMod.NotebookPanel.IConfig
import typings.jupyterlabNotebook.widgetMod.Notebook
import typings.jupyterlabNotebook.widgetMod.StaticNotebook
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    /* private */ var _autorestarting: js.Any = js.native
    
    /**
      * Handle a change in the kernel by updating the document metadata.
      */
    /* private */ var _onKernelChanged: js.Any = js.native
    
    def _onSave(sender: Context, state: SaveState): Unit = js.native
    
    /* private */ var _onSessionStatusChanged: js.Any = js.native
    
    /**
      * Update the kernel language.
      */
    /* private */ var _updateLanguage: js.Any = js.native
    
    /**
      * Update the kernel spec.
      */
    /* private */ var _updateSpec: js.Any = js.native
    
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
      
      /**
        * Create a new cell header for the parent widget.
        */
      /* CompleteClass */
      /* InferMemberOverrides */
      override def createCellFooter(): ICellFooter = js.native
      
      /**
        * Create a new cell header for the parent widget.
        */
      /* CompleteClass */
      /* InferMemberOverrides */
      override def createCellHeader(): ICellHeader = js.native
      
      /**
        * Create a new code cell widget.
        */
      /* CompleteClass */
      override def createCodeCell(options: typings.jupyterlabCells.widgetMod.CodeCell.IOptions, parent: StaticNotebook): CodeCell = js.native
      
      /**
        * Create an input prompt.
        */
      /* InferMemberOverrides */
      override def createInputPrompt(): IInputPrompt = js.native
      
      /**
        * Create a new markdown cell widget.
        */
      /* CompleteClass */
      override def createMarkdownCell(options: typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions, parent: StaticNotebook): MarkdownCell = js.native
      
      /**
        * Create a new content area for the panel.
        */
      /* CompleteClass */
      override def createNotebook(options: typings.jupyterlabNotebook.widgetMod.Notebook.IOptions): Notebook = js.native
      
      /**
        * Create an output prompt.
        */
      /* CompleteClass */
      /* InferMemberOverrides */
      override def createOutputPrompt(): IOutputPrompt = js.native
      
      /**
        * Create a new raw cell widget.
        */
      /* CompleteClass */
      override def createRawCell(options: typings.jupyterlabCells.widgetMod.RawCell.IOptions, parent: StaticNotebook): RawCell = js.native
      
      /**
        * Create an stdin widget.
        */
      /* CompleteClass */
      /* InferMemberOverrides */
      override def createStdin(options: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
      
      /**
        * The editor factory we need to include in `CodeEditorWratter.IOptions`.
        *
        * This is a separate readonly attribute rather than a factory method as we need
        * to pass it around.
        */
      /* InferMemberOverrides */
      override val editorFactory: Factory = js.native
    }
    
    /**
      * A content factory interface for NotebookPanel.
      */
    trait IContentFactory
      extends StObject
         with typings.jupyterlabNotebook.widgetMod.StaticNotebook.IContentFactory {
      
      /**
        * Create a new content area for the panel.
        */
      def createNotebook(options: typings.jupyterlabNotebook.widgetMod.Notebook.IOptions): Notebook
    }
    object IContentFactory {
      
      /**
        * The notebook renderer token.
        */
      @JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.IContentFactory")
      @js.native
      val ^ : Token[IContentFactory] = js.native
      
      extension [Self <: IContentFactory](x: Self) {
        
        inline def setCreateNotebook(value: typings.jupyterlabNotebook.widgetMod.Notebook.IOptions => Notebook): Self = StObject.set(x, "createNotebook", js.Any.fromFunction1(value))
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
    trait IConfig extends StObject {
      
      /**
        * A config object for cell editors
        */
      var editorConfig: IEditorConfig
      
      /**
        * Whether to shut down the kernel when closing the panel or not
        */
      var kernelShutdown: Boolean
      
      /**
        * A config object for notebook widget
        */
      var notebookConfig: INotebookConfig
    }
    object IConfig {
      
      inline def apply(editorConfig: IEditorConfig, kernelShutdown: Boolean, notebookConfig: INotebookConfig): IConfig = {
        val __obj = js.Dynamic.literal(editorConfig = editorConfig.asInstanceOf[js.Any], kernelShutdown = kernelShutdown.asInstanceOf[js.Any], notebookConfig = notebookConfig.asInstanceOf[js.Any])
        __obj.asInstanceOf[IConfig]
      }
      
      extension [Self <: IConfig](x: Self) {
        
        inline def setEditorConfig(value: IEditorConfig): Self = StObject.set(x, "editorConfig", value.asInstanceOf[js.Any])
        
        inline def setKernelShutdown(value: Boolean): Self = StObject.set(x, "kernelShutdown", value.asInstanceOf[js.Any])
        
        inline def setNotebookConfig(value: INotebookConfig): Self = StObject.set(x, "notebookConfig", value.asInstanceOf[js.Any])
      }
    }
  }
}

package typings.jupyterlabConsole

import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabCells.headerfooterMod.ICellFooter
import typings.jupyterlabCells.headerfooterMod.ICellHeader
import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabCells.mod.RawCell
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory
import typings.jupyterlabConsole.panelMod.ConsolePanel.IOptions
import typings.jupyterlabConsole.widgetMod.CodeConsole
import typings.jupyterlabConsole.widgetMod.CodeConsole.IModelFactory
import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.Panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("@jupyterlab/console/lib/panel", "ConsolePanel")
  @js.native
  class ConsolePanel protected () extends MainAreaWidget[Panel] {
    /**
      * Construct a console panel.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _connected: js.Any = js.native
    
    /* private */ var _executed: js.Any = js.native
    
    /**
      * Handle a console execution.
      */
    /* private */ var _onExecuted: js.Any = js.native
    
    /* private */ var _sessionContext: js.Any = js.native
    
    /**
      * Update the console panel title.
      */
    /* private */ var _updateTitlePanel: js.Any = js.native
    
    /**
      * The console widget used by the panel.
      */
    var console: CodeConsole = js.native
    
    /**
      * The content factory used by the console panel.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * The session used by the panel.
      */
    def sessionContext: ISessionContext = js.native
  }
  object ConsolePanel {
    
    /**
      * Default implementation of `IContentFactory`.
      */
    @JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typings.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory
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
      override def createCodeCell(options: typings.jupyterlabCells.widgetMod.CodeCell.IOptions): CodeCell = js.native
      
      /**
        * Create a new console panel.
        */
      /* CompleteClass */
      override def createConsole(options: typings.jupyterlabConsole.widgetMod.CodeConsole.IOptions): CodeConsole = js.native
      
      /**
        * Create an input prompt.
        */
      /* InferMemberOverrides */
      override def createInputPrompt(): IInputPrompt = js.native
      
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
      override def createRawCell(options: typings.jupyterlabCells.widgetMod.RawCell.IOptions): RawCell = js.native
      
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
      * A namespace for the console panel content factory.
      */
    object ContentFactory {
      
      /**
        * Options for the code console content factory.
        */
      type IOptions = typings.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory.IOptions
    }
    
    /**
      * The console panel renderer.
      */
    trait IContentFactory
      extends StObject
         with typings.jupyterlabConsole.widgetMod.CodeConsole.IContentFactory {
      
      /**
        * Create a new console panel.
        */
      def createConsole(options: typings.jupyterlabConsole.widgetMod.CodeConsole.IOptions): CodeConsole
    }
    object IContentFactory {
      
      /**
        * The console renderer token.
        */
      @JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.IContentFactory")
      @js.native
      val ^ : Token[IContentFactory] = js.native
      
      extension [Self <: IContentFactory](x: Self) {
        
        inline def setCreateConsole(value: typings.jupyterlabConsole.widgetMod.CodeConsole.IOptions => CodeConsole): Self = StObject.set(x, "createConsole", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * A default code console content factory.
      */
    @JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.defaultContentFactory")
    @js.native
    val defaultContentFactory: IContentFactory = js.native
    
    /**
      * The initialization options for a console panel.
      */
    trait IOptions extends StObject {
      
      /**
        * The base path for a new console.
        */
      var basePath: js.UndefOr[String] = js.undefined
      
      /**
        * The content factory for the panel.
        */
      var contentFactory: IContentFactory
      
      /**
        * A kernel preference.
        */
      var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
      
      /**
        * The service manager used by the panel.
        */
      var manager: IManager
      
      /**
        * The service used to look up mime types.
        */
      var mimeTypeService: IEditorMimeTypeService
      
      /**
        * The model factory for the console widget.
        */
      var modelFactory: js.UndefOr[IModelFactory] = js.undefined
      
      /**
        * The name of the console.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The path of an existing console.
        */
      var path: js.UndefOr[String] = js.undefined
      
      /**
        * The rendermime instance used by the panel.
        */
      var rendermime: IRenderMimeRegistry
      
      /**
        * An existing session context to use.
        */
      var sessionContext: js.UndefOr[ISessionContext] = js.undefined
      
      /**
        * A function to call when the kernel is busy.
        */
      var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
    }
    object IOptions {
      
      inline def apply(
        contentFactory: IContentFactory,
        manager: IManager,
        mimeTypeService: IEditorMimeTypeService,
        rendermime: IRenderMimeRegistry
      ): IOptions = {
        val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setKernelPreference(value: IKernelPreference): Self = StObject.set(x, "kernelPreference", value.asInstanceOf[js.Any])
        
        inline def setKernelPreferenceUndefined: Self = StObject.set(x, "kernelPreference", js.undefined)
        
        inline def setManager(value: IManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        inline def setMimeTypeService(value: IEditorMimeTypeService): Self = StObject.set(x, "mimeTypeService", value.asInstanceOf[js.Any])
        
        inline def setModelFactory(value: IModelFactory): Self = StObject.set(x, "modelFactory", value.asInstanceOf[js.Any])
        
        inline def setModelFactoryUndefined: Self = StObject.set(x, "modelFactory", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        inline def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
        
        inline def setSessionContextUndefined: Self = StObject.set(x, "sessionContext", js.undefined)
        
        inline def setSetBusy(value: () => IDisposable): Self = StObject.set(x, "setBusy", js.Any.fromFunction0(value))
        
        inline def setSetBusyUndefined: Self = StObject.set(x, "setBusy", js.undefined)
      }
    }
  }
}

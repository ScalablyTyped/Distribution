package typings.jupyterlabConsole

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
import typings.jupyterlabConsole.libPanelMod.ConsolePanel.IContentFactory
import typings.jupyterlabConsole.libPanelMod.ConsolePanel.IOptions
import typings.jupyterlabConsole.libWidgetMod.CodeConsole
import typings.jupyterlabConsole.libWidgetMod.CodeConsole.IModelFactory
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.Panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelMod {
  
  @JSImport("@jupyterlab/console/lib/panel", "ConsolePanel")
  @js.native
  open class ConsolePanel protected () extends MainAreaWidget[Panel] {
    /**
      * Construct a console panel.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _connected: Any = js.native
    
    /* private */ var _executed: Any = js.native
    
    /**
      * Handle a console execution.
      */
    /* private */ var _onExecuted: Any = js.native
    
    /* private */ var _sessionContext: Any = js.native
    
    /**
      * Update the console panel title.
      */
    /* private */ var _updateTitlePanel: Any = js.native
    
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
    
    var translator: ITranslator = js.native
  }
  object ConsolePanel {
    
    /**
      * Default implementation of `IContentFactory`.
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.jupyterlabCells.libInputareaMod.InputArea.IContentFactory because Already inherited
    - typings.jupyterlabCells.libWidgetMod.Cell.IContentFactory because Already inherited
    - typings.jupyterlabConsole.libWidgetMod.CodeConsole.IContentFactory because Already inherited
    - typings.jupyterlabConsole.libPanelMod.ConsolePanel.IContentFactory because Already inherited typings.jupyterlabOutputarea.libWidgetMod.OutputArea.IContentFactory */ @JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    open class ContentFactory ()
      extends typings.jupyterlabConsole.libWidgetMod.CodeConsole.ContentFactory {
      def this(options: typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions) = this()
      
      /**
        * Create a new console panel.
        */
      def createConsole(options: typings.jupyterlabConsole.libWidgetMod.CodeConsole.IOptions): CodeConsole = js.native
    }
    /**
      * A namespace for the console panel content factory.
      */
    object ContentFactory {
      
      /**
        * Options for the code console content factory.
        */
      type IOptions = typings.jupyterlabConsole.libWidgetMod.CodeConsole.ContentFactory.IOptions
    }
    
    /**
      * The console panel renderer.
      */
    trait IContentFactory
      extends StObject
         with typings.jupyterlabConsole.libWidgetMod.CodeConsole.IContentFactory {
      
      /**
        * Create a new console panel.
        */
      def createConsole(options: typings.jupyterlabConsole.libWidgetMod.CodeConsole.IOptions): CodeConsole
    }
    object IContentFactory {
      
      /**
        * The console renderer token.
        */
      @JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.IContentFactory")
      @js.native
      val ^ : Token[IContentFactory] = js.native
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        inline def setCreateConsole(value: typings.jupyterlabConsole.libWidgetMod.CodeConsole.IOptions => CodeConsole): Self = StObject.set(x, "createConsole", js.Any.fromFunction1(value))
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
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
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
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}

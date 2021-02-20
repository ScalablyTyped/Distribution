package typings.jupyterlabConsole

import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory
import typings.jupyterlabConsole.panelMod.ConsolePanel.IOptions
import typings.jupyterlabConsole.widgetMod.CodeConsole
import typings.jupyterlabConsole.widgetMod.CodeConsole.IModelFactory
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.Panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("@jupyterlab/console/lib/panel", "ConsolePanel")
  @js.native
  class ConsolePanel protected () extends MainAreaWidget[Panel] {
    /**
      * Construct a console panel.
      */
    def this(options: IOptions) = this()
    
    var _connected: js.Any = js.native
    
    var _executed: js.Any = js.native
    
    /**
      * Handle a console execution.
      */
    var _onExecuted: js.Any = js.native
    
    var _sessionContext: js.Any = js.native
    
    /**
      * Update the console panel title.
      */
    var _updateTitlePanel: js.Any = js.native
    
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
    @js.native
    trait IContentFactory
      extends typings.jupyterlabConsole.widgetMod.CodeConsole.IContentFactory {
      
      /**
        * Create a new console panel.
        */
      def createConsole(options: typings.jupyterlabConsole.widgetMod.CodeConsole.IOptions): CodeConsole = js.native
    }
    object IContentFactory {
      
      /**
        * The console renderer token.
        */
      @JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.IContentFactory")
      @js.native
      val ^ : Token[IContentFactory] = js.native
      
      @scala.inline
      implicit class IContentFactoryMutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateConsole(value: typings.jupyterlabConsole.widgetMod.CodeConsole.IOptions => CodeConsole): Self = StObject.set(x, "createConsole", js.Any.fromFunction1(value))
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The base path for a new console.
        */
      var basePath: js.UndefOr[String] = js.native
      
      /**
        * The content factory for the panel.
        */
      var contentFactory: IContentFactory = js.native
      
      /**
        * A kernel preference.
        */
      var kernelPreference: js.UndefOr[IKernelPreference] = js.native
      
      /**
        * The service manager used by the panel.
        */
      var manager: IManager = js.native
      
      /**
        * The service used to look up mime types.
        */
      var mimeTypeService: IEditorMimeTypeService = js.native
      
      /**
        * The model factory for the console widget.
        */
      var modelFactory: js.UndefOr[IModelFactory] = js.native
      
      /**
        * The name of the console.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * The path of an existing console.
        */
      var path: js.UndefOr[String] = js.native
      
      /**
        * The rendermime instance used by the panel.
        */
      var rendermime: IRenderMimeRegistry = js.native
      
      /**
        * An existing session context to use.
        */
      var sessionContext: js.UndefOr[ISessionContext] = js.native
      
      /**
        * A function to call when the kernel is busy.
        */
      var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        contentFactory: IContentFactory,
        manager: IManager,
        mimeTypeService: IEditorMimeTypeService,
        rendermime: IRenderMimeRegistry
      ): IOptions = {
        val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
        
        @scala.inline
        def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKernelPreference(value: IKernelPreference): Self = StObject.set(x, "kernelPreference", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKernelPreferenceUndefined: Self = StObject.set(x, "kernelPreference", js.undefined)
        
        @scala.inline
        def setManager(value: IManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeTypeService(value: IEditorMimeTypeService): Self = StObject.set(x, "mimeTypeService", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelFactory(value: IModelFactory): Self = StObject.set(x, "modelFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelFactoryUndefined: Self = StObject.set(x, "modelFactory", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionContextUndefined: Self = StObject.set(x, "sessionContext", js.undefined)
        
        @scala.inline
        def setSetBusy(value: () => IDisposable): Self = StObject.set(x, "setBusy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetBusyUndefined: Self = StObject.set(x, "setBusy", js.undefined)
      }
    }
  }
}

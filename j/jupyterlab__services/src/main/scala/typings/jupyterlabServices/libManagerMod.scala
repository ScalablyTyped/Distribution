package typings.jupyterlabServices

import typings.jupyterlabServices.builderMod.BuildManager
import typings.jupyterlabServices.contentsMod.Contents.IDrive
import typings.jupyterlabServices.contentsMod.ContentsManager
import typings.jupyterlabServices.kernelspecMod.KernelSpecManager
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.jupyterlabServices.libManagerMod.ServiceManager.IOptions
import typings.jupyterlabServices.nbconvertMod.NbConvertManager
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.sessionMod.SessionManager
import typings.jupyterlabServices.settingMod.SettingManager
import typings.jupyterlabServices.terminalMod.TerminalManager
import typings.jupyterlabServices.workspaceMod.WorkspaceManager
import typings.luminoDisposable.mod.IDisposable
import typings.luminoPolling.pollMod.Poll.Standby
import typings.luminoSignaling.mod.ISignal
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libManagerMod {
  
  @JSImport("@jupyterlab/services/lib/manager", "ServiceManager")
  @js.native
  /**
    * Construct a new services provider.
    */
  class ServiceManager () extends IManager {
    def this(options: IOptions) = this()
    
    var _connectionFailure: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _isReady: js.Any = js.native
    
    var _onConnectionFailure: js.Any = js.native
    
    var _readyPromise: js.Any = js.native
    
    /**
      * The builder for the manager.
      */
    @JSName("builder")
    val builder_ServiceManager: BuildManager = js.native
    
    /**
      * A signal emitted when there is a connection failure with the kernel.
      */
    @JSName("connectionFailure")
    def connectionFailure_MServiceManager: ISignal[this.type, Error] = js.native
    
    /**
      * Get the contents manager instance.
      */
    @JSName("contents")
    val contents_ServiceManager: ContentsManager = js.native
    
    /**
      * Test whether the service manager is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MServiceManager: Boolean = js.native
    
    /**
      * Test whether the manager is ready.
      */
    @JSName("isReady")
    def isReady_MServiceManager: Boolean = js.native
    
    /**
      * Get the session manager instance.
      */
    @JSName("kernelspecs")
    val kernelspecs_ServiceManager: KernelSpecManager = js.native
    
    /**
      * Get the nbconvert manager instance.
      */
    @JSName("nbconvert")
    val nbconvert_ServiceManager: NbConvertManager = js.native
    
    /**
      * A promise that fulfills when the manager is ready.
      */
    @JSName("ready")
    def ready_MServiceManager: js.Promise[Unit] = js.native
    
    /**
      * Get the session manager instance.
      */
    @JSName("sessions")
    val sessions_ServiceManager: SessionManager = js.native
    
    /**
      * Get the setting manager instance.
      */
    @JSName("settings")
    val settings_ServiceManager: SettingManager = js.native
    
    /**
      * Get the terminal manager instance.
      */
    @JSName("terminals")
    val terminals_ServiceManager: TerminalManager = js.native
    
    /**
      * Get the workspace manager instance.
      */
    @JSName("workspaces")
    val workspaces_ServiceManager: WorkspaceManager = js.native
  }
  object ServiceManager {
    
    /**
      * A service manager interface.
      */
    @js.native
    trait IManager extends IDisposable {
      
      /**
        * The builder for the manager.
        */
      val builder: typings.jupyterlabServices.builderMod.Builder.IManager = js.native
      
      /**
        * A signal emitted when there is a connection failure with the server.
        */
      val connectionFailure: ISignal[IManager, Error] = js.native
      
      /**
        * The contents manager for the manager.
        */
      val contents: typings.jupyterlabServices.contentsMod.Contents.IManager = js.native
      
      /**
        * Test whether the manager is ready.
        */
      val isReady: Boolean = js.native
      
      /**
        * The session manager for the manager.
        */
      val kernelspecs: typings.jupyterlabServices.kernelspecKernelspecMod.IManager = js.native
      
      /**
        * The nbconvert manager for the manager.
        */
      val nbconvert: typings.jupyterlabServices.nbconvertMod.NbConvert.IManager = js.native
      
      /**
        * A promise that fulfills when the manager is initially ready.
        */
      val ready: js.Promise[Unit] = js.native
      
      /**
        * The server settings of the manager.
        */
      val serverSettings: ISettings = js.native
      
      /**
        * The session manager for the manager.
        */
      val sessions: typings.jupyterlabServices.sessionSessionMod.IManager = js.native
      
      /**
        * The setting manager for the manager.
        */
      val settings: typings.jupyterlabServices.settingMod.Setting.IManager = js.native
      
      /**
        * The terminals manager for the manager.
        */
      val terminals: typings.jupyterlabServices.terminalTerminalMod.IManager = js.native
      
      /**
        * The workspace manager for the manager.
        */
      val workspaces: typings.jupyterlabServices.workspaceMod.Workspace.IManager = js.native
    }
    object IManager {
      
      @scala.inline
      def apply(
        builder: typings.jupyterlabServices.builderMod.Builder.IManager,
        connectionFailure: ISignal[IManager, Error],
        contents: typings.jupyterlabServices.contentsMod.Contents.IManager,
        dispose: () => Unit,
        isDisposed: Boolean,
        isReady: Boolean,
        kernelspecs: typings.jupyterlabServices.kernelspecKernelspecMod.IManager,
        nbconvert: typings.jupyterlabServices.nbconvertMod.NbConvert.IManager,
        ready: js.Promise[Unit],
        serverSettings: ISettings,
        sessions: typings.jupyterlabServices.sessionSessionMod.IManager,
        settings: typings.jupyterlabServices.settingMod.Setting.IManager,
        terminals: typings.jupyterlabServices.terminalTerminalMod.IManager,
        workspaces: typings.jupyterlabServices.workspaceMod.Workspace.IManager
      ): IManager = {
        val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any], connectionFailure = connectionFailure.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], kernelspecs = kernelspecs.asInstanceOf[js.Any], nbconvert = nbconvert.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], terminals = terminals.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
        __obj.asInstanceOf[IManager]
      }
      
      @scala.inline
      implicit class IManagerMutableBuilder[Self <: IManager] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBuilder(value: typings.jupyterlabServices.builderMod.Builder.IManager): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionFailure(value: ISignal[IManager, Error]): Self = StObject.set(x, "connectionFailure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContents(value: typings.jupyterlabServices.contentsMod.Contents.IManager): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKernelspecs(value: typings.jupyterlabServices.kernelspecKernelspecMod.IManager): Self = StObject.set(x, "kernelspecs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNbconvert(value: typings.jupyterlabServices.nbconvertMod.NbConvert.IManager): Self = StObject.set(x, "nbconvert", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReady(value: js.Promise[Unit]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessions(value: typings.jupyterlabServices.sessionSessionMod.IManager): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSettings(value: typings.jupyterlabServices.settingMod.Setting.IManager): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTerminals(value: typings.jupyterlabServices.terminalTerminalMod.IManager): Self = StObject.set(x, "terminals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaces(value: typings.jupyterlabServices.workspaceMod.Workspace.IManager): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to create a service manager.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The default drive for the contents manager.
        */
      val defaultDrive: js.UndefOr[IDrive] = js.native
      
      /**
        * The server settings of the manager.
        */
      val serverSettings: js.UndefOr[ISettings] = js.native
      
      /**
        * When the manager stops polling the API. Defaults to `when-hidden`.
        */
      var standby: js.UndefOr[Standby] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultDrive(value: IDrive): Self = StObject.set(x, "defaultDrive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDriveUndefined: Self = StObject.set(x, "defaultDrive", js.undefined)
        
        @scala.inline
        def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
        
        @scala.inline
        def setStandby(value: Standby): Self = StObject.set(x, "standby", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStandbyUndefined: Self = StObject.set(x, "standby", js.undefined)
      }
    }
  }
}

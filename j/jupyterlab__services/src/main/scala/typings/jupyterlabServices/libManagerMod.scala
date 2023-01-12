package typings.jupyterlabServices

import typings.jupyterlabServices.libBuilderMod.BuildManager
import typings.jupyterlabServices.libContentsMod.Contents.IDrive
import typings.jupyterlabServices.libContentsMod.ContentsManager
import typings.jupyterlabServices.libKernelspecMod.KernelSpecManager
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.jupyterlabServices.libManagerMod.ServiceManager.IOptions
import typings.jupyterlabServices.libNbconvertMod.NbConvertManager
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.libSessionMod.SessionManager
import typings.jupyterlabServices.libSettingMod.SettingManager
import typings.jupyterlabServices.libTerminalMod.TerminalManager
import typings.jupyterlabServices.libWorkspaceMod.WorkspaceManager
import typings.luminoDisposable.mod.IDisposable
import typings.luminoPolling.typesPollMod.Poll.Standby
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libManagerMod {
  
  @JSImport("@jupyterlab/services/lib/manager", "ServiceManager")
  @js.native
  /**
    * Construct a new services provider.
    */
  open class ServiceManager ()
    extends StObject
       with IManager {
    def this(options: IOptions) = this()
    
    /* private */ var _connectionFailure: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _isReady: Any = js.native
    
    /* private */ var _onConnectionFailure: Any = js.native
    
    /* private */ var _readyPromise: Any = js.native
    
    /**
      * The builder for the manager.
      */
    /* CompleteClass */
    override val builder: typings.jupyterlabServices.libBuilderMod.Builder.IManager = js.native
    /**
      * The builder for the manager.
      */
    @JSName("builder")
    val builder_ServiceManager: BuildManager = js.native
    
    /**
      * A signal emitted when there is a connection failure with the server.
      */
    /* CompleteClass */
    override val connectionFailure: ISignal[IManager, js.Error] = js.native
    /**
      * A signal emitted when there is a connection failure with the kernel.
      */
    @JSName("connectionFailure")
    def connectionFailure_MServiceManager: ISignal[this.type, js.Error] = js.native
    
    /**
      * The contents manager for the manager.
      */
    /* CompleteClass */
    override val contents: typings.jupyterlabServices.libContentsMod.Contents.IManager = js.native
    /**
      * Get the contents manager instance.
      */
    @JSName("contents")
    val contents_ServiceManager: ContentsManager = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the service manager is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MServiceManager: Boolean = js.native
    
    /**
      * Test whether the manager is ready.
      */
    /* CompleteClass */
    override val isReady: Boolean = js.native
    /**
      * Test whether the manager is ready.
      */
    @JSName("isReady")
    def isReady_MServiceManager: Boolean = js.native
    
    /**
      * The session manager for the manager.
      */
    /* CompleteClass */
    override val kernelspecs: typings.jupyterlabServices.libKernelspecKernelspecMod.IManager = js.native
    /**
      * Get the session manager instance.
      */
    @JSName("kernelspecs")
    val kernelspecs_ServiceManager: KernelSpecManager = js.native
    
    /**
      * The nbconvert manager for the manager.
      */
    /* CompleteClass */
    override val nbconvert: typings.jupyterlabServices.libNbconvertMod.NbConvert.IManager = js.native
    /**
      * Get the nbconvert manager instance.
      */
    @JSName("nbconvert")
    val nbconvert_ServiceManager: NbConvertManager = js.native
    
    /**
      * A promise that fulfills when the manager is initially ready.
      */
    /* CompleteClass */
    override val ready: js.Promise[Unit] = js.native
    /**
      * A promise that fulfills when the manager is ready.
      */
    @JSName("ready")
    def ready_MServiceManager: js.Promise[Unit] = js.native
    
    /**
      * The server settings of the manager.
      */
    /* CompleteClass */
    override val serverSettings: ISettings = js.native
    
    /**
      * The session manager for the manager.
      */
    /* CompleteClass */
    override val sessions: typings.jupyterlabServices.libSessionSessionMod.IManager = js.native
    /**
      * Get the session manager instance.
      */
    @JSName("sessions")
    val sessions_ServiceManager: SessionManager = js.native
    
    /**
      * The setting manager for the manager.
      */
    /* CompleteClass */
    override val settings: typings.jupyterlabServices.libSettingMod.Setting.IManager = js.native
    /**
      * Get the setting manager instance.
      */
    @JSName("settings")
    val settings_ServiceManager: SettingManager = js.native
    
    /**
      * The terminals manager for the manager.
      */
    /* CompleteClass */
    override val terminals: typings.jupyterlabServices.libTerminalTerminalMod.IManager = js.native
    /**
      * Get the terminal manager instance.
      */
    @JSName("terminals")
    val terminals_ServiceManager: TerminalManager = js.native
    
    /**
      * The workspace manager for the manager.
      */
    /* CompleteClass */
    override val workspaces: typings.jupyterlabServices.libWorkspaceMod.Workspace.IManager = js.native
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
    trait IManager
      extends StObject
         with IDisposable {
      
      /**
        * The builder for the manager.
        */
      val builder: typings.jupyterlabServices.libBuilderMod.Builder.IManager
      
      /**
        * A signal emitted when there is a connection failure with the server.
        */
      val connectionFailure: ISignal[IManager, js.Error]
      
      /**
        * The contents manager for the manager.
        */
      val contents: typings.jupyterlabServices.libContentsMod.Contents.IManager
      
      /**
        * Test whether the manager is ready.
        */
      val isReady: Boolean
      
      /**
        * The session manager for the manager.
        */
      val kernelspecs: typings.jupyterlabServices.libKernelspecKernelspecMod.IManager
      
      /**
        * The nbconvert manager for the manager.
        */
      val nbconvert: typings.jupyterlabServices.libNbconvertMod.NbConvert.IManager
      
      /**
        * A promise that fulfills when the manager is initially ready.
        */
      val ready: js.Promise[Unit]
      
      /**
        * The server settings of the manager.
        */
      val serverSettings: ISettings
      
      /**
        * The session manager for the manager.
        */
      val sessions: typings.jupyterlabServices.libSessionSessionMod.IManager
      
      /**
        * The setting manager for the manager.
        */
      val settings: typings.jupyterlabServices.libSettingMod.Setting.IManager
      
      /**
        * The terminals manager for the manager.
        */
      val terminals: typings.jupyterlabServices.libTerminalTerminalMod.IManager
      
      /**
        * The workspace manager for the manager.
        */
      val workspaces: typings.jupyterlabServices.libWorkspaceMod.Workspace.IManager
    }
    object IManager {
      
      inline def apply(
        builder: typings.jupyterlabServices.libBuilderMod.Builder.IManager,
        connectionFailure: ISignal[IManager, js.Error],
        contents: typings.jupyterlabServices.libContentsMod.Contents.IManager,
        dispose: () => Unit,
        isDisposed: Boolean,
        isReady: Boolean,
        kernelspecs: typings.jupyterlabServices.libKernelspecKernelspecMod.IManager,
        nbconvert: typings.jupyterlabServices.libNbconvertMod.NbConvert.IManager,
        ready: js.Promise[Unit],
        serverSettings: ISettings,
        sessions: typings.jupyterlabServices.libSessionSessionMod.IManager,
        settings: typings.jupyterlabServices.libSettingMod.Setting.IManager,
        terminals: typings.jupyterlabServices.libTerminalTerminalMod.IManager,
        workspaces: typings.jupyterlabServices.libWorkspaceMod.Workspace.IManager
      ): IManager = {
        val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any], connectionFailure = connectionFailure.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], kernelspecs = kernelspecs.asInstanceOf[js.Any], nbconvert = nbconvert.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], terminals = terminals.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
        __obj.asInstanceOf[IManager]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IManager] (val x: Self) extends AnyVal {
        
        inline def setBuilder(value: typings.jupyterlabServices.libBuilderMod.Builder.IManager): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
        
        inline def setConnectionFailure(value: ISignal[IManager, js.Error]): Self = StObject.set(x, "connectionFailure", value.asInstanceOf[js.Any])
        
        inline def setContents(value: typings.jupyterlabServices.libContentsMod.Contents.IManager): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
        
        inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
        
        inline def setKernelspecs(value: typings.jupyterlabServices.libKernelspecKernelspecMod.IManager): Self = StObject.set(x, "kernelspecs", value.asInstanceOf[js.Any])
        
        inline def setNbconvert(value: typings.jupyterlabServices.libNbconvertMod.NbConvert.IManager): Self = StObject.set(x, "nbconvert", value.asInstanceOf[js.Any])
        
        inline def setReady(value: js.Promise[Unit]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setSessions(value: typings.jupyterlabServices.libSessionSessionMod.IManager): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
        
        inline def setSettings(value: typings.jupyterlabServices.libSettingMod.Setting.IManager): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
        
        inline def setTerminals(value: typings.jupyterlabServices.libTerminalTerminalMod.IManager): Self = StObject.set(x, "terminals", value.asInstanceOf[js.Any])
        
        inline def setWorkspaces(value: typings.jupyterlabServices.libWorkspaceMod.Workspace.IManager): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to create a service manager.
      */
    trait IOptions extends StObject {
      
      /**
        * The default drive for the contents manager.
        */
      val defaultDrive: js.UndefOr[IDrive] = js.undefined
      
      /**
        * The server settings of the manager.
        */
      val serverSettings: js.UndefOr[ISettings] = js.undefined
      
      /**
        * When the manager stops polling the API. Defaults to `when-hidden`.
        */
      var standby: js.UndefOr[Standby] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setDefaultDrive(value: IDrive): Self = StObject.set(x, "defaultDrive", value.asInstanceOf[js.Any])
        
        inline def setDefaultDriveUndefined: Self = StObject.set(x, "defaultDrive", js.undefined)
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
        
        inline def setStandby(value: Standby): Self = StObject.set(x, "standby", value.asInstanceOf[js.Any])
        
        inline def setStandbyUndefined: Self = StObject.set(x, "standby", js.undefined)
      }
    }
  }
}

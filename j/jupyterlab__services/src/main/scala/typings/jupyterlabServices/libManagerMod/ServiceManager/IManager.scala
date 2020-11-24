package typings.jupyterlabServices.libManagerMod.ServiceManager

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IManagerOps[Self <: IManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuilder(value: typings.jupyterlabServices.builderMod.Builder.IManager): Self = this.set("builder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFailure(value: ISignal[IManager, Error]): Self = this.set("connectionFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContents(value: typings.jupyterlabServices.contentsMod.Contents.IManager): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReady(value: Boolean): Self = this.set("isReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelspecs(value: typings.jupyterlabServices.kernelspecKernelspecMod.IManager): Self = this.set("kernelspecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbconvert(value: typings.jupyterlabServices.nbconvertMod.NbConvert.IManager): Self = this.set("nbconvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: js.Promise[Unit]): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSettings(value: ISettings): Self = this.set("serverSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessions(value: typings.jupyterlabServices.sessionSessionMod.IManager): Self = this.set("sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: typings.jupyterlabServices.settingMod.Setting.IManager): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminals(value: typings.jupyterlabServices.terminalTerminalMod.IManager): Self = this.set("terminals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaces(value: typings.jupyterlabServices.workspaceMod.Workspace.IManager): Self = this.set("workspaces", value.asInstanceOf[js.Any])
  }
}

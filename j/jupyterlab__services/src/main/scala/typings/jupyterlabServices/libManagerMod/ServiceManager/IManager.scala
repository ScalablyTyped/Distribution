package typings.jupyterlabServices.libManagerMod.ServiceManager

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service manager interface.
  */
trait IManager extends IDisposable {
  /**
    * The builder for the manager.
    */
  val builder: typings.jupyterlabServices.builderMod.Builder.IManager
  /**
    * A signal emitted when there is a connection failure with the server.
    */
  val connectionFailure: ISignal[IManager, Error]
  /**
    * The contents manager for the manager.
    */
  val contents: typings.jupyterlabServices.contentsMod.Contents.IManager
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean
  /**
    * The session manager for the manager.
    */
  val kernelspecs: typings.jupyterlabServices.kernelspecKernelspecMod.IManager
  /**
    * The nbconvert manager for the manager.
    */
  val nbconvert: typings.jupyterlabServices.nbconvertMod.NbConvert.IManager
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
  val sessions: typings.jupyterlabServices.sessionSessionMod.IManager
  /**
    * The setting manager for the manager.
    */
  val settings: typings.jupyterlabServices.settingMod.Setting.IManager
  /**
    * The terminals manager for the manager.
    */
  val terminals: typings.jupyterlabServices.terminalTerminalMod.IManager
  /**
    * The workspace manager for the manager.
    */
  val workspaces: typings.jupyterlabServices.workspaceMod.Workspace.IManager
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
}


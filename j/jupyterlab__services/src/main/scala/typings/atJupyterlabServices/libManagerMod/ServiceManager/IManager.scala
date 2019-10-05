package typings.atJupyterlabServices.libManagerMod.ServiceManager

import typings.atJupyterlabServices.libKernelKernelMod.Kernel.ISpecModels
import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
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
  val builder: typings.atJupyterlabServices.libBuilderMod.Builder.IManager
  /**
    * A signal emitted when there is a connection failure with the server.
    */
  val connectionFailure: ISignal[IManager, Error]
  /**
    * The contents manager for the manager.
    */
  val contents: typings.atJupyterlabServices.libContentsMod.Contents.IManager
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean
  /**
    * The nbconvert manager for the manager.
    */
  val nbconvert: typings.atJupyterlabServices.libNbconvertMod.NbConvert.IManager
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
  val sessions: typings.atJupyterlabServices.libSessionSessionMod.Session.IManager
  /**
    * The setting manager for the manager.
    */
  val settings: typings.atJupyterlabServices.libSettingMod.Setting.IManager
  /**
    * The kernel spec models.
    */
  val specs: ISpecModels | Null
  /**
    * A signal emitted when the kernel specs change.
    */
  val specsChanged: ISignal[IManager, ISpecModels]
  /**
    * The terminals manager for the manager.
    */
  val terminals: typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession.IManager
  /**
    * The workspace manager for the manager.
    */
  val workspaces: typings.atJupyterlabServices.libWorkspaceMod.Workspace.IManager
}

object IManager {
  @scala.inline
  def apply(
    builder: typings.atJupyterlabServices.libBuilderMod.Builder.IManager,
    connectionFailure: ISignal[IManager, Error],
    contents: typings.atJupyterlabServices.libContentsMod.Contents.IManager,
    dispose: () => Unit,
    isDisposed: Boolean,
    isReady: Boolean,
    nbconvert: typings.atJupyterlabServices.libNbconvertMod.NbConvert.IManager,
    ready: js.Promise[Unit],
    serverSettings: ISettings,
    sessions: typings.atJupyterlabServices.libSessionSessionMod.Session.IManager,
    settings: typings.atJupyterlabServices.libSettingMod.Setting.IManager,
    specsChanged: ISignal[IManager, ISpecModels],
    terminals: typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession.IManager,
    workspaces: typings.atJupyterlabServices.libWorkspaceMod.Workspace.IManager,
    specs: ISpecModels = null
  ): IManager = {
    val __obj = js.Dynamic.literal(builder = builder, connectionFailure = connectionFailure, contents = contents, dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed, isReady = isReady, nbconvert = nbconvert, ready = ready, serverSettings = serverSettings, sessions = sessions, settings = settings, specsChanged = specsChanged, terminals = terminals, workspaces = workspaces)
    if (specs != null) __obj.updateDynamic("specs")(specs)
    __obj.asInstanceOf[IManager]
  }
}


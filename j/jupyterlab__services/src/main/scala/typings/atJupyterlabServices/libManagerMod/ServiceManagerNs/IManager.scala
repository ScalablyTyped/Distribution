package typings.atJupyterlabServices.libManagerMod.ServiceManagerNs

import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.ISpecModels
import typings.atJupyterlabServices.libServerconnectionMod.ServerConnectionNs.ISettings
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
  val builder: typings.atJupyterlabServices.libBuilderMod.BuilderNs.IManager
  /**
    * A signal emitted when there is a connection failure with the server.
    */
  val connectionFailure: ISignal[IManager, Error]
  /**
    * The contents manager for the manager.
    */
  val contents: typings.atJupyterlabServices.libContentsMod.ContentsNs.IManager
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean
  /**
    * The nbconvert manager for the manager.
    */
  val nbconvert: typings.atJupyterlabServices.libNbconvertMod.NbConvertNs.IManager
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
  val sessions: typings.atJupyterlabServices.libSessionSessionMod.SessionNs.IManager
  /**
    * The setting manager for the manager.
    */
  val settings: typings.atJupyterlabServices.libSettingMod.SettingNs.IManager
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
  val terminals: typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.IManager
  /**
    * The workspace manager for the manager.
    */
  val workspaces: typings.atJupyterlabServices.libWorkspaceMod.WorkspaceNs.IManager
}

object IManager {
  @scala.inline
  def apply(
    builder: typings.atJupyterlabServices.libBuilderMod.BuilderNs.IManager,
    connectionFailure: ISignal[IManager, Error],
    contents: typings.atJupyterlabServices.libContentsMod.ContentsNs.IManager,
    dispose: () => Unit,
    isDisposed: Boolean,
    isReady: Boolean,
    nbconvert: typings.atJupyterlabServices.libNbconvertMod.NbConvertNs.IManager,
    ready: js.Promise[Unit],
    serverSettings: ISettings,
    sessions: typings.atJupyterlabServices.libSessionSessionMod.SessionNs.IManager,
    settings: typings.atJupyterlabServices.libSettingMod.SettingNs.IManager,
    specsChanged: ISignal[IManager, ISpecModels],
    terminals: typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.IManager,
    workspaces: typings.atJupyterlabServices.libWorkspaceMod.WorkspaceNs.IManager,
    specs: ISpecModels = null
  ): IManager = {
    val __obj = js.Dynamic.literal(builder = builder, connectionFailure = connectionFailure, contents = contents, dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed, isReady = isReady, nbconvert = nbconvert, ready = ready, serverSettings = serverSettings, sessions = sessions, settings = settings, specsChanged = specsChanged, terminals = terminals, workspaces = workspaces)
    if (specs != null) __obj.updateDynamic("specs")(specs)
    __obj.asInstanceOf[IManager]
  }
}


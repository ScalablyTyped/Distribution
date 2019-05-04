package typings
package atJupyterlabServicesLib.libManagerMod.ServiceManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service manager interface.
  */
trait IManager
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * The builder for the manager.
    */
  val builder: atJupyterlabServicesLib.libBuilderMod.BuilderNs.IManager
  /**
    * The contents manager for the manager.
    */
  val contents: atJupyterlabServicesLib.libContentsMod.ContentsNs.IManager
  /**
    * Test whether the manager is ready.
    */
  val isReady: scala.Boolean
  /**
    * The nbconvert manager for the manager.
    */
  val nbconvert: atJupyterlabServicesLib.libNbconvertMod.NbConvertNs.IManager
  /**
    * A promise that fulfills when the manager is initially ready.
    */
  val ready: js.Promise[scala.Unit]
  /**
    * The server settings of the manager.
    */
  val serverSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings
  /**
    * The session manager for the manager.
    */
  val sessions: atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IManager
  /**
    * The setting manager for the manager.
    */
  val settings: atJupyterlabServicesLib.libSettingMod.SettingNs.IManager
  /**
    * The kernel spec models.
    */
  val specs: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModels | scala.Null
  /**
    * A signal emitted when the kernel specs change.
    */
  val specsChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IManager, atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModels]
  /**
    * The terminals manager for the manager.
    */
  val terminals: atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IManager
  /**
    * The workspace manager for the manager.
    */
  val workspaces: atJupyterlabServicesLib.libWorkspaceMod.WorkspaceNs.IManager
}

object IManager {
  @scala.inline
  def apply(
    builder: atJupyterlabServicesLib.libBuilderMod.BuilderNs.IManager,
    contents: atJupyterlabServicesLib.libContentsMod.ContentsNs.IManager,
    dispose: () => scala.Unit,
    isDisposed: scala.Boolean,
    isReady: scala.Boolean,
    nbconvert: atJupyterlabServicesLib.libNbconvertMod.NbConvertNs.IManager,
    ready: js.Promise[scala.Unit],
    serverSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings,
    sessions: atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IManager,
    settings: atJupyterlabServicesLib.libSettingMod.SettingNs.IManager,
    specsChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IManager, atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModels],
    terminals: atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IManager,
    workspaces: atJupyterlabServicesLib.libWorkspaceMod.WorkspaceNs.IManager,
    specs: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModels = null
  ): IManager = {
    val __obj = js.Dynamic.literal(builder = builder, contents = contents, dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed, isReady = isReady, nbconvert = nbconvert, ready = ready, serverSettings = serverSettings, sessions = sessions, settings = settings, specsChanged = specsChanged, terminals = terminals, workspaces = workspaces)
    if (specs != null) __obj.updateDynamic("specs")(specs)
    __obj.asInstanceOf[IManager]
  }
}


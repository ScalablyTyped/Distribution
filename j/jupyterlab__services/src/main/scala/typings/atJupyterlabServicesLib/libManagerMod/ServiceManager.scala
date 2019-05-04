package typings
package atJupyterlabServicesLib.libManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/manager", "ServiceManager")
@js.native
/**
  * Construct a new services provider.
  */
class ServiceManager ()
  extends atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IManager {
  def this(options: atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IOptions) = this()
  var _isDisposed: js.Any = js.native
  var _isReady: js.Any = js.native
  var _readyPromise: js.Any = js.native
  var _specsChanged: js.Any = js.native
  /**
    * The builder for the manager.
    */
  /* CompleteClass */
  override val builder: atJupyterlabServicesLib.libBuilderMod.BuilderNs.IManager = js.native
  /**
    * The builder for the manager.
    */
  @JSName("builder")
  val builder_ServiceManager: atJupyterlabServicesLib.libBuilderMod.BuildManager = js.native
  /**
    * The contents manager for the manager.
    */
  /* CompleteClass */
  override val contents: atJupyterlabServicesLib.libContentsMod.ContentsNs.IManager = js.native
  /**
    * Get the contents manager instance.
    */
  @JSName("contents")
  val contents_ServiceManager: atJupyterlabServicesLib.libContentsMod.ContentsManager = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * Test whether the manager is ready.
    */
  /* CompleteClass */
  override val isReady: scala.Boolean = js.native
  /**
    * The nbconvert manager for the manager.
    */
  /* CompleteClass */
  override val nbconvert: atJupyterlabServicesLib.libNbconvertMod.NbConvertNs.IManager = js.native
  /**
    * Get the nbconvert manager instance.
    */
  @JSName("nbconvert")
  val nbconvert_ServiceManager: atJupyterlabServicesLib.libNbconvertMod.NbConvertManager = js.native
  /**
    * A promise that fulfills when the manager is initially ready.
    */
  /* CompleteClass */
  override val ready: js.Promise[scala.Unit] = js.native
  /**
    * The server settings of the manager.
    */
  /* CompleteClass */
  override val serverSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = js.native
  /**
    * The session manager for the manager.
    */
  /* CompleteClass */
  override val sessions: atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IManager = js.native
  /**
    * Get the session manager instance.
    */
  @JSName("sessions")
  val sessions_ServiceManager: atJupyterlabServicesLib.libSessionMod.SessionManager = js.native
  /**
    * The setting manager for the manager.
    */
  /* CompleteClass */
  override val settings: atJupyterlabServicesLib.libSettingMod.SettingNs.IManager = js.native
  /**
    * Get the setting manager instance.
    */
  @JSName("settings")
  val settings_ServiceManager: atJupyterlabServicesLib.libSettingMod.SettingManager = js.native
  /**
    * The kernel spec models.
    */
  /* CompleteClass */
  override val specs: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModels | scala.Null = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  /* CompleteClass */
  override val specsChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IManager, 
    atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModels
  ] = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  @JSName("specsChanged")
  val specsChanged_ServiceManager: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModels] = js.native
  /**
    * The terminals manager for the manager.
    */
  /* CompleteClass */
  override val terminals: atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IManager = js.native
  /**
    * Get the terminal manager instance.
    */
  @JSName("terminals")
  val terminals_ServiceManager: atJupyterlabServicesLib.libTerminalMod.TerminalManager = js.native
  /**
    * The workspace manager for the manager.
    */
  /* CompleteClass */
  override val workspaces: atJupyterlabServicesLib.libWorkspaceMod.WorkspaceNs.IManager = js.native
  /**
    * Get the workspace manager instance.
    */
  @JSName("workspaces")
  val workspaces_ServiceManager: atJupyterlabServicesLib.libWorkspaceMod.WorkspaceManager = js.native
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
  override def dispose(): scala.Unit = js.native
}


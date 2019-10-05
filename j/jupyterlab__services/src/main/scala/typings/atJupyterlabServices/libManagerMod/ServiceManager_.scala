package typings.atJupyterlabServices.libManagerMod

import typings.atJupyterlabServices.libBuilderMod.BuildManager
import typings.atJupyterlabServices.libContentsMod.ContentsManager
import typings.atJupyterlabServices.libKernelKernelMod.Kernel.ISpecModels
import typings.atJupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.atJupyterlabServices.libManagerMod.ServiceManager.IOptions
import typings.atJupyterlabServices.libNbconvertMod.NbConvertManager
import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.atJupyterlabServices.libSessionMod.SessionManager
import typings.atJupyterlabServices.libSettingMod.SettingManager
import typings.atJupyterlabServices.libTerminalMod.TerminalManager
import typings.atJupyterlabServices.libWorkspaceMod.WorkspaceManager
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/manager", "ServiceManager")
@js.native
/**
  * Construct a new services provider.
  */
class ServiceManager_ () extends IManager {
  def this(options: IOptions) = this()
  var _connectionFailure: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isReady: js.Any = js.native
  var _onConnectionFailure: js.Any = js.native
  var _readyPromise: js.Any = js.native
  var _specsChanged: js.Any = js.native
  /**
    * The builder for the manager.
    */
  /* CompleteClass */
  override val builder: typings.atJupyterlabServices.libBuilderMod.Builder.IManager = js.native
  /**
    * The builder for the manager.
    */
  @JSName("builder")
  val builder_ServiceManager_ : BuildManager = js.native
  /**
    * A signal emitted when there is a connection failure with the server.
    */
  /* CompleteClass */
  override val connectionFailure: ISignal[IManager, Error] = js.native
  /**
    * A signal emitted when there is a connection failure with the kernel.
    */
  @JSName("connectionFailure")
  val connectionFailure_ServiceManager_ : ISignal[this.type, Error] = js.native
  /**
    * The contents manager for the manager.
    */
  /* CompleteClass */
  override val contents: typings.atJupyterlabServices.libContentsMod.Contents.IManager = js.native
  /**
    * Get the contents manager instance.
    */
  @JSName("contents")
  val contents_ServiceManager_ : ContentsManager = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Test whether the manager is ready.
    */
  /* CompleteClass */
  override val isReady: Boolean = js.native
  /**
    * The nbconvert manager for the manager.
    */
  /* CompleteClass */
  override val nbconvert: typings.atJupyterlabServices.libNbconvertMod.NbConvert.IManager = js.native
  /**
    * Get the nbconvert manager instance.
    */
  @JSName("nbconvert")
  val nbconvert_ServiceManager_ : NbConvertManager = js.native
  /**
    * A promise that fulfills when the manager is initially ready.
    */
  /* CompleteClass */
  override val ready: js.Promise[Unit] = js.native
  /**
    * The server settings of the manager.
    */
  /* CompleteClass */
  override val serverSettings: ISettings = js.native
  /**
    * The session manager for the manager.
    */
  /* CompleteClass */
  override val sessions: typings.atJupyterlabServices.libSessionSessionMod.Session.IManager = js.native
  /**
    * Get the session manager instance.
    */
  @JSName("sessions")
  val sessions_ServiceManager_ : SessionManager = js.native
  /**
    * The setting manager for the manager.
    */
  /* CompleteClass */
  override val settings: typings.atJupyterlabServices.libSettingMod.Setting.IManager = js.native
  /**
    * Get the setting manager instance.
    */
  @JSName("settings")
  val settings_ServiceManager_ : SettingManager = js.native
  /**
    * The kernel spec models.
    */
  /* CompleteClass */
  override val specs: ISpecModels | Null = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  /* CompleteClass */
  override val specsChanged: ISignal[IManager, ISpecModels] = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  @JSName("specsChanged")
  val specsChanged_ServiceManager_ : ISignal[this.type, ISpecModels] = js.native
  /**
    * The terminals manager for the manager.
    */
  /* CompleteClass */
  override val terminals: typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession.IManager = js.native
  /**
    * Get the terminal manager instance.
    */
  @JSName("terminals")
  val terminals_ServiceManager_ : TerminalManager = js.native
  /**
    * The workspace manager for the manager.
    */
  /* CompleteClass */
  override val workspaces: typings.atJupyterlabServices.libWorkspaceMod.Workspace.IManager = js.native
  /**
    * Get the workspace manager instance.
    */
  @JSName("workspaces")
  val workspaces_ServiceManager_ : WorkspaceManager = js.native
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
}


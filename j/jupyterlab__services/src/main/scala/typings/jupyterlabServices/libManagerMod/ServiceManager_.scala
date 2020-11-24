package typings.jupyterlabServices.libManagerMod

import typings.jupyterlabServices.builderMod.BuildManager
import typings.jupyterlabServices.contentsMod.ContentsManager
import typings.jupyterlabServices.kernelspecMod.KernelSpecManager
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.jupyterlabServices.libManagerMod.ServiceManager.IOptions
import typings.jupyterlabServices.nbconvertMod.NbConvertManager
import typings.jupyterlabServices.sessionMod.SessionManager
import typings.jupyterlabServices.settingMod.SettingManager
import typings.jupyterlabServices.terminalMod.TerminalManager
import typings.jupyterlabServices.workspaceMod.WorkspaceManager
import typings.luminoSignaling.mod.ISignal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * The builder for the manager.
    */
  @JSName("builder")
  val builder_ServiceManager_ : BuildManager = js.native
  
  /**
    * A signal emitted when there is a connection failure with the kernel.
    */
  @JSName("connectionFailure")
  def connectionFailure_MServiceManager_ : ISignal[this.type, Error] = js.native
  
  /**
    * Get the contents manager instance.
    */
  @JSName("contents")
  val contents_ServiceManager_ : ContentsManager = js.native
  
  /**
    * Test whether the service manager is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MServiceManager_ : Boolean = js.native
  
  /**
    * Test whether the manager is ready.
    */
  @JSName("isReady")
  def isReady_MServiceManager_ : Boolean = js.native
  
  /**
    * Get the session manager instance.
    */
  @JSName("kernelspecs")
  val kernelspecs_ServiceManager_ : KernelSpecManager = js.native
  
  /**
    * Get the nbconvert manager instance.
    */
  @JSName("nbconvert")
  val nbconvert_ServiceManager_ : NbConvertManager = js.native
  
  /**
    * A promise that fulfills when the manager is ready.
    */
  @JSName("ready")
  def ready_MServiceManager_ : js.Promise[Unit] = js.native
  
  /**
    * Get the session manager instance.
    */
  @JSName("sessions")
  val sessions_ServiceManager_ : SessionManager = js.native
  
  /**
    * Get the setting manager instance.
    */
  @JSName("settings")
  val settings_ServiceManager_ : SettingManager = js.native
  
  /**
    * Get the terminal manager instance.
    */
  @JSName("terminals")
  val terminals_ServiceManager_ : TerminalManager = js.native
  
  /**
    * Get the workspace manager instance.
    */
  @JSName("workspaces")
  val workspaces_ServiceManager_ : WorkspaceManager = js.native
}

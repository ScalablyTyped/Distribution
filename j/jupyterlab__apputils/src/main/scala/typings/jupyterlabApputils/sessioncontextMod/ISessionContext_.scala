package typings.jupyterlabApputils.sessioncontextMod

import typings.jupyterlabApputils.anon.PartialIModel
import typings.jupyterlabApputils.jupyterlabApputilsStrings.kernel
import typings.jupyterlabApputils.jupyterlabApputilsStrings.session
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.KernelDisplayStatus
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabServices.kernelKernelMod.ConnectionStatus
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.MessageType
import typings.jupyterlabServices.messagesMod.Status
import typings.jupyterlabServices.sessionSessionMod.IManager
import typings.jupyterlabServices.sessionSessionMod.ISessionConnection
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISessionContext_ extends IObservableDisposable {
  
  /**
    * Change the kernel associated with the session.
    *
    * @param options The optional kernel model parameters to use for the new kernel.
    *
    * @returns A promise that resolves with the new kernel connection.
    */
  def changeKernel(): js.Promise[IKernelConnection | Null] = js.native
  def changeKernel(options: PartialIModel): js.Promise[IKernelConnection | Null] = js.native
  
  /**
    * A signal emitted when the kernel connection status changes, proxied from the session connection.
    */
  val connectionStatusChanged: ISignal[this.type, ConnectionStatus] = js.native
  
  /**
    * Initialize the session context.
    *
    * @returns A promise that resolves with whether to ask the user to select a kernel.
    *
    * #### Notes
    * This includes starting up an initial kernel if needed.
    */
  def initialize(): js.Promise[Boolean] = js.native
  
  /**
    * A signal emitted for a kernel messages, proxied from the session connection.
    */
  val iopubMessage: ISignal[this.type, IMessage[MessageType]] = js.native
  
  /**
    * Whether the session context is ready.
    */
  val isReady: Boolean = js.native
  
  /**
    * Whether the session context is restarting.
    */
  val isRestarting: Boolean = js.native
  
  /**
    * Whether the session context is terminating.
    */
  val isTerminating: Boolean = js.native
  
  /**
    * A signal emitted when the kernel changes, proxied from the session connection.
    */
  val kernelChanged: ISignal[
    this.type, 
    IChangedArgs[IKernelConnection | Null, IKernelConnection | Null, kernel]
  ] = js.native
  
  /**
    * The sensible display name for the kernel, or Private.NO_KERNEL
    *
    * #### Notes
    * This is at this level since the underlying kernel connection does not
    * have access to the kernel spec manager.
    */
  val kernelDisplayName: String = js.native
  
  /**
    * A sensible status to display
    *
    * #### Notes
    * This combines the status and connection status into a single status for the user.
    */
  val kernelDisplayStatus: KernelDisplayStatus = js.native
  
  /**
    * The kernel preference for starting new kernels.
    */
  var kernelPreference: IKernelPreference = js.native
  
  /**
    * The session name.
    *
    * #### Notes
    * Typically `.session.name` should be used. This attribute is useful if
    * there is no current session.
    */
  val name: String = js.native
  
  /**
    * The session path.
    *
    * #### Notes
    * Typically `.session.path` should be used. This attribute is useful if
    * there is no current session.
    */
  val path: String = js.native
  
  /**
    * The previous kernel name.
    */
  val prevKernelName: String = js.native
  
  /**
    * A signal emitted when a session property changes, proxied from the session connection.
    */
  val propertyChanged: ISignal[
    this.type, 
    typings.jupyterlabApputils.jupyterlabApputilsStrings.path | typings.jupyterlabApputils.jupyterlabApputilsStrings.name | typings.jupyterlabApputils.jupyterlabApputilsStrings.`type`
  ] = js.native
  
  /**
    * A promise that is fulfilled when the session context is ready.
    */
  val ready: js.Promise[Unit] = js.native
  
  /**
    * Restart the current Kernel.
    *
    * @returns A promise that resolves when the kernel is restarted.
    */
  def restartKernel(): js.Promise[Unit] = js.native
  
  /**
    * The current session connection.
    */
  var session: ISessionConnection | Null = js.native
  
  /**
    * A signal emitted when the session connection changes.
    */
  val sessionChanged: ISignal[
    this.type, 
    IChangedArgs[ISessionConnection | Null, ISessionConnection | Null, session]
  ] = js.native
  
  /**
    * The session manager used by the session.
    */
  val sessionManager: IManager = js.native
  
  /**
    * Kill the kernel and shutdown the session.
    *
    * @returns A promise that resolves when the session is shut down.
    */
  def shutdown(): js.Promise[Unit] = js.native
  
  /**
    * The kernel spec manager
    */
  val specsManager: typings.jupyterlabServices.kernelspecKernelspecMod.IManager = js.native
  
  /**
    * A signal emitted when the kernel status changes, proxied from the session connection.
    */
  val statusChanged: ISignal[this.type, Status] = js.native
  
  /**
    * The session type.
    *
    * #### Notes
    * Typically `.session.type` should be used. This attribute is useful if
    * there is no current session.
    */
  val `type`: String = js.native
  
  /**
    * A signal emitted for an unhandled kernel message, proxied from the session connection.
    */
  val unhandledMessage: ISignal[this.type, IMessage[MessageType]] = js.native
}

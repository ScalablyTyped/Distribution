package typings.jupyterlabApputils.clientsessionMod

import typings.jupyterlabApputils.clientsessionMod.IClientSession.IKernelPreference
import typings.jupyterlabApputils.jupyterlabApputilsStrings.`type`
import typings.jupyterlabApputils.jupyterlabApputilsStrings.name
import typings.jupyterlabApputils.jupyterlabApputilsStrings.path
import typings.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import typings.jupyterlabServices.kernelKernelMod.Kernel.IModel
import typings.jupyterlabServices.kernelKernelMod.Kernel.Status
import typings.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typings.jupyterlabServices.messagesMod.KernelMessage.MessageType
import typings.jupyterlabServices.sessionSessionMod.Session.IKernelChangedArgs
import typings.phosphorDisposable.mod.IDisposable
import typings.phosphorSignaling.mod.ISignal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientSession_ extends IDisposable {
  /**
    * A signal emitted for a kernel messages.
    */
  val iopubMessage: ISignal[this.type, IMessage[MessageType]]
  /**
    * Whether the session is ready.
    */
  val isReady: Boolean
  /**
    * The current kernel associated with the document.
    */
  val kernel: IKernelConnection | Null
  /**
    * A signal emitted when the kernel changes.
    */
  val kernelChanged: ISignal[this.type, IKernelChangedArgs]
  /**
    * The display name of the kernel.
    */
  val kernelDisplayName: String
  /**
    * The kernel preference.
    */
  var kernelPreference: IKernelPreference
  /**
    * The current name associated with the client session.
    */
  val name: String
  /**
    * The current path associated with the client session.
    */
  val path: String
  /**
    * A signal emitted when a session property changes.
    */
  val propertyChanged: ISignal[
    this.type, 
    typings.jupyterlabApputils.jupyterlabApputilsStrings.path | typings.jupyterlabApputils.jupyterlabApputilsStrings.name | typings.jupyterlabApputils.jupyterlabApputilsStrings.`type`
  ]
  /**
    * A promise that is fulfilled when the session is ready.
    */
  val ready: js.Promise[Unit]
  /**
    * The current status of the client session.
    */
  val status: Status
  /**
    * A signal emitted when the kernel status changes.
    */
  val statusChanged: ISignal[this.type, Status]
  /**
    * A signal emitted when the session is shut down.
    */
  val terminated: ISignal[this.type, Unit]
  /**
    * The type of the client session.
    */
  val `type`: String
  /**
    * A signal emitted for an unhandled kernel message.
    */
  val unhandledMessage: ISignal[this.type, IMessage[MessageType]]
  /**
    * Change the current kernel associated with the document.
    */
  def changeKernel(options: Partial[IModel]): js.Promise[IKernelConnection]
  /**
    * Restart the session.
    *
    * @returns A promise that resolves with whether the kernel has restarted.
    *
    * #### Notes
    * If there is a running kernel, present a dialog.
    * If there is no kernel, we start a kernel with the last run
    * kernel name and resolves with `true`. If no kernel has been started,
    * this is a no-op, and resolves with `false`.
    */
  def restart(): js.Promise[Boolean]
  /**
    * Select a kernel for the session.
    */
  def selectKernel(): js.Promise[Unit]
  /**
    * Change the session name.
    */
  def setName(name: String): js.Promise[Unit]
  /**
    * Change the session path.
    *
    * @param path - The new session path.
    *
    * @returns A promise that resolves when the session has renamed.
    *
    * #### Notes
    * This uses the Jupyter REST API, and the response is validated.
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def setPath(path: String): js.Promise[Unit]
  /**
    * Change the session type.
    */
  def setType(`type`: String): js.Promise[Unit]
  /**
    * Kill the kernel and shutdown the session.
    *
    * @returns A promise that resolves when the session is shut down.
    */
  def shutdown(): js.Promise[Unit]
}

object IClientSession_ {
  @scala.inline
  def apply(
    changeKernel: Partial[IModel] => js.Promise[IKernelConnection],
    dispose: () => Unit,
    iopubMessage: ISignal[IClientSession_, IMessage[MessageType]],
    isDisposed: Boolean,
    isReady: Boolean,
    kernelChanged: ISignal[IClientSession_, IKernelChangedArgs],
    kernelDisplayName: String,
    kernelPreference: IKernelPreference,
    name: String,
    path: String,
    propertyChanged: ISignal[IClientSession_, path | name | `type`],
    ready: js.Promise[Unit],
    restart: () => js.Promise[Boolean],
    selectKernel: () => js.Promise[Unit],
    setName: String => js.Promise[Unit],
    setPath: String => js.Promise[Unit],
    setType: String => js.Promise[Unit],
    shutdown: () => js.Promise[Unit],
    status: Status,
    statusChanged: ISignal[IClientSession_, Status],
    terminated: ISignal[IClientSession_, Unit],
    `type`: String,
    unhandledMessage: ISignal[IClientSession_, IMessage[MessageType]],
    kernel: IKernelConnection = null
  ): IClientSession_ = {
    val __obj = js.Dynamic.literal(changeKernel = js.Any.fromFunction1(changeKernel), dispose = js.Any.fromFunction0(dispose), iopubMessage = iopubMessage.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], kernelChanged = kernelChanged.asInstanceOf[js.Any], kernelDisplayName = kernelDisplayName.asInstanceOf[js.Any], kernelPreference = kernelPreference.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyChanged = propertyChanged.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], restart = js.Any.fromFunction0(restart), selectKernel = js.Any.fromFunction0(selectKernel), setName = js.Any.fromFunction1(setName), setPath = js.Any.fromFunction1(setPath), setType = js.Any.fromFunction1(setType), shutdown = js.Any.fromFunction0(shutdown), status = status.asInstanceOf[js.Any], statusChanged = statusChanged.asInstanceOf[js.Any], terminated = terminated.asInstanceOf[js.Any], unhandledMessage = unhandledMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (kernel != null) __obj.updateDynamic("kernel")(kernel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientSession_]
  }
}


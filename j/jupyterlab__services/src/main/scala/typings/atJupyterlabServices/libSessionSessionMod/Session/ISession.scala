package typings.atJupyterlabServices.libSessionSessionMod.Session

import typings.atJupyterlabServices.atJupyterlabServicesStrings.`type`
import typings.atJupyterlabServices.atJupyterlabServicesStrings.name
import typings.atJupyterlabServices.atJupyterlabServicesStrings.path
import typings.atJupyterlabServices.libKernelKernelMod.Kernel.IAnyMessageArgs
import typings.atJupyterlabServices.libKernelKernelMod.Kernel.IKernelConnection
import typings.atJupyterlabServices.libKernelKernelMod.Kernel.Status
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IIOPubMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOPubMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.MessageType
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of a session object.
  */
trait ISession extends IDisposable {
  /**
    * A signal emitted for any kernel message.
    *
    * Note: The behavior is undefined if the message is modified
    * during message handling. As such, it should be treated as read-only.
    */
  var anyMessage: ISignal[this.type, IAnyMessageArgs]
  /**
    * Unique id of the session.
    */
  val id: String
  /**
    * A signal emitted for iopub kernel messages.
    */
  var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]]
  /**
    * The kernel.
    *
    * #### Notes
    * This is a read-only property, and can be altered by [changeKernel].
    */
  val kernel: IKernelConnection
  /**
    * A signal emitted when the kernel changes.
    */
  var kernelChanged: ISignal[this.type, IKernelChangedArgs]
  /**
    * The model associated with the session.
    */
  val model: IModel
  /**
    * The current name associated with the session.
    */
  val name: String
  /**
    * The current path associated with the session.
    */
  val path: String
  /**
    * A signal emitted when a session property changes.
    */
  val propertyChanged: ISignal[
    this.type, 
    typings.atJupyterlabServices.atJupyterlabServicesStrings.path | typings.atJupyterlabServices.atJupyterlabServicesStrings.name | typings.atJupyterlabServices.atJupyterlabServicesStrings.`type`
  ]
  /**
    * The server settings of the session.
    */
  val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  /**
    * The current status of the session.
    *
    * #### Notes
    * This is a delegate to the kernel status.
    */
  val status: Status
  /**
    * A signal emitted when the session status changes.
    */
  var statusChanged: ISignal[this.type, Status]
  /**
    * A signal emitted when the session is shut down.
    */
  var terminated: ISignal[this.type, Unit]
  /**
    * The type of the session.
    */
  val `type`: String
  /**
    * A signal emitted for unhandled kernel message.
    */
  var unhandledMessage: ISignal[this.type, IMessage[MessageType]]
  /**
    * Change the kernel.
    *
    * @param options - The name or id of the new kernel.
    *
    * @returns A promise that resolves with the new kernel model.
    *
    * #### Notes
    * This shuts down the existing kernel and creates a new kernel,
    * keeping the existing session ID and path.
    */
  def changeKernel(options: Partial[typings.atJupyterlabServices.libKernelKernelMod.Kernel.IModel]): js.Promise[IKernelConnection]
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
    *
    * #### Notes
    * This uses the Jupyter REST API, and the response is validated.
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def shutdown(): js.Promise[Unit]
}

object ISession {
  @scala.inline
  def apply(
    anyMessage: ISignal[ISession, IAnyMessageArgs],
    changeKernel: Partial[typings.atJupyterlabServices.libKernelKernelMod.Kernel.IModel] => js.Promise[IKernelConnection],
    dispose: () => Unit,
    id: String,
    iopubMessage: ISignal[ISession, IIOPubMessage[IOPubMessageType]],
    isDisposed: Boolean,
    kernel: IKernelConnection,
    kernelChanged: ISignal[ISession, IKernelChangedArgs],
    model: IModel,
    name: String,
    path: String,
    propertyChanged: ISignal[ISession, path | name | `type`],
    serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any,
    setName: String => js.Promise[Unit],
    setPath: String => js.Promise[Unit],
    setType: String => js.Promise[Unit],
    shutdown: () => js.Promise[Unit],
    status: Status,
    statusChanged: ISignal[ISession, Status],
    terminated: ISignal[ISession, Unit],
    `type`: String,
    unhandledMessage: ISignal[ISession, IMessage[MessageType]]
  ): ISession = {
    val __obj = js.Dynamic.literal(anyMessage = anyMessage, changeKernel = js.Any.fromFunction1(changeKernel), dispose = js.Any.fromFunction0(dispose), id = id, iopubMessage = iopubMessage, isDisposed = isDisposed, kernel = kernel, kernelChanged = kernelChanged, model = model, name = name, path = path, propertyChanged = propertyChanged, serverSettings = serverSettings, setName = js.Any.fromFunction1(setName), setPath = js.Any.fromFunction1(setPath), setType = js.Any.fromFunction1(setType), shutdown = js.Any.fromFunction0(shutdown), status = status, statusChanged = statusChanged, terminated = terminated, unhandledMessage = unhandledMessage)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISession]
  }
}


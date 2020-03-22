package typings.jupyterlabServices.sessionSessionMod

import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabServices.PartialIModelId
import typings.jupyterlabServices.jupyterlabServicesStrings.`type`
import typings.jupyterlabServices.jupyterlabServicesStrings.kernel
import typings.jupyterlabServices.jupyterlabServicesStrings.name
import typings.jupyterlabServices.jupyterlabServicesStrings.path
import typings.jupyterlabServices.kernelKernelMod.ConnectionStatus
import typings.jupyterlabServices.kernelKernelMod.IAnyMessageArgs
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabServices.messagesMod.IIOPubMessage
import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.IOPubMessageType
import typings.jupyterlabServices.messagesMod.MessageType
import typings.jupyterlabServices.messagesMod.Status
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionConnection_ extends IObservableDisposable {
  /**
    * The kernel anyMessage signal, proxied from the current kernel.
    */
  var anyMessage: ISignal[this.type, IAnyMessageArgs]
  /**
    * The kernel connectionStatusChanged signal, proxied from the current
    * kernel.
    */
  var connectionStatusChanged: ISignal[this.type, ConnectionStatus]
  /**
    * Unique id of the session.
    */
  val id: String
  /**
    * The kernel iopubMessage signal, proxied from the current kernel.
    */
  var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]]
  /**
    * The kernel.
    *
    * #### Notes
    * This is a read-only property, and can be altered by [changeKernel].
    *
    * A number of kernel signals are proxied through the session from
    * whatever the current kernel is for convenience.
    */
  val kernel: IKernelConnection | Null
  /**
    * A signal emitted when the kernel changes.
    */
  var kernelChanged: ISignal[
    this.type, 
    IChangedArgs[
      IKernelConnection | Null, 
      IKernelConnection | Null, 
      typings.jupyterlabServices.jupyterlabServicesStrings.kernel
    ]
  ]
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
    typings.jupyterlabServices.jupyterlabServicesStrings.path | typings.jupyterlabServices.jupyterlabServicesStrings.name | typings.jupyterlabServices.jupyterlabServicesStrings.`type`
  ]
  /**
    * The server settings of the session.
    */
  val serverSettings: ISettings
  /**
    * The kernel statusChanged signal, proxied from the current kernel.
    */
  var statusChanged: ISignal[this.type, Status]
  /**
    * The type of the session.
    */
  val `type`: String
  /**
    * The kernel unhandledMessage signal, proxied from the current kernel.
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
    * This shuts down the existing kernel and creates a new kernel, keeping
    * the existing session ID and path. The session assumes it owns the
    * kernel.
    *
    * To start now kernel, pass an empty dictionary.
    */
  def changeKernel(options: PartialIModelId): js.Promise[IKernelConnection | Null]
  /**
    * Change the session name.
    *
    * @returns A promise that resolves when the session has renamed.
    *
    * #### Notes
    * This uses the Jupyter REST API, and the response is validated.
    * The promise is fulfilled on a valid response and rejected otherwise.
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
    *
    * @returns A promise that resolves when the session has renamed.
    *
    * #### Notes
    * This uses the Jupyter REST API, and the response is validated.
    * The promise is fulfilled on a valid response and rejected otherwise.
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

object ISessionConnection_ {
  @scala.inline
  def apply(
    anyMessage: ISignal[ISessionConnection_, IAnyMessageArgs],
    changeKernel: PartialIModelId => js.Promise[IKernelConnection | Null],
    connectionStatusChanged: ISignal[ISessionConnection_, ConnectionStatus],
    dispose: () => Unit,
    disposed: ISignal[ISessionConnection_, Unit],
    id: String,
    iopubMessage: ISignal[ISessionConnection_, IIOPubMessage[IOPubMessageType]],
    isDisposed: Boolean,
    kernelChanged: ISignal[
      ISessionConnection_, 
      IChangedArgs[IKernelConnection | Null, IKernelConnection | Null, kernel]
    ],
    model: IModel,
    name: String,
    path: String,
    propertyChanged: ISignal[ISessionConnection_, path | name | `type`],
    serverSettings: ISettings,
    setName: String => js.Promise[Unit],
    setPath: String => js.Promise[Unit],
    setType: String => js.Promise[Unit],
    shutdown: () => js.Promise[Unit],
    statusChanged: ISignal[ISessionConnection_, Status],
    `type`: String,
    unhandledMessage: ISignal[ISessionConnection_, IMessage[MessageType]],
    kernel: IKernelConnection = null
  ): ISessionConnection_ = {
    val __obj = js.Dynamic.literal(anyMessage = anyMessage.asInstanceOf[js.Any], changeKernel = js.Any.fromFunction1(changeKernel), connectionStatusChanged = connectionStatusChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iopubMessage = iopubMessage.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], kernelChanged = kernelChanged.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyChanged = propertyChanged.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], setName = js.Any.fromFunction1(setName), setPath = js.Any.fromFunction1(setPath), setType = js.Any.fromFunction1(setType), shutdown = js.Any.fromFunction0(shutdown), statusChanged = statusChanged.asInstanceOf[js.Any], unhandledMessage = unhandledMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (kernel != null) __obj.updateDynamic("kernel")(kernel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionConnection_]
  }
}


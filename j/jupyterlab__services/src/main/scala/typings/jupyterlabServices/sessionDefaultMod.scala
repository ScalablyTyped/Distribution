package typings.jupyterlabServices

import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabServices.anon.PartialIModelId
import typings.jupyterlabServices.kernelKernelMod.ConnectionStatus
import typings.jupyterlabServices.kernelKernelMod.IAnyMessageArgs
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabServices.messagesMod.IIOPubMessage
import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.IOPubMessageType
import typings.jupyterlabServices.messagesMod.MessageType
import typings.jupyterlabServices.messagesMod.Status
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.sessionSessionMod.IModel
import typings.jupyterlabServices.sessionSessionMod.ISessionConnection
import typings.jupyterlabServices.sessionSessionMod.ISessionConnection.IKernelChangedArgs
import typings.jupyterlabServices.sessionSessionMod.ISessionConnection.IOptions
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/default", JSImport.Namespace)
@js.native
object sessionDefaultMod extends js.Object {
  @js.native
  class SessionConnection protected () extends ISessionConnection {
    /**
      * Construct a new session.
      */
    def this(options: IOptions) = this()
    var _anyMessage: js.Any = js.native
    var _clientId: js.Any = js.native
    var _connectToKernel: js.Any = js.native
    var _connectionStatusChanged: js.Any = js.native
    var _disposed: js.Any = js.native
    /**
      * Handle a change to the model.
      */
    var _handleModelChange: js.Any = js.native
    var _id: js.Any = js.native
    var _iopubMessage: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _kernel: js.Any = js.native
    var _kernelChanged: js.Any = js.native
    var _kernelConnectionOptions: js.Any = js.native
    var _name: js.Any = js.native
    /**
      * Send a PATCH to the server, updating the session path or the kernel.
      */
    var _patch: js.Any = js.native
    var _path: js.Any = js.native
    var _propertyChanged: js.Any = js.native
    var _statusChanged: js.Any = js.native
    var _type: js.Any = js.native
    var _unhandledMessage: js.Any = js.native
    var _username: js.Any = js.native
    /**
      * The kernel anyMessage signal, proxied from the current kernel.
      */
    /* CompleteClass */
    override var anyMessage: ISignal[this.type, IAnyMessageArgs] = js.native
    /**
      * The kernel connectionStatusChanged signal, proxied from the current
      * kernel.
      */
    /* CompleteClass */
    override var connectionStatusChanged: ISignal[this.type, ConnectionStatus] = js.native
    /**
      * A signal emitted when the object is disposed.
      */
    /* CompleteClass */
    override val disposed: ISignal[this.type, Unit] = js.native
    /**
      * Unique id of the session.
      */
    /* CompleteClass */
    override val id: String = js.native
    /**
      * The kernel iopubMessage signal, proxied from the current kernel.
      */
    /* CompleteClass */
    override var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * The kernel.
      *
      * #### Notes
      * This is a read-only property, and can be altered by [changeKernel].
      *
      * A number of kernel signals are proxied through the session from
      * whatever the current kernel is for convenience.
      */
    /* CompleteClass */
    override val kernel: IKernelConnection | Null = js.native
    /**
      * A signal emitted when the kernel changes.
      */
    /* CompleteClass */
    override var kernelChanged: ISignal[
        this.type, 
        IChangedArgs[
          IKernelConnection | Null, 
          IKernelConnection | Null, 
          typings.jupyterlabServices.jupyterlabServicesStrings.kernel
        ]
      ] = js.native
    /**
      * The model associated with the session.
      */
    /* CompleteClass */
    override val model: IModel = js.native
    /**
      * The current name associated with the session.
      */
    /* CompleteClass */
    override val name: String = js.native
    /**
      * The current path associated with the session.
      */
    /* CompleteClass */
    override val path: String = js.native
    /**
      * A signal emitted when a session property changes.
      */
    /* CompleteClass */
    override val propertyChanged: ISignal[
        this.type, 
        typings.jupyterlabServices.jupyterlabServicesStrings.path | typings.jupyterlabServices.jupyterlabServicesStrings.name | typings.jupyterlabServices.jupyterlabServicesStrings.`type`
      ] = js.native
    /**
      * The server settings of the session.
      */
    /* CompleteClass */
    override val serverSettings: ISettings = js.native
    /**
      * The kernel statusChanged signal, proxied from the current kernel.
      */
    /* CompleteClass */
    override var statusChanged: ISignal[this.type, Status] = js.native
    /**
      * The type of the session.
      */
    /* CompleteClass */
    override val `type`: String = js.native
    /**
      * The kernel unhandledMessage signal, proxied from the current kernel.
      */
    /* CompleteClass */
    override var unhandledMessage: ISignal[this.type, IMessage[MessageType]] = js.native
    /**
      * A signal proxied from the kernel emitted for any kernel message.
      *
      * #### Notes
      * The behavior is undefined if the message is modified during message
      * handling. As such, it should be treated as read-only.
      */
    @JSName("anyMessage")
    def anyMessage_MSessionConnection: ISignal[this.type, IAnyMessageArgs] = js.native
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
    /* CompleteClass */
    override def changeKernel(options: PartialIModelId): js.Promise[IKernelConnection | Null] = js.native
    /**
      * A signal proxied from the kernel about the connection status.
      */
    @JSName("connectionStatusChanged")
    def connectionStatusChanged_MSessionConnection: ISignal[this.type, ConnectionStatus] = js.native
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
    /**
      * A signal emitted when the session is disposed.
      */
    @JSName("disposed")
    def disposed_MSessionConnection: ISignal[this.type, Unit] = js.native
    /**
      * Get the session id.
      */
    @JSName("id")
    def id_MSessionConnection: String = js.native
    /**
      * A signal proxied from the kernel about iopub kernel messages.
      */
    @JSName("iopubMessage")
    def iopubMessage_MSessionConnection: ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
    /**
      * Test whether the session has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MSessionConnection: Boolean = js.native
    /**
      * A signal emitted when the kernel changes.
      */
    @JSName("kernelChanged")
    def kernelChanged_MSessionConnection: ISignal[this.type, IKernelChangedArgs] = js.native
    /**
      * Get the session kernel connection object.
      *
      * #### Notes
      * This is a read-only property, and can be altered by [changeKernel].
      */
    @JSName("kernel")
    def kernel_MSessionConnection: IKernelConnection | Null = js.native
    /**
      * Get the model associated with the session.
      */
    @JSName("model")
    def model_MSessionConnection: IModel = js.native
    /**
      * Get the session name.
      */
    @JSName("name")
    def name_MSessionConnection: String = js.native
    /**
      * Handle any kernel messages.
      */
    /* protected */ def onAnyMessage(sender: IKernelConnection, args: IAnyMessageArgs): Unit = js.native
    /**
      * Handle iopub kernel messages.
      */
    /* protected */ def onIOPubMessage(sender: IKernelConnection, msg: IIOPubMessage[IOPubMessageType]): Unit = js.native
    /**
      * Handle to changes in the Kernel status.
      */
    /* protected */ def onKernelConnectionStatus(sender: IKernelConnection, state: ConnectionStatus): Unit = js.native
    /**
      * Handle to changes in the Kernel status.
      */
    /* protected */ def onKernelStatus(sender: IKernelConnection, state: Status): Unit = js.native
    /**
      * Handle unhandled kernel messages.
      */
    /* protected */ def onUnhandledMessage(sender: IKernelConnection, msg: IMessage[MessageType]): Unit = js.native
    /**
      * Get the session path.
      */
    @JSName("path")
    def path_MSessionConnection: String = js.native
    /**
      * A signal emitted when a session property changes.
      */
    @JSName("propertyChanged")
    def propertyChanged_MSessionConnection: ISignal[
        this.type, 
        typings.jupyterlabServices.jupyterlabServicesStrings.path | typings.jupyterlabServices.jupyterlabServicesStrings.name | typings.jupyterlabServices.jupyterlabServicesStrings.`type`
      ] = js.native
    /**
      * Change the session name.
      *
      * @returns A promise that resolves when the session has renamed.
      *
      * #### Notes
      * This uses the Jupyter REST API, and the response is validated.
      * The promise is fulfilled on a valid response and rejected otherwise.
      */
    /* CompleteClass */
    override def setName(name: String): js.Promise[Unit] = js.native
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
    /* CompleteClass */
    override def setPath(path: String): js.Promise[Unit] = js.native
    /**
      * Change the session type.
      *
      * @returns A promise that resolves when the session has renamed.
      *
      * #### Notes
      * This uses the Jupyter REST API, and the response is validated.
      * The promise is fulfilled on a valid response and rejected otherwise.
      */
    /* CompleteClass */
    override def setType(`type`: String): js.Promise[Unit] = js.native
    /* protected */ def setupKernel(): Unit = js.native
    /**
      * Create a new kernel connection and connect to its signals.
      *
      * #### Notes
      * This method is not meant to be subclassed.
      */
    /* protected */ def setupKernel(model: typings.jupyterlabServices.kernelRestapiMod.IModel): Unit = js.native
    /**
      * Kill the kernel and shutdown the session.
      *
      * @returns A promise that resolves when the session is shut down.
      *
      * #### Notes
      * This uses the Jupyter REST API, and the response is validated.
      * The promise is fulfilled on a valid response and rejected otherwise.
      */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
    /**
      * A signal proxied from the connection about the kernel status.
      */
    @JSName("statusChanged")
    def statusChanged_MSessionConnection: ISignal[this.type, Status] = js.native
    /**
      * Get the session type.
      */
    @JSName("type")
    def type_MSessionConnection: String = js.native
    /**
      * A signal proxied from the kernel for an unhandled kernel message.
      */
    @JSName("unhandledMessage")
    def unhandledMessage_MSessionConnection: ISignal[this.type, IMessage[MessageType]] = js.native
    /**
      * Update the session based on a session model from the server.
      *
      * #### Notes
      * This only updates this session connection instance. Use `setPath`,
      * `setName`, `setType`, and `changeKernel` to change the session values on
      * the server.
      */
    def update(model: IModel): Unit = js.native
  }
  
}


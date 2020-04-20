package typings.jupyterlabServices

import typings.jupyterlabServices.kernelKernelMod.ConnectionStatus
import typings.jupyterlabServices.kernelKernelMod.IAnyMessageArgs
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection.IOptions
import typings.jupyterlabServices.kernelRestapiMod.IModel
import typings.jupyterlabServices.messagesMod.IIOPubMessage
import typings.jupyterlabServices.messagesMod.IInfoReply
import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.IOPubMessageType
import typings.jupyterlabServices.messagesMod.MessageType
import typings.jupyterlabServices.messagesMod.Status
import typings.jupyterlabServices.restapiMod.ISpecModel
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/default", JSImport.Namespace)
@js.native
object defaultMod extends js.Object {
  @js.native
  class KernelConnection protected () extends IKernelConnection {
    /**
      * Construct a kernel object.
      */
    def this(options: IOptions) = this()
    var _anyMessage: js.Any = js.native
    /**
      * Check to make sure it is okay to proceed to handle a message.
      *
      * #### Notes
      * Because we handle messages asynchronously, before a message is handled the
      * kernel might be disposed or restarted (and have a different session id).
      * This function throws an error in each of these cases. This is meant to be
      * called at the start of an asynchronous message handler to cancel message
      * processing if the message no longer is valid.
      */
    var _assertCurrentMessage: js.Any = js.native
    /**
      * Clear the internal state.
      */
    var _clearKernelState: js.Any = js.native
    /**
      * Forcefully clear the socket state.
      *
      * #### Notes
      * This will clear all socket state without calling any handlers and will
      * not update the connection status. If you call this method, you are
      * responsible for updating the connection status as needed and recreating
      * the socket if you plan to reconnect.
      */
    var _clearSocket: js.Any = js.native
    var _clientId: js.Any = js.native
    var _comms: js.Any = js.native
    var _connectionStatus: js.Any = js.native
    var _connectionStatusChanged: js.Any = js.native
    /**
      * Create the kernel websocket connection and add socket status handlers.
      */
    var _createSocket: js.Any = js.native
    var _displayIdToParentIds: js.Any = js.native
    var _disposed: js.Any = js.native
    /**
      * Utility function to throw an error if this instance is disposed.
      */
    var _errorIfDisposed: js.Any = js.native
    var _futures: js.Any = js.native
    /**
      * Handle 'comm_close' kernel message.
      */
    var _handleCommClose: js.Any = js.native
    /**
      * Handle a 'comm_msg' kernel message.
      */
    var _handleCommMsg: js.Any = js.native
    /**
      * Handle a `comm_open` kernel message.
      */
    var _handleCommOpen: js.Any = js.native
    /**
      * Handle a message with a display id.
      *
      * @returns Whether the message was handled.
      */
    var _handleDisplayId: js.Any = js.native
    var _handleMessage: js.Any = js.native
    /**
      * Handle a restart on the kernel.  This is not part of the `IKernel`
      * interface.
      */
    var _handleRestart: js.Any = js.native
    var _id: js.Any = js.native
    var _info: js.Any = js.native
    var _iopubMessage: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _kernelSession: js.Any = js.native
    var _msgChain: js.Any = js.native
    var _msgIdToDisplayIds: js.Any = js.native
    var _name: js.Any = js.native
    var _noOp: js.Any = js.native
    /**
      * Handle a websocket close event.
      */
    var _onWSClose: js.Any = js.native
    /**
      * Handle a websocket message, validating and routing appropriately.
      */
    var _onWSMessage: js.Any = js.native
    /**
      * Handle a websocket open event.
      */
    var _onWSOpen: js.Any = js.native
    var _pendingMessages: js.Any = js.native
    /**
      * Attempt a connection if we have not exhausted connection attempts.
      */
    var _reconnect: js.Any = js.native
    var _reconnectAttempt: js.Any = js.native
    var _reconnectLimit: js.Any = js.native
    var _reconnectTimeout: js.Any = js.native
    var _sendKernelShellControl: js.Any = js.native
    /**
      * Send a message on the websocket.
      *
      * If queue is true, queue the message for later sending if we cannot send
      * now. Otherwise throw an error.
      */
    var _sendMessage: js.Any = js.native
    /**
      * Send pending messages to the kernel.
      */
    var _sendPending: js.Any = js.native
    var _specPromise: js.Any = js.native
    var _status: js.Any = js.native
    var _statusChanged: js.Any = js.native
    var _targetRegistry: js.Any = js.native
    var _unhandledMessage: js.Any = js.native
    /**
      * Unregister a comm instance.
      */
    var _unregisterComm: js.Any = js.native
    /**
      * Handle connection status changes.
      */
    var _updateConnectionStatus: js.Any = js.native
    /**
      * Handle status iopub messages from the kernel.
      */
    var _updateStatus: js.Any = js.native
    var _username: js.Any = js.native
    /**
      * Websocket to communicate with kernel.
      */
    var _ws: js.Any = js.native
    /**
      * A signal emitted when the object is disposed.
      */
    /* CompleteClass */
    override val disposed: ISignal[this.type, Unit] = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * A signal emitted for any kernel message.
      *
      * #### Notes
      * This signal is emitted when a message is received, before it is handled
      * asynchronously.
      *
      * This message is emitted when a message is queued for sending (either in
      * the websocket buffer, or our own pending message buffer). The message may
      * actually be sent across the wire at a later time.
      *
      * The message emitted in this signal should not be modified in any way.
      */
    @JSName("anyMessage")
    def anyMessage_MKernelConnection: ISignal[this.type, IAnyMessageArgs] = js.native
    /**
      * The client unique id.
      */
    @JSName("clientId")
    def clientId_MKernelConnection: String = js.native
    /**
      * A signal emitted when the kernel status changes.
      */
    @JSName("connectionStatusChanged")
    def connectionStatusChanged_MKernelConnection: ISignal[this.type, ConnectionStatus] = js.native
    /**
      * The current connection status of the kernel connection.
      */
    @JSName("connectionStatus")
    def connectionStatus_MKernelConnection: ConnectionStatus = js.native
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
    @JSName("disposed")
    def disposed_MKernelConnection: ISignal[this.type, Unit] = js.native
    /**
      * Handles a kernel shutdown.
      *
      * #### Notes
      * This method should be called if we know from outside information that a
      * kernel is dead (for example, we cannot find the kernel model on the
      * server).
      */
    def handleShutdown(): Unit = js.native
    /**
      * The id of the server-side kernel.
      */
    @JSName("id")
    def id_MKernelConnection: String = js.native
    /**
      * The cached kernel info.
      *
      * @returns A promise that resolves to the kernel info.
      */
    @JSName("info")
    def info_MKernelConnection: js.Promise[IInfoReply] = js.native
    /**
      * A signal emitted for iopub kernel messages.
      *
      * #### Notes
      * This signal is emitted after the iopub message is handled asynchronously.
      */
    @JSName("iopubMessage")
    def iopubMessage_MKernelConnection: ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
    /**
      * Test whether the kernel has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MKernelConnection: Boolean = js.native
    /**
      * The kernel model
      */
    @JSName("model")
    def model_MKernelConnection: IModel = js.native
    /**
      * The name of the server-side kernel.
      */
    @JSName("name")
    def name_MKernelConnection: String = js.native
    /**
      * The kernel spec.
      *
      * @returns A promise that resolves to the kernel spec.
      */
    @JSName("spec")
    def spec_MKernelConnection: js.Promise[js.UndefOr[ISpecModel]] = js.native
    /**
      * A signal emitted when the kernel status changes.
      */
    @JSName("statusChanged")
    def statusChanged_MKernelConnection: ISignal[this.type, Status] = js.native
    /**
      * The current status of the kernel.
      */
    @JSName("status")
    def status_MKernelConnection: Status = js.native
    /**
      * A signal emitted for unhandled kernel message.
      *
      * #### Notes
      * This signal is emitted for a message that was not handled. It is emitted
      * during the asynchronous message handling code.
      */
    @JSName("unhandledMessage")
    def unhandledMessage_MKernelConnection: ISignal[this.type, IMessage[MessageType]] = js.native
    /**
      * The client username.
      */
    @JSName("username")
    def username_MKernelConnection: String = js.native
  }
  
}


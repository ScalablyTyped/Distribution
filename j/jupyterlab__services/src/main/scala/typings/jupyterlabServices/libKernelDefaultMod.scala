package typings.jupyterlabServices

import typings.jupyterlabServices.libKernelKernelMod.ConnectionStatus
import typings.jupyterlabServices.libKernelKernelMod.IAnyMessageArgs
import typings.jupyterlabServices.libKernelKernelMod.IKernelConnection
import typings.jupyterlabServices.libKernelKernelMod.IKernelConnection.IOptions
import typings.jupyterlabServices.libKernelMessagesMod.IIOPubMessage
import typings.jupyterlabServices.libKernelMessagesMod.IInfoReply
import typings.jupyterlabServices.libKernelMessagesMod.IMessage
import typings.jupyterlabServices.libKernelMessagesMod.IOPubMessageType
import typings.jupyterlabServices.libKernelMessagesMod.MessageType
import typings.jupyterlabServices.libKernelMessagesMod.Status
import typings.jupyterlabServices.libKernelRestapiMod.IModel
import typings.jupyterlabServices.libKernelspecRestapiMod.ISpecModel
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelDefaultMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/default", "KernelConnection")
  @js.native
  open class KernelConnection protected ()
    extends StObject
       with IKernelConnection {
    /**
      * Construct a kernel object.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _anyMessage: Any = js.native
    
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
    /* private */ var _assertCurrentMessage: Any = js.native
    
    /**
      * Clear the internal state.
      */
    /* private */ var _clearKernelState: Any = js.native
    
    /**
      * Forcefully clear the socket state.
      *
      * #### Notes
      * This will clear all socket state without calling any handlers and will
      * not update the connection status. If you call this method, you are
      * responsible for updating the connection status as needed and recreating
      * the socket if you plan to reconnect.
      */
    /* private */ var _clearSocket: Any = js.native
    
    /* private */ var _clientId: Any = js.native
    
    /* private */ var _comms: Any = js.native
    
    /* private */ var _connectionStatus: Any = js.native
    
    /* private */ var _connectionStatusChanged: Any = js.native
    
    /**
      * Create the kernel websocket connection and add socket status handlers.
      */
    /* private */ var _createSocket: Any = js.native
    
    /* private */ var _displayIdToParentIds: Any = js.native
    
    /* private */ var _disposed: Any = js.native
    
    /**
      * Utility function to throw an error if this instance is disposed.
      */
    /* private */ var _errorIfDisposed: Any = js.native
    
    /* private */ var _futures: Any = js.native
    
    /**
      * Handle 'comm_close' kernel message.
      */
    /* private */ var _handleCommClose: Any = js.native
    
    /**
      * Handle a 'comm_msg' kernel message.
      */
    /* private */ var _handleCommMsg: Any = js.native
    
    /**
      * Handle a `comm_open` kernel message.
      */
    /* private */ var _handleCommOpen: Any = js.native
    
    /**
      * Handle a message with a display id.
      *
      * @returns Whether the message was handled.
      */
    /* private */ var _handleDisplayId: Any = js.native
    
    /* private */ var _handleMessage: Any = js.native
    
    /* private */ var _hasPendingInput: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _info: Any = js.native
    
    /* private */ var _iopubMessage: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _kernelSession: Any = js.native
    
    /* private */ var _model: Any = js.native
    
    /* private */ var _msgChain: Any = js.native
    
    /* private */ var _msgIdToDisplayIds: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _noOp: Any = js.native
    
    /**
      * Handle a websocket close event.
      */
    /* private */ var _onWSClose: Any = js.native
    
    /**
      * Handle a websocket message, validating and routing appropriately.
      */
    /* private */ var _onWSMessage: Any = js.native
    
    /**
      * Handle a websocket open event.
      */
    /* private */ var _onWSOpen: Any = js.native
    
    /* private */ var _pendingInput: Any = js.native
    
    /* private */ var _pendingMessages: Any = js.native
    
    /* private */ var _reason: Any = js.native
    
    /**
      * Attempt a connection if we have not exhausted connection attempts.
      */
    /* private */ var _reconnect: Any = js.native
    
    /* private */ var _reconnectAttempt: Any = js.native
    
    /* private */ var _reconnectLimit: Any = js.native
    
    /* private */ var _reconnectTimeout: Any = js.native
    
    /* private */ var _sendKernelShellControl: Any = js.native
    
    /**
      * Send a message on the websocket.
      *
      * If queue is true, queue the message for later sending if we cannot send
      * now. Otherwise throw an error.
      *
      * #### Notes
      * As an exception to the queueing, if we are sending a kernel_info_request
      * message while we think the kernel is restarting, we send the message
      * immediately without queueing. This is so that we can trigger a message
      * back, which will then clear the kernel restarting state.
      */
    /* private */ var _sendMessage: Any = js.native
    
    /**
      * Send pending messages to the kernel.
      */
    /* private */ var _sendPending: Any = js.native
    
    /* private */ var _specPromise: Any = js.native
    
    /* private */ var _status: Any = js.native
    
    /* private */ var _statusChanged: Any = js.native
    
    /* private */ var _targetRegistry: Any = js.native
    
    /* private */ var _unhandledMessage: Any = js.native
    
    /**
      * Unregister a comm instance.
      */
    /* private */ var _unregisterComm: Any = js.native
    
    /**
      * Handle connection status changes.
      */
    /* private */ var _updateConnectionStatus: Any = js.native
    
    /**
      * Handle status iopub messages from the kernel.
      */
    /* private */ var _updateStatus: Any = js.native
    
    /* private */ var _username: Any = js.native
    
    /**
      * Websocket to communicate with kernel.
      */
    /* private */ var _ws: Any = js.native
    
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
    
    /**
      * A signal emitted when the object is disposed.
      */
    /* CompleteClass */
    override val disposed: ISignal[this.type, Unit] = js.native
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
    
    @JSName("hasPendingInput")
    def hasPendingInput_MKernelConnection: Boolean = js.native
    
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
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
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
      * A signal emitted when a kernel has pending inputs from the user.
      */
    @JSName("pendingInput")
    def pendingInput_MKernelConnection: ISignal[this.type, Boolean] = js.native
    
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

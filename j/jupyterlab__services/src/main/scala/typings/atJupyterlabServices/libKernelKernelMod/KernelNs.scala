package typings.atJupyterlabServices.libKernelKernelMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabServices.Anon_0
import typings.atJupyterlabServices.Anon_Allowstdin
import typings.atJupyterlabServices.Anon_Arguments
import typings.atJupyterlabServices.Anon_Code
import typings.atJupyterlabServices.Anon_CodeString
import typings.atJupyterlabServices.Anon_Target
import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atJupyterlabServices.atJupyterlabServicesStrings.recv
import typings.atJupyterlabServices.atJupyterlabServicesStrings.send
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IAnyMessageArgs
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IComm
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IControlFuture
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IFuture
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IKernel
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IKernelConnection
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IManager
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IModel
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IOptions
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IShellFuture
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.ISpecModel
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.ISpecModels
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.Status
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ControlMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommCloseMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommInfoReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommMsgMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommOpenMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICompleteReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IControlMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDebugReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDebugRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryRequestRange
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryRequestSearch
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryRequestTail
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIOPubMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInfoReply
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInfoReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInputReply
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInspectReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIsCompleteReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IOPubMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IShellControlMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IShellMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IStdinMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.MessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ReplyContent
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ShellMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.StdinMessageType
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/kernel", "Kernel")
@js.native
object KernelNs extends js.Object {
  /**
    * Arguments interface for the anyMessage signal.
    */
  trait IAnyMessageArgs extends js.Object {
    /**
      * The direction of the message.
      */
    var direction: send | recv
    /**
      * The message that is being signaled.
      */
    var msg: IMessage[MessageType]
  }
  
  /**
    * A client side Comm interface.
    */
  @js.native
  trait IComm extends IDisposable {
    /**
      * The unique id for the comm channel.
      */
    val commId: String = js.native
    /**
      * The target name for the comm channel.
      */
    val targetName: String = js.native
    /**
      * Close the comm.
      *
      * @param data - The data to send to the server on opening.
      *
      * @param metadata - Additional metatada for the message.
      *
      * @returns A future for the generated message.
      *
      * #### Notes
      * This will send a `comm_close` message to the kernel, and call the
      * `onClose` callback if set.
      *
      * This is a no-op if the comm is already closed.
      */
    def close(): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(data: JSONValue): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(data: JSONValue, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(data: JSONValue, metadata: JSONObject, buffers: js.Array[ArrayBuffer | ArrayBufferView]): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    /**
      * Callback for a comm close event.
      *
      * #### Notes
      * This is called when the comm is closed from either the server or client.
      * If this is called in response to a kernel message and the handler returns
      * a promise, all kernel message processing pauses until the promise is
      * resolved.
      */
    def onClose(msg: ICommCloseMsg[iopub | shell]): Unit | js.Thenable[Unit] = js.native
    /**
      * Callback for a comm message received event.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved.
      */
    def onMsg(msg: ICommMsgMsg[iopub | shell]): Unit | js.Thenable[Unit] = js.native
    /**
      * Open a comm with optional data and metadata.
      *
      * @param data - The data to send to the server on opening.
      *
      * @param metadata - Additional metatada for the message.
      *
      * @returns A future for the generated message.
      *
      * #### Notes
      * This sends a `comm_open` message to the server.
      */
    def open(): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: JSONValue): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: JSONValue, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: JSONValue, metadata: JSONObject, buffers: js.Array[ArrayBuffer | ArrayBufferView]): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    /**
      * Send a `comm_msg` message to the kernel.
      *
      * @param data - The data to send to the server on opening.
      *
      * @param metadata - Additional metatada for the message.
      *
      * @param buffers - Optional buffer data.
      *
      * @param disposeOnDone - Whether to dispose of the future when done.
      *
      * @returns A future for the generated message.
      *
      * #### Notes
      * This is a no-op if the comm has been closed.
      */
    def send(data: JSONValue): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONValue, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONValue, metadata: JSONObject, buffers: js.Array[ArrayBuffer | ArrayBufferView]): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONValue,
      metadata: JSONObject,
      buffers: js.Array[ArrayBuffer | ArrayBufferView],
      disposeOnDone: Boolean
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  }
  
  /**
    * A Future interface for responses from the kernel.
    *
    * When a message is sent to a kernel, a Future is created to handle any
    * responses that may come from the kernel.
    */
  trait IFuture[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */] extends IDisposable {
    /**
      * A promise that resolves when the future is done.
      *
      * #### Notes
      * The future is done when there are no more responses expected from the
      * kernel.
      *
      * The `done` promise resolves to the reply message if there is one,
      * otherwise it resolves to `undefined`.
      */
    val done: js.Promise[js.UndefOr[REPLY]]
    /**
      * The original outgoing message.
      */
    val msg: REQUEST
    /**
      * The iopub handler for the kernel future.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved.
      */
    def onIOPub(msg: IIOPubMessage[IOPubMessageType]): Unit | js.Thenable[Unit]
    /**
      * The reply handler for the kernel future.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved. If there is a reply message, the future
      * `done` promise also resolves to the reply message after this handler has
      * been called.
      */
    def onReply(msg: REPLY): Unit | js.Thenable[Unit]
    /**
      * The stdin handler for the kernel future.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved.
      */
    def onStdin(msg: IStdinMessage[StdinMessageType]): Unit | js.Thenable[Unit]
    /**
      * Register hook for IOPub messages.
      *
      * @param hook - The callback invoked for an IOPub message.
      *
      * #### Notes
      * The IOPub hook system allows you to preempt the handlers for IOPub
      * messages handled by the future.
      *
      * The most recently registered hook is run first. A hook can return a
      * boolean or a promise to a boolean, in which case all kernel message
      * processing pauses until the promise is fulfilled. If a hook return value
      * resolves to false, any later hooks will not run and the function will
      * return a promise resolving to false. If a hook throws an error, the error
      * is logged to the console and the next hook is run. If a hook is
      * registered during the hook processing, it will not run until the next
      * message. If a hook is removed during the hook processing, it will be
      * deactivated immediately.
      */
    def registerMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit
    /**
      * Remove a hook for IOPub messages.
      *
      * @param hook - The hook to remove.
      *
      * #### Notes
      * If a hook is removed during the hook processing, it will be deactivated immediately.
      */
    def removeMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit
    /**
      * Send an `input_reply` message.
      */
    def sendInputReply(content: ReplyContent[IInputReply]): Unit
  }
  
  /**
    * The full interface of a kernel.
    */
  @js.native
  trait IKernel extends IKernelConnection {
    /**
      * A signal emitted when any kernel message is sent or received.
      *
      * #### Notes
      * This signal is emitted before any message handling has happened. The
      * message should be treated as read-only.
      */
    var anyMessage: ISignal[this.type, IAnyMessageArgs] = js.native
    /**
      * A signal emitted after an iopub kernel message is handled.
      */
    var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
    /**
      * The server settings for the kernel.
      */
    val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = js.native
    /**
      * A signal emitted when the kernel status changes.
      */
    var statusChanged: ISignal[this.type, Status] = js.native
    /**
      * A signal emitted when the kernel is shut down.
      */
    var terminated: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted for unhandled non-iopub kernel messages that claimed to
      * be responses for messages we sent using this kernel object.
      */
    var unhandledMessage: ISignal[this.type, IMessage[MessageType]] = js.native
    /**
      * Shutdown a kernel.
      *
      * @returns A promise that resolves when the kernel has shut down.
      *
      * #### Notes
      * Uses the [Jupyter Notebook
      * API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels).
      *
      * On a valid response, closes the websocket, emits the [[terminated]]
      * signal, disposes of the kernel object, and fulfills the promise.
      *
      * The promise will be rejected if the kernel status is `'dead'`, the
      * request fails, or the response is invalid.
      */
    def shutdown(): js.Promise[Unit] = js.native
  }
  
  /**
    * Interface of a Kernel connection that is managed by a session.
    *
    * #### Notes
    * The Kernel object is tied to the lifetime of the Kernel id, which is a
    * unique id for the Kernel session on the server.  The Kernel object manages
    * a websocket connection internally, and will auto-restart if the websocket
    * temporarily loses connection.  Restarting creates a new Kernel process on
    * the server, but preserves the Kernel id.
    */
  @js.native
  trait IKernelConnection extends IDisposable {
    /**
      * The client unique id.
      *
      * #### Notes
      * This should be unique for a particular kernel connection object.
      */
    val clientId: String = js.native
    /**
      * Whether the kernel connection handles comm messages.
      *
      * #### Notes
      * The comm message protocol currently has implicit assumptions that only
      * one kernel connection is handling comm messages. This option allows a
      * kernel connection to opt out of handling comms.
      *
      * See https://github.com/jupyter/jupyter_client/issues/263
      */
    var handleComms: Boolean = js.native
    /**
      * The id of the server-side kernel.
      */
    val id: String = js.native
    /**
      * The cached kernel info.
      *
      * #### Notes
      * This value will be null until the kernel is ready.
      */
    val info: IInfoReply | Null = js.native
    /**
      * Test whether the kernel is ready.
      *
      * #### Notes
      * A kernel is ready when the communication channel is active and we have
      * cached the kernel info.
      */
    val isReady: Boolean = js.native
    /**
      * The model associated with the kernel.
      */
    val model: IModel = js.native
    /**
      * The name of the server-side kernel.
      */
    val name: String = js.native
    /**
      * A promise that resolves when the kernel is initially ready after a start
      * or restart.
      *
      * #### Notes
      * A kernel is ready when the communication channel is active and we have
      * cached the kernel info.
      */
    val ready: js.Promise[Unit] = js.native
    /**
      * The current status of the kernel.
      */
    val status: Status = js.native
    /**
      * The client username.
      */
    val username: String = js.native
    /**
      * Connect to a comm, or create a new one.
      *
      * @param targetName - The name of the comm target.
      *
      * @param id - The comm id.
      *
      * @returns A comm instance.
      */
    def connectToComm(targetName: String): IComm = js.native
    def connectToComm(targetName: String, commId: String): IComm = js.native
    /**
      * Get the kernel spec.
      *
      * @returns A promise that resolves with the kernel spec for this kernel.
      */
    def getSpec(): js.Promise[ISpecModel] = js.native
    /**
      * Interrupt a kernel.
      *
      * @returns A promise that resolves when the kernel has interrupted.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels).
      *
      * The promise is fulfilled on a valid response and rejected otherwise.
      *
      * It is assumed that the API call does not mutate the kernel id or name.
      *
      * The promise will be rejected if the kernel status is `'dead'` or if the
      * request fails or the response is invalid.
      */
    def interrupt(): js.Promise[Unit] = js.native
    /**
      * Reconnect to a disconnected kernel.
      *
      * @returns A promise that resolves when the kernel has reconnected.
      *
      * #### Notes
      * This just refreshes the connection to an existing kernel, and does not
      * perform an HTTP request to the server or restart the kernel.
      */
    def reconnect(): js.Promise[Unit] = js.native
    /**
      * Register a comm target handler.
      *
      * @param targetName - The name of the comm target.
      *
      * @param callback - The callback invoked for a comm open message.
      *
      * #### Notes
      * Only one comm target can be registered to a target name at a time, an
      * existing callback for the same target name will be overridden.  A registered
      * comm target handler will take precedence over a comm which specifies a
      * `target_module`.
      *
      * If the callback returns a promise, kernel message processing will pause
      * until the returned promise is fulfilled.
      */
    def registerCommTarget(
      targetName: String,
      callback: js.Function2[/* comm */ IComm, /* msg */ ICommOpenMsg[iopub | shell], Unit | js.Thenable[Unit]]
    ): Unit = js.native
    /**
      * Register an IOPub message hook.
      *
      * @param msg_id - The parent_header message id in messages the hook should
      * intercept.
      *
      * @param hook - The callback invoked for the message.
      *
      * #### Notes
      * The IOPub hook system allows you to preempt the handlers for IOPub
      * messages with a given parent_header message id. The most recently
      * registered hook is run first. If a hook return value resolves to false,
      * any later hooks and the future's onIOPub handler will not run. If a hook
      * throws an error, the error is logged to the console and the next hook is
      * run. If a hook is registered during the hook processing, it will not run
      * until the next message. If a hook is disposed during the hook processing,
      * it will be deactivated immediately.
      *
      * See also [[IFuture.registerMessageHook]].
      */
    def registerMessageHook(
      msgId: String,
      hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]
    ): Unit = js.native
    /**
      * Remove a comm target handler.
      *
      * @param targetName - The name of the comm target to remove.
      *
      * @param callback - The callback to remove.
      *
      * #### Notes
      * The comm target is only removed if it matches the callback argument.
      */
    def removeCommTarget(
      targetName: String,
      callback: js.Function2[/* comm */ IComm, /* msg */ ICommOpenMsg[iopub | shell], Unit | js.Thenable[Unit]]
    ): Unit = js.native
    /**
      * Remove an IOPub message hook.
      *
      * @param msg_id - The parent_header message id the hook intercepted.
      *
      * @param hook - The callback invoked for the message.
      *
      */
    def removeMessageHook(
      msgId: String,
      hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]
    ): Unit = js.native
    /**
      * Send a `comm_info_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm_info).
      *
      * Fulfills with the `comm_info_reply` content when the shell reply is
      * received and validated.
      */
    def requestCommInfo(content: Anon_Target): js.Promise[ICommInfoReplyMsg] = js.native
    /**
      * Send a `complete_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
      *
      * Fulfills with the `complete_reply` content when the shell reply is
      * received and validated.
      */
    def requestComplete(content: Anon_Code): js.Promise[ICompleteReplyMsg] = js.native
    /**
      * Send an experimental `debug_request` message.
      *
      * @hidden
      *
      * @param content - The content of the request.
      *
      * @param disposeOnDone - Whether to dispose of the future when done.
      *
      * @returns A kernel future.
      *
      * #### Notes
      * Debug messages are experimental messages that are not in the official
      * kernel message specification. As such, this function is *NOT* considered
      * part of the public API, and may change without notice.
      */
    def requestDebug(content: Anon_Arguments): IControlFuture[IDebugRequestMsg, IDebugReplyMsg] = js.native
    def requestDebug(content: Anon_Arguments, disposeOnDone: Boolean): IControlFuture[IDebugRequestMsg, IDebugReplyMsg] = js.native
    /**
      * Send an `execute_request` message.
      *
      * @param content - The content of the request.
      *
      * @param disposeOnDone - Whether to dispose of the future when done.
      *
      * @returns A kernel future.
      *
      * #### Notes
      * See [Messaging in
      * Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execute).
      *
      * This method returns a kernel future, rather than a promise, since execution may
      * have many response messages (for example, many iopub display messages).
      *
      * Future `onReply` is called with the `execute_reply` content when the
      * shell reply is received and validated.
      *
      * **See also:** [[IExecuteReply]]
      */
    def requestExecute(content: Anon_Allowstdin): IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
    def requestExecute(content: Anon_Allowstdin, disposeOnDone: Boolean): IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
    def requestExecute(content: Anon_Allowstdin, disposeOnDone: Boolean, metadata: JSONObject): IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
    /**
      * Send a `history_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
      *
      * Fulfills with the `history_reply` content when the shell reply is
      * received and validated.
      */
    def requestHistory(content: IHistoryRequestRange): js.Promise[IHistoryReplyMsg] = js.native
    def requestHistory(content: IHistoryRequestSearch): js.Promise[IHistoryReplyMsg] = js.native
    def requestHistory(content: IHistoryRequestTail): js.Promise[IHistoryReplyMsg] = js.native
    /**
      * Send an `inspect_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
      *
      * Fulfills with the `inspect_reply` content when the shell reply is
      * received and validated.
      */
    def requestInspect(content: Anon_0): js.Promise[IInspectReplyMsg] = js.native
    /**
      * Send an `is_complete_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-completeness).
      *
      * Fulfills with the `is_complete_response` content when the shell reply is
      * received and validated.
      */
    def requestIsComplete(content: Anon_CodeString): js.Promise[IIsCompleteReplyMsg] = js.native
    /**
      * Send a `kernel_info_request` message.
      *
      * @param content - The content of the request.
      *
      * @returns A promise that resolves with the response message.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
      *
      * Fulfills with the `kernel_info_response` content when the shell reply is
      * received and validated.
      */
    def requestKernelInfo(): js.Promise[IInfoReplyMsg] = js.native
    /**
      * Restart a kernel.
      *
      * @returns A promise that resolves when the kernel has restarted.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
      *
      * Any existing Future or Comm objects are cleared.
      *
      * It is assumed that the API call does not mutate the kernel id or name.
      *
      * The promise will be rejected if the kernel status is `'dead'` or if the
      * request fails or the response is invalid.
      */
    def restart(): js.Promise[Unit] = js.native
    def sendControlMessage[T /* <: ControlMessageType */](msg: IControlMessage[T]): IControlFuture[IControlMessage[T], IControlMessage[ControlMessageType]] = js.native
    def sendControlMessage[T /* <: ControlMessageType */](msg: IControlMessage[T], expectReply: Boolean): IControlFuture[IControlMessage[T], IControlMessage[ControlMessageType]] = js.native
    def sendControlMessage[T /* <: ControlMessageType */](msg: IControlMessage[T], expectReply: Boolean, disposeOnDone: Boolean): IControlFuture[IControlMessage[T], IControlMessage[ControlMessageType]] = js.native
    /**
      * Send an `input_reply` message.
      *
      * @param content - The content of the reply.
      *
      * #### Notes
      * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
      */
    def sendInputReply(content: ReplyContent[IInputReply]): Unit = js.native
    /**
      * Send a shell message to the kernel.
      *
      * @param msg - The fully-formed shell message to send.
      *
      * @param expectReply - Whether to expect a shell reply message.
      *
      * @param disposeOnDone - Whether to dispose of the future when done.
      *
      * #### Notes
      * Send a message to the kernel's shell channel, yielding a future object
      * for accepting replies.
      *
      * If `expectReply` is given and `true`, the future is done when both a
      * shell reply and an idle status message are received with the appropriate
      * parent header, in which case the `.done` promise resolves to the reply.
      * If `expectReply` is not given or is `false`, the future is done when an
      * idle status message with the appropriate parent header is received, in
      * which case the `.done` promise resolves to `undefined`.
      *
      * If `disposeOnDone` is given and `false`, the future will not be disposed
      * of when the future is done, instead relying on the caller to dispose of
      * it. This allows for the handling of out-of-order output from ill-behaved
      * kernels.
      *
      * All replies are validated as valid kernel messages.
      *
      * If the kernel status is `'dead'`, this will throw an error.
      */
    def sendShellMessage[T /* <: ShellMessageType */](msg: IShellMessage[T]): IShellFuture[IShellMessage[T], IShellMessage[ShellMessageType]] = js.native
    def sendShellMessage[T /* <: ShellMessageType */](msg: IShellMessage[T], expectReply: Boolean): IShellFuture[IShellMessage[T], IShellMessage[ShellMessageType]] = js.native
    def sendShellMessage[T /* <: ShellMessageType */](msg: IShellMessage[T], expectReply: Boolean, disposeOnDone: Boolean): IShellFuture[IShellMessage[T], IShellMessage[ShellMessageType]] = js.native
  }
  
  /**
    * Object which manages kernel instances for a given base url.
    *
    * #### Notes
    * The manager is responsible for maintaining the state of running
    * kernels and the initial fetch of kernel specs.
    */
  @js.native
  trait IManager extends IDisposable {
    /**
      * A signal emitted when there is a connection failure.
      */
    var connectionFailure: ISignal[
        IManager, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.NetworkError */ _
      ] = js.native
    /**
      * Whether the manager is ready.
      */
    val isReady: Boolean = js.native
    /**
      * A promise that resolves when the manager is initially ready.
      */
    val ready: js.Promise[Unit] = js.native
    /**
      * A signal emitted when the running kernels change.
      */
    var runningChanged: ISignal[IManager, js.Array[IModel]] = js.native
    /**
      * The server settings for the manager.
      */
    var serverSettings: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
      ] = js.native
    /**
      * The kernel spec models.
      *
      * #### Notes
      * The value will be null until the manager is ready.
      */
    val specs: ISpecModels | Null = js.native
    /**
      * A signal emitted when the kernel specs change.
      */
    var specsChanged: ISignal[IManager, ISpecModels] = js.native
    /**
      * Connect to an existing kernel.
      *
      * @param model - The model of the target kernel.
      *
      * @returns A promise that resolves with the new kernel instance.
      */
    def connectTo(model: IModel): IKernel = js.native
    /**
      * Find a kernel by id.
      *
      * @param id - The id of the target kernel.
      *
      * @returns A promise that resolves with the kernel's model.
      */
    def findById(id: String): js.Promise[IModel] = js.native
    /**
      * Force a refresh of the running kernels.
      *
      * @returns A promise that resolves when the models are refreshed.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    def refreshRunning(): js.Promise[Unit] = js.native
    /**
      * Force a refresh of the specs from the server.
      *
      * @returns A promise that resolves when the specs are fetched.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    def refreshSpecs(): js.Promise[Unit] = js.native
    /**
      * Create an iterator over the known running kernels.
      *
      * @returns A new iterator over the running kernels.
      */
    def running(): IIterator[IModel] = js.native
    /**
      * Shut down a kernel by id.
      *
      * @param id - The id of the target kernel.
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def shutdown(id: String): js.Promise[Unit] = js.native
    /**
      * Shut down all kernels.
      *
      * @returns A promise that resolves when all of the kernels are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    /**
      * Start a new kernel.
      *
      * @param options - The kernel options to use.
      *
      * @returns A promise that resolves with the kernel instance.
      *
      * #### Notes
      * The manager `serverSettings` will be always be used.
      */
    def startNew(): js.Promise[IKernel] = js.native
    def startNew(options: IOptions): js.Promise[IKernel] = js.native
  }
  
  /**
    * The kernel model provided by the server.
    *
    * #### Notes
    * See the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels).
    */
  trait IModel extends JSONObject {
    /**
      * Unique identifier of the kernel server session.
      */
    val id: String
    /**
      * The name of the kernel.
      */
    val name: String
  }
  
  /**
    * The options object used to initialize a kernel.
    */
  trait IOptions extends js.Object {
    /**
      * The unique identifier for the kernel client.
      */
    var clientId: js.UndefOr[String] = js.undefined
    /**
      * Whether the kernel connection should handle comm messages
      *
      * #### Notes
      * The comm message protocol currently has implicit assumptions that only
      * one kernel connection is handling comm messages. This option allows a
      * kernel connection to opt out of handling comms.
      *
      * See https://github.com/jupyter/jupyter_client/issues/263
      */
    var handleComms: js.UndefOr[Boolean] = js.undefined
    /**
      * The kernel type (e.g. python3).
      */
    var name: js.UndefOr[String] = js.undefined
    /**
      * The server settings for the kernel.
      */
    var serverSettings: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
      ] = js.undefined
    /**
      * The username of the kernel client.
      */
    var username: js.UndefOr[String] = js.undefined
  }
  
  /**
    * Kernel Spec interface.
    *
    * #### Notes
    * See [Kernel specs](https://jupyter-client.readthedocs.io/en/latest/kernels.html#kernelspecs).
    */
  trait ISpecModel extends JSONObject {
    /**
      * A list of command line arguments used to start the kernel.
      */
    val argv: js.Array[String]
    /**
      * The kernel’s name as it should be displayed in the UI.
      */
    val display_name: String
    /**
      * A dictionary of environment variables to set for the kernel.
      */
    val env: js.UndefOr[JSONObject] = js.undefined
    /**
      * The name of the language of the kernel.
      */
    val language: String
    /**
      * The name of the kernel spec.
      */
    val name: String
    /**
      * A mapping of resource file name to download path.
      */
    val resources: StringDictionary[String]
  }
  
  /**
    * The available kernelSpec models.
    *
    * #### Notes
    * See the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernelspecs).
    */
  trait ISpecModels extends JSONObject {
    /**
      * The name of the default kernel spec.
      */
    var default: String
    /**
      * A mapping of kernel spec name to spec.
      */
    val kernelspecs: StringDictionary[ISpecModel]
  }
  
  /**
    * The valid Kernel status states.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.unknown
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.starting
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.reconnecting
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.idle
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.busy
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.restarting
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.autorestarting
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.dead
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.connected
  */
  trait Status extends js.Object
  
  /**
    * Connect to a running kernel.
    *
    * @param model - The model of the running kernel.
    *
    * @param settings - The server settings for the request.
    *
    * @returns The kernel object.
    *
    * #### Notes
    * If the kernel was already started via `startNewKernel`, the existing
    * Kernel object info is used to create another instance.
    */
  def connectTo(model: IModel): IKernel = js.native
  def connectTo(
    model: IModel,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): IKernel = js.native
  /**
    * Find a kernel by id.
    *
    * @param id - The id of the kernel of interest.
    *
    * @param settings - The optional server settings.
    *
    * @returns A promise that resolves with the model for the kernel.
    *
    * #### Notes
    * If the kernel was already started via `startNewKernel`, we return its
    * `Kernel.IModel`. Otherwise, we attempt to find the existing kernel. The
    * promise is fulfilled when the kernel is found, otherwise the promise is
    * rejected.
    */
  def findById(id: String): js.Promise[IModel] = js.native
  def findById(
    id: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[IModel] = js.native
  /**
    * Fetch all of the kernel specs.
    *
    * @param settings - The optional server settings.
    *
    * @returns A promise that resolves with the kernel specs.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernelspecs).
    */
  def getSpecs(): js.Promise[ISpecModels] = js.native
  def getSpecs(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[ISpecModels] = js.native
  /**
    * Fetch the running kernels.
    *
    * @param settings - The optional server settings.
    *
    * @returns A promise that resolves with the list of running kernels.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
    *
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  def listRunning(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[js.Array[IModel]] = js.native
  /**
    * Shut down a kernel by id.
    *
    * @param id - The id of the running kernel.
    *
    * @param settings - The server settings for the request.
    *
    * @returns A promise that resolves when the kernel is shut down.
    */
  def shutdown(id: String): js.Promise[Unit] = js.native
  def shutdown(
    id: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[Unit] = js.native
  /**
    * Shut down all kernels.
    *
    * @returns A promise that resolves when all of the kernels are shut down.
    */
  def shutdownAll(): js.Promise[Unit] = js.native
  def shutdownAll(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[Unit] = js.native
  /**
    * Start a new kernel.
    *
    * @param options - The options used to create the kernel.
    *
    * @returns A promise that resolves with a kernel object.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
    *
    * If no options are given or the kernel name is not given, the
    * default kernel will by started by the server.
    *
    * Wraps the result in a Kernel object. The promise is fulfilled
    * when the kernel is started by the server, otherwise the promise is rejected.
    */
  def startNew(): js.Promise[IKernel] = js.native
  def startNew(options: IOptions): js.Promise[IKernel] = js.native
  type IControlFuture[REQUEST /* <: IControlMessage[ControlMessageType] */, REPLY /* <: IControlMessage[ControlMessageType] */] = IFuture[REQUEST, REPLY]
  type IShellFuture[REQUEST /* <: IShellMessage[ShellMessageType] */, REPLY /* <: IShellMessage[ShellMessageType] */] = IFuture[REQUEST, REPLY]
}


package typings
package atJupyterlabServicesLib.libKernelMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/messages", "KernelMessage")
@js.native
object KernelMessageNs extends js.Object {
  /**
    * The valid channel names.
    */
  /* Rewritten from type alias, can be one of: 
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.shell
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.iopub
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.stdin
  */
  trait Channel extends js.Object
  
  /**
    * The history access settings.
    */
  /* Rewritten from type alias, can be one of: 
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.range
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.tail
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.search
  */
  trait HistAccess extends js.Object
  
  /**
    * A `'clear_output'` message on the `'iopub'` channel.
    *
    * See [Clear output](https://jupyter-client.readthedocs.io/en/latest/messaging.html#clear-output).
    */
  trait IClearOutputMsg extends IIOPubMessage {
    @JSName("content")
    var content_IClearOutputMsg: atJupyterlabServicesLib.Anon_Wait
  }
  
  /**
    * The content of a `'comm_close'` method.  The message can
    * be received on the `'iopub'` channel or send on the `'shell'` channel.
    *
    * See [Comm close](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
    */
  trait ICommClose
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var comm_id: java.lang.String
    var data: atPhosphorCoreutilsLib.libJsonMod.JSONValue
  }
  
  /**
    * A `'comm_close'` message on the `'iopub'` channel.
    *
    * See [Comm close](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
    */
  trait ICommCloseMsg extends IIOPubMessage {
    @JSName("content")
    var content_ICommCloseMsg: ICommClose
  }
  
  /**
    * A `'comm_info_reply'` message on the `'stream'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm-info).
    *
    * **See also:** [[ICommInfoRequest]], [[IKernel.commInfo]]
    */
  trait ICommInfoReplyMsg extends IShellMessage {
    @JSName("content")
    var content_ICommInfoReplyMsg: atJupyterlabServicesLib.Anon_CommId
  }
  
  /**
    * The content of a `'comm_info_request'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm-info).
    *
    * **See also:** [[ICommInfoReply]], [[IKernel.commInfo]]
    */
  trait ICommInfoRequest
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var target: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * The content of a `'comm_msg'` message.  The message can
    * be received on the `'iopub'` channel or send on the `'shell'` channel.
    *
    * See [Comm msg](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
    */
  trait ICommMsg
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var comm_id: java.lang.String
    var data: atPhosphorCoreutilsLib.libJsonMod.JSONValue
  }
  
  /**
    * A `'comm_msg'` message on the `'iopub'` channel.
    *
    * See [Comm msg](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
    */
  trait ICommMsgMsg extends IIOPubMessage {
    @JSName("content")
    var content_ICommMsgMsg: ICommMsg
  }
  
  /**
    * The content of a `'comm_open'` message.  The message can
    * be received on the `'iopub'` channel or send on the `'shell'` channel.
    *
    * See [Comm open](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
    */
  trait ICommOpen
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var comm_id: java.lang.String
    var data: atPhosphorCoreutilsLib.libJsonMod.JSONValue
    var target_module: js.UndefOr[java.lang.String] = js.undefined
    var target_name: java.lang.String
  }
  
  /**
    * A `'comm_open'` message on the `'iopub'` channel.
    *
    * See [Comm open](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
    */
  trait ICommOpenMsg extends IIOPubMessage {
    @JSName("content")
    var content_ICommOpenMsg: ICommOpen
  }
  
  /**
    * A `'complete_reply'` message on the `'stream'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
    *
    * **See also:** [[ICompleteRequest]], [[IKernel.complete]]
    */
  trait ICompleteReplyMsg extends IShellMessage {
    @JSName("content")
    var content_ICompleteReplyMsg: atJupyterlabServicesLib.Anon_Cursorend
  }
  
  /**
    * The content of a  `'complete_request'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
    *
    * **See also:** [[ICompleteReply]], [[IKernel.complete]]
    */
  trait ICompleteRequest
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var code: java.lang.String
    var cursor_pos: scala.Double
  }
  
  /**
    * A `'display_data'` message on the `'iopub'` channel.
    *
    * See [Display data](https://jupyter-client.readthedocs.io/en/latest/messaging.html#display-data).
    */
  trait IDisplayDataMsg extends IIOPubMessage {
    @JSName("content")
    var content_IDisplayDataMsg: atJupyterlabServicesLib.Anon_Data
  }
  
  /**
    * A `'error'` message on the `'iopub'` channel.
    *
    * See [Execution errors](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-errors).
    */
  trait IErrorMsg extends IIOPubMessage {
    @JSName("content")
    var content_IErrorMsg: atJupyterlabServicesLib.Anon_Ename
  }
  
  /**
    * The `'execute_reply'` contents for an `'error'` status.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
    */
  trait IExecuteErrorReply extends IExecuteReply {
    /**
      * The exception name.
      */
    var ename: java.lang.String
    /**
      * The Exception value.
      */
    var evalue: java.lang.String
    /**
      * A list of traceback frames.
      */
    var traceback: js.Array[java.lang.String]
  }
  
  /**
    * An `'execute_input'` message on the `'iopub'` channel.
    *
    * See [Code inputs](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-inputs).
    */
  trait IExecuteInputMsg extends IIOPubMessage {
    @JSName("content")
    var content_IExecuteInputMsg: atJupyterlabServicesLib.Anon_Code
  }
  
  /**
    * The `'execute_reply'` contents for an `'ok'` status.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
    */
  trait IExecuteOkReply extends IExecuteReply {
    /**
      * A list of payload objects.
      * Payloads are considered deprecated.
      * The only requirement of each payload object is that it have a 'source'
      * key, which is a string classifying the payload (e.g. 'page').
      */
    var payload: js.UndefOr[js.Array[atPhosphorCoreutilsLib.libJsonMod.JSONObject]] = js.undefined
    /**
      * Results for the user_expressions.
      */
    var user_expressions: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  }
  
  /**
    * The options used to configure an execute request.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execute).
    */
  trait IExecuteOptions
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    /**
      * Whether to allow stdin requests.
      * The default is `true`.
      */
    var allow_stdin: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Whether to execute the code as quietly as possible.
      * The default is `false`.
      */
    var silent: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Whether to the abort execution queue on an error.
      * The default is `false`.
      */
    var stop_on_error: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Whether to store history of the execution.
      * The default `true` if silent is False.
      * It is forced to  `false ` if silent is `true`.
      */
    var store_history: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A mapping of names to expressions to be evaluated in the
      * kernel's interactive namespace.
      */
    var user_expressions: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONObject] = js.undefined
  }
  
  /**
    * The content of an `execute-reply` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
    */
  trait IExecuteReply
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var execution_count: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ExecutionCount
    var status: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.ok | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.error | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.abort
  }
  
  /**
    * An `'execute_reply'` message on the `'stream'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
    *
    * **See also:** [[IExecuteRequest]], [[IKernel.execute]]
    */
  trait IExecuteReplyMsg extends IShellMessage {
    @JSName("content")
    var content_IExecuteReplyMsg: IExecuteReply
  }
  
  /**
    * The content of an `'execute_request'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execute).
    *
    * **See also:** [[IExecuteReply]], [[IKernel.execute]]
    */
  trait IExecuteRequest extends IExecuteOptions {
    var code: java.lang.String
  }
  
  /**
    * An `'execute_result'` message on the `'iopub'` channel.
    *
    * See [Execution results](https://jupyter-client.readthedocs.io/en/latest/messaging.html#id4).
    */
  trait IExecuteResultMsg extends IIOPubMessage {
    @JSName("content")
    var content_IExecuteResultMsg: atJupyterlabServicesLib.Anon_DataExecutioncount
  }
  
  /**
    * Kernel message header content.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#general-message-format).
    *
    * **See also:** [[IMessage]]
    */
  trait IHeader
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var msg_id: java.lang.String
    var msg_type: java.lang.String
    var session: java.lang.String
    var username: java.lang.String
    var version: java.lang.String
  }
  
  /**
    * A `'history_reply'` message on the `'stream'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
    *
    * **See also:** [[IHistoryRequest]], [[IKernel.history]]
    */
  trait IHistoryReplyMsg extends IShellMessage {
    @JSName("content")
    var content_IHistoryReplyMsg: atJupyterlabServicesLib.Anon_History
  }
  
  /**
    * The content of a `'history_request'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
    *
    * **See also:** [[IHistoryReply]], [[[IKernel.history]]]
    */
  trait IHistoryRequest
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var hist_access_type: HistAccess
    var n: js.UndefOr[scala.Double] = js.undefined
    var output: scala.Boolean
    var pattern: js.UndefOr[java.lang.String] = js.undefined
    var raw: scala.Boolean
    var session: js.UndefOr[scala.Double] = js.undefined
    var start: js.UndefOr[scala.Double] = js.undefined
    var stop: js.UndefOr[scala.Double] = js.undefined
    var unique: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  /**
    * A kernel message on the `'iopub'` channel.
    */
  trait IIOPubMessage extends IMessage {
    @JSName("channel")
    var channel_IIOPubMessage: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.iopub
  }
  
  /**
    * The kernel info content.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
    */
  trait IInfoReply
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var banner: java.lang.String
    var help_links: js.Array[atJupyterlabServicesLib.Anon_Text]
    var implementation: java.lang.String
    var implementation_version: java.lang.String
    var language_info: ILanguageInfo
    var protocol_version: java.lang.String
  }
  
  /**
    * A `'kernel_info_reply'` message on the `'stream'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
    */
  trait IInfoReplyMsg extends IShellMessage {
    @JSName("content")
    var content_IInfoReplyMsg: IInfoReply
  }
  
  /**
    * The content of an `'input_reply'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
    *
    * **See also:** [[IKernel.input_reply]]
    */
  trait IInputReply
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var value: java.lang.String
  }
  
  /**
    * The content of an `'input_request'` message.
    */
  trait IInputRequest
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    /**
      * Whether the request is for a password.
      * If so, the frontend shouldn't echo input.
      */
    var password: scala.Boolean
    /**
      * The text to show at the prompt.
      */
    var prompt: java.lang.String
  }
  
  /**
    * An `'input_request'` message on the `'stdin'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
    */
  trait IInputRequestMsg extends IStdinMessage {
    @JSName("content")
    var content_IInputRequestMsg: IInputRequest
  }
  
  /**
    * A `'inspect_reply'` message on the `'stream'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
    *
    * **See also:** [[IInspectRequest]], [[IKernel.inspect]]
    */
  trait IInspectReplyMsg extends IShellMessage {
    @JSName("content")
    var content_IInspectReplyMsg: atJupyterlabServicesLib.Anon_DataError
  }
  
  /**
    * The content of an `'inspect_request'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
    *
    * **See also:** [[IInspectReply]], [[[IKernel.inspect]]]
    */
  trait IInspectRequest
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var code: java.lang.String
    var cursor_pos: scala.Double
    var detail_level: atJupyterlabServicesLib.atJupyterlabServicesLibNumbers.`0` | atJupyterlabServicesLib.atJupyterlabServicesLibNumbers.`1`
  }
  
  /**
    * An `'is_complete_reply'` message on the `'stream'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-completeness).
    *
    * **See also:** [[IIsCompleteRequest]], [[IKernel.isComplete]]
    */
  trait IIsCompleteReplyMsg extends IShellMessage {
    @JSName("content")
    var content_IIsCompleteReplyMsg: atJupyterlabServicesLib.Anon_Indent
  }
  
  /**
    * The content of an `'is_complete_request'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-completeness).
    *
    * **See also:** [[IIsCompleteReply]], [[IKernel.isComplete]]
    */
  trait IIsCompleteRequest
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var code: java.lang.String
  }
  
  /**
    * The kernel language information specification.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
    */
  trait ILanguageInfo
    extends atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ILanguageInfoMetadata {
    var nbconverter_exporter: js.UndefOr[java.lang.String] = js.undefined
    var version: java.lang.String
  }
  
  /**
    * Kernel message specification.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#general-message-format).
    */
  trait IMessage extends js.Object {
    var buffers: js.UndefOr[js.Array[stdLib.ArrayBuffer | stdLib.ArrayBufferView]] = js.undefined
    var channel: Channel
    var content: atPhosphorCoreutilsLib.libJsonMod.JSONObject
    var header: IHeader
    var metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject
    var parent_header: IHeader | js.Object
  }
  
  /**
    * Options for an `IMessage`.
    *
    * **See also:** [[IMessage]]
    */
  trait IOptions extends js.Object {
    var channel: Channel
    var msgId: js.UndefOr[java.lang.String] = js.undefined
    var msgType: java.lang.String
    var session: java.lang.String
    var username: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * A kernel message on the `'shell'` channel.
    */
  trait IShellMessage extends IMessage {
    @JSName("channel")
    var channel_IShellMessage: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.shell
  }
  
  /**
    * A `'status'` message on the `'iopub'` channel.
    *
    * See [Kernel status](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-status).
    */
  trait IStatusMsg extends IIOPubMessage {
    @JSName("content")
    var content_IStatusMsg: atJupyterlabServicesLib.Anon_Executionstate
  }
  
  /**
    * A kernel message on the `'stdin'` channel.
    */
  trait IStdinMessage extends IMessage {
    @JSName("channel")
    var channel_IStdinMessage: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.stdin
  }
  
  /**
    * A `'stream'` message on the `'iopub'` channel.
    *
    * See [Streams](https://jupyter-client.readthedocs.io/en/latest/messaging.html#streams-stdout-stderr-etc).
    */
  trait IStreamMsg extends IIOPubMessage {
    @JSName("content")
    var content_IStreamMsg: atJupyterlabServicesLib.Anon_Name
  }
  
  /**
    * An `'update_display_data'` message on the `'iopub'` channel.
    *
    * See [Update Display data](https://jupyter-client.readthedocs.io/en/latest/messaging.html#update-display-data).
    */
  trait IUpdateDisplayDataMsg extends IDisplayDataMsg {
    @JSName("content")
    var content_IUpdateDisplayDataMsg: atJupyterlabServicesLib.Anon_Data with atJupyterlabServicesLib.Anon_Transient
  }
  
  /**
    * Create a well-formed kernel message.
    */
  def createMessage(options: IOptions): IMessage = js.native
  def createMessage(options: IOptions, content: atPhosphorCoreutilsLib.libJsonMod.JSONObject): IMessage = js.native
  def createMessage(
    options: IOptions,
    content: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): IMessage = js.native
  def createMessage(
    options: IOptions,
    content: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    buffers: js.Array[stdLib.ArrayBuffer | stdLib.ArrayBufferView]
  ): IMessage = js.native
  /**
    * Create a well-formed kernel shell message.
    */
  def createShellMessage(options: IOptions): IShellMessage = js.native
  def createShellMessage(options: IOptions, content: atPhosphorCoreutilsLib.libJsonMod.JSONObject): IShellMessage = js.native
  def createShellMessage(
    options: IOptions,
    content: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): IShellMessage = js.native
  def createShellMessage(
    options: IOptions,
    content: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    buffers: js.Array[stdLib.ArrayBuffer | stdLib.ArrayBufferView]
  ): IShellMessage = js.native
  /**
    * Test whether a kernel message is a `'clear_output'` message.
    */
  def isClearOutputMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IClearOutputMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_close'` message.
    */
  def isCommCloseMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommCloseMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_msg'` message.
    */
  def isCommMsgMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommMsgMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_open'` message.
    */
  def isCommOpenMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommOpenMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'display_data'` message.
    */
  def isDisplayDataMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'error'` message.
    */
  def isErrorMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IErrorMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_input'` message.
    */
  def isExecuteInputMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteInputMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_reply'` message.
    */
  def isExecuteReplyMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteReplyMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_result'` message.
    */
  def isExecuteResultMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteResultMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'input_request'` message.
    */
  def isInputRequestMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInputRequestMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is a `'status'` message.
    */
  def isStatusMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IStatusMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is a `'stream'` message.
    */
  def isStreamMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IStreamMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'update_display_data'` message.
    */
  def isUpdateDisplayDataMsg(msg: IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IUpdateDisplayDataMsg */ scala.Boolean = js.native
}


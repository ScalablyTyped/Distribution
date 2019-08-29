package typings.atJupyterlabServices.libKernelMessagesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ExecutionCount
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ILanguageInfoMetadata
import typings.atJupyterlabServices.Anon_0
import typings.atJupyterlabServices.Anon_Allowstdin
import typings.atJupyterlabServices.Anon_Arguments
import typings.atJupyterlabServices.Anon_Body
import typings.atJupyterlabServices.Anon_BodyCommand
import typings.atJupyterlabServices.Anon_Code
import typings.atJupyterlabServices.Anon_CodeExecutioncount
import typings.atJupyterlabServices.Anon_CodeString
import typings.atJupyterlabServices.Anon_Commid
import typings.atJupyterlabServices.Anon_CommidData
import typings.atJupyterlabServices.Anon_Data
import typings.atJupyterlabServices.Anon_DataExecutioncount
import typings.atJupyterlabServices.Anon_Ename
import typings.atJupyterlabServices.Anon_Executionstate
import typings.atJupyterlabServices.Anon_Name
import typings.atJupyterlabServices.Anon_Password
import typings.atJupyterlabServices.Anon_Target
import typings.atJupyterlabServices.Anon_Targetname
import typings.atJupyterlabServices.Anon_Text
import typings.atJupyterlabServices.Anon_Transient
import typings.atJupyterlabServices.Anon_Wait
import typings.atJupyterlabServices.atJupyterlabServicesStrings.abort
import typings.atJupyterlabServices.atJupyterlabServicesStrings.clear_output
import typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_close
import typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_info_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_info_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_msg
import typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_open
import typings.atJupyterlabServices.atJupyterlabServicesStrings.complete
import typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.control
import typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_event
import typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.display_data
import typings.atJupyterlabServices.atJupyterlabServicesStrings.error
import typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_input
import typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_result
import typings.atJupyterlabServices.atJupyterlabServicesStrings.history_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.history_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.incomplete
import typings.atJupyterlabServices.atJupyterlabServicesStrings.input_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.input_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.invalid
import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.kernel_info_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.kernel_info_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.ok
import typings.atJupyterlabServices.atJupyterlabServicesStrings.range
import typings.atJupyterlabServices.atJupyterlabServicesStrings.search
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atJupyterlabServices.atJupyterlabServicesStrings.status
import typings.atJupyterlabServices.atJupyterlabServicesStrings.stdin
import typings.atJupyterlabServices.atJupyterlabServicesStrings.stream
import typings.atJupyterlabServices.atJupyterlabServicesStrings.tail
import typings.atJupyterlabServices.atJupyterlabServicesStrings.unknown
import typings.atJupyterlabServices.atJupyterlabServicesStrings.update_display_data
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.Channel
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ControlMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IClearOutputMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommCloseMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommInfoReply
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommInfoReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommInfoRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommMsgMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommOpenMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICompleteReply
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICompleteReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICompleteRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IControlMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDebugEventMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDebugReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDebugRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDisplayDataMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IErrorMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteCount
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteInputMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteReply
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteResultMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHeader
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryReply
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryRequestRange
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryRequestSearch
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryRequestTail
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIOPubMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInfoReply
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInfoReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInfoRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInputReply
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInputReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInputRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInspectReply
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInspectReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInspectRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIsCompleteReplyIncomplete
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIsCompleteReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIsCompleteReplyOther
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIsCompleteRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ILanguageInfo
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IOPubMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IOptions
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IReplyOkContent
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IShellMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IStatusMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IStdinMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IStreamMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IUpdateDisplayDataMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.Message
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.MessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ReplyContent
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ShellMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.StdinMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs._Message
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs._ReplyContent
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/messages", "KernelMessage")
@js.native
object KernelMessageNs extends js.Object {
  /**
    * The valid Jupyter channel names in a message to a frontend.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.control
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.stdin
  */
  trait Channel extends js.Object
  
  /**
    * Control message types.
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, debug message types are *NOT*
    * considered part of the public API, and may change without notice.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_request
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_reply
  */
  trait ControlMessageType extends MessageType
  
  /**
    * A `'clear_output'` message on the `'iopub'` channel.
    *
    * See [Clear output](https://jupyter-client.readthedocs.io/en/latest/messaging.html#clear-output).
    */
  trait IClearOutputMsg
    extends IIOPubMessage[clear_output]
       with _Message {
    @JSName("content")
    var content_IClearOutputMsg: Anon_Wait
  }
  
  /**
    * A `'comm_close'` message on the `'iopub'` channel.
    *
    * See [Comm close](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
    */
  trait ICommCloseMsg[T /* <: iopub | shell */] extends IMessage[comm_close] {
    @JSName("channel")
    var channel_ICommCloseMsg: T
    @JSName("content")
    var content_ICommCloseMsg: Anon_CommidData
  }
  
  /**
    * A `'comm_info_reply'` message content.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm-info).
    *
    * **See also:** [[ICommInfoRequest]], [[IKernel.commInfo]]
    */
  trait ICommInfoReply extends IReplyOkContent {
    /**
      * Mapping of comm ids to target names.
      */
    var comms: StringDictionary[Anon_Targetname]
  }
  
  /**
    * A `'comm_info_reply'` message on the `'shell'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm-info).
    *
    * **See also:** [[ICommInfoRequestMsg]], [[IKernel.commInfo]]
    */
  trait ICommInfoReplyMsg
    extends IShellMessage[comm_info_reply]
       with _Message {
    @JSName("content")
    var content_ICommInfoReplyMsg: ReplyContent[ICommInfoReply]
    @JSName("parent_header")
    var parent_header_ICommInfoReplyMsg: IHeader[comm_info_request]
  }
  
  /**
    * A `'comm_info_request'` message on the `'shell'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm-info).
    *
    * **See also:** [[ICommInfoReplyMsg]], [[IKernel.commInfo]]
    */
  trait ICommInfoRequestMsg
    extends IShellMessage[comm_info_request]
       with _Message {
    @JSName("content")
    var content_ICommInfoRequestMsg: Anon_Target
  }
  
  /**
    * A `'comm_msg'` message on the `'iopub'` channel.
    *
    * See [Comm msg](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
    */
  trait ICommMsgMsg[T /* <: iopub | shell */] extends IMessage[comm_msg] {
    @JSName("channel")
    var channel_ICommMsgMsg: T
    @JSName("content")
    var content_ICommMsgMsg: Anon_CommidData
  }
  
  /**
    * A `'comm_open'` message on the `'iopub'` channel.
    *
    * See [Comm open](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
    */
  trait ICommOpenMsg[T /* <: shell | iopub */] extends IMessage[comm_open] {
    @JSName("channel")
    var channel_ICommOpenMsg: T
    @JSName("content")
    var content_ICommOpenMsg: Anon_Commid
  }
  
  /**
    * A `'complete_reply'` message content.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
    *
    * **See also:** [[ICompleteRequest]], [[IKernel.complete]]
    */
  trait ICompleteReply extends IReplyOkContent {
    var cursor_end: Double
    var cursor_start: Double
    var matches: js.Array[String]
    var metadata: JSONObject
  }
  
  /**
    * A `'complete_reply'` message on the `'shell'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
    *
    * **See also:** [[ICompleteRequest]], [[IKernel.complete]]
    */
  trait ICompleteReplyMsg
    extends IShellMessage[complete_reply]
       with _Message {
    @JSName("content")
    var content_ICompleteReplyMsg: ReplyContent[ICompleteReply]
    @JSName("parent_header")
    var parent_header_ICompleteReplyMsg: IHeader[complete_request]
  }
  
  /**
    * A  `'complete_request'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
    *
    * **See also:** [[ICompleteReplyMsg]], [[IKernel.complete]]
    */
  trait ICompleteRequestMsg
    extends IShellMessage[complete_request]
       with _Message {
    @JSName("content")
    var content_ICompleteRequestMsg: Anon_Code
  }
  
  /**
    * A kernel message on the `'control'` channel.
    */
  trait IControlMessage[T /* <: ControlMessageType */] extends IMessage[T] {
    @JSName("channel")
    var channel_IControlMessage: control
  }
  
  /**
    * An experimental `'debug_event'` message on the `'iopub'` channel
    *
    * @hidden
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this is *NOT* considered
    * part of the public API, and may change without notice.
    */
  trait IDebugEventMsg
    extends IIOPubMessage[debug_event]
       with _Message {
    @JSName("content")
    var content_IDebugEventMsg: Anon_Body
  }
  
  /**
    * An experimental `'debug_reply'` messsage on the `'control'` channel.
    *
    * @hidden
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this is *NOT* considered
    * part of the public API, and may change without notice.
    */
  trait IDebugReplyMsg
    extends IControlMessage[debug_reply]
       with _Message {
    @JSName("content")
    var content_IDebugReplyMsg: Anon_BodyCommand
  }
  
  /**
    * An experimental `'debug_request'` messsage on the `'control'` channel.
    *
    * @hidden
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this function is *NOT* considered
    * part of the public API, and may change without notice.
    */
  trait IDebugRequestMsg
    extends IControlMessage[debug_request]
       with _Message {
    @JSName("content")
    var content_IDebugRequestMsg: Anon_Arguments
  }
  
  /**
    * A `'display_data'` message on the `'iopub'` channel.
    *
    * See [Display data](https://jupyter-client.readthedocs.io/en/latest/messaging.html#display-data).
    */
  trait IDisplayDataMsg
    extends IIOPubMessage[display_data]
       with _Message {
    @JSName("content")
    var content_IDisplayDataMsg: Anon_Data
  }
  
  /**
    * A `'error'` message on the `'iopub'` channel.
    *
    * See [Execution errors](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-errors).
    */
  trait IErrorMsg
    extends IIOPubMessage[error]
       with _Message {
    @JSName("content")
    var content_IErrorMsg: Anon_Ename
  }
  
  /**
    * The content of an `execute-reply` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
    */
  trait IExecuteCount extends js.Object {
    var execution_count: ExecutionCount
  }
  
  /**
    * An `'execute_input'` message on the `'iopub'` channel.
    *
    * See [Code inputs](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-inputs).
    */
  trait IExecuteInputMsg
    extends IIOPubMessage[execute_input]
       with _Message {
    @JSName("content")
    var content_IExecuteInputMsg: Anon_CodeExecutioncount
  }
  
  /**
    * The `'execute_reply'` contents for an `'ok'` status.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
    */
  trait IExecuteReply
    extends IExecuteCount
       with IReplyOkContent {
    /**
      * A list of payload objects.
      * Payloads are considered deprecated.
      * The only requirement of each payload object is that it have a 'source'
      * key, which is a string classifying the payload (e.g. 'page').
      */
    var payload: js.UndefOr[js.Array[JSONObject]] = js.undefined
    /**
      * Results for the user_expressions.
      */
    var user_expressions: JSONObject
  }
  
  /**
    * An `'execute_reply'` message on the `'stream'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
    *
    * **See also:** [[IExecuteRequest]], [[IKernel.execute]]
    */
  trait IExecuteReplyMsg
    extends IShellMessage[execute_reply]
       with _Message {
    @JSName("content")
    var content_IExecuteReplyMsg: ReplyContent[IExecuteReply] with IExecuteCount
    @JSName("parent_header")
    var parent_header_IExecuteReplyMsg: IHeader[execute_request]
  }
  
  /**
    * An `execute_request` message on the `'shell'` channel.
    */
  trait IExecuteRequestMsg
    extends IShellMessage[execute_request]
       with _Message {
    @JSName("content")
    var content_IExecuteRequestMsg: Anon_Allowstdin
  }
  
  /**
    * An `'execute_result'` message on the `'iopub'` channel.
    *
    * See [Execution results](https://jupyter-client.readthedocs.io/en/latest/messaging.html#id4).
    */
  trait IExecuteResultMsg
    extends IIOPubMessage[execute_result]
       with _Message {
    @JSName("content")
    var content_IExecuteResultMsg: Anon_DataExecutioncount
  }
  
  /**
    * Kernel message header content.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#general-message-format).
    *
    * **See also:** [[IMessage]]
    */
  trait IHeader[T /* <: MessageType */] extends js.Object {
    /**
      * ISO 8601 timestamp for when the message is created
      */
    var date: String
    /**
      * Message id, typically UUID, must be unique per message
      */
    var msg_id: String
    /**
      * Message type
      */
    var msg_type: T
    /**
      * Session id, typically UUID, should be unique per session.
      */
    var session: String
    /**
      * The user sending the message
      */
    var username: String
    /**
      * The message protocol version, should be 5.1, 5.2, 5.3, etc.
      */
    var version: String
  }
  
  /**
    * A `'history_reply'` message content.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
    *
    * **See also:** [[IHistoryRequest]], [[IKernel.history]]
    */
  trait IHistoryReply extends IReplyOkContent {
    var history: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]]
  }
  
  /**
    * A `'history_reply'` message on the `'shell'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
    *
    * **See also:** [[IHistoryRequest]], [[IKernel.history]]
    */
  trait IHistoryReplyMsg
    extends IShellMessage[history_reply]
       with _Message {
    @JSName("content")
    var content_IHistoryReplyMsg: ReplyContent[IHistoryReply]
    @JSName("parent_header")
    var parent_header_IHistoryReplyMsg: IHeader[history_request]
  }
  
  /**
    * A `'history_request'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
    *
    * **See also:** [[IHistoryReplyMsg]], [[[IKernel.history]]]
    */
  trait IHistoryRequestMsg
    extends IShellMessage[history_request]
       with _Message {
    @JSName("content")
    var content_IHistoryRequestMsg: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail
  }
  
  /**
    * The content of a `'history_request'` range message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
    *
    * **See also:** [[IHistoryReply]], [[[IKernel.history]]]
    */
  trait IHistoryRequestRange extends js.Object {
    var hist_access_type: range
    var output: Boolean
    var raw: Boolean
    var session: Double
    var start: Double
    var stop: Double
  }
  
  /**
    * The content of a `'history_request'` search message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
    *
    * **See also:** [[IHistoryReply]], [[[IKernel.history]]]
    */
  trait IHistoryRequestSearch extends js.Object {
    var hist_access_type: search
    var n: Double
    var output: Boolean
    var pattern: String
    var raw: Boolean
    var unique: Boolean
  }
  
  /**
    * The content of a `'history_request'` tail message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
    *
    * **See also:** [[IHistoryReply]], [[[IKernel.history]]]
    */
  trait IHistoryRequestTail extends js.Object {
    var hist_access_type: tail
    var n: Double
    var output: Boolean
    var raw: Boolean
  }
  
  /**
    * A kernel message on the `'iopub'` channel.
    */
  trait IIOPubMessage[T /* <: IOPubMessageType */] extends IMessage[T] {
    @JSName("channel")
    var channel_IIOPubMessage: iopub
  }
  
  /**
    * A `'kernel_info_reply'` message content.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
    */
  trait IInfoReply extends IReplyOkContent {
    var banner: String
    var help_links: js.Array[Anon_Text]
    var implementation: String
    var implementation_version: String
    var language_info: ILanguageInfo
    var protocol_version: String
  }
  
  /**
    * A `'kernel_info_reply'` message on the `'shell'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
    */
  trait IInfoReplyMsg
    extends IShellMessage[kernel_info_reply]
       with _Message {
    @JSName("content")
    var content_IInfoReplyMsg: ReplyContent[IInfoReply]
    @JSName("parent_header")
    var parent_header_IInfoReplyMsg: IHeader[kernel_info_request]
  }
  
  /**
    * A `'kernel_info_request'` message on the `'shell'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
    */
  trait IInfoRequestMsg
    extends IShellMessage[kernel_info_request]
       with _Message
  
  /**
    * An `'input_reply'` message content.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
    */
  trait IInputReply extends IReplyOkContent {
    var value: String
  }
  
  /**
    * An `'input_reply'` message on the `'stdin'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
    */
  trait IInputReplyMsg
    extends IStdinMessage[input_reply]
       with _Message {
    @JSName("content")
    var content_IInputReplyMsg: ReplyContent[IInputReply]
    @JSName("parent_header")
    var parent_header_IInputReplyMsg: IHeader[input_request]
  }
  
  /**
    * An `'input_request'` message on the `'stdin'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
    */
  trait IInputRequestMsg
    extends IStdinMessage[input_request]
       with _Message {
    @JSName("content")
    var content_IInputRequestMsg: Anon_Password
  }
  
  /**
    * A `'inspect_reply'` message content.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
    *
    * **See also:** [[IInspectRequest]], [[IKernel.inspect]]
    */
  trait IInspectReply extends IReplyOkContent {
    var data: JSONObject
    var found: Boolean
    var metadata: JSONObject
  }
  
  /**
    * A `'inspect_reply'` message on the `'shell'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
    *
    * **See also:** [[IInspectRequest]], [[IKernel.inspect]]
    */
  trait IInspectReplyMsg
    extends IShellMessage[inspect_reply]
       with _Message {
    @JSName("content")
    var content_IInspectReplyMsg: ReplyContent[IInspectReply]
    @JSName("parent_header")
    var parent_header_IInspectReplyMsg: IHeader[inspect_request]
  }
  
  /**
    * An `'inspect_request'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
    *
    * **See also:** [[IInspectReplyMsg]], [[[IKernel.inspect]]]
    */
  trait IInspectRequestMsg
    extends IShellMessage[inspect_request]
       with _Message {
    @JSName("content")
    var content_IInspectRequestMsg: Anon_0
  }
  
  /**
    * An 'incomplete' completion reply
    */
  trait IIsCompleteReplyIncomplete extends js.Object {
    var indent: String
    var status: incomplete
  }
  
  /**
    * An `'is_complete_reply'` message on the `'stream'` channel.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-completeness).
    *
    * **See also:** [[IIsCompleteRequest]], [[IKernel.isComplete]]
    */
  trait IIsCompleteReplyMsg
    extends IShellMessage[is_complete_reply]
       with _Message {
    @JSName("content")
    var content_IIsCompleteReplyMsg: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther]
    @JSName("parent_header")
    var parent_header_IIsCompleteReplyMsg: IHeader[is_complete_request]
  }
  
  /**
    * A completion reply for completion or invalid states.
    */
  trait IIsCompleteReplyOther extends js.Object {
    var status: complete | invalid | unknown
  }
  
  /**
    * An `'is_complete_request'` message.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-completeness).
    *
    * **See also:** [[IIsCompleteReplyMsg]], [[IKernel.isComplete]]
    */
  trait IIsCompleteRequestMsg
    extends IShellMessage[is_complete_request]
       with _Message {
    @JSName("content")
    var content_IIsCompleteRequestMsg: Anon_CodeString
  }
  
  /**
    * The kernel language information specification.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
    */
  trait ILanguageInfo extends ILanguageInfoMetadata {
    var nbconverter_exporter: js.UndefOr[String] = js.undefined
    var version: String
  }
  
  /**
    * Kernel message specification.
    *
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#general-message-format).
    */
  trait IMessage[MSGTYPE /* <: MessageType */] extends js.Object {
    /**
      * An optional list of binary buffers.
      */
    var buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.undefined
    /**
      * The channel on which the message is transmitted.
      */
    var channel: Channel
    /**
      * The content of the message.
      */
    var content: /* import warning: ImportType.apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.Message['content'] */ js.Any
    /**
      * The message header.
      */
    var header: IHeader[MSGTYPE]
    /**
      * Metadata associated with the message.
      */
    var metadata: JSONObject
    /**
      * The parent message
      */
    var parent_header: IHeader[MessageType] | js.Object
  }
  
  /**
    * IOPub message types.
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, debug message types are *NOT*
    * considered part of the public API, and may change without notice.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.clear_output
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_close
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_msg
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_open
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.display_data
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.error
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_input
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_result
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.status
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.stream
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.update_display_data
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_event
  */
  trait IOPubMessageType extends MessageType
  
  trait IOptions[T /* <: Message */] extends js.Object {
    var buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.undefined
    var channel: /* import warning: ImportType.apply Failed type conversion: T['channel'] */ js.Any
    var content: /* import warning: ImportType.apply Failed type conversion: T['content'] */ js.Any
    var metadata: js.UndefOr[JSONObject] = js.undefined
    var msgId: js.UndefOr[String] = js.undefined
    var msgType: /* import warning: ImportType.apply Failed type conversion: T['header']['msg_type'] */ js.Any
    var parentHeader: js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: T['parent_header'] */ js.Any
      ] = js.undefined
    var session: String
    var username: js.UndefOr[String] = js.undefined
  }
  
  /**
    * Reply content indicating an aborted request.
    *
    * This is [deprecated](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply)
    * in message spec 5.1. Kernels should send an 'error' reply instead.
    */
  trait IReplyAbortContent
    extends _ReplyContent[js.Any] {
    var status: abort
  }
  
  /**
    * Reply content indicating an error.
    *
    * See the [Message spec](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply) for details.
    */
  trait IReplyErrorContent
    extends _ReplyContent[js.Any] {
    /**
      * Exception name
      */
    var ename: String
    /**
      * Exception value
      */
    var evalue: String
    var status: error
    /**
      * Traceback
      */
    var traceback: js.Array[String]
  }
  
  /**
    * Reply content indicating a sucessful request.
    */
  trait IReplyOkContent extends js.Object {
    var status: ok
  }
  
  /**
    * A kernel message on the `'shell'` channel.
    */
  trait IShellMessage[T /* <: ShellMessageType */] extends IMessage[T] {
    @JSName("channel")
    var channel_IShellMessage: shell
  }
  
  /**
    * A `'status'` message on the `'iopub'` channel.
    *
    * See [Kernel status](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-status).
    */
  trait IStatusMsg
    extends IIOPubMessage[status]
       with _Message {
    @JSName("content")
    var content_IStatusMsg: Anon_Executionstate
  }
  
  /**
    * A kernel message on the `'stdin'` channel.
    */
  trait IStdinMessage[T /* <: StdinMessageType */] extends IMessage[T] {
    @JSName("channel")
    var channel_IStdinMessage: stdin
  }
  
  /**
    * A `'stream'` message on the `'iopub'` channel.
    *
    * See [Streams](https://jupyter-client.readthedocs.io/en/latest/messaging.html#streams-stdout-stderr-etc).
    */
  trait IStreamMsg
    extends IIOPubMessage[stream]
       with _Message {
    @JSName("content")
    var content_IStreamMsg: Anon_Name
  }
  
  /**
    * An `'update_display_data'` message on the `'iopub'` channel.
    *
    * See [Update Display data](https://jupyter-client.readthedocs.io/en/latest/messaging.html#update-display-data).
    */
  trait IUpdateDisplayDataMsg
    extends IIOPubMessage[update_display_data]
       with _Message {
    @JSName("content")
    var content_IUpdateDisplayDataMsg: Anon_Data with Anon_Transient
  }
  
  /**
    * Jupyter message types.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IOPubMessageType
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ShellMessageType
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ControlMessageType
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.StdinMessageType
  */
  trait MessageType extends js.Object
  
  /**
    * Shell message types.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_close
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_info_reply
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_info_request
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_msg
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_open
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_reply
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_request
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_reply
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_request
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.history_reply
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.history_request
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_reply
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_request
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.interrupt_reply
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.interrupt_request
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_reply
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_request
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.kernel_info_reply
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.kernel_info_request
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.shutdown_reply
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.shutdown_request
  */
  trait ShellMessageType extends MessageType
  
  /**
    * Stdin message types.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.input_request
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.input_reply
  */
  trait StdinMessageType extends MessageType
  
  trait _Message extends js.Object
  
  trait _ReplyContent[T] extends js.Object
  
  def createMessage[T /* <: ICommCloseMsg[shell] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IClearOutputMsg[T /* <: IClearOutputMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommCloseMsgiopub[T /* <: ICommCloseMsg[iopub] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommInfoReplyMsg[T /* <: ICommInfoReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommInfoRequestMsg[T /* <: ICommInfoRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommMsgMsgiopub[T /* <: ICommMsgMsg[iopub] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommMsgMsgshell[T /* <: ICommMsgMsg[shell] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommOpenMsgiopub[T /* <: ICommOpenMsg[iopub] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommOpenMsgshell[T /* <: ICommOpenMsg[shell] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICompleteReplyMsg[T /* <: ICompleteReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICompleteRequestMsg[T /* <: ICompleteRequestMsg */](options: IOptions[T]): T = js.native
  /**
    * @hidden
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this function is *NOT* considered
    * part of the public API, and may change without notice.
    */
  @JSName("createMessage")
  def createMessage_T_IDebugEventMsg[T /* <: IDebugEventMsg */](options: IOptions[T]): T = js.native
  /**
    * @hidden
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this function is *NOT* considered
    * part of the public API, and may change without notice.
    */
  @JSName("createMessage")
  def createMessage_T_IDebugReplyMsg[T /* <: IDebugReplyMsg */](options: IOptions[T]): T = js.native
  /**
    * @hidden
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this function is *NOT* considered
    * part of the public API, and may change without notice.
    */
  @JSName("createMessage")
  def createMessage_T_IDebugRequestMsg[T /* <: IDebugRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IDisplayDataMsg[T /* <: IDisplayDataMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IErrorMsg[T /* <: IErrorMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteInputMsg[T /* <: IExecuteInputMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteReplyMsg[T /* <: IExecuteReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteRequestMsg[T /* <: IExecuteRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteResultMsg[T /* <: IExecuteResultMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IHistoryReplyMsg[T /* <: IHistoryReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IHistoryRequestMsg[T /* <: IHistoryRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInfoReplyMsg[T /* <: IInfoReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInfoRequestMsg[T /* <: IInfoRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInputReplyMsg[T /* <: IInputReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInputRequestMsg[T /* <: IInputRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInspectReplyMsg[T /* <: IInspectReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInspectRequestMsg[T /* <: IInspectRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IIsCompleteReplyMsg[T /* <: IIsCompleteReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IIsCompleteRequestMsg[T /* <: IIsCompleteRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IStatusMsg[T /* <: IStatusMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IStreamMsg[T /* <: IStreamMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IUpdateDisplayDataMsg[T /* <: IUpdateDisplayDataMsg */](options: IOptions[T]): T = js.native
  /**
    * Test whether a kernel message is a `'clear_output'` message.
    */
  def isClearOutputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IClearOutputMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_close'` message.
    */
  def isCommCloseMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommCloseMsg<'iopub' | 'shell'> */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_msg'` message.
    */
  def isCommMsgMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommMsgMsg<'iopub' | 'shell'> */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_open'` message.
    */
  def isCommOpenMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommOpenMsg<'iopub' | 'shell'> */ Boolean = js.native
  /**
    * Test whether a kernel message is an experimental `'debug_event'` message.
    *
    * @hidden
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this is *NOT* considered
    * part of the public API, and may change without notice.
    */
  def isDebugEventMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDebugEventMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an experimental `'debug_reply'` message.
    *
    * @hidden
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this is *NOT* considered
    * part of the public API, and may change without notice.
    */
  def isDebugReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDebugReplyMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an experimental `'debug_request'` message.
    *
    * @hidden
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this is *NOT* considered
    * part of the public API, and may change without notice.
    */
  def isDebugRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDebugRequestMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'display_data'` message.
    */
  def isDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'error'` message.
    */
  def isErrorMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IErrorMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_input'` message.
    */
  def isExecuteInputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteInputMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_reply'` message.
    */
  def isExecuteReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteReplyMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_result'` message.
    */
  def isExecuteResultMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteResultMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'kernel_info_request'` message.
    */
  def isInfoRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInfoRequestMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'input_reply'` message.
    */
  def isInputReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInputReplyMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'input_request'` message.
    */
  def isInputRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInputRequestMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'status'` message.
    */
  def isStatusMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IStatusMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'stream'` message.
    */
  def isStreamMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IStreamMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'update_display_data'` message.
    */
  def isUpdateDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IUpdateDisplayDataMsg */ Boolean = js.native
  /**
    * A convenience type for a base for an execute reply content.
    */
  type IExecuteReplyBase = IExecuteCount with IReplyOkContent
  /**
    * A message type for shell or control messages.
    *
    * #### Notes
    * This convenience is so we can use it as a generic type constraint.
    */
  type IShellControlMessage = IShellMessage[ShellMessageType] | IControlMessage[ControlMessageType]
  /**
    * Message types.
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, debug message types are *NOT*
    * considered part of the public API, and may change without notice.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IClearOutputMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommCloseMsg[
  typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub | typings.atJupyterlabServices.atJupyterlabServicesStrings.shell]
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommInfoReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommInfoRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommMsgMsg[
  typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub | typings.atJupyterlabServices.atJupyterlabServicesStrings.shell]
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommOpenMsg[
  typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub | typings.atJupyterlabServices.atJupyterlabServicesStrings.shell]
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICompleteReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICompleteRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDisplayDataMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IErrorMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteInputMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteResultMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInfoReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInfoRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInputReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInputRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInspectReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInspectRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIsCompleteReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIsCompleteRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IStatusMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IStreamMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IUpdateDisplayDataMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDebugRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDebugReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDebugEventMsg
  */
  type Message = _Message | (ICommCloseMsg[iopub | shell]) | (ICommMsgMsg[iopub | shell]) | (ICommOpenMsg[iopub | shell])
  /**
    * A convenience type for reply content.
    *
    * This automatically unions the necessary error and abort replies required in
    * the [message spec](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply).
    */
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IReplyErrorContent
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IReplyAbortContent
  */
  type ReplyContent[T] = _ReplyContent[T] | T
}


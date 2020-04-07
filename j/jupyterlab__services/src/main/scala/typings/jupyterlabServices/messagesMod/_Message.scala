package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.AnonAllowstdin
import typings.jupyterlabServices.AnonArguments
import typings.jupyterlabServices.AnonBody
import typings.jupyterlabServices.AnonCode
import typings.jupyterlabServices.AnonCodeString
import typings.jupyterlabServices.AnonCommid
import typings.jupyterlabServices.AnonCursorpos
import typings.jupyterlabServices.AnonData
import typings.jupyterlabServices.AnonEname
import typings.jupyterlabServices.AnonEvent
import typings.jupyterlabServices.AnonExecutioncount
import typings.jupyterlabServices.AnonExecutionstate
import typings.jupyterlabServices.AnonMetadata
import typings.jupyterlabServices.AnonName
import typings.jupyterlabServices.AnonPassword
import typings.jupyterlabServices.AnonTargetname
import typings.jupyterlabServices.AnonTransient
import typings.jupyterlabServices.AnonTransientAnonDisplayidString
import typings.jupyterlabServices.AnonWait
import typings.jupyterlabServices.jupyterlabServicesStrings.clear_output
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
import typings.jupyterlabServices.jupyterlabServicesStrings.complete_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typings.jupyterlabServices.jupyterlabServicesStrings.control
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_event
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_request
import typings.jupyterlabServices.jupyterlabServicesStrings.display_data
import typings.jupyterlabServices.jupyterlabServicesStrings.error
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_input
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_result
import typings.jupyterlabServices.jupyterlabServicesStrings.history_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.history_request
import typings.jupyterlabServices.jupyterlabServicesStrings.input_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.input_request
import typings.jupyterlabServices.jupyterlabServicesStrings.inspect_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.inspect_request
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
import typings.jupyterlabServices.jupyterlabServicesStrings.kernel_info_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.jupyterlabServices.jupyterlabServicesStrings.status
import typings.jupyterlabServices.jupyterlabServicesStrings.stdin
import typings.jupyterlabServices.jupyterlabServicesStrings.stream
import typings.jupyterlabServices.jupyterlabServicesStrings.update_display_data
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Message extends js.Object

object _Message {
  @scala.inline
  def IExecuteInputMsg(
    channel: iopub,
    content: AnonExecutioncount,
    header: IHeader[execute_input],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInspectReplyMsg(
    channel: shell,
    content: ReplyContent[IInspectReply],
    header: IHeader[inspect_reply],
    metadata: JSONObject,
    parent_header: IHeader[inspect_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def ICompleteRequestMsg(
    channel: shell,
    content: AnonCode,
    header: IHeader[complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IExecuteReplyMsg(
    channel: shell,
    content: ReplyContent[IExecuteReply] with IExecuteCount,
    header: IHeader[execute_reply],
    metadata: JSONObject,
    parent_header: IHeader[execute_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IDebugEventMsg(
    channel: iopub,
    content: AnonEvent,
    header: IHeader[debug_event],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IHistoryReplyMsg(
    channel: shell,
    content: ReplyContent[IHistoryReply],
    header: IHeader[history_reply],
    metadata: JSONObject,
    parent_header: IHeader[history_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IErrorMsg(
    channel: iopub,
    content: AnonEname,
    header: IHeader[error],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInputReplyMsg(
    channel: stdin,
    content: ReplyContent[IInputReply],
    header: IHeader[input_reply],
    metadata: JSONObject,
    parent_header: IHeader[input_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IDebugRequestMsg(
    channel: control,
    content: AnonArguments,
    header: IHeader[debug_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IExecuteRequestMsg(
    channel: shell,
    content: AnonAllowstdin,
    header: IHeader[execute_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def ICommInfoReplyMsg(
    channel: shell,
    content: ReplyContent[ICommInfoReply],
    header: IHeader[comm_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[comm_info_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInfoReplyMsg(
    channel: shell,
    content: ReplyContent[IInfoReply],
    header: IHeader[kernel_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[kernel_info_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IDisplayDataMsg(
    channel: iopub,
    content: AnonMetadata,
    header: IHeader[display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def ICommInfoRequestMsg(
    channel: shell,
    content: AnonTargetname,
    header: IHeader[comm_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IClearOutputMsg(
    channel: iopub,
    content: AnonWait,
    header: IHeader[clear_output],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IStatusMsg(
    channel: iopub,
    content: AnonExecutionstate,
    header: IHeader[status],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInspectRequestMsg(
    channel: shell,
    content: AnonCursorpos,
    header: IHeader[inspect_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInfoRequestMsg(
    channel: shell,
    content: AnonWait | AnonCommid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | AnonTargetname | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent,
    header: IHeader[kernel_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IIsCompleteRequestMsg(
    channel: shell,
    content: AnonCodeString,
    header: IHeader[is_complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IIsCompleteReplyMsg(
    channel: shell,
    content: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther],
    header: IHeader[is_complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[is_complete_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def ICompleteReplyMsg(
    channel: shell,
    content: ReplyContent[ICompleteReply],
    header: IHeader[complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[complete_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IUpdateDisplayDataMsg(
    channel: iopub,
    content: AnonMetadata with AnonTransientAnonDisplayidString,
    header: IHeader[update_display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IExecuteResultMsg(
    channel: iopub,
    content: AnonTransient,
    header: IHeader[execute_result],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IDebugReplyMsg(
    channel: control,
    content: AnonBody,
    header: IHeader[debug_reply],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IInputRequestMsg(
    channel: stdin,
    content: AnonPassword,
    header: IHeader[input_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IHistoryRequestMsg(
    channel: shell,
    content: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail,
    header: IHeader[history_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
  @scala.inline
  def IStreamMsg(
    channel: iopub,
    content: AnonName,
    header: IHeader[stream],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): _Message = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Message]
  }
}


package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Allowstdin
import typings.jupyterlabServices.anon.Arguments
import typings.jupyterlabServices.anon.Body
import typings.jupyterlabServices.anon.Code
import typings.jupyterlabServices.anon.CodeString
import typings.jupyterlabServices.anon.Commid
import typings.jupyterlabServices.anon.Cursorpos
import typings.jupyterlabServices.anon.Data
import typings.jupyterlabServices.anon.Ename
import typings.jupyterlabServices.anon.Event
import typings.jupyterlabServices.anon.Executioncount
import typings.jupyterlabServices.anon.Executionstate
import typings.jupyterlabServices.anon.Metadata
import typings.jupyterlabServices.anon.Name
import typings.jupyterlabServices.anon.Password
import typings.jupyterlabServices.anon.Targetname
import typings.jupyterlabServices.anon.Transient
import typings.jupyterlabServices.anon.TransientDisplayidString
import typings.jupyterlabServices.anon.Wait
import typings.jupyterlabServices.jupyterlabServicesStrings.clear_output
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
import typings.jupyterlabServices.jupyterlabServicesStrings.complete_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.complete_request
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
import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
import typings.jupyterlabServices.jupyterlabServicesStrings.kernel_info_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request
import typings.jupyterlabServices.jupyterlabServicesStrings.status
import typings.jupyterlabServices.jupyterlabServicesStrings.stream
import typings.jupyterlabServices.jupyterlabServicesStrings.update_display_data
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Message extends StObject
object _Message {
  
  inline def IClearOutputMsg(
    content: Wait,
    header: IHeader[clear_output],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IClearOutputMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IClearOutputMsg]
  }
  
  inline def ICommInfoReplyMsg(
    content: ReplyContent[ICommInfoReply],
    header: IHeader[comm_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[comm_info_request]
  ): typings.jupyterlabServices.libKernelMessagesMod.ICommInfoReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.ICommInfoReplyMsg]
  }
  
  inline def ICommInfoRequestMsg(
    content: Targetname,
    header: IHeader[comm_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.ICommInfoRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.ICommInfoRequestMsg]
  }
  
  inline def ICompleteReplyMsg(
    content: ReplyContent[ICompleteReply],
    header: IHeader[complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[complete_request]
  ): typings.jupyterlabServices.libKernelMessagesMod.ICompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.ICompleteReplyMsg]
  }
  
  inline def ICompleteRequestMsg(
    content: Code,
    header: IHeader[complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.ICompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.ICompleteRequestMsg]
  }
  
  inline def IDebugEventMsg(
    content: Event,
    header: IHeader[debug_event],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IDebugEventMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IDebugEventMsg]
  }
  
  inline def IDebugReplyMsg(
    content: Body,
    header: IHeader[debug_reply],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IDebugReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "control", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IDebugReplyMsg]
  }
  
  inline def IDebugRequestMsg(
    content: Arguments,
    header: IHeader[debug_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IDebugRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "control", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IDebugRequestMsg]
  }
  
  inline def IDisplayDataMsg(
    content: Metadata,
    header: IHeader[display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IDisplayDataMsg]
  }
  
  inline def IErrorMsg(
    content: Ename,
    header: IHeader[error],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IErrorMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IErrorMsg]
  }
  
  inline def IExecuteInputMsg(
    content: Executioncount,
    header: IHeader[execute_input],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IExecuteInputMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IExecuteInputMsg]
  }
  
  inline def IExecuteReplyMsg(
    content: ReplyContent[IExecuteReply] & IExecuteCount,
    header: IHeader[execute_reply],
    metadata: JSONObject,
    parent_header: IHeader[execute_request]
  ): typings.jupyterlabServices.libKernelMessagesMod.IExecuteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IExecuteReplyMsg]
  }
  
  inline def IExecuteRequestMsg(
    content: Allowstdin,
    header: IHeader[execute_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IExecuteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IExecuteRequestMsg]
  }
  
  inline def IExecuteResultMsg(
    content: Transient,
    header: IHeader[execute_result],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IExecuteResultMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IExecuteResultMsg]
  }
  
  inline def IHistoryReplyMsg(
    content: ReplyContent[IHistoryReply],
    header: IHeader[history_reply],
    metadata: JSONObject,
    parent_header: IHeader[history_request]
  ): typings.jupyterlabServices.libKernelMessagesMod.IHistoryReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IHistoryReplyMsg]
  }
  
  inline def IHistoryRequestMsg(
    content: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail,
    header: IHeader[history_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IHistoryRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IHistoryRequestMsg]
  }
  
  inline def IInfoReplyMsg(
    content: ReplyContent[IInfoReply],
    header: IHeader[kernel_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[kernel_info_request]
  ): typings.jupyterlabServices.libKernelMessagesMod.IInfoReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IInfoReplyMsg]
  }
  
  inline def IInfoRequestMsg(
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] & IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) & TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[kernel_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IInfoRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IInfoRequestMsg]
  }
  
  inline def IInputReplyMsg(
    content: ReplyContent[IInputReply],
    header: IHeader[input_reply],
    metadata: JSONObject,
    parent_header: IHeader[input_request]
  ): typings.jupyterlabServices.libKernelMessagesMod.IInputReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "stdin", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IInputReplyMsg]
  }
  
  inline def IInputRequestMsg(
    content: Password,
    header: IHeader[input_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IInputRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "stdin", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IInputRequestMsg]
  }
  
  inline def IInspectReplyMsg(
    content: ReplyContent[IInspectReply],
    header: IHeader[inspect_reply],
    metadata: JSONObject,
    parent_header: IHeader[inspect_request]
  ): typings.jupyterlabServices.libKernelMessagesMod.IInspectReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IInspectReplyMsg]
  }
  
  inline def IInspectRequestMsg(
    content: Cursorpos,
    header: IHeader[inspect_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IInspectRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IInspectRequestMsg]
  }
  
  inline def IIsCompleteReplyMsg(
    content: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther],
    header: IHeader[is_complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[is_complete_request]
  ): typings.jupyterlabServices.libKernelMessagesMod.IIsCompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IIsCompleteReplyMsg]
  }
  
  inline def IIsCompleteRequestMsg(
    content: CodeString,
    header: IHeader[is_complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IIsCompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IIsCompleteRequestMsg]
  }
  
  inline def IStatusMsg(
    content: Executionstate,
    header: IHeader[status],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IStatusMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IStatusMsg]
  }
  
  inline def IStreamMsg(
    content: Name,
    header: IHeader[stream],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IStreamMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IStreamMsg]
  }
  
  inline def IUpdateDisplayDataMsg(
    content: Metadata & TransientDisplayidString,
    header: IHeader[update_display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typings.jupyterlabServices.libKernelMessagesMod.IUpdateDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.libKernelMessagesMod.IUpdateDisplayDataMsg]
  }
}

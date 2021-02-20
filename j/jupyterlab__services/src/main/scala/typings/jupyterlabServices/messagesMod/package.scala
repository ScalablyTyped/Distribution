package typings.jupyterlabServices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object messagesMod {
  
  /**
    * A convenience type for a base for an execute reply content.
    */
  type IExecuteReplyBase = typings.jupyterlabServices.messagesMod.IExecuteCount with typings.jupyterlabServices.messagesMod.IReplyOkContent
  
  type IShellControlMessage = typings.jupyterlabServices.messagesMod.IShellMessage[typings.jupyterlabServices.messagesMod.ShellMessageType] | typings.jupyterlabServices.messagesMod.IControlMessage[typings.jupyterlabServices.messagesMod.ControlMessageType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabServices.messagesMod.IClearOutputMsg
    - typings.jupyterlabServices.messagesMod.ICommCloseMsg[
  typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typings.jupyterlabServices.messagesMod.ICommInfoReplyMsg
    - typings.jupyterlabServices.messagesMod.ICommInfoRequestMsg
    - typings.jupyterlabServices.messagesMod.ICommMsgMsg[
  typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typings.jupyterlabServices.messagesMod.ICommOpenMsg[
  typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typings.jupyterlabServices.messagesMod.ICompleteReplyMsg
    - typings.jupyterlabServices.messagesMod.ICompleteRequestMsg
    - typings.jupyterlabServices.messagesMod.IDisplayDataMsg
    - typings.jupyterlabServices.messagesMod.IErrorMsg
    - typings.jupyterlabServices.messagesMod.IExecuteInputMsg
    - typings.jupyterlabServices.messagesMod.IExecuteReplyMsg
    - typings.jupyterlabServices.messagesMod.IExecuteRequestMsg
    - typings.jupyterlabServices.messagesMod.IExecuteResultMsg
    - typings.jupyterlabServices.messagesMod.IHistoryReplyMsg
    - typings.jupyterlabServices.messagesMod.IHistoryRequestMsg
    - typings.jupyterlabServices.messagesMod.IInfoReplyMsg
    - typings.jupyterlabServices.messagesMod.IInfoRequestMsg
    - typings.jupyterlabServices.messagesMod.IInputReplyMsg
    - typings.jupyterlabServices.messagesMod.IInputRequestMsg
    - typings.jupyterlabServices.messagesMod.IInspectReplyMsg
    - typings.jupyterlabServices.messagesMod.IInspectRequestMsg
    - typings.jupyterlabServices.messagesMod.IIsCompleteReplyMsg
    - typings.jupyterlabServices.messagesMod.IIsCompleteRequestMsg
    - typings.jupyterlabServices.messagesMod.IStatusMsg
    - typings.jupyterlabServices.messagesMod.IStreamMsg
    - typings.jupyterlabServices.messagesMod.IUpdateDisplayDataMsg
    - typings.jupyterlabServices.messagesMod.IDebugRequestMsg
    - typings.jupyterlabServices.messagesMod.IDebugReplyMsg
    - typings.jupyterlabServices.messagesMod.IDebugEventMsg
  */
  type Message = typings.jupyterlabServices.messagesMod._Message | (typings.jupyterlabServices.messagesMod.ICommCloseMsg[
    typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell
  ]) | (typings.jupyterlabServices.messagesMod.ICommMsgMsg[
    typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell
  ]) | (typings.jupyterlabServices.messagesMod.ICommOpenMsg[
    typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell
  ])
  
  /**
    * A convenience type for reply content.
    *
    * This automatically unions the necessary error and abort replies required in
    * the [message spec](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply).
    */
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.jupyterlabServices.messagesMod.IReplyErrorContent
    - typings.jupyterlabServices.messagesMod.IReplyAbortContent
  */
  type ReplyContent[T] = typings.jupyterlabServices.messagesMod._ReplyContent[T] | T
  
  @scala.inline
  def createMessage[T /* <: typings.jupyterlabServices.messagesMod.IStreamMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IClearOutputMsg[T /* <: typings.jupyterlabServices.messagesMod.IClearOutputMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommCloseMsgiopub[T /* <: typings.jupyterlabServices.messagesMod.ICommCloseMsg[typings.jupyterlabServices.jupyterlabServicesStrings.iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommCloseMsgshell[T /* <: typings.jupyterlabServices.messagesMod.ICommCloseMsg[typings.jupyterlabServices.jupyterlabServicesStrings.shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommInfoReplyMsg[T /* <: typings.jupyterlabServices.messagesMod.ICommInfoReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommInfoRequestMsg[T /* <: typings.jupyterlabServices.messagesMod.ICommInfoRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommMsgMsgiopub[T /* <: typings.jupyterlabServices.messagesMod.ICommMsgMsg[typings.jupyterlabServices.jupyterlabServicesStrings.iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommMsgMsgshell[T /* <: typings.jupyterlabServices.messagesMod.ICommMsgMsg[typings.jupyterlabServices.jupyterlabServicesStrings.shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommOpenMsgiopub[T /* <: typings.jupyterlabServices.messagesMod.ICommOpenMsg[typings.jupyterlabServices.jupyterlabServicesStrings.iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICommOpenMsgshell[T /* <: typings.jupyterlabServices.messagesMod.ICommOpenMsg[typings.jupyterlabServices.jupyterlabServicesStrings.shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICompleteReplyMsg[T /* <: typings.jupyterlabServices.messagesMod.ICompleteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_ICompleteRequestMsg[T /* <: typings.jupyterlabServices.messagesMod.ICompleteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IDebugEventMsg[T /* <: typings.jupyterlabServices.messagesMod.IDebugEventMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IDebugReplyMsg[T /* <: typings.jupyterlabServices.messagesMod.IDebugReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IDebugRequestMsg[T /* <: typings.jupyterlabServices.messagesMod.IDebugRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IDisplayDataMsg[T /* <: typings.jupyterlabServices.messagesMod.IDisplayDataMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IErrorMsg[T /* <: typings.jupyterlabServices.messagesMod.IErrorMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IExecuteInputMsg[T /* <: typings.jupyterlabServices.messagesMod.IExecuteInputMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IExecuteReplyMsg[T /* <: typings.jupyterlabServices.messagesMod.IExecuteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IExecuteRequestMsg[T /* <: typings.jupyterlabServices.messagesMod.IExecuteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IExecuteResultMsg[T /* <: typings.jupyterlabServices.messagesMod.IExecuteResultMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IHistoryReplyMsg[T /* <: typings.jupyterlabServices.messagesMod.IHistoryReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IHistoryRequestMsg[T /* <: typings.jupyterlabServices.messagesMod.IHistoryRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInfoReplyMsg[T /* <: typings.jupyterlabServices.messagesMod.IInfoReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInfoRequestMsg[T /* <: typings.jupyterlabServices.messagesMod.IInfoRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInputReplyMsg[T /* <: typings.jupyterlabServices.messagesMod.IInputReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInputRequestMsg[T /* <: typings.jupyterlabServices.messagesMod.IInputRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInspectReplyMsg[T /* <: typings.jupyterlabServices.messagesMod.IInspectReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IInspectRequestMsg[T /* <: typings.jupyterlabServices.messagesMod.IInspectRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IIsCompleteReplyMsg[T /* <: typings.jupyterlabServices.messagesMod.IIsCompleteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IIsCompleteRequestMsg[T /* <: typings.jupyterlabServices.messagesMod.IIsCompleteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IStatusMsg[T /* <: typings.jupyterlabServices.messagesMod.IStatusMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def createMessage_T_IUpdateDisplayDataMsg[T /* <: typings.jupyterlabServices.messagesMod.IUpdateDisplayDataMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def isClearOutputMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isClearOutputMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ scala.Boolean]
  
  @scala.inline
  def isCommCloseMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommCloseMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ scala.Boolean]
  
  @scala.inline
  def isCommMsgMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommMsgMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ scala.Boolean]
  
  @scala.inline
  def isCommOpenMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommOpenMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ scala.Boolean]
  
  @scala.inline
  def isDebugEventMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDebugEventMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ scala.Boolean]
  
  @scala.inline
  def isDebugReplyMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDebugReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ scala.Boolean]
  
  @scala.inline
  def isDebugRequestMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDebugRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ scala.Boolean]
  
  @scala.inline
  def isDisplayDataMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayDataMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ scala.Boolean]
  
  @scala.inline
  def isErrorMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isErrorMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ scala.Boolean]
  
  @scala.inline
  def isExecuteInputMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteInputMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ scala.Boolean]
  
  @scala.inline
  def isExecuteReplyMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ scala.Boolean]
  
  @scala.inline
  def isExecuteResultMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteResultMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ scala.Boolean]
  
  @scala.inline
  def isInfoRequestMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isInfoRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ scala.Boolean]
  
  @scala.inline
  def isInputReplyMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isInputReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ scala.Boolean]
  
  @scala.inline
  def isInputRequestMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isInputRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ scala.Boolean]
  
  @scala.inline
  def isStatusMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStatusMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ scala.Boolean]
  
  @scala.inline
  def isStreamMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStreamMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ scala.Boolean]
  
  @scala.inline
  def isUpdateDisplayDataMsg(
    msg: typings.jupyterlabServices.messagesMod.IMessage[typings.jupyterlabServices.messagesMod.MessageType]
  ): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ scala.Boolean = typings.jupyterlabServices.messagesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isUpdateDisplayDataMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ scala.Boolean]
}

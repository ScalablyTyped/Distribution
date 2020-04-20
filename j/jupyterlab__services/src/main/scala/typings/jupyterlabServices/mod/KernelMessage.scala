package typings.jupyterlabServices.mod

import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.jupyterlabServices.messagesMod.IClearOutputMsg
import typings.jupyterlabServices.messagesMod.ICommCloseMsg
import typings.jupyterlabServices.messagesMod.ICommInfoReplyMsg
import typings.jupyterlabServices.messagesMod.ICommInfoRequestMsg
import typings.jupyterlabServices.messagesMod.ICommMsgMsg
import typings.jupyterlabServices.messagesMod.ICommOpenMsg
import typings.jupyterlabServices.messagesMod.ICompleteReplyMsg
import typings.jupyterlabServices.messagesMod.ICompleteRequestMsg
import typings.jupyterlabServices.messagesMod.IDebugEventMsg
import typings.jupyterlabServices.messagesMod.IDebugReplyMsg
import typings.jupyterlabServices.messagesMod.IDebugRequestMsg
import typings.jupyterlabServices.messagesMod.IDisplayDataMsg
import typings.jupyterlabServices.messagesMod.IErrorMsg
import typings.jupyterlabServices.messagesMod.IExecuteInputMsg
import typings.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typings.jupyterlabServices.messagesMod.IExecuteRequestMsg
import typings.jupyterlabServices.messagesMod.IExecuteResultMsg
import typings.jupyterlabServices.messagesMod.IHistoryReplyMsg
import typings.jupyterlabServices.messagesMod.IHistoryRequestMsg
import typings.jupyterlabServices.messagesMod.IInfoReplyMsg
import typings.jupyterlabServices.messagesMod.IInfoRequestMsg
import typings.jupyterlabServices.messagesMod.IInputReplyMsg
import typings.jupyterlabServices.messagesMod.IInputRequestMsg
import typings.jupyterlabServices.messagesMod.IInspectReplyMsg
import typings.jupyterlabServices.messagesMod.IInspectRequestMsg
import typings.jupyterlabServices.messagesMod.IIsCompleteReplyMsg
import typings.jupyterlabServices.messagesMod.IIsCompleteRequestMsg
import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.IOptions
import typings.jupyterlabServices.messagesMod.IStatusMsg
import typings.jupyterlabServices.messagesMod.IStreamMsg
import typings.jupyterlabServices.messagesMod.IUpdateDisplayDataMsg
import typings.jupyterlabServices.messagesMod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "KernelMessage")
@js.native
object KernelMessage extends js.Object {
  def createMessage[T /* <: IExecuteResultMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IClearOutputMsg[T /* <: IClearOutputMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommCloseMsgiopub[T /* <: ICommCloseMsg[iopub] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommCloseMsgshell[T /* <: ICommCloseMsg[shell] */](options: IOptions[T]): T = js.native
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
  @JSName("createMessage")
  def createMessage_T_IDebugEventMsg[T /* <: IDebugEventMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IDebugReplyMsg[T /* <: IDebugReplyMsg */](options: IOptions[T]): T = js.native
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
  def isClearOutputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ Boolean = js.native
  def isCommCloseMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ Boolean = js.native
  def isCommMsgMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ Boolean = js.native
  def isCommOpenMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ Boolean = js.native
  def isDebugEventMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ Boolean = js.native
  def isDebugReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ Boolean = js.native
  def isDebugRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ Boolean = js.native
  def isDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ Boolean = js.native
  def isErrorMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ Boolean = js.native
  def isExecuteInputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ Boolean = js.native
  def isExecuteReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ Boolean = js.native
  def isExecuteResultMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ Boolean = js.native
  def isInfoRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ Boolean = js.native
  def isInputReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ Boolean = js.native
  def isInputRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ Boolean = js.native
  def isStatusMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ Boolean = js.native
  def isStreamMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ Boolean = js.native
  def isUpdateDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ Boolean = js.native
}


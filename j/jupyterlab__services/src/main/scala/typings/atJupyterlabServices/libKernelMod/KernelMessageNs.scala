package typings.atJupyterlabServices.libKernelMod

import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IClearOutputMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommCloseMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommInfoReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommInfoRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommMsgMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICommOpenMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICompleteReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.ICompleteRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IDisplayDataMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IErrorMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteInputMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteResultMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IHistoryRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInfoReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInfoRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInputReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInputRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInspectReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IInspectRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIsCompleteReplyMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIsCompleteRequestMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IOptions
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IStatusMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IStreamMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IUpdateDisplayDataMsg
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel", "KernelMessage")
@js.native
object KernelMessageNs extends js.Object {
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
}


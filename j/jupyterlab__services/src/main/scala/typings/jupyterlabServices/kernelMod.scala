package typings.jupyterlabServices

import typings.jupyterlabServices.jupyterlabServicesStrings.apiSlashkernels
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.jupyterlabServices.kernelManagerMod.KernelManager.IOptions
import typings.jupyterlabServices.kernelRestapiMod.IKernelOptions
import typings.jupyterlabServices.kernelRestapiMod.IModel
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
import typings.jupyterlabServices.messagesMod.IStatusMsg
import typings.jupyterlabServices.messagesMod.IStreamMsg
import typings.jupyterlabServices.messagesMod.IUpdateDisplayDataMsg
import typings.jupyterlabServices.messagesMod.MessageType
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel", JSImport.Namespace)
@js.native
object kernelMod extends js.Object {
  @js.native
  /**
    * Construct a new kernel manager.
    *
    * @param options - The default options for kernel.
    */
  class KernelManager ()
    extends typings.jupyterlabServices.kernelManagerMod.KernelManager {
    def this(options: IOptions) = this()
  }
  
  @js.native
  object KernelAPI extends js.Object {
    val KERNEL_SERVICE_URL: apiSlashkernels = js.native
    def getKernelModel(id: String): js.Promise[js.UndefOr[IModel]] = js.native
    def getKernelModel(id: String, settings: ISettings): js.Promise[js.UndefOr[IModel]] = js.native
    def interruptKernel(id: String): js.Promise[Unit] = js.native
    def interruptKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
    def listRunning(): js.Promise[js.Array[IModel]] = js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
    def restartKernel(id: String): js.Promise[Unit] = js.native
    def restartKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
    def shutdownKernel(id: String): js.Promise[Unit] = js.native
    def shutdownKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
    def startNew(): js.Promise[IModel] = js.native
    def startNew(options: IKernelOptions): js.Promise[IModel] = js.native
    def startNew(options: IKernelOptions, settings: ISettings): js.Promise[IModel] = js.native
  }
  
  @js.native
  object KernelMessage extends js.Object {
    def createMessage[T /* <: IExecuteResultMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IClearOutputMsg[T /* <: IClearOutputMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommCloseMsgiopub[T /* <: ICommCloseMsg[iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommCloseMsgshell[T /* <: ICommCloseMsg[shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommInfoReplyMsg[T /* <: ICommInfoReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommInfoRequestMsg[T /* <: ICommInfoRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommMsgMsgiopub[T /* <: ICommMsgMsg[iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommMsgMsgshell[T /* <: ICommMsgMsg[shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommOpenMsgiopub[T /* <: ICommOpenMsg[iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICommOpenMsgshell[T /* <: ICommOpenMsg[shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICompleteReplyMsg[T /* <: ICompleteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_ICompleteRequestMsg[T /* <: ICompleteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IDebugEventMsg[T /* <: IDebugEventMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IDebugReplyMsg[T /* <: IDebugReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IDebugRequestMsg[T /* <: IDebugRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IDisplayDataMsg[T /* <: IDisplayDataMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IErrorMsg[T /* <: IErrorMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IExecuteInputMsg[T /* <: IExecuteInputMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IExecuteReplyMsg[T /* <: IExecuteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IExecuteRequestMsg[T /* <: IExecuteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IHistoryReplyMsg[T /* <: IHistoryReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IHistoryRequestMsg[T /* <: IHistoryRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInfoReplyMsg[T /* <: IInfoReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInfoRequestMsg[T /* <: IInfoRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInputReplyMsg[T /* <: IInputReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInputRequestMsg[T /* <: IInputRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInspectReplyMsg[T /* <: IInspectReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IInspectRequestMsg[T /* <: IInspectRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IIsCompleteReplyMsg[T /* <: IIsCompleteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IIsCompleteRequestMsg[T /* <: IIsCompleteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IStatusMsg[T /* <: IStatusMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IStreamMsg[T /* <: IStreamMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSName("createMessage")
    def createMessage_T_IUpdateDisplayDataMsg[T /* <: IUpdateDisplayDataMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
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
  
}


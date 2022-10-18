package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.jupyterlabServices.libKernelMessagesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createMessage[T /* <: IClearOutputMsg */](options: IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]

inline def isClearOutputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClearOutputMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ Boolean]

inline def isCommCloseMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommCloseMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ Boolean]

inline def isCommMsgMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommMsgMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ Boolean]

inline def isCommOpenMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommOpenMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ Boolean]

inline def isDebugEventMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebugEventMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ Boolean]

inline def isDebugReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebugReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ Boolean]

inline def isDebugRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebugRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ Boolean]

inline def isDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayDataMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ Boolean]

inline def isErrorMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ Boolean]

inline def isExecuteInputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteInputMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ Boolean]

inline def isExecuteReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ Boolean]

inline def isExecuteResultMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteResultMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ Boolean]

inline def isInfoRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInfoRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ Boolean]

inline def isInputReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ Boolean]

inline def isInputRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ Boolean]

inline def isStatusMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatusMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ Boolean]

inline def isStreamMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStreamMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ Boolean]

inline def isUpdateDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpdateDisplayDataMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ Boolean]

type IShellControlMessage = IShellMessage[ShellMessageType] | IControlMessage[ControlMessageType]

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabServices.libKernelMessagesMod.IClearOutputMsg
  - typings.jupyterlabServices.libKernelMessagesMod.ICommCloseMsg[
typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell]
  - typings.jupyterlabServices.libKernelMessagesMod.ICommInfoReplyMsg
  - typings.jupyterlabServices.libKernelMessagesMod.ICommInfoRequestMsg
  - typings.jupyterlabServices.libKernelMessagesMod.ICommMsgMsg[
typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell]
  - typings.jupyterlabServices.libKernelMessagesMod.ICommOpenMsg[
typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell]
  - typings.jupyterlabServices.libKernelMessagesMod.ICompleteReplyMsg
  - typings.jupyterlabServices.libKernelMessagesMod.ICompleteRequestMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IDisplayDataMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IErrorMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IExecuteInputMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IExecuteReplyMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IExecuteRequestMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IExecuteResultMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IHistoryReplyMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IHistoryRequestMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IInfoReplyMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IInfoRequestMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IInputReplyMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IInputRequestMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IInspectReplyMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IInspectRequestMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IIsCompleteReplyMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IIsCompleteRequestMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IStatusMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IStreamMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IUpdateDisplayDataMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IDebugRequestMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IDebugReplyMsg
  - typings.jupyterlabServices.libKernelMessagesMod.IDebugEventMsg
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
  - typings.jupyterlabServices.libKernelMessagesMod.IReplyErrorContent
  - typings.jupyterlabServices.libKernelMessagesMod.IReplyAbortContent
*/
type ReplyContent[T] = _ReplyContent[T] | T

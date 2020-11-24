package typings.jupyterlabServices

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
}

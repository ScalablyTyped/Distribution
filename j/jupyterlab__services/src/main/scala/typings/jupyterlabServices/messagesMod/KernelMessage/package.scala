package typings.jupyterlabServices.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KernelMessage {
  /**
    * A convenience type for a base for an execute reply content.
    */
  type IExecuteReplyBase = typings.jupyterlabServices.messagesMod.KernelMessage.IExecuteCount with typings.jupyterlabServices.messagesMod.KernelMessage.IReplyOkContent
  /**
    * A message type for shell or control messages.
    *
    * #### Notes
    * This convenience is so we can use it as a generic type constraint.
    */
  type IShellControlMessage = typings.jupyterlabServices.messagesMod.KernelMessage.IShellMessage[typings.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType] | typings.jupyterlabServices.messagesMod.KernelMessage.IControlMessage[typings.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType]
  /**
    * Message types.
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, debug message types are *NOT*
    * considered part of the public API, and may change without notice.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabServices.messagesMod.KernelMessage.IClearOutputMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.ICommCloseMsg[
  typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typings.jupyterlabServices.messagesMod.KernelMessage.ICommInfoReplyMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.ICommInfoRequestMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.ICommMsgMsg[
  typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typings.jupyterlabServices.messagesMod.KernelMessage.ICommOpenMsg[
  typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typings.jupyterlabServices.messagesMod.KernelMessage.ICompleteReplyMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.ICompleteRequestMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IDisplayDataMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IErrorMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IExecuteInputMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IExecuteRequestMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IExecuteResultMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IHistoryReplyMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IHistoryRequestMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IInfoReplyMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IInfoRequestMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IInputReplyMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IInputRequestMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IInspectReplyMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IInspectRequestMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteReplyMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteRequestMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IStatusMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IStreamMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IUpdateDisplayDataMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IDebugRequestMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IDebugReplyMsg
    - typings.jupyterlabServices.messagesMod.KernelMessage.IDebugEventMsg
  */
  type Message = typings.jupyterlabServices.messagesMod.KernelMessage._Message | (typings.jupyterlabServices.messagesMod.KernelMessage.ICommCloseMsg[
    typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell
  ]) | (typings.jupyterlabServices.messagesMod.KernelMessage.ICommMsgMsg[
    typings.jupyterlabServices.jupyterlabServicesStrings.iopub | typings.jupyterlabServices.jupyterlabServicesStrings.shell
  ]) | (typings.jupyterlabServices.messagesMod.KernelMessage.ICommOpenMsg[
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
    - typings.jupyterlabServices.messagesMod.KernelMessage.IReplyErrorContent
    - typings.jupyterlabServices.messagesMod.KernelMessage.IReplyAbortContent
  */
  type ReplyContent[T] = typings.jupyterlabServices.messagesMod.KernelMessage._ReplyContent[T] | T
}

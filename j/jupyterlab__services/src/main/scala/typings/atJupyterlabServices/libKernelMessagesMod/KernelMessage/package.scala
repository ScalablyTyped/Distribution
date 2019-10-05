package typings.atJupyterlabServices.libKernelMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KernelMessage {
  import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
  import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell

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
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IClearOutputMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICommCloseMsg[
  typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub | typings.atJupyterlabServices.atJupyterlabServicesStrings.shell]
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICommInfoReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICommInfoRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICommMsgMsg[
  typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub | typings.atJupyterlabServices.atJupyterlabServicesStrings.shell]
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICommOpenMsg[
  typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub | typings.atJupyterlabServices.atJupyterlabServicesStrings.shell]
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICompleteReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ICompleteRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IDisplayDataMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IErrorMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteInputMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteResultMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IHistoryReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IHistoryRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInfoReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInfoRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInputReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInputRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInspectReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInspectRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IIsCompleteReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IIsCompleteRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IStatusMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IStreamMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IUpdateDisplayDataMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IDebugRequestMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IDebugReplyMsg
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IDebugEventMsg
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
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IReplyErrorContent
    - typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IReplyAbortContent
  */
  type ReplyContent[T] = _ReplyContent[T] | T
}

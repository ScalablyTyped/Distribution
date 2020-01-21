package typings.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/messages", "KernelMessage.isCommMsgMsg")
@js.native
object isCommMsgMsg extends js.Object {
  /**
    * Test whether a kernel message is a `'comm_msg'` message.
    */
  def apply(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommMsgMsg<'iopub' | 'shell'> */ Boolean = js.native
}


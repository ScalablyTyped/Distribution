package typings.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/messages", "KernelMessage.isDebugEventMsg")
@js.native
object isDebugEventMsg extends js.Object {
  /**
    * Test whether a kernel message is an experimental `'debug_event'` message.
    *
    * @hidden
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this is *NOT* considered
    * part of the public API, and may change without notice.
    */
  def apply(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDebugEventMsg */ Boolean = js.native
}


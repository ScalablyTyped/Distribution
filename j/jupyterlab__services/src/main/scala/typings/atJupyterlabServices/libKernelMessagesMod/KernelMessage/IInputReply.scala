package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'input_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
  */
trait IInputReply extends IReplyOkContent {
  var value: String
}

object IInputReply {
  @scala.inline
  def apply(status: ok, value: String): IInputReply = {
    val __obj = js.Dynamic.literal(status = status, value = value)
  
    __obj.asInstanceOf[IInputReply]
  }
}


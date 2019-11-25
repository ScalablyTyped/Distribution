package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The content of a `'history_request'` tail message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
  *
  * **See also:** [[IHistoryReply]], [[[IKernel.history]]]
  */
trait IHistoryRequestTail extends js.Object {
  var hist_access_type: tail
  var n: Double
  var output: Boolean
  var raw: Boolean
}

object IHistoryRequestTail {
  @scala.inline
  def apply(hist_access_type: tail, n: Double, output: Boolean, raw: Boolean): IHistoryRequestTail = {
    val __obj = js.Dynamic.literal(hist_access_type = hist_access_type.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IHistoryRequestTail]
  }
}


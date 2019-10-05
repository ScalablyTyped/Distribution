package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The content of a `'history_request'` range message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
  *
  * **See also:** [[IHistoryReply]], [[[IKernel.history]]]
  */
trait IHistoryRequestRange extends js.Object {
  var hist_access_type: range
  var output: Boolean
  var raw: Boolean
  var session: Double
  var start: Double
  var stop: Double
}

object IHistoryRequestRange {
  @scala.inline
  def apply(
    hist_access_type: range,
    output: Boolean,
    raw: Boolean,
    session: Double,
    start: Double,
    stop: Double
  ): IHistoryRequestRange = {
    val __obj = js.Dynamic.literal(hist_access_type = hist_access_type, output = output, raw = raw, session = session, start = start, stop = stop)
  
    __obj.asInstanceOf[IHistoryRequestRange]
  }
}


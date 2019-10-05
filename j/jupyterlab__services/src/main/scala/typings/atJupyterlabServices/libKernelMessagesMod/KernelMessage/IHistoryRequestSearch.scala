package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The content of a `'history_request'` search message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
  *
  * **See also:** [[IHistoryReply]], [[[IKernel.history]]]
  */
trait IHistoryRequestSearch extends js.Object {
  var hist_access_type: search
  var n: Double
  var output: Boolean
  var pattern: String
  var raw: Boolean
  var unique: Boolean
}

object IHistoryRequestSearch {
  @scala.inline
  def apply(
    hist_access_type: search,
    n: Double,
    output: Boolean,
    pattern: String,
    raw: Boolean,
    unique: Boolean
  ): IHistoryRequestSearch = {
    val __obj = js.Dynamic.literal(hist_access_type = hist_access_type, n = n, output = output, pattern = pattern, raw = raw, unique = unique)
  
    __obj.asInstanceOf[IHistoryRequestSearch]
  }
}


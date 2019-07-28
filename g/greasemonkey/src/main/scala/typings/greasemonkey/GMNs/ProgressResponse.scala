package typings.greasemonkey.GMNs

import typings.greasemonkey.greasemonkeyNumbers.`1`
import typings.greasemonkey.greasemonkeyNumbers.`2`
import typings.greasemonkey.greasemonkeyNumbers.`3`
import typings.greasemonkey.greasemonkeyNumbers.`4`
import typings.greasemonkey.greasemonkeyNumbers.`false`
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressResponse[TContext] extends Response[TContext] {
  var lengthComputable: Boolean
  var loaded: Double
  var total: Double
}

object ProgressResponse {
  @scala.inline
  def apply[TContext](
    finalUrl: String,
    lengthComputable: Boolean,
    loaded: Double,
    readyState: `1` | `2` | `3` | `4`,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    responseXML: Document | `false`,
    status: Double,
    statusText: String,
    total: Double,
    context: TContext = null
  ): ProgressResponse[TContext] = {
    val __obj = js.Dynamic.literal(finalUrl = finalUrl, lengthComputable = lengthComputable, loaded = loaded, readyState = readyState.asInstanceOf[js.Any], response = response, responseHeaders = responseHeaders, responseText = responseText, responseXML = responseXML.asInstanceOf[js.Any], status = status, statusText = statusText, total = total)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressResponse[TContext]]
  }
}


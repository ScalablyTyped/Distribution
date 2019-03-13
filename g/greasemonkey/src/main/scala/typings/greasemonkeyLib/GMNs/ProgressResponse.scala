package typings
package greasemonkeyLib.GMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressResponse[TContext] extends Response[TContext] {
  var lengthComputable: scala.Boolean
  var loaded: scala.Double
  var total: scala.Double
}

object ProgressResponse {
  @scala.inline
  def apply[TContext](
    finalUrl: java.lang.String,
    lengthComputable: scala.Boolean,
    loaded: scala.Double,
    readyState: greasemonkeyLib.greasemonkeyLibNumbers.`1` | greasemonkeyLib.greasemonkeyLibNumbers.`2` | greasemonkeyLib.greasemonkeyLibNumbers.`3` | greasemonkeyLib.greasemonkeyLibNumbers.`4`,
    response: js.Any,
    responseHeaders: java.lang.String,
    responseText: java.lang.String,
    responseXML: stdLib.Document | greasemonkeyLib.greasemonkeyLibNumbers.`false`,
    status: scala.Double,
    statusText: java.lang.String,
    total: scala.Double,
    context: TContext = null
  ): ProgressResponse[TContext] = {
    val __obj = js.Dynamic.literal(finalUrl = finalUrl, lengthComputable = lengthComputable, loaded = loaded, readyState = readyState.asInstanceOf[js.Any], response = response, responseHeaders = responseHeaders, responseText = responseText, responseXML = responseXML.asInstanceOf[js.Any], status = status, statusText = statusText, total = total)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressResponse[TContext]]
  }
}


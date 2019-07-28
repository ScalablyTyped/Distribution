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

trait Response[TContext] extends js.Object {
  /** The same object passed into the original request */
  val context: js.UndefOr[TContext] = js.undefined
  val finalUrl: String
  val readyState: `1` | `2` | `3` | `4`
  val response: js.Any
  val responseHeaders: String
  val responseText: String
  val responseXML: Document | `false`
  val status: Double
  val statusText: String
}

object Response {
  @scala.inline
  def apply[TContext](
    finalUrl: String,
    readyState: `1` | `2` | `3` | `4`,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    responseXML: Document | `false`,
    status: Double,
    statusText: String,
    context: TContext = null
  ): Response[TContext] = {
    val __obj = js.Dynamic.literal(finalUrl = finalUrl, readyState = readyState.asInstanceOf[js.Any], response = response, responseHeaders = responseHeaders, responseText = responseText, responseXML = responseXML.asInstanceOf[js.Any], status = status, statusText = statusText)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[TContext]]
  }
}


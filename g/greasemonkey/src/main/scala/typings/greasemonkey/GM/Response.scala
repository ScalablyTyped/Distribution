package typings.greasemonkey.GM

import typings.greasemonkey.greasemonkeyBooleans.`false`
import typings.greasemonkey.greasemonkeyNumbers.`1`
import typings.greasemonkey.greasemonkeyNumbers.`2`
import typings.greasemonkey.greasemonkeyNumbers.`3`
import typings.greasemonkey.greasemonkeyNumbers.`4`
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
    val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[TContext]]
  }
}


package typings
package greasemonkeyLib.GMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[TContext] extends js.Object {
  /** The same object passed into the original request */
  val context: js.UndefOr[TContext] = js.undefined
  val finalUrl: java.lang.String
  val readyState: greasemonkeyLib.greasemonkeyLibNumbers.`1` | greasemonkeyLib.greasemonkeyLibNumbers.`2` | greasemonkeyLib.greasemonkeyLibNumbers.`3` | greasemonkeyLib.greasemonkeyLibNumbers.`4`
  val response: js.Any
  val responseHeaders: java.lang.String
  val responseText: java.lang.String
  val responseXML: stdLib.Document | greasemonkeyLib.greasemonkeyLibNumbers.`false`
  val status: scala.Double
  val statusText: java.lang.String
}

object Response {
  @scala.inline
  def apply[TContext](
    finalUrl: java.lang.String,
    readyState: greasemonkeyLib.greasemonkeyLibNumbers.`1` | greasemonkeyLib.greasemonkeyLibNumbers.`2` | greasemonkeyLib.greasemonkeyLibNumbers.`3` | greasemonkeyLib.greasemonkeyLibNumbers.`4`,
    response: js.Any,
    responseHeaders: java.lang.String,
    responseText: java.lang.String,
    responseXML: stdLib.Document | greasemonkeyLib.greasemonkeyLibNumbers.`false`,
    status: scala.Double,
    statusText: java.lang.String,
    context: TContext = null
  ): Response[TContext] = {
    val __obj = js.Dynamic.literal(finalUrl = finalUrl, readyState = readyState.asInstanceOf[js.Any], response = response, responseHeaders = responseHeaders, responseText = responseText, responseXML = responseXML.asInstanceOf[js.Any], status = status, statusText = statusText)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[TContext]]
  }
}


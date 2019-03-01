package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response object for general events of {@link GM_xmlhttpRequest}.
  * @see {@link http://wiki.greasespot.net/GM_xmlhttpRequest#Response_Object}
  */
trait GMXMLHttpRequestResponse extends js.Object {
  var context: js.Any
  var finalUrl: java.lang.String
  var readyState: scala.Double
  var responseHeaders: java.lang.String
  var responseText: java.lang.String
  var status: scala.Double
  var statusText: java.lang.String
}

object GMXMLHttpRequestResponse {
  @scala.inline
  def apply(
    context: js.Any,
    finalUrl: java.lang.String,
    readyState: scala.Double,
    responseHeaders: java.lang.String,
    responseText: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String
  ): GMXMLHttpRequestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("finalUrl")(finalUrl)
    __obj.updateDynamic("readyState")(readyState)
    __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.updateDynamic("responseText")(responseText)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[GMXMLHttpRequestResponse]
  }
}


package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response object for onprogress event of {@link GM_xmlhttpRequest}.
  */
trait GMXMLHttpRequestProgressResponse extends GMXMLHttpRequestResponse {
  var lengthComputable: scala.Boolean
  var loaded: scala.Double
  var total: scala.Double
}

object GMXMLHttpRequestProgressResponse {
  @scala.inline
  def apply(
    context: js.Any,
    finalUrl: java.lang.String,
    lengthComputable: scala.Boolean,
    loaded: scala.Double,
    readyState: scala.Double,
    responseHeaders: java.lang.String,
    responseText: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String,
    total: scala.Double
  ): GMXMLHttpRequestProgressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("finalUrl")(finalUrl)
    __obj.updateDynamic("lengthComputable")(lengthComputable)
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("readyState")(readyState)
    __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.updateDynamic("responseText")(responseText)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[GMXMLHttpRequestProgressResponse]
  }
}


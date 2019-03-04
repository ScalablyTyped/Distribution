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
    val __obj = js.Dynamic.literal(context = context, finalUrl = finalUrl, lengthComputable = lengthComputable, loaded = loaded, readyState = readyState, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText, total = total)
  
    __obj.asInstanceOf[GMXMLHttpRequestProgressResponse]
  }
}


package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned object by {@link GM_xmlhttpRequest}.
  * @see  {@link http://wiki.greasespot.net/GM_xmlhttpRequest#Returns}
  */
trait GMXMLHttpRequestResult
  extends GMXMLHttpRequestAsyncResult
     with GMXMLHttpRequestSyncResult {
  /* InferMemberOverrides */
  override def abort(): scala.Unit
}

object GMXMLHttpRequestResult {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    finalUrl: java.lang.String,
    readyState: scala.Double,
    responseHeaders: java.lang.String,
    responseText: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String
  ): GMXMLHttpRequestResult = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), finalUrl = finalUrl, readyState = readyState, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText)
  
    __obj.asInstanceOf[GMXMLHttpRequestResult]
  }
}


package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned object by {@link GM_xmlhttpRequest} in synchronouse mode.
  */
trait GMXMLHttpRequestSyncResult extends js.Object {
  var finalUrl: java.lang.String
  var readyState: scala.Double
  var responseHeaders: java.lang.String
  var responseText: java.lang.String
  var status: scala.Double
  var statusText: java.lang.String
  def abort(): scala.Unit
}

object GMXMLHttpRequestSyncResult {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    finalUrl: java.lang.String,
    readyState: scala.Double,
    responseHeaders: java.lang.String,
    responseText: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String
  ): GMXMLHttpRequestSyncResult = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), finalUrl = finalUrl, readyState = readyState, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText)
  
    __obj.asInstanceOf[GMXMLHttpRequestSyncResult]
  }
}


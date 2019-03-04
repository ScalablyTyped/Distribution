package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned object by {@link GM_xmlhttpRequest} in asynchronous mode.
  */
trait GMXMLHttpRequestAsyncResult extends js.Object {
  def abort(): scala.Unit
}

object GMXMLHttpRequestAsyncResult {
  @scala.inline
  def apply(abort: js.Function0[scala.Unit]): GMXMLHttpRequestAsyncResult = {
    val __obj = js.Dynamic.literal(abort = abort)
  
    __obj.asInstanceOf[GMXMLHttpRequestAsyncResult]
  }
}


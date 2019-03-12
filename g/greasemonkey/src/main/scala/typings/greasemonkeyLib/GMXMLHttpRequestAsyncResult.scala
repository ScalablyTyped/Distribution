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
  def apply(abort: () => scala.Unit): GMXMLHttpRequestAsyncResult = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
  
    __obj.asInstanceOf[GMXMLHttpRequestAsyncResult]
  }
}


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


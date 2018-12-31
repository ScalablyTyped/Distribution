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


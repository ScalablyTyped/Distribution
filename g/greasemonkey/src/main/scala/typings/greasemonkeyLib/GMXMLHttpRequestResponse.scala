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


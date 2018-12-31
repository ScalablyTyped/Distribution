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


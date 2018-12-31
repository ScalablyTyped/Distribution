package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * Size of the request body (POST data payload) in bytes.
    *
    * Set to `-1` if the info is not available.
    */
  var bodySize: scala.Double
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** List of cookie objects. */
  var cookies: js.Array[Cookie]
  /** List of header objects. */
  var headers: js.Array[Header]
  /**
    * Total number of bytes from the start of the HTTP request message until
    * (and including) the double CRLF before the body.
    *
    * Set to `-1` if the info is not available.
    */
  var headersSize: scala.Double
  /** Request HTTP Version. */
  var httpVersion: java.lang.String
  /** Request method (`GET`, `POST`, ...). */
  var method: java.lang.String
  /** Posted data info. */
  var postData: js.UndefOr[PostData] = js.undefined
  /** List of query parameter objects. */
  var queryString: js.Array[QueryString]
  /** Absolute URL of the request (fragments are not included). */
  var url: java.lang.String
}


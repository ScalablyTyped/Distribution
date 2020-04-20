package typings.k6.wsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /** Response body. */
  var body: String
  /** Non-HTTP error message. */
  var error: String
  /** Response headers. */
  var headers: StringDictionary[String]
  /** HTTP status code. */
  var status: Double
  /** Fetched URL. May differ from request URL due to redirects. */
  var url: String
}

object Response {
  @scala.inline
  def apply(body: String, error: String, headers: StringDictionary[String], status: Double, url: String): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}


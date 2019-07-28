package typings.k6

import org.scalablytyped.runtime.StringDictionary
import typings.k6.httpMod.RequestCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  /** Request body. */
  var body: String
  /** Request cookies. */
  var cookies: StringDictionary[js.Array[RequestCookie]]
  /** Request headers. */
  var headers: StringDictionary[js.Array[String]]
  /** Request method. */
  var method: String
  /** Request URL. */
  var url: String
}

object Anon_Body {
  @scala.inline
  def apply(
    body: String,
    cookies: StringDictionary[js.Array[RequestCookie]],
    headers: StringDictionary[js.Array[String]],
    method: String,
    url: String
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, cookies = cookies, headers = headers, method = method, url = url)
  
    __obj.asInstanceOf[Anon_Body]
  }
}


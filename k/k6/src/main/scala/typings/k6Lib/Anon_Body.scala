package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  /** Request body. */
  var body: java.lang.String
  /** Request cookies. */
  var cookies: org.scalablytyped.runtime.StringDictionary[js.Array[k6Lib.httpMod.RequestCookie]]
  /** Request headers. */
  var headers: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  /** Request method. */
  var method: java.lang.String
  /** Request URL. */
  var url: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(
    body: java.lang.String,
    cookies: org.scalablytyped.runtime.StringDictionary[js.Array[k6Lib.httpMod.RequestCookie]],
    headers: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    method: java.lang.String,
    url: java.lang.String
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, cookies = cookies, headers = headers, method = method, url = url)
  
    __obj.asInstanceOf[Anon_Body]
  }
}


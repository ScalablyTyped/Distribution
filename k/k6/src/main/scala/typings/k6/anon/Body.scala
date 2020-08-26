package typings.k6.anon

import org.scalablytyped.runtime.StringDictionary
import typings.k6.httpMod.RequestCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  /** Request body. */
  var body: String = js.native
  /** Request cookies. */
  var cookies: StringDictionary[js.Array[RequestCookie]] = js.native
  /** Request headers. */
  var headers: StringDictionary[js.Array[String]] = js.native
  /** Request method. */
  var method: String = js.native
  /** Request URL. */
  var url: String = js.native
}

object Body {
  @scala.inline
  def apply(
    body: String,
    cookies: StringDictionary[js.Array[RequestCookie]],
    headers: StringDictionary[js.Array[String]],
    method: String,
    url: String
  ): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookies(value: StringDictionary[js.Array[RequestCookie]]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: StringDictionary[js.Array[String]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}


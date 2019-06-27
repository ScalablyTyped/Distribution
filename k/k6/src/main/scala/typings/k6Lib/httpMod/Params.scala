package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var auth: js.UndefOr[AuthMethod] = js.undefined
  var cookies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ParamsCookieValue]] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var jar: js.UndefOr[CookieJar] = js.undefined
  var redirects: js.UndefOr[scala.Double] = js.undefined
  var responseType: js.UndefOr[ResponseType] = js.undefined
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    auth: AuthMethod = null,
    cookies: org.scalablytyped.runtime.StringDictionary[ParamsCookieValue] = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    jar: CookieJar = null,
    redirects: scala.Int | scala.Double = null,
    responseType: ResponseType = null,
    tags: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    timeout: scala.Int | scala.Double = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (jar != null) __obj.updateDynamic("jar")(jar)
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}


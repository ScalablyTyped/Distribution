package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericParams[RT /* <: js.UndefOr[ResponseType] */] extends Params {
  @JSName("responseType")
  var responseType_GenericParams: js.UndefOr[RT] = js.undefined
}

object GenericParams {
  @scala.inline
  def apply[RT /* <: js.UndefOr[ResponseType] */](
    auth: AuthMethod = null,
    cookies: org.scalablytyped.runtime.StringDictionary[ParamsCookieValue] = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    jar: CookieJar = null,
    redirects: scala.Int | scala.Double = null,
    responseType: RT = null,
    tags: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    timeout: scala.Int | scala.Double = null
  ): GenericParams[RT] = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (jar != null) __obj.updateDynamic("jar")(jar)
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericParams[RT]]
  }
}


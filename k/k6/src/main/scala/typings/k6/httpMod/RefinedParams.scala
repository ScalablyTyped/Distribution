package typings.k6.httpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinedParams[RT /* <: js.UndefOr[ResponseType] */] extends Params {
  @JSName("responseType")
  var responseType_RefinedParams: js.UndefOr[RT] = js.undefined
}

object RefinedParams {
  @scala.inline
  def apply[RT /* <: js.UndefOr[ResponseType] */](
    auth: AuthMethod = null,
    compression: String = null,
    cookies: StringDictionary[ParamsCookieValue] = null,
    headers: StringDictionary[String] = null,
    jar: CookieJar = null,
    redirects: Int | Double = null,
    responseType: RT = null,
    tags: StringDictionary[String] = null,
    timeout: Int | Double = null
  ): RefinedParams[RT] = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (jar != null) __obj.updateDynamic("jar")(jar)
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinedParams[RT]]
  }
}


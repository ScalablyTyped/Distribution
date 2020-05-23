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
  def apply[RT](
    auth: AuthMethod = null,
    compression: String = null,
    cookies: StringDictionary[ParamsCookieValue] = null,
    headers: StringDictionary[String] = null,
    jar: CookieJar_ = null,
    redirects: js.UndefOr[Double] = js.undefined,
    responseType: RT = null,
    tags: StringDictionary[String] = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): RefinedParams[RT] = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (jar != null) __obj.updateDynamic("jar")(jar.asInstanceOf[js.Any])
    if (!js.isUndefined(redirects)) __obj.updateDynamic("redirects")(redirects.get.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinedParams[RT]]
  }
}


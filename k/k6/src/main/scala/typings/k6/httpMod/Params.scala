package typings.k6.httpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  /** Authentication method. */
  var auth: js.UndefOr[AuthMethod] = js.undefined
  /** Request body compression. */
  var compression: js.UndefOr[String] = js.undefined
  /** Request scoped cookies. */
  var cookies: js.UndefOr[StringDictionary[ParamsCookieValue]] = js.undefined
  /** Request headers. */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /** Cookie jar to override default VU cookie jar with. */
  var jar: js.UndefOr[CookieJar_] = js.undefined
  /** Maximum redirects to follow. */
  var redirects: js.UndefOr[Double] = js.undefined
  /** Response type. */
  var responseType: js.UndefOr[ResponseType] = js.undefined
  /** Response time metric tags. */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  /** Request timeout. */
  var timeout: js.UndefOr[Double] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    auth: AuthMethod = null,
    compression: String = null,
    cookies: StringDictionary[ParamsCookieValue] = null,
    headers: StringDictionary[String] = null,
    jar: CookieJar_ = null,
    redirects: Int | Double = null,
    responseType: ResponseType = null,
    tags: StringDictionary[String] = null,
    timeout: Int | Double = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (jar != null) __obj.updateDynamic("jar")(jar.asInstanceOf[js.Any])
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}


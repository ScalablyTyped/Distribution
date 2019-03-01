package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParams extends js.Object {
  var auth: js.UndefOr[java.lang.String] = js.undefined
  var cookies: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var jar: js.UndefOr[js.Object] = js.undefined
  var redirects: js.UndefOr[scala.Double] = js.undefined
  var tags: js.UndefOr[js.Object] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object RequestParams {
  @scala.inline
  def apply(
    auth: java.lang.String = null,
    cookies: js.Object = null,
    headers: js.Object = null,
    jar: js.Object = null,
    redirects: scala.Int | scala.Double = null,
    tags: js.Object = null,
    timeout: scala.Int | scala.Double = null
  ): RequestParams = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (jar != null) __obj.updateDynamic("jar")(jar)
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParams]
  }
}


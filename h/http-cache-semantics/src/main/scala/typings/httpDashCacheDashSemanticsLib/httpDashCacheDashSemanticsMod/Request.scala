package typings
package httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var headers: Headers
  var method: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Request {
  @scala.inline
  def apply(headers: Headers, method: java.lang.String = null, url: java.lang.String = null): Request = {
    val __obj = js.Dynamic.literal(headers = headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Request]
  }
}


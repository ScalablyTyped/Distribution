package typings
package httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var headers: Headers
  var status: js.UndefOr[scala.Double] = js.undefined
}

object Response {
  @scala.inline
  def apply(headers: Headers, status: scala.Int | scala.Double = null): Response = {
    val __obj = js.Dynamic.literal(headers = headers)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}


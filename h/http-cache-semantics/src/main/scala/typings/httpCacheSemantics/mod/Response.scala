package typings.httpCacheSemantics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var headers: Headers
  var status: js.UndefOr[Double] = js.undefined
}

object Response {
  @scala.inline
  def apply(headers: Headers, status: js.UndefOr[Double] = js.undefined): Response = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}


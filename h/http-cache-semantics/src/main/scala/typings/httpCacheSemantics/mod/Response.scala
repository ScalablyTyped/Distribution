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
  def apply(headers: Headers, status: Int | Double = null): Response = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}


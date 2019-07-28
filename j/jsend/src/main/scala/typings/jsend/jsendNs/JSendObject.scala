package typings.jsend.jsendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSendObject extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var status: String
}

object JSendObject {
  @scala.inline
  def apply(status: String, code: Int | Double = null, data: js.Any = null, message: String = null): JSendObject = {
    val __obj = js.Dynamic.literal(status = status)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[JSendObject]
  }
}


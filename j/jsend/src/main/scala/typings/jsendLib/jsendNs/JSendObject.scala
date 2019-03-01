package typings
package jsendLib.jsendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSendObject extends js.Object {
  var code: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var status: java.lang.String
}

object JSendObject {
  @scala.inline
  def apply(
    status: java.lang.String,
    code: scala.Int | scala.Double = null,
    data: js.Any = null,
    message: java.lang.String = null
  ): JSendObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[JSendObject]
  }
}


package typings.jsend.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var message: String
}

object Code {
  @scala.inline
  def apply(message: String, code: js.UndefOr[Double] = js.undefined, data: js.Object = null): Code = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}


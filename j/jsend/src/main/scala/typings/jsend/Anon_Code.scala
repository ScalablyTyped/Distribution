package typings.jsend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var message: String
}

object Anon_Code {
  @scala.inline
  def apply(message: String, code: Int | Double = null, data: js.Object = null): Anon_Code = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}


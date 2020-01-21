package typings.jestRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: js.UndefOr[String] = js.undefined
}

object AnonCode {
  @scala.inline
  def apply(code: String = null): AnonCode = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}


package typings.jestDashRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: js.UndefOr[String] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: String = null): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}


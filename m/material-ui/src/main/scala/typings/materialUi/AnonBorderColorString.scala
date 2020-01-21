package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderColorString extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
}

object AnonBorderColorString {
  @scala.inline
  def apply(borderColor: String = null): AnonBorderColorString = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderColorString]
  }
}


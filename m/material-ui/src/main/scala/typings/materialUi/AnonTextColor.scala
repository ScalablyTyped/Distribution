package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextColor extends js.Object {
  var textColor: js.UndefOr[String] = js.undefined
}

object AnonTextColor {
  @scala.inline
  def apply(textColor: String = null): AnonTextColor = {
    val __obj = js.Dynamic.literal()
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextColor]
  }
}


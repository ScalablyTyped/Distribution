package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorRippleBackgroundColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var rippleBackgroundColor: js.UndefOr[String] = js.undefined
}

object AnonColorRippleBackgroundColor {
  @scala.inline
  def apply(color: String = null, rippleBackgroundColor: String = null): AnonColorRippleBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (rippleBackgroundColor != null) __obj.updateDynamic("rippleBackgroundColor")(rippleBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorRippleBackgroundColor]
  }
}


package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleBackgroundColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var rippleBackgroundColor: js.UndefOr[String] = js.undefined
}

object RippleBackgroundColor {
  @scala.inline
  def apply(color: String = null, rippleBackgroundColor: String = null): RippleBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (rippleBackgroundColor != null) __obj.updateDynamic("rippleBackgroundColor")(rippleBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleBackgroundColor]
  }
}


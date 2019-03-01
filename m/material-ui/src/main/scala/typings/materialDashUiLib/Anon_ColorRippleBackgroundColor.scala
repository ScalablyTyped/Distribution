package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorRippleBackgroundColor extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var rippleBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColorRippleBackgroundColor {
  @scala.inline
  def apply(color: java.lang.String = null, rippleBackgroundColor: java.lang.String = null): Anon_ColorRippleBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (rippleBackgroundColor != null) __obj.updateDynamic("rippleBackgroundColor")(rippleBackgroundColor)
    __obj.asInstanceOf[Anon_ColorRippleBackgroundColor]
  }
}


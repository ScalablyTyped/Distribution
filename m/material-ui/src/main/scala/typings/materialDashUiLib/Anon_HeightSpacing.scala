package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightSpacing extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_HeightSpacing {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    spacing: scala.Int | scala.Double = null,
    textColor: java.lang.String = null
  ): Anon_HeightSpacing = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_HeightSpacing]
  }
}


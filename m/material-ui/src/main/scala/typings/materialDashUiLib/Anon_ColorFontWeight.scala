package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorFontWeight extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[scala.Double] = js.undefined
  var primaryColor: js.UndefOr[java.lang.String] = js.undefined
  var primaryTextColor: js.UndefOr[java.lang.String] = js.undefined
  var secondaryColor: js.UndefOr[java.lang.String] = js.undefined
  var secondaryTextColor: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColorFontWeight {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontWeight: scala.Int | scala.Double = null,
    primaryColor: java.lang.String = null,
    primaryTextColor: java.lang.String = null,
    secondaryColor: java.lang.String = null,
    secondaryTextColor: java.lang.String = null,
    textColor: java.lang.String = null
  ): Anon_ColorFontWeight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    if (primaryTextColor != null) __obj.updateDynamic("primaryTextColor")(primaryTextColor)
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor)
    if (secondaryTextColor != null) __obj.updateDynamic("secondaryTextColor")(secondaryTextColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_ColorFontWeight]
  }
}


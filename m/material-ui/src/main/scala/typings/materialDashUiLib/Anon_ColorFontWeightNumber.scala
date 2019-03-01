package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorFontWeightNumber extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColorFontWeightNumber {
  @scala.inline
  def apply(color: java.lang.String = null, fontWeight: scala.Int | scala.Double = null): Anon_ColorFontWeightNumber = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorFontWeightNumber]
  }
}


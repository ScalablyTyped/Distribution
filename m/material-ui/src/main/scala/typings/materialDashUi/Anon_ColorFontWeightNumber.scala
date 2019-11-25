package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorFontWeightNumber extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
}

object Anon_ColorFontWeightNumber {
  @scala.inline
  def apply(color: String = null, fontWeight: Int | Double = null): Anon_ColorFontWeightNumber = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorFontWeightNumber]
  }
}


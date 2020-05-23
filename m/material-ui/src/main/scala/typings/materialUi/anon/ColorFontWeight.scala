package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorFontWeight extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
}

object ColorFontWeight {
  @scala.inline
  def apply(color: String = null, fontWeight: js.UndefOr[Double] = js.undefined): ColorFontWeight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFontWeight]
  }
}


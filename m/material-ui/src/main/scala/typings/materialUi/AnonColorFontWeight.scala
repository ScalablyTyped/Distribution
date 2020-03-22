package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorFontWeight extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
}

object AnonColorFontWeight {
  @scala.inline
  def apply(color: String = null, fontWeight: Int | Double = null): AnonColorFontWeight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorFontWeight]
  }
}


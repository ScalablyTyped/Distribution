package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var font: js.UndefOr[Weight] = js.undefined
  var padding: js.UndefOr[String | Top] = js.undefined
  var weight: js.UndefOr[Double | String] = js.undefined
}

object Font {
  @scala.inline
  def apply(font: Weight = null, padding: String | Top = null, weight: Double | String = null): Font = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}


package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var font: js.UndefOr[js.Object] = js.undefined
  var large: js.UndefOr[MaxWidth] = js.undefined
  var medium: js.UndefOr[MaxWidth] = js.undefined
  var small: js.UndefOr[MaxWidth] = js.undefined
  var xlarge: js.UndefOr[MaxWidth] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    font: js.Object = null,
    large: MaxWidth = null,
    medium: MaxWidth = null,
    small: MaxWidth = null,
    xlarge: MaxWidth = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}


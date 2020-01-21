package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFont extends js.Object {
  var font: js.UndefOr[js.Object] = js.undefined
  var large: js.UndefOr[AnonHeightMaxWidth] = js.undefined
  var medium: js.UndefOr[AnonHeightMaxWidth] = js.undefined
  var small: js.UndefOr[AnonHeightMaxWidth] = js.undefined
  var xlarge: js.UndefOr[AnonHeightMaxWidth] = js.undefined
}

object AnonFont {
  @scala.inline
  def apply(
    font: js.Object = null,
    large: AnonHeightMaxWidth = null,
    medium: AnonHeightMaxWidth = null,
    small: AnonHeightMaxWidth = null,
    xlarge: AnonHeightMaxWidth = null
  ): AnonFont = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFont]
  }
}


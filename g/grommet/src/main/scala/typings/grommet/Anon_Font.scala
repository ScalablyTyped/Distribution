package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Font extends js.Object {
  var font: js.UndefOr[js.Object] = js.undefined
  var large: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var medium: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var small: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var xlarge: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
}

object Anon_Font {
  @scala.inline
  def apply(
    font: js.Object = null,
    large: Anon_HeightMaxWidth = null,
    medium: Anon_HeightMaxWidth = null,
    small: Anon_HeightMaxWidth = null,
    xlarge: Anon_HeightMaxWidth = null
  ): Anon_Font = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Font]
  }
}


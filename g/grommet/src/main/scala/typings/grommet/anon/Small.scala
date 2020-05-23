package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Small extends js.Object {
  var large: js.UndefOr[MaxWidth] = js.undefined
  var medium: js.UndefOr[MaxWidth] = js.undefined
  var small: js.UndefOr[MaxWidth] = js.undefined
  var xlarge: js.UndefOr[MaxWidth] = js.undefined
  var xsmall: js.UndefOr[MaxWidth] = js.undefined
  var xxlarge: js.UndefOr[MaxWidth] = js.undefined
}

object Small {
  @scala.inline
  def apply(
    large: MaxWidth = null,
    medium: MaxWidth = null,
    small: MaxWidth = null,
    xlarge: MaxWidth = null,
    xsmall: MaxWidth = null,
    xxlarge: MaxWidth = null
  ): Small = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Small]
  }
}


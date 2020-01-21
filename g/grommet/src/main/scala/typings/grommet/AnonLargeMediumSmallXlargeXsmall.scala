package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLargeMediumSmallXlargeXsmall extends js.Object {
  var large: js.UndefOr[AnonHeightMaxWidth] = js.undefined
  var medium: js.UndefOr[AnonHeightMaxWidth] = js.undefined
  var small: js.UndefOr[AnonHeightMaxWidth] = js.undefined
  var xlarge: js.UndefOr[AnonHeightMaxWidth] = js.undefined
  var xsmall: js.UndefOr[AnonHeightMaxWidth] = js.undefined
  var xxlarge: js.UndefOr[AnonHeightMaxWidth] = js.undefined
}

object AnonLargeMediumSmallXlargeXsmall {
  @scala.inline
  def apply(
    large: AnonHeightMaxWidth = null,
    medium: AnonHeightMaxWidth = null,
    small: AnonHeightMaxWidth = null,
    xlarge: AnonHeightMaxWidth = null,
    xsmall: AnonHeightMaxWidth = null,
    xxlarge: AnonHeightMaxWidth = null
  ): AnonLargeMediumSmallXlargeXsmall = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLargeMediumSmallXlargeXsmall]
  }
}


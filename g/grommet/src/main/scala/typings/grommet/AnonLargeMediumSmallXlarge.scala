package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLargeMediumSmallXlarge extends js.Object {
  var large: js.UndefOr[AnonHeight] = js.undefined
  var medium: js.UndefOr[AnonHeight] = js.undefined
  var small: js.UndefOr[AnonHeight] = js.undefined
  var xlarge: js.UndefOr[AnonHeight] = js.undefined
  var xsmall: js.UndefOr[AnonHeight] = js.undefined
  var xxlarge: js.UndefOr[AnonHeight] = js.undefined
}

object AnonLargeMediumSmallXlarge {
  @scala.inline
  def apply(
    large: AnonHeight = null,
    medium: AnonHeight = null,
    small: AnonHeight = null,
    xlarge: AnonHeight = null,
    xsmall: AnonHeight = null,
    xxlarge: AnonHeight = null
  ): AnonLargeMediumSmallXlarge = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLargeMediumSmallXlarge]
  }
}


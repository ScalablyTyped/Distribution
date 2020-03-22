package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXsmall extends js.Object {
  var large: js.UndefOr[AnonHeightSize] = js.undefined
  var medium: js.UndefOr[AnonHeightSize] = js.undefined
  var small: js.UndefOr[AnonHeightSize] = js.undefined
  var xlarge: js.UndefOr[AnonHeightSize] = js.undefined
  var xsmall: js.UndefOr[AnonHeightSize] = js.undefined
  var xxlarge: js.UndefOr[AnonHeightSize] = js.undefined
}

object AnonXsmall {
  @scala.inline
  def apply(
    large: AnonHeightSize = null,
    medium: AnonHeightSize = null,
    small: AnonHeightSize = null,
    xlarge: AnonHeightSize = null,
    xsmall: AnonHeightSize = null,
    xxlarge: AnonHeightSize = null
  ): AnonXsmall = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXsmall]
  }
}


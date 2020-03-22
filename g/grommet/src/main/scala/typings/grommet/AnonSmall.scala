package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSmall extends js.Object {
  var large: js.UndefOr[AnonMaxWidth] = js.undefined
  var medium: js.UndefOr[AnonMaxWidth] = js.undefined
  var small: js.UndefOr[AnonMaxWidth] = js.undefined
  var xlarge: js.UndefOr[AnonMaxWidth] = js.undefined
  var xsmall: js.UndefOr[AnonMaxWidth] = js.undefined
  var xxlarge: js.UndefOr[AnonMaxWidth] = js.undefined
}

object AnonSmall {
  @scala.inline
  def apply(
    large: AnonMaxWidth = null,
    medium: AnonMaxWidth = null,
    small: AnonMaxWidth = null,
    xlarge: AnonMaxWidth = null,
    xsmall: AnonMaxWidth = null,
    xxlarge: AnonMaxWidth = null
  ): AnonSmall = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSmall]
  }
}


package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LargeMediumSmallXlargeXsmall extends js.Object {
  var large: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var medium: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var small: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var xlarge: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var xsmall: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var xxlarge: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
}

object Anon_LargeMediumSmallXlargeXsmall {
  @scala.inline
  def apply(
    large: Anon_HeightMaxWidth = null,
    medium: Anon_HeightMaxWidth = null,
    small: Anon_HeightMaxWidth = null,
    xlarge: Anon_HeightMaxWidth = null,
    xsmall: Anon_HeightMaxWidth = null,
    xxlarge: Anon_HeightMaxWidth = null
  ): Anon_LargeMediumSmallXlargeXsmall = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LargeMediumSmallXlargeXsmall]
  }
}


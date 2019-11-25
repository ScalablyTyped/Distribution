package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LargeMediumSmallXlarge extends js.Object {
  var large: js.UndefOr[Anon_Height] = js.undefined
  var medium: js.UndefOr[Anon_Height] = js.undefined
  var small: js.UndefOr[Anon_Height] = js.undefined
  var xlarge: js.UndefOr[Anon_Height] = js.undefined
  var xsmall: js.UndefOr[Anon_Height] = js.undefined
  var xxlarge: js.UndefOr[Anon_Height] = js.undefined
}

object Anon_LargeMediumSmallXlarge {
  @scala.inline
  def apply(
    large: Anon_Height = null,
    medium: Anon_Height = null,
    small: Anon_Height = null,
    xlarge: Anon_Height = null,
    xsmall: Anon_Height = null,
    xxlarge: Anon_Height = null
  ): Anon_LargeMediumSmallXlarge = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LargeMediumSmallXlarge]
  }
}


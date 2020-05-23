package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xsmall extends js.Object {
  var large: js.UndefOr[HeightSize] = js.undefined
  var medium: js.UndefOr[HeightSize] = js.undefined
  var small: js.UndefOr[HeightSize] = js.undefined
  var xlarge: js.UndefOr[HeightSize] = js.undefined
  var xsmall: js.UndefOr[HeightSize] = js.undefined
  var xxlarge: js.UndefOr[HeightSize] = js.undefined
}

object Xsmall {
  @scala.inline
  def apply(
    large: HeightSize = null,
    medium: HeightSize = null,
    small: HeightSize = null,
    xlarge: HeightSize = null,
    xsmall: HeightSize = null,
    xxlarge: HeightSize = null
  ): Xsmall = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xsmall]
  }
}


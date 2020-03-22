package typings.grommet.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakpointEdgeSize extends js.Object {
  var hair: js.UndefOr[String] = js.undefined
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var none: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
  var xsmall: js.UndefOr[String] = js.undefined
  var xxsmall: js.UndefOr[String] = js.undefined
}

object BreakpointEdgeSize {
  @scala.inline
  def apply(
    hair: String = null,
    large: String = null,
    medium: String = null,
    none: String = null,
    small: String = null,
    xlarge: String = null,
    xsmall: String = null,
    xxsmall: String = null
  ): BreakpointEdgeSize = {
    val __obj = js.Dynamic.literal()
    if (hair != null) __obj.updateDynamic("hair")(hair.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (none != null) __obj.updateDynamic("none")(none.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxsmall != null) __obj.updateDynamic("xxsmall")(xxsmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointEdgeSize]
  }
}


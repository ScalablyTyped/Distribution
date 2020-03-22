package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFull extends js.Object {
  var full: js.UndefOr[String] = js.undefined
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
  var xsmall: js.UndefOr[String] = js.undefined
  var xxsmall: js.UndefOr[String] = js.undefined
}

object AnonFull {
  @scala.inline
  def apply(
    full: String = null,
    large: String = null,
    medium: String = null,
    small: String = null,
    xlarge: String = null,
    xsmall: String = null,
    xxsmall: String = null
  ): AnonFull = {
    val __obj = js.Dynamic.literal()
    if (full != null) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxsmall != null) __obj.updateDynamic("xxsmall")(xxsmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFull]
  }
}


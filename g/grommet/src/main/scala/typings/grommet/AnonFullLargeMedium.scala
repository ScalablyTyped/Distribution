package typings.grommet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullLargeMedium
  extends /* x */ StringDictionary[js.UndefOr[String]] {
  var full: js.UndefOr[String] = js.undefined
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
  var xsmall: js.UndefOr[String] = js.undefined
  var xxlarge: js.UndefOr[String] = js.undefined
  var xxsmall: js.UndefOr[String] = js.undefined
}

object AnonFullLargeMedium {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.UndefOr[String]] = null,
    full: String = null,
    large: String = null,
    medium: String = null,
    small: String = null,
    xlarge: String = null,
    xsmall: String = null,
    xxlarge: String = null,
    xxsmall: String = null
  ): AnonFullLargeMedium = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (full != null) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    if (xxsmall != null) __obj.updateDynamic("xxsmall")(xxsmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFullLargeMedium]
  }
}


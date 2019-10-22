package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FullLarge extends js.Object {
  var full: js.UndefOr[String] = js.undefined
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
  var xsmall: js.UndefOr[String] = js.undefined
  var xxsmall: js.UndefOr[String] = js.undefined
}

object Anon_FullLarge {
  @scala.inline
  def apply(
    full: String = null,
    large: String = null,
    medium: String = null,
    small: String = null,
    xlarge: String = null,
    xsmall: String = null,
    xxsmall: String = null
  ): Anon_FullLarge = {
    val __obj = js.Dynamic.literal()
    if (full != null) __obj.updateDynamic("full")(full)
    if (large != null) __obj.updateDynamic("large")(large)
    if (medium != null) __obj.updateDynamic("medium")(medium)
    if (small != null) __obj.updateDynamic("small")(small)
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge)
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall)
    if (xxsmall != null) __obj.updateDynamic("xxsmall")(xxsmall)
    __obj.asInstanceOf[Anon_FullLarge]
  }
}


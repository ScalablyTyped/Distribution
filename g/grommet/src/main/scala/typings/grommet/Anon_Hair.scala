package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hair extends js.Object {
  var hair: js.UndefOr[String] = js.undefined
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var none: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
  var xsmall: js.UndefOr[String] = js.undefined
  var xxsmall: js.UndefOr[String] = js.undefined
}

object Anon_Hair {
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
  ): Anon_Hair = {
    val __obj = js.Dynamic.literal()
    if (hair != null) __obj.updateDynamic("hair")(hair)
    if (large != null) __obj.updateDynamic("large")(large)
    if (medium != null) __obj.updateDynamic("medium")(medium)
    if (none != null) __obj.updateDynamic("none")(none)
    if (small != null) __obj.updateDynamic("small")(small)
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge)
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall)
    if (xxsmall != null) __obj.updateDynamic("xxsmall")(xxsmall)
    __obj.asInstanceOf[Anon_Hair]
  }
}


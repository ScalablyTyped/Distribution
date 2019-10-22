package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LargeMedium extends js.Object {
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
  var xsmall: js.UndefOr[String] = js.undefined
}

object Anon_LargeMedium {
  @scala.inline
  def apply(
    large: String = null,
    medium: String = null,
    small: String = null,
    xlarge: String = null,
    xsmall: String = null
  ): Anon_LargeMedium = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large)
    if (medium != null) __obj.updateDynamic("medium")(medium)
    if (small != null) __obj.updateDynamic("small")(small)
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge)
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall)
    __obj.asInstanceOf[Anon_LargeMedium]
  }
}


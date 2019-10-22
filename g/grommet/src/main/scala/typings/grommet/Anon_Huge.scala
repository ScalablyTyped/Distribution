package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Huge extends js.Object {
  var huge: js.UndefOr[String] = js.undefined
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
}

object Anon_Huge {
  @scala.inline
  def apply(
    huge: String = null,
    large: String = null,
    medium: String = null,
    small: String = null,
    xlarge: String = null
  ): Anon_Huge = {
    val __obj = js.Dynamic.literal()
    if (huge != null) __obj.updateDynamic("huge")(huge)
    if (large != null) __obj.updateDynamic("large")(large)
    if (medium != null) __obj.updateDynamic("medium")(medium)
    if (small != null) __obj.updateDynamic("small")(small)
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge)
    __obj.asInstanceOf[Anon_Huge]
  }
}


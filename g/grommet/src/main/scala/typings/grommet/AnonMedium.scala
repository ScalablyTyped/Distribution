package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMedium extends js.Object {
  var large: js.UndefOr[AnonValueNumber] = js.undefined
  var medium: js.UndefOr[AnonValueNumber] = js.undefined
  var small: js.UndefOr[AnonBorderSize] = js.undefined
}

object AnonMedium {
  @scala.inline
  def apply(large: AnonValueNumber = null, medium: AnonValueNumber = null, small: AnonBorderSize = null): AnonMedium = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMedium]
  }
}


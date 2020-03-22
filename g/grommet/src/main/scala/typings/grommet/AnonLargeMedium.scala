package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLargeMedium extends js.Object {
  var large: js.UndefOr[AnonBorderPad] = js.undefined
  var medium: js.UndefOr[AnonBorderPad] = js.undefined
  var small: js.UndefOr[AnonBorderPad] = js.undefined
}

object AnonLargeMedium {
  @scala.inline
  def apply(large: AnonBorderPad = null, medium: AnonBorderPad = null, small: AnonBorderPad = null): AnonLargeMedium = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLargeMedium]
  }
}


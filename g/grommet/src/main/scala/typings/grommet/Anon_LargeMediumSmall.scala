package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LargeMediumSmall extends js.Object {
  var large: js.UndefOr[Anon_ValueNumber] = js.undefined
  var medium: js.UndefOr[Anon_ValueNumber] = js.undefined
  var small: js.UndefOr[Anon_BorderSize] = js.undefined
}

object Anon_LargeMediumSmall {
  @scala.inline
  def apply(large: Anon_ValueNumber = null, medium: Anon_ValueNumber = null, small: Anon_BorderSize = null): Anon_LargeMediumSmall = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large)
    if (medium != null) __obj.updateDynamic("medium")(medium)
    if (small != null) __obj.updateDynamic("small")(small)
    __obj.asInstanceOf[Anon_LargeMediumSmall]
  }
}


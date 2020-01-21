package typings.grommet

import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownMargin extends js.Object {
  var down: js.UndefOr[js.Any] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
}

object AnonDownMargin {
  @scala.inline
  def apply(down: js.Any = null, margin: MarginType = null): AnonDownMargin = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDownMargin]
  }
}


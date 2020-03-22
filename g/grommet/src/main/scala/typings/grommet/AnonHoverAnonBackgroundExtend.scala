package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHoverAnonBackgroundExtend extends js.Object {
  var hover: js.UndefOr[AnonBackgroundExtend] = js.undefined
}

object AnonHoverAnonBackgroundExtend {
  @scala.inline
  def apply(hover: AnonBackgroundExtend = null): AnonHoverAnonBackgroundExtend = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHoverAnonBackgroundExtend]
  }
}


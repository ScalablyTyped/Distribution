package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHover extends js.Object {
  var hover: js.UndefOr[AnonBackgroundExtendBackgroundType] = js.undefined
}

object AnonHover {
  @scala.inline
  def apply(hover: AnonBackgroundExtendBackgroundType = null): AnonHover = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHover]
  }
}


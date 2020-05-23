package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverBackgroundExtend extends js.Object {
  var hover: js.UndefOr[BackgroundExtend] = js.undefined
}

object HoverBackgroundExtend {
  @scala.inline
  def apply(hover: BackgroundExtend = null): HoverBackgroundExtend = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverBackgroundExtend]
  }
}


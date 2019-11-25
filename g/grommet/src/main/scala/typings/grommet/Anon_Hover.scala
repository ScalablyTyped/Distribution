package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hover extends js.Object {
  var hover: js.UndefOr[Anon_BackgroundExtendBackgroundType] = js.undefined
}

object Anon_Hover {
  @scala.inline
  def apply(hover: Anon_BackgroundExtendBackgroundType = null): Anon_Hover = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Hover]
  }
}


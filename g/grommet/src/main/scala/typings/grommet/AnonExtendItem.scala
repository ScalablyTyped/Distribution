package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtendItem extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var item: js.UndefOr[AnonBackgroundBorderExtend] = js.undefined
}

object AnonExtendItem {
  @scala.inline
  def apply(extend: ExtendType = null, item: AnonBackgroundBorderExtend = null): AnonExtendItem = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtendItem]
  }
}


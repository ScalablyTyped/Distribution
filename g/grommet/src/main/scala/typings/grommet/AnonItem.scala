package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var item: js.UndefOr[AnonBorderExtend] = js.undefined
}

object AnonItem {
  @scala.inline
  def apply(extend: ExtendType = null, item: AnonBorderExtend = null): AnonItem = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem]
  }
}


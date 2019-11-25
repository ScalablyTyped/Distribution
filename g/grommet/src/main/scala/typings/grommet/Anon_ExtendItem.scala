package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendItem extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var item: js.UndefOr[Anon_BackgroundBorderExtend] = js.undefined
}

object Anon_ExtendItem {
  @scala.inline
  def apply(extend: ExtendType = null, item: Anon_BackgroundBorderExtend = null): Anon_ExtendItem = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtendItem]
  }
}


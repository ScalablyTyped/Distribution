package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderExtend extends js.Object {
  var border: js.UndefOr[`0`] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object BorderExtend {
  @scala.inline
  def apply(border: `0` = null, extend: ExtendType = null): BorderExtend = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderExtend]
  }
}


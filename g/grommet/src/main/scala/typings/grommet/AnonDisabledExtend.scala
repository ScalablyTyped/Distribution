package typings.grommet

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabledExtend extends js.Object {
  var disabled: js.UndefOr[OpacityType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object AnonDisabledExtend {
  @scala.inline
  def apply(disabled: OpacityType = null, extend: ExtendType = null): AnonDisabledExtend = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabledExtend]
  }
}


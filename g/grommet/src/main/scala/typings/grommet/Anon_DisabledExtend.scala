package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledExtend extends js.Object {
  var disabled: js.UndefOr[OpacityType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object Anon_DisabledExtend {
  @scala.inline
  def apply(disabled: OpacityType = null, extend: ExtendType = null): Anon_DisabledExtend = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisabledExtend]
  }
}


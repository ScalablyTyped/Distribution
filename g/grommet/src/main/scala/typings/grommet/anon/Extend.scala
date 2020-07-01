package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend extends js.Object {
  var disabled: js.UndefOr[OpacityOpacityType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object Extend {
  @scala.inline
  def apply(disabled: OpacityOpacityType = null, extend: ExtendType = null): Extend = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extend]
  }
}


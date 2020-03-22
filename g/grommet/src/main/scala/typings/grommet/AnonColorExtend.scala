package typings.grommet

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorExtend extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object AnonColorExtend {
  @scala.inline
  def apply(color: ColorType = null, extend: ExtendType = null): AnonColorExtend = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorExtend]
  }
}


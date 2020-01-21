package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtendSizeAnonLargeMediumSmallX extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var size: js.UndefOr[AnonLargeMediumSmallX] = js.undefined
}

object AnonExtendSizeAnonLargeMediumSmallX {
  @scala.inline
  def apply(extend: ExtendType = null, size: AnonLargeMediumSmallX = null): AnonExtendSizeAnonLargeMediumSmallX = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtendSizeAnonLargeMediumSmallX]
  }
}


package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtend extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object AnonExtend {
  @scala.inline
  def apply(extend: ExtendType = null): AnonExtend = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtend]
  }
}


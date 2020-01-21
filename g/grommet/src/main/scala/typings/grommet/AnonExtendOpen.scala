package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtendOpen extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
}

object AnonExtendOpen {
  @scala.inline
  def apply(extend: ExtendType = null, open: js.UndefOr[Boolean] = js.undefined): AnonExtendOpen = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtendOpen]
  }
}


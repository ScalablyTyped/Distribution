package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThickness extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var radius: js.UndefOr[String] = js.undefined
  var thickness: js.UndefOr[String] = js.undefined
}

object AnonThickness {
  @scala.inline
  def apply(extend: ExtendType = null, radius: String = null, thickness: String = null): AnonThickness = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThickness]
  }
}


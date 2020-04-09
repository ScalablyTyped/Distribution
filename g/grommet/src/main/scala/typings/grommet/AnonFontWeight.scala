package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontWeight extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
}

object AnonFontWeight {
  @scala.inline
  def apply(extend: ExtendType = null, fontWeight: Int | Double = null): AnonFontWeight = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFontWeight]
  }
}


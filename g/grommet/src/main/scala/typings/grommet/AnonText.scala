package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var size: js.UndefOr[AnonXlarge] = js.undefined
  var text: js.UndefOr[AnonFontWeight] = js.undefined
}

object AnonText {
  @scala.inline
  def apply(extend: ExtendType = null, size: AnonXlarge = null, text: AnonFontWeight = null): AnonText = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}


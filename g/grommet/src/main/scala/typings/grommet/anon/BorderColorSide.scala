package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderColorSide extends js.Object {
  var border: js.UndefOr[ColorSide] = js.undefined
}

object BorderColorSide {
  @scala.inline
  def apply(border: ColorSide = null): BorderColorSide = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorSide]
  }
}


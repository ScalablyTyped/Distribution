package typings.handsontable.handsontableMod.Handsontable.customBorders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object BorderOptions {
  @scala.inline
  def apply(color: String = null, style: String = null, width: Int | Double = null): BorderOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderOptions]
  }
}


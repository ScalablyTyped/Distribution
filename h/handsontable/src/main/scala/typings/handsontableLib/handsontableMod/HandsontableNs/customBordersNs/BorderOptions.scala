package typings
package handsontableLib.handsontableMod.HandsontableNs.customBordersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderOptions extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object BorderOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    style: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): BorderOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderOptions]
  }
}


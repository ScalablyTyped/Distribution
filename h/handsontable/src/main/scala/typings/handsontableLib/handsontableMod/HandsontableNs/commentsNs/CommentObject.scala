package typings
package handsontableLib.handsontableMod.HandsontableNs.commentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentObject extends js.Object {
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[handsontableLib.Anon_Height] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CommentObject {
  @scala.inline
  def apply(
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    style: handsontableLib.Anon_Height = null,
    value: java.lang.String = null
  ): CommentObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CommentObject]
  }
}


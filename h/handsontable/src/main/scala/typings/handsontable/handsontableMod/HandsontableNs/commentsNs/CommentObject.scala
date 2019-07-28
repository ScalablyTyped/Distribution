package typings.handsontable.handsontableMod.HandsontableNs.commentsNs

import typings.handsontable.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentObject extends js.Object {
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Anon_Height] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CommentObject {
  @scala.inline
  def apply(readOnly: js.UndefOr[Boolean] = js.undefined, style: Anon_Height = null, value: String = null): CommentObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CommentObject]
  }
}


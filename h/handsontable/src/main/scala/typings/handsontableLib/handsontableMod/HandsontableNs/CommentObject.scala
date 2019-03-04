package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// plugins
// Comments
trait CommentObject extends js.Object {
  var col: scala.Double
  var comment: js.UndefOr[handsontableLib.Anon_ReadOnly] = js.undefined
  var row: scala.Double
}

object CommentObject {
  @scala.inline
  def apply(col: scala.Double, row: scala.Double, comment: handsontableLib.Anon_ReadOnly = null): CommentObject = {
    val __obj = js.Dynamic.literal(col = col, row = row)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[CommentObject]
  }
}


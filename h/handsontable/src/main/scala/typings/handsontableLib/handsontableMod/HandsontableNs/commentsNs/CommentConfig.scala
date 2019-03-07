package typings
package handsontableLib.handsontableMod.HandsontableNs.commentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentConfig extends js.Object {
  var col: scala.Double
  var comment: CommentObject
  var row: scala.Double
}

object CommentConfig {
  @scala.inline
  def apply(col: scala.Double, comment: CommentObject, row: scala.Double): CommentConfig = {
    val __obj = js.Dynamic.literal(col = col, comment = comment, row = row)
  
    __obj.asInstanceOf[CommentConfig]
  }
}


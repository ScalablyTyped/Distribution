package typings.lineColumn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Utility type for object structures that can be used as inputs to the `toIndex`
  * function.
  */
/* Rewritten from type alias, can be one of: 
  - typings.lineColumn.mod.LineColumnInfo
  - typings.lineColumn.anon.Column
*/
trait LineColumnObject extends js.Object

object LineColumnObject {
  @scala.inline
  def LineColumnInfo(col: Double, line: Double): LineColumnObject = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineColumnObject]
  }
  @scala.inline
  def Column(column: Double, line: Double): LineColumnObject = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineColumnObject]
  }
}


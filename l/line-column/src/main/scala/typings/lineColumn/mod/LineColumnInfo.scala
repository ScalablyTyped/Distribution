package typings.lineColumn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineColumnInfo extends LineColumnObject {
  var col: Double
  var line: Double
}

object LineColumnInfo {
  @scala.inline
  def apply(col: Double, line: Double): LineColumnInfo = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineColumnInfo]
  }
}


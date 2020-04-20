package typings.lineColumn

import typings.lineColumn.mod.LineColumnObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends LineColumnObject {
  var column: Double
  var line: Double
}

object AnonColumn {
  @scala.inline
  def apply(column: Double, line: Double): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
}


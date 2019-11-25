package typings.handsontable.handsontableMod.Handsontable.columnSorting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var column: Double
  var sortOrder: SortOrderType
}

object Config {
  @scala.inline
  def apply(column: Double, sortOrder: SortOrderType): Config = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}


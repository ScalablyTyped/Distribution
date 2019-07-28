package typings.handsontable.handsontableMod.HandsontableNs.columnSortingNs

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
    val __obj = js.Dynamic.literal(column = column, sortOrder = sortOrder)
  
    __obj.asInstanceOf[Config]
  }
}


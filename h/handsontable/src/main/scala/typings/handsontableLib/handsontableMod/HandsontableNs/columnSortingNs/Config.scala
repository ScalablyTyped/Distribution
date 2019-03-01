package typings
package handsontableLib.handsontableMod.HandsontableNs.columnSortingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var column: scala.Double
  var sortOrder: SortOrderType
}

object Config {
  @scala.inline
  def apply(column: scala.Double, sortOrder: SortOrderType): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[Config]
  }
}


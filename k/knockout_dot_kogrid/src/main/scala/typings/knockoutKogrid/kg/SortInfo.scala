package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortInfo extends js.Object {
  /** Which column to sort */
  var column: SortColumn
  /** Which direction to sort */
  var direction: Direction
}

object SortInfo {
  @scala.inline
  def apply(column: SortColumn, direction: Direction): SortInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortInfo]
  }
}


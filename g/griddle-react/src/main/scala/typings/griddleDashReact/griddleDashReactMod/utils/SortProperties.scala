package typings.griddleDashReact.griddleDashReactMod.utils

import typings.griddleDashReact.griddleDashReactMod.GriddleSortKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortProperties extends js.Object {
  var columnId: String
  var sortProperty: GriddleSortKey
  def setSortColumn(sortProperties: js.Function1[/* key */ GriddleSortKey, Unit]): Unit
}

object SortProperties {
  @scala.inline
  def apply(
    columnId: String,
    setSortColumn: js.Function1[/* key */ GriddleSortKey, Unit] => Unit,
    sortProperty: GriddleSortKey
  ): SortProperties = {
    val __obj = js.Dynamic.literal(columnId = columnId, setSortColumn = js.Any.fromFunction1(setSortColumn), sortProperty = sortProperty)
  
    __obj.asInstanceOf[SortProperties]
  }
}


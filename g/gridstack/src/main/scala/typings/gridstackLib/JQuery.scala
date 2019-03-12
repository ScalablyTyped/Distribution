package typings
package gridstackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  @JSName("data")
  def data_gridstack(key: gridstackLib.gridstackLibStrings.gridstack): GridStack
  def gridstack(options: IGridstackOptions): JQuery
}

object JQuery {
  @scala.inline
  def apply(
    data_gridstack: gridstackLib.gridstackLibStrings.gridstack => GridStack,
    gridstack: IGridstackOptions => JQuery
  ): JQuery = {
    val __obj = js.Dynamic.literal(gridstack = js.Any.fromFunction1(gridstack))
    __obj.updateDynamic("data")(js.Any.fromFunction1(data_gridstack))
    __obj.asInstanceOf[JQuery]
  }
}


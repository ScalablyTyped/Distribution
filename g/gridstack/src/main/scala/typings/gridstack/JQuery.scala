package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  @JSName("data")
  def data_gridstack(key: typings.gridstack.gridstackStrings.gridstack): GridStack
  def gridstack(options: GridstackOptions): JQuery
}

object JQuery {
  @scala.inline
  def apply(
    data: typings.gridstack.gridstackStrings.gridstack => GridStack,
    gridstack: GridstackOptions => JQuery
  ): JQuery = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction1(data), gridstack = js.Any.fromFunction1(gridstack))
  
    __obj.asInstanceOf[JQuery]
  }
}


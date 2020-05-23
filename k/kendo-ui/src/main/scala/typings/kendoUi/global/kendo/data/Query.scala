package typings.kendoUi.global.kendo.data

import typings.kendoUi.kendo.data.DataSourceTransportReadOptionsData
import typings.kendoUi.kendo.data.QueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Query")
@js.native
class Query protected ()
  extends typings.kendoUi.kendo.data.Query {
  def this(data: js.Array[_]) = this()
}

/* static members */
@JSGlobal("kendo.data.Query")
@js.native
object Query extends js.Object {
  def process(data: js.Array[_], options: DataSourceTransportReadOptionsData): QueryResult = js.native
}


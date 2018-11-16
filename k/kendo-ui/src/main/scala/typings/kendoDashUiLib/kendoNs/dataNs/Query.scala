package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Query")
@js.native
class Query protected () extends js.Object {
  def this(data: js.Array[_]) = this()
  var data: js.Array[_] = js.native
  def filter(filters: js.Array[DataSourceFilterItem]): Query = js.native
  def filter(filters: DataSourceFilterItem): Query = js.native
  def filter(filters: DataSourceFilters): Query = js.native
  def group(descriptors: js.Array[DataSourceGroupItem]): Query = js.native
  def group(descriptors: DataSourceGroupItem): Query = js.native
  def order(selector: java.lang.String): Query = js.native
  def order(selector: java.lang.String, dir: java.lang.String): Query = js.native
  def order(selector: js.Function): Query = js.native
  def order(selector: js.Function, dir: java.lang.String): Query = js.native
  def range(intex: scala.Double, count: scala.Double): Query = js.native
  def select(selector: js.Function): Query = js.native
  def skip(count: scala.Double): Query = js.native
  def take(count: scala.Double): Query = js.native
  def toArray(): js.Array[_] = js.native
}

@JSGlobal("kendo.data.Query")
@js.native
object Query extends js.Object {
  def process(data: js.Array[_], options: kendoDashUiLib.kendoNs.dataNs.DataSourceTransportReadOptionsData): kendoDashUiLib.kendoNs.dataNs.QueryResult = js.native
}


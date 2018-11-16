package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.DataSource")
@js.native
class DataSource ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: DataSourceOptions) = this()
  var options: DataSourceOptions = js.native
  def add(model: js.Object): Model = js.native
  def add(model: Model): Model = js.native
  def aggregate(): js.Any = js.native
  def aggregate(`val`: js.Any): scala.Unit = js.native
  def aggregates(): js.Any = js.native
  def at(index: scala.Double): ObservableObject = js.native
  def cancelChanges(): scala.Unit = js.native
  def cancelChanges(model: Model): scala.Unit = js.native
  def data(): ObservableArray = js.native
  def data(value: js.Any): scala.Unit = js.native
  def fetch(): kendoDashUiLib.JQueryPromise[_] = js.native
  def fetch(callback: js.Function): kendoDashUiLib.JQueryPromise[_] = js.native
  def filter(): DataSourceFilters = js.native
  def filter(filters: js.Array[DataSourceFilterItem]): scala.Unit = js.native
  def filter(filters: DataSourceFilterItem): scala.Unit = js.native
  def filter(filters: DataSourceFilters): scala.Unit = js.native
  def get(id: js.Any): Model = js.native
  def getByUid(uid: java.lang.String): Model = js.native
  def group(): js.Any = js.native
  def group(groups: js.Any): scala.Unit = js.native
  def hasChanges(): scala.Boolean = js.native
  def indexOf(value: ObservableObject): scala.Double = js.native
  def init(): scala.Unit = js.native
  def init(options: DataSourceOptions): scala.Unit = js.native
  def insert(index: scala.Double, model: js.Object): Model = js.native
  def insert(index: scala.Double, model: Model): Model = js.native
  def offlineData(): js.Array[_] = js.native
  def offlineData(data: js.Array[_]): scala.Unit = js.native
  def online(): scala.Boolean = js.native
  def online(value: scala.Boolean): scala.Unit = js.native
  def page(): scala.Double = js.native
  def page(page: scala.Double): scala.Unit = js.native
  def pageSize(): scala.Double = js.native
  def pageSize(size: scala.Double): scala.Unit = js.native
  def pushCreate(model: js.Object): scala.Unit = js.native
  def pushCreate(models: js.Array[_]): scala.Unit = js.native
  def pushDestroy(model: js.Object): scala.Unit = js.native
  def pushDestroy(models: js.Array[_]): scala.Unit = js.native
  def pushUpdate(model: js.Object): scala.Unit = js.native
  def pushUpdate(models: js.Array[_]): scala.Unit = js.native
  def query(): kendoDashUiLib.JQueryPromise[_] = js.native
  def query(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def read(): kendoDashUiLib.JQueryPromise[_] = js.native
  def read(data: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def remove(model: ObservableObject): scala.Unit = js.native
  def sort(): js.Array[DataSourceSortItem] = js.native
  def sort(sort: js.Array[DataSourceSortItem]): scala.Unit = js.native
  def sort(sort: DataSourceSortItem): scala.Unit = js.native
  def sync(): kendoDashUiLib.JQueryPromise[_] = js.native
  def total(): scala.Double = js.native
  def totalPages(): scala.Double = js.native
  def view(): ObservableArray = js.native
}

@JSGlobal("kendo.data.DataSource")
@js.native
object DataSource extends js.Object {
  def create(): kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  def create(options: kendoDashUiLib.kendoNs.dataNs.DataSourceOptions): kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
}


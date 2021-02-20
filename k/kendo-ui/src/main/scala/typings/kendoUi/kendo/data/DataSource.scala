package typings.kendoUi.kendo.data

import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends Observable {
  
  def add(model: js.Object): Model = js.native
  def add(model: Model): Model = js.native
  
  def aggregate(): js.Any = js.native
  def aggregate(`val`: js.Any): Unit = js.native
  
  def aggregates(): js.Any = js.native
  
  def at(index: Double): ObservableObject = js.native
  
  def cancelChanges(): Unit = js.native
  def cancelChanges(model: Model): Unit = js.native
  
  def data(): ObservableArray = js.native
  def data(value: js.Any): Unit = js.native
  
  def fetch(): JQueryPromise[_] = js.native
  def fetch(callback: js.Function): JQueryPromise[_] = js.native
  
  def filter(): DataSourceFilters = js.native
  def filter(filters: js.Array[DataSourceFilterItem]): Unit = js.native
  def filter(filters: DataSourceFilterItem): Unit = js.native
  def filter(filters: DataSourceFilters): Unit = js.native
  
  def get(id: js.Any): Model = js.native
  
  def getByUid(uid: String): Model = js.native
  
  def group(): js.Any = js.native
  def group(groups: js.Any): Unit = js.native
  
  def hasChanges(): Boolean = js.native
  
  def indexOf(value: ObservableObject): Double = js.native
  
  def init(): Unit = js.native
  def init(options: DataSourceOptions): Unit = js.native
  
  def insert(index: Double, model: js.Object): Model = js.native
  def insert(index: Double, model: Model): Model = js.native
  
  def offlineData(): js.Array[_] = js.native
  def offlineData(data: js.Array[_]): Unit = js.native
  
  def online(): Boolean = js.native
  def online(value: Boolean): Unit = js.native
  
  var options: DataSourceOptions = js.native
  
  def page(): Double = js.native
  def page(page: Double): Unit = js.native
  
  def pageSize(): Double = js.native
  def pageSize(size: Double): Unit = js.native
  
  def pushCreate(model: js.Object): Unit = js.native
  def pushCreate(models: js.Array[_]): Unit = js.native
  
  def pushDestroy(model: js.Object): Unit = js.native
  def pushDestroy(models: js.Array[_]): Unit = js.native
  
  def pushInsert(index: Double, model: js.Object): Unit = js.native
  def pushInsert(index: Double, models: js.Array[_]): Unit = js.native
  
  def pushUpdate(model: js.Object): Unit = js.native
  def pushUpdate(models: js.Array[_]): Unit = js.native
  
  def query(): JQueryPromise[_] = js.native
  def query(options: js.Any): JQueryPromise[_] = js.native
  
  def read(): JQueryPromise[_] = js.native
  def read(data: js.Any): JQueryPromise[_] = js.native
  
  def remove(model: ObservableObject): Unit = js.native
  
  def skip(): Double = js.native
  
  def sort(): js.Array[DataSourceSortItem] = js.native
  def sort(sort: js.Array[DataSourceSortItem]): Unit = js.native
  def sort(sort: DataSourceSortItem): Unit = js.native
  
  def sync(): JQueryPromise[_] = js.native
  
  def total(): Double = js.native
  
  def totalPages(): Double = js.native
  
  def view(): ObservableArray = js.native
}

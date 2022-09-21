package typings.kendoUi.kendo.data

import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource
  extends StObject
     with Observable {
  
  def add(model: js.Object): Model = js.native
  def add(model: Model): Model = js.native
  
  def aggregate(): Any = js.native
  def aggregate(`val`: Any): Unit = js.native
  
  def aggregates(): Any = js.native
  
  def at(index: Double): ObservableObject = js.native
  
  def cancelChanges(): Unit = js.native
  def cancelChanges(model: Model): Unit = js.native
  
  def data(): ObservableArray = js.native
  def data(value: Any): Unit = js.native
  
  def fetch(): JQueryPromise[Any] = js.native
  def fetch(callback: js.Function): JQueryPromise[Any] = js.native
  
  def filter(): DataSourceFilters = js.native
  def filter(filters: js.Array[DataSourceFilterItem]): Unit = js.native
  def filter(filters: DataSourceFilterItem): Unit = js.native
  def filter(filters: DataSourceFilters): Unit = js.native
  
  def get(id: Any): Model = js.native
  
  def getByUid(uid: String): Model = js.native
  
  def group(): Any = js.native
  def group(groups: Any): Unit = js.native
  
  def hasChanges(): Boolean = js.native
  
  def indexOf(value: ObservableObject): Double = js.native
  
  def init(): Unit = js.native
  def init(options: DataSourceOptions): Unit = js.native
  
  def insert(index: Double, model: js.Object): Model = js.native
  def insert(index: Double, model: Model): Model = js.native
  
  def offlineData(): js.Array[Any] = js.native
  def offlineData(data: js.Array[Any]): Unit = js.native
  
  def online(): Boolean = js.native
  def online(value: Boolean): Unit = js.native
  
  var options: DataSourceOptions = js.native
  
  def page(): Double = js.native
  def page(page: Double): Unit = js.native
  
  def pageSize(): Double = js.native
  def pageSize(size: Double): Unit = js.native
  
  def pushCreate(model: js.Object): Unit = js.native
  def pushCreate(models: js.Array[Any]): Unit = js.native
  
  def pushDestroy(model: js.Object): Unit = js.native
  def pushDestroy(models: js.Array[Any]): Unit = js.native
  
  def pushInsert(index: Double, model: js.Object): Unit = js.native
  def pushInsert(index: Double, models: js.Array[Any]): Unit = js.native
  
  def pushUpdate(model: js.Object): Unit = js.native
  def pushUpdate(models: js.Array[Any]): Unit = js.native
  
  def query(): JQueryPromise[Any] = js.native
  def query(options: Any): JQueryPromise[Any] = js.native
  
  def read(): JQueryPromise[Any] = js.native
  def read(data: Any): JQueryPromise[Any] = js.native
  
  def remove(model: ObservableObject): Unit = js.native
  
  def skip(): Double = js.native
  
  def sort(): js.Array[DataSourceSortItem] = js.native
  def sort(sort: js.Array[DataSourceSortItem]): Unit = js.native
  def sort(sort: DataSourceSortItem): Unit = js.native
  
  def sync(): JQueryPromise[Any] = js.native
  
  def total(): Double = js.native
  
  def totalPages(): Double = js.native
  
  def view(): ObservableArray = js.native
}

package typings.kendoUi.kendo.data

import typings.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotDataSource extends DataSource {
  def axes(): PivotSchemaAxes = js.native
  def catalog(): String = js.native
  def catalog(`val`: String): Unit = js.native
  def columns(): js.Array[String] = js.native
  def columns(`val`: js.Array[String]): Unit = js.native
  def cube(): String = js.native
  def cube(`val`: String): Unit = js.native
  def discover(options: PivotDiscoverRequestOptions): JQueryPromise[_] = js.native
  def init(options: PivotDataSourceOptions): Unit = js.native
  def measures(): js.Array[String] = js.native
  def measures(`val`: js.Array[String]): Unit = js.native
  def measuresAxis(): String = js.native
  def rows(): js.Array[String] = js.native
  def rows(`val`: js.Array[String]): Unit = js.native
  def schemaCatalogs(): JQueryPromise[_] = js.native
  def schemaCubes(): JQueryPromise[_] = js.native
  def schemaDimensions(): JQueryPromise[_] = js.native
  def schemaHierarchies(): JQueryPromise[_] = js.native
  def schemaLevels(): JQueryPromise[_] = js.native
  def schemaMeasures(): JQueryPromise[_] = js.native
}


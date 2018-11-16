package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.PivotDataSource")
@js.native
class PivotDataSource () extends DataSource {
  def this(options: PivotDataSourceOptions) = this()
  def axes(): PivotSchemaAxes = js.native
  def catalog(): java.lang.String = js.native
  def catalog(`val`: java.lang.String): scala.Unit = js.native
  def columns(): js.Array[java.lang.String] = js.native
  def columns(`val`: js.Array[java.lang.String]): scala.Unit = js.native
  def cube(): java.lang.String = js.native
  def cube(`val`: java.lang.String): scala.Unit = js.native
  def discover(options: PivotDiscoverRequestOptions): kendoDashUiLib.JQueryPromise[_] = js.native
  def init(options: PivotDataSourceOptions): scala.Unit = js.native
  def measures(): js.Array[java.lang.String] = js.native
  def measures(`val`: js.Array[java.lang.String]): scala.Unit = js.native
  def measuresAxis(): java.lang.String = js.native
  def rows(): js.Array[java.lang.String] = js.native
  def rows(`val`: js.Array[java.lang.String]): scala.Unit = js.native
  def schemaCatalogs(): kendoDashUiLib.JQueryPromise[_] = js.native
  def schemaCubes(): kendoDashUiLib.JQueryPromise[_] = js.native
  def schemaDimensions(): kendoDashUiLib.JQueryPromise[_] = js.native
  def schemaHierarchies(): kendoDashUiLib.JQueryPromise[_] = js.native
  def schemaLevels(): kendoDashUiLib.JQueryPromise[_] = js.native
  def schemaMeasures(): kendoDashUiLib.JQueryPromise[_] = js.native
}


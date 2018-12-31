package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDataSourceOptions extends DataSourceOptions {
  var columns: js.UndefOr[js.Array[java.lang.String] | js.Array[PivotDataSourceAxisOptions]] = js.undefined
  var measures: js.UndefOr[js.Array[java.lang.String] | PivotDataSourceMeasureOptions] = js.undefined
  var rows: js.UndefOr[js.Array[java.lang.String] | js.Array[PivotDataSourceAxisOptions]] = js.undefined
  @JSName("schema")
  var schema_PivotDataSourceOptions: js.UndefOr[PivotSchema] = js.undefined
  @JSName("transport")
  var transport_PivotDataSourceOptions: js.UndefOr[PivotTransport] = js.undefined
}


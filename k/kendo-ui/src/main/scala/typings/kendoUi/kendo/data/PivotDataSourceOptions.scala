package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotDataSourceOptions extends DataSourceOptions {
  
  var columns: js.UndefOr[js.Array[PivotDataSourceAxisOptions | String]] = js.native
  
  var measures: js.UndefOr[js.Array[String] | PivotDataSourceMeasureOptions] = js.native
  
  var rows: js.UndefOr[js.Array[PivotDataSourceAxisOptions | String]] = js.native
  
  @JSName("schema")
  var schema_PivotDataSourceOptions: js.UndefOr[PivotSchema] = js.native
  
  @JSName("transport")
  var transport_PivotDataSourceOptions: js.UndefOr[PivotTransport] = js.native
}
object PivotDataSourceOptions {
  
  @scala.inline
  def apply(): PivotDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotDataSourceOptions]
  }
  
  @scala.inline
  implicit class PivotDataSourceOptionsMutableBuilder[Self <: PivotDataSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[PivotDataSourceAxisOptions | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (PivotDataSourceAxisOptions | String)*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setMeasures(value: js.Array[String] | PivotDataSourceMeasureOptions): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    @scala.inline
    def setMeasuresVarargs(value: String*): Self = StObject.set(x, "measures", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[PivotDataSourceAxisOptions | String]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: (PivotDataSourceAxisOptions | String)*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: PivotSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setTransport(value: PivotTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}

package typings.kendoUi.kendo.data

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
  implicit class PivotDataSourceOptionsOps[Self <: PivotDataSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnsVarargs(value: (PivotDataSourceAxisOptions | String)*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[PivotDataSourceAxisOptions | String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setMeasuresVarargs(value: String*): Self = this.set("measures", js.Array(value :_*))
    
    @scala.inline
    def setMeasures(value: js.Array[String] | PivotDataSourceMeasureOptions): Self = this.set("measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasures: Self = this.set("measures", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: (PivotDataSourceAxisOptions | String)*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[PivotDataSourceAxisOptions | String]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSchema(value: PivotSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setTransport(value: PivotTransport): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
}

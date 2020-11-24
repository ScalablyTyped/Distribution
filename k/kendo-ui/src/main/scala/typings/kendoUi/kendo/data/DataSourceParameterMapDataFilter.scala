package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceParameterMapDataFilter extends js.Object {
  
  var field: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[js.Array[DataSourceParameterMapDataFilter]] = js.native
  
  var logic: js.UndefOr[String] = js.native
  
  var operator: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object DataSourceParameterMapDataFilter {
  
  @scala.inline
  def apply(): DataSourceParameterMapDataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceParameterMapDataFilter]
  }
  
  @scala.inline
  implicit class DataSourceParameterMapDataFilterOps[Self <: DataSourceParameterMapDataFilter] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: DataSourceParameterMapDataFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[DataSourceParameterMapDataFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setLogic(value: String): Self = this.set("logic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogic: Self = this.set("logic", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}

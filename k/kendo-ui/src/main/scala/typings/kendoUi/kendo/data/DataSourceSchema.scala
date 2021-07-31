package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSchema extends StObject {
  
  var aggregates: js.UndefOr[js.Any] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var errors: js.UndefOr[js.Any] = js.undefined
  
  var groups: js.UndefOr[js.Any] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var parse: js.UndefOr[js.Function] = js.undefined
  
  var total: js.UndefOr[js.Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSourceSchema {
  
  @scala.inline
  def apply(): DataSourceSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchema]
  }
  
  @scala.inline
  implicit class DataSourceSchemaMutableBuilder[Self <: DataSourceSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregates(value: js.Any): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatesUndefined: Self = StObject.set(x, "aggregates", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Any): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setTotal(value: js.Any): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

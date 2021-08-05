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
  
  inline def apply(): DataSourceSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchema]
  }
  
  extension [Self <: DataSourceSchema](x: Self) {
    
    inline def setAggregates(value: js.Any): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    inline def setAggregatesUndefined: Self = StObject.set(x, "aggregates", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setGroups(value: js.Any): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setTotal(value: js.Any): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

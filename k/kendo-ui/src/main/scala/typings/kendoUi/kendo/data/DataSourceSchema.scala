package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSchema extends StObject {
  
  var aggregates: js.UndefOr[Any] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var errors: js.UndefOr[Any] = js.undefined
  
  var groups: js.UndefOr[Any] = js.undefined
  
  var model: js.UndefOr[Any] = js.undefined
  
  var parse: js.UndefOr[js.Function] = js.undefined
  
  var total: js.UndefOr[Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSourceSchema {
  
  inline def apply(): DataSourceSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceSchema] (val x: Self) extends AnyVal {
    
    inline def setAggregates(value: Any): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    inline def setAggregatesUndefined: Self = StObject.set(x, "aggregates", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setErrors(value: Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setGroups(value: Any): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setTotal(value: Any): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogConfigCounterOptions extends StObject {
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var customFields: js.UndefOr[js.Array[SchemaLogConfigCounterOptionsCustomField]] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var field: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var metric: js.UndefOr[String | Null] = js.undefined
}
object SchemaLogConfigCounterOptions {
  
  inline def apply(): SchemaLogConfigCounterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigCounterOptions]
  }
  
  extension [Self <: SchemaLogConfigCounterOptions](x: Self) {
    
    inline def setCustomFields(value: js.Array[SchemaLogConfigCounterOptionsCustomField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setCustomFieldsVarargs(value: SchemaLogConfigCounterOptionsCustomField*): Self = StObject.set(x, "customFields", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricNull: Self = StObject.set(x, "metric", null)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}

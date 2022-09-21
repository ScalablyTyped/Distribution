package typings.googleapis.gameservicesV1Mod.gameservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCounterOptions extends StObject {
  
  /**
    * Custom fields.
    */
  var customFields: js.UndefOr[js.Array[SchemaCustomField]] = js.undefined
  
  /**
    * The field value to attribute.
    */
  var field: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The metric to update.
    */
  var metric: js.UndefOr[String | Null] = js.undefined
}
object SchemaCounterOptions {
  
  inline def apply(): SchemaCounterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterOptions]
  }
  
  extension [Self <: SchemaCounterOptions](x: Self) {
    
    inline def setCustomFields(value: js.Array[SchemaCustomField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setCustomFieldsVarargs(value: SchemaCustomField*): Self = StObject.set(x, "customFields", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricNull: Self = StObject.set(x, "metric", null)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}

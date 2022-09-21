package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfigCounterOptions extends StObject {
  
  /** This is deprecated and has no effect. Do not use. */
  var customFields: js.UndefOr[js.Array[LogConfigCounterOptionsCustomField]] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var field: js.UndefOr[String] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var metric: js.UndefOr[String] = js.undefined
}
object LogConfigCounterOptions {
  
  inline def apply(): LogConfigCounterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigCounterOptions]
  }
  
  extension [Self <: LogConfigCounterOptions](x: Self) {
    
    inline def setCustomFields(value: js.Array[LogConfigCounterOptionsCustomField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setCustomFieldsVarargs(value: LogConfigCounterOptionsCustomField*): Self = StObject.set(x, "customFields", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}

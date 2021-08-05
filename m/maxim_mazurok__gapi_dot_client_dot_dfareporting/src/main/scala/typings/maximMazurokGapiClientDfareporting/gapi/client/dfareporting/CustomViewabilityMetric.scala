package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomViewabilityMetric extends StObject {
  
  /** Configuration of the custom viewability metric. */
  var configuration: js.UndefOr[CustomViewabilityMetricConfiguration] = js.undefined
  
  /** ID of the custom viewability metric. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Name of the custom viewability metric. */
  var name: js.UndefOr[String] = js.undefined
}
object CustomViewabilityMetric {
  
  inline def apply(): CustomViewabilityMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomViewabilityMetric]
  }
  
  extension [Self <: CustomViewabilityMetric](x: Self) {
    
    inline def setConfiguration(value: CustomViewabilityMetricConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

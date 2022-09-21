package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasicSli extends StObject {
  
  /**
    * Good service is defined to be the count of requests made to this service that return successfully.
    */
  var availability: js.UndefOr[SchemaAvailabilityCriteria] = js.undefined
  
  /**
    * Good service is defined to be the count of requests made to this service that are fast enough with respect to latency.threshold.
    */
  var latency: js.UndefOr[SchemaLatencyCriteria] = js.undefined
  
  /**
    * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry from other locations will not be used to calculate performance for this SLI. If omitted, this SLI applies to all locations in which the Service has activity. For service types that don't support breaking down by location, setting this field will result in an error.
    */
  var location: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from other methods will not be used to calculate performance for this SLI. If omitted, this SLI applies to all the Service's methods. For service types that don't support breaking down by method, setting this field will result in an error.
    */
  var method: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry from other API versions will not be used to calculate performance for this SLI. If omitted, this SLI applies to all API versions. For service types that don't support breaking down by version, setting this field will result in an error.
    */
  var version: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBasicSli {
  
  inline def apply(): SchemaBasicSli = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicSli]
  }
  
  extension [Self <: SchemaBasicSli](x: Self) {
    
    inline def setAvailability(value: SchemaAvailabilityCriteria): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setLatency(value: SchemaLatencyCriteria): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setLocation(value: js.Array[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: String*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setMethod(value: js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value*))
    
    inline def setVersion(value: js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value*))
  }
}

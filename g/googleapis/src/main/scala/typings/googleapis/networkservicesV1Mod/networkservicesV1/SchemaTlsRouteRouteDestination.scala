package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTlsRouteRouteDestination extends StObject {
  
  /**
    * Required. The URL of a BackendService to route traffic to.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies the proportion of requests forwareded to the backend referenced by the service_name field. This is computed as: weight/Sum(weights in destinations) Weights in all destinations does not need to sum up to 100.
    */
  var weight: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTlsRouteRouteDestination {
  
  inline def apply(): SchemaTlsRouteRouteDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsRouteRouteDestination]
  }
  
  extension [Self <: SchemaTlsRouteRouteDestination](x: Self) {
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightNull: Self = StObject.set(x, "weight", null)
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}

package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestUtilization extends StObject {
  
  /** Target number of concurrent requests. */
  var targetConcurrentRequests: js.UndefOr[Double] = js.undefined
  
  /** Target requests per second. */
  var targetRequestCountPerSecond: js.UndefOr[Double] = js.undefined
}
object RequestUtilization {
  
  inline def apply(): RequestUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestUtilization]
  }
  
  extension [Self <: RequestUtilization](x: Self) {
    
    inline def setTargetConcurrentRequests(value: Double): Self = StObject.set(x, "targetConcurrentRequests", value.asInstanceOf[js.Any])
    
    inline def setTargetConcurrentRequestsUndefined: Self = StObject.set(x, "targetConcurrentRequests", js.undefined)
    
    inline def setTargetRequestCountPerSecond(value: Double): Self = StObject.set(x, "targetRequestCountPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetRequestCountPerSecondUndefined: Self = StObject.set(x, "targetRequestCountPerSecond", js.undefined)
  }
}

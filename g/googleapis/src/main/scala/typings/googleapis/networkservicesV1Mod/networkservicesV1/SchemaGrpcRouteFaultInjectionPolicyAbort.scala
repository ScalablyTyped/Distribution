package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrpcRouteFaultInjectionPolicyAbort extends StObject {
  
  /**
    * The HTTP status code used to abort the request. The value must be between 200 and 599 inclusive.
    */
  var httpStatus: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The percentage of traffic which will be aborted. The value must be between [0, 100]
    */
  var percentage: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGrpcRouteFaultInjectionPolicyAbort {
  
  inline def apply(): SchemaGrpcRouteFaultInjectionPolicyAbort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcRouteFaultInjectionPolicyAbort]
  }
  
  extension [Self <: SchemaGrpcRouteFaultInjectionPolicyAbort](x: Self) {
    
    inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    inline def setHttpStatusNull: Self = StObject.set(x, "httpStatus", null)
    
    inline def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageNull: Self = StObject.set(x, "percentage", null)
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}

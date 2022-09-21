package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrpcRouteFaultInjectionPolicy extends StObject {
  
  /**
    * The specification for aborting to client requests.
    */
  var abort: js.UndefOr[SchemaGrpcRouteFaultInjectionPolicyAbort] = js.undefined
  
  /**
    * The specification for injecting delay to client requests.
    */
  var delay: js.UndefOr[SchemaGrpcRouteFaultInjectionPolicyDelay] = js.undefined
}
object SchemaGrpcRouteFaultInjectionPolicy {
  
  inline def apply(): SchemaGrpcRouteFaultInjectionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcRouteFaultInjectionPolicy]
  }
  
  extension [Self <: SchemaGrpcRouteFaultInjectionPolicy](x: Self) {
    
    inline def setAbort(value: SchemaGrpcRouteFaultInjectionPolicyAbort): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setDelay(value: SchemaGrpcRouteFaultInjectionPolicyDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}

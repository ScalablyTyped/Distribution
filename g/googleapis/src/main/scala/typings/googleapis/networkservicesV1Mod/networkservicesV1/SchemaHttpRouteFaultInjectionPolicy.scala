package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteFaultInjectionPolicy extends StObject {
  
  /**
    * The specification for aborting to client requests.
    */
  var abort: js.UndefOr[SchemaHttpRouteFaultInjectionPolicyAbort] = js.undefined
  
  /**
    * The specification for injecting delay to client requests.
    */
  var delay: js.UndefOr[SchemaHttpRouteFaultInjectionPolicyDelay] = js.undefined
}
object SchemaHttpRouteFaultInjectionPolicy {
  
  inline def apply(): SchemaHttpRouteFaultInjectionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteFaultInjectionPolicy]
  }
  
  extension [Self <: SchemaHttpRouteFaultInjectionPolicy](x: Self) {
    
    inline def setAbort(value: SchemaHttpRouteFaultInjectionPolicyAbort): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setDelay(value: SchemaHttpRouteFaultInjectionPolicyDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}

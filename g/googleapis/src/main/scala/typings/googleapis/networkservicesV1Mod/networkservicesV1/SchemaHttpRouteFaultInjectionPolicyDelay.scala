package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteFaultInjectionPolicyDelay extends StObject {
  
  /**
    * Specify a fixed delay before forwarding the request.
    */
  var fixedDelay: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The percentage of traffic on which delay will be injected. The value must be between [0, 100]
    */
  var percentage: js.UndefOr[Double | Null] = js.undefined
}
object SchemaHttpRouteFaultInjectionPolicyDelay {
  
  inline def apply(): SchemaHttpRouteFaultInjectionPolicyDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteFaultInjectionPolicyDelay]
  }
  
  extension [Self <: SchemaHttpRouteFaultInjectionPolicyDelay](x: Self) {
    
    inline def setFixedDelay(value: String): Self = StObject.set(x, "fixedDelay", value.asInstanceOf[js.Any])
    
    inline def setFixedDelayNull: Self = StObject.set(x, "fixedDelay", null)
    
    inline def setFixedDelayUndefined: Self = StObject.set(x, "fixedDelay", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageNull: Self = StObject.set(x, "percentage", null)
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}

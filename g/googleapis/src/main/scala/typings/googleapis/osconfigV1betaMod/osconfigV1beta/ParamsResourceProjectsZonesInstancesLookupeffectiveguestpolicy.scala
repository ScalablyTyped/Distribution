package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The VM instance whose policies are being looked up.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLookupEffectiveGuestPolicyRequest] = js.undefined
}
object ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy {
  
  inline def apply(): ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy]
  }
  
  extension [Self <: ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setRequestBody(value: SchemaLookupEffectiveGuestPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

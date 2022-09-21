package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirewallpoliciesTestiampermissions
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTestPermissionsRequest] = js.undefined
  
  /**
    * Name or id of the resource for this request.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceFirewallpoliciesTestiampermissions {
  
  inline def apply(): ParamsResourceFirewallpoliciesTestiampermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirewallpoliciesTestiampermissions]
  }
  
  extension [Self <: ParamsResourceFirewallpoliciesTestiampermissions](x: Self) {
    
    inline def setRequestBody(value: SchemaTestPermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}

package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionDisksAddResourcePoliciesRequest extends StObject {
  
  /** Resource policies to be added to this disk. */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.undefined
}
object RegionDisksAddResourcePoliciesRequest {
  
  inline def apply(): RegionDisksAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionDisksAddResourcePoliciesRequest]
  }
  
  extension [Self <: RegionDisksAddResourcePoliciesRequest](x: Self) {
    
    inline def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    inline def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    inline def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value*))
  }
}

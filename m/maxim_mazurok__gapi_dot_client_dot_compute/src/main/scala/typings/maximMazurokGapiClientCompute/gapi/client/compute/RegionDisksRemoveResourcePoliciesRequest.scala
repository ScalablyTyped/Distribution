package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionDisksRemoveResourcePoliciesRequest extends StObject {
  
  /** Resource policies to be removed from this disk. */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.undefined
}
object RegionDisksRemoveResourcePoliciesRequest {
  
  @scala.inline
  def apply(): RegionDisksRemoveResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionDisksRemoveResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class RegionDisksRemoveResourcePoliciesRequestMutableBuilder[Self <: RegionDisksRemoveResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
  }
}

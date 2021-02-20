package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionDisksAddResourcePoliciesRequest extends StObject {
  
  /** Resource policies to be added to this disk. */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}
object RegionDisksAddResourcePoliciesRequest {
  
  @scala.inline
  def apply(): RegionDisksAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionDisksAddResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class RegionDisksAddResourcePoliciesRequestMutableBuilder[Self <: RegionDisksAddResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
  }
}

package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesAddResourcePoliciesRequest extends StObject {
  
  /** Resource policies to be added to this instance. */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}
object InstancesAddResourcePoliciesRequest {
  
  @scala.inline
  def apply(): InstancesAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesAddResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class InstancesAddResourcePoliciesRequestMutableBuilder[Self <: InstancesAddResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
  }
}

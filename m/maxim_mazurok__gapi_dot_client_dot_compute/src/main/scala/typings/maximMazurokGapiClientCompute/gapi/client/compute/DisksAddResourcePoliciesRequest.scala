package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisksAddResourcePoliciesRequest extends StObject {
  
  /** Resource policies to be added to this disk. Currently you can only specify one policy here. */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.undefined
}
object DisksAddResourcePoliciesRequest {
  
  @scala.inline
  def apply(): DisksAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisksAddResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class DisksAddResourcePoliciesRequestMutableBuilder[Self <: DisksAddResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
  }
}

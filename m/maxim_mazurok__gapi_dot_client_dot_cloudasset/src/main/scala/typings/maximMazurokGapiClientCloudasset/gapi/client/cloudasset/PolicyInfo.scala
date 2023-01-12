package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyInfo extends StObject {
  
  /** The full resource name the policy is directly attached to. */
  var attachedResource: js.UndefOr[String] = js.undefined
  
  /** The IAM policy that's directly attached to the attached_resource. */
  var policy: js.UndefOr[Policy] = js.undefined
}
object PolicyInfo {
  
  inline def apply(): PolicyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyInfo] (val x: Self) extends AnyVal {
    
    inline def setAttachedResource(value: String): Self = StObject.set(x, "attachedResource", value.asInstanceOf[js.Any])
    
    inline def setAttachedResourceUndefined: Self = StObject.set(x, "attachedResource", js.undefined)
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}

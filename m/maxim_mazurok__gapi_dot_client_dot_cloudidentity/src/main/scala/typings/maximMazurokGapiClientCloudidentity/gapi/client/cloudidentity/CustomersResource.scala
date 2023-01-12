package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomersResource extends StObject {
  
  var userinvitations: UserinvitationsResource
}
object CustomersResource {
  
  inline def apply(userinvitations: UserinvitationsResource): CustomersResource = {
    val __obj = js.Dynamic.literal(userinvitations = userinvitations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomersResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomersResource] (val x: Self) extends AnyVal {
    
    inline def setUserinvitations(value: UserinvitationsResource): Self = StObject.set(x, "userinvitations", value.asInstanceOf[js.Any])
  }
}

package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckTransitiveMembershipResponse extends StObject {
  
  /**
    * Response does not include the possible roles of a member since the behavior of this rpc is not all-or-nothing unlike the other rpcs. So, it may not be possible to list all the roles
    * definitively, due to possible lack of authorization in some of the paths.
    */
  var hasMembership: js.UndefOr[Boolean] = js.undefined
}
object CheckTransitiveMembershipResponse {
  
  inline def apply(): CheckTransitiveMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckTransitiveMembershipResponse]
  }
  
  extension [Self <: CheckTransitiveMembershipResponse](x: Self) {
    
    inline def setHasMembership(value: Boolean): Self = StObject.set(x, "hasMembership", value.asInstanceOf[js.Any])
    
    inline def setHasMembershipUndefined: Self = StObject.set(x, "hasMembership", js.undefined)
  }
}

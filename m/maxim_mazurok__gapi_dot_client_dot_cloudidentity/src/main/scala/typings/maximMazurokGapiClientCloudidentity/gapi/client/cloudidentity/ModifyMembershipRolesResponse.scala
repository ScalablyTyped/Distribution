package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyMembershipRolesResponse extends StObject {
  
  /** The `Membership` resource after modifying its `MembershipRole`s. */
  var membership: js.UndefOr[Membership] = js.undefined
}
object ModifyMembershipRolesResponse {
  
  inline def apply(): ModifyMembershipRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyMembershipRolesResponse]
  }
  
  extension [Self <: ModifyMembershipRolesResponse](x: Self) {
    
    inline def setMembership(value: Membership): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}

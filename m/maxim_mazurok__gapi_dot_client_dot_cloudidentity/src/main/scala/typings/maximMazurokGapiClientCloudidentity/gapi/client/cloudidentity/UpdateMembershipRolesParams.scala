package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMembershipRolesParams extends StObject {
  
  /** The fully-qualified names of fields to update. May only contain the field `expiry_detail.expire_time`. */
  var fieldMask: js.UndefOr[String] = js.undefined
  
  /** The `MembershipRole`s to be updated. Only `MEMBER` `MembershipRole` can currently be updated. */
  var membershipRole: js.UndefOr[MembershipRole] = js.undefined
}
object UpdateMembershipRolesParams {
  
  inline def apply(): UpdateMembershipRolesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMembershipRolesParams]
  }
  
  extension [Self <: UpdateMembershipRolesParams](x: Self) {
    
    inline def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setMembershipRole(value: MembershipRole): Self = StObject.set(x, "membershipRole", value.asInstanceOf[js.Any])
    
    inline def setMembershipRoleUndefined: Self = StObject.set(x, "membershipRole", js.undefined)
  }
}

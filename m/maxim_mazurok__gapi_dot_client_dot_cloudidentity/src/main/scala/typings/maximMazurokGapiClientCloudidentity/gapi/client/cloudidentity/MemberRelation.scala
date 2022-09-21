package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberRelation extends StObject {
  
  /** Resource name for this member. */
  var member: js.UndefOr[String] = js.undefined
  
  /** Entity key has an id and a namespace. In case of discussion forums, the id will be an email address without a namespace. */
  var preferredMemberKey: js.UndefOr[js.Array[EntityKey]] = js.undefined
  
  /** The relation between the group and the transitive member. */
  var relationType: js.UndefOr[String] = js.undefined
  
  /** The membership role details (i.e name of role and expiry time). */
  var roles: js.UndefOr[js.Array[TransitiveMembershipRole]] = js.undefined
}
object MemberRelation {
  
  inline def apply(): MemberRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberRelation]
  }
  
  extension [Self <: MemberRelation](x: Self) {
    
    inline def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setPreferredMemberKey(value: js.Array[EntityKey]): Self = StObject.set(x, "preferredMemberKey", value.asInstanceOf[js.Any])
    
    inline def setPreferredMemberKeyUndefined: Self = StObject.set(x, "preferredMemberKey", js.undefined)
    
    inline def setPreferredMemberKeyVarargs(value: EntityKey*): Self = StObject.set(x, "preferredMemberKey", js.Array(value*))
    
    inline def setRelationType(value: String): Self = StObject.set(x, "relationType", value.asInstanceOf[js.Any])
    
    inline def setRelationTypeUndefined: Self = StObject.set(x, "relationType", js.undefined)
    
    inline def setRoles(value: js.Array[TransitiveMembershipRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: TransitiveMembershipRole*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}

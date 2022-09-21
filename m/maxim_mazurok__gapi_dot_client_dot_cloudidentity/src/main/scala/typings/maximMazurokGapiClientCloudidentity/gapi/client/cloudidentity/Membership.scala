package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Membership extends StObject {
  
  /** Output only. The time when the `Membership` was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership`. Shall be of the form `groups/{group}/memberships/{membership}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The `EntityKey` of the member. */
  var preferredMemberKey: js.UndefOr[EntityKey] = js.undefined
  
  /**
    * The `MembershipRole`s that apply to the `Membership`. If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`. Must not contain duplicate `MembershipRole`s with
    * the same `name`.
    */
  var roles: js.UndefOr[js.Array[MembershipRole]] = js.undefined
  
  /** Output only. The type of the membership. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Output only. The time when the `Membership` was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Membership {
  
  inline def apply(): Membership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Membership]
  }
  
  extension [Self <: Membership](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreferredMemberKey(value: EntityKey): Self = StObject.set(x, "preferredMemberKey", value.asInstanceOf[js.Any])
    
    inline def setPreferredMemberKeyUndefined: Self = StObject.set(x, "preferredMemberKey", js.undefined)
    
    inline def setRoles(value: js.Array[MembershipRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: MembershipRole*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}

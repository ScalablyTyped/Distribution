package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMember extends StObject {
  
  /**
    * Defines mail delivery preferences of member. This is only supported by create/update/get.
    */
  var delivery_settings: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The member's email address. A member can be a user or another group. This property is required when adding a member to a group. The `email` must be unique and cannot be an alias of another group. If the email address is changed, the API automatically reflects the email address changes.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID of the group member. A member `id` can be used as a member request URI's `memberKey`.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the API resource. For Members resources, the value is `admin#directory#member`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The member's role in a group. The API returns an error for cycles in group memberships. For example, if `group1` is a member of `group2`, `group2` cannot be a member of `group1`. For more information about a member's role, see the [administration help center](https://support.google.com/a/answer/167094).
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of member (Immutable)
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of group member.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaMember {
  
  inline def apply(): SchemaMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMember]
  }
  
  extension [Self <: SchemaMember](x: Self) {
    
    inline def setDelivery_settings(value: String): Self = StObject.set(x, "delivery_settings", value.asInstanceOf[js.Any])
    
    inline def setDelivery_settingsNull: Self = StObject.set(x, "delivery_settings", null)
    
    inline def setDelivery_settingsUndefined: Self = StObject.set(x, "delivery_settings", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.AccountRef
import typings.googleapis.anon.Local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntityUserLink extends StObject {
  
  /**
    * Entity for this link. It can be an account, a web property, or a view (profile).
    */
  var entity: js.UndefOr[AccountRef | Null] = js.undefined
  
  /**
    * Entity user link ID
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for entity user link.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Permissions the user has for this entity.
    */
  var permissions: js.UndefOr[Local | Null] = js.undefined
  
  /**
    * Self link for this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User reference.
    */
  var userRef: js.UndefOr[SchemaUserRef] = js.undefined
}
object SchemaEntityUserLink {
  
  inline def apply(): SchemaEntityUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityUserLink]
  }
  
  extension [Self <: SchemaEntityUserLink](x: Self) {
    
    inline def setEntity(value: AccountRef): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityNull: Self = StObject.set(x, "entity", null)
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPermissions(value: Local): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUserRef(value: SchemaUserRef): Self = StObject.set(x, "userRef", value.asInstanceOf[js.Any])
    
    inline def setUserRefUndefined: Self = StObject.set(x, "userRef", js.undefined)
  }
}

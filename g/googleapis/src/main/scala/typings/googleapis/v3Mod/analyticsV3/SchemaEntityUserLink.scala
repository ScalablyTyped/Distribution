package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.AccountRef
import typings.googleapis.anon.Local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics Entity-User Link. Returns permissions that a
  * user has for an entity.
  */
trait SchemaEntityUserLink extends StObject {
  
  /**
    * Entity for this link. It can be an account, a web property, or a view
    * (profile).
    */
  var entity: js.UndefOr[AccountRef] = js.undefined
  
  /**
    * Entity user link ID
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for entity user link.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Permissions the user has for this entity.
    */
  var permissions: js.UndefOr[Local] = js.undefined
  
  /**
    * Self link for this resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * User reference.
    */
  var userRef: js.UndefOr[SchemaUserRef] = js.undefined
}
object SchemaEntityUserLink {
  
  @scala.inline
  def apply(): SchemaEntityUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityUserLink]
  }
  
  @scala.inline
  implicit class SchemaEntityUserLinkMutableBuilder[Self <: SchemaEntityUserLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: AccountRef): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPermissions(value: Local): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setUserRef(value: SchemaUserRef): Self = StObject.set(x, "userRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRefUndefined: Self = StObject.set(x, "userRef", js.undefined)
  }
}

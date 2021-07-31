package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.maximMazurokGapiClientAnalytics.anon.Local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityUserLink extends StObject {
  
  /** Entity for this link. It can be an account, a web property, or a view (profile). */
  var entity: js.UndefOr[typings.maximMazurokGapiClientAnalytics.anon.AccountRef] = js.undefined
  
  /** Entity user link ID */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource type for entity user link. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Permissions the user has for this entity. */
  var permissions: js.UndefOr[Local] = js.undefined
  
  /** Self link for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** User reference. */
  var userRef: js.UndefOr[UserRef] = js.undefined
}
object EntityUserLink {
  
  @scala.inline
  def apply(): EntityUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityUserLink]
  }
  
  @scala.inline
  implicit class EntityUserLinkMutableBuilder[Self <: EntityUserLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: typings.maximMazurokGapiClientAnalytics.anon.AccountRef): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
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
    def setUserRef(value: UserRef): Self = StObject.set(x, "userRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRefUndefined: Self = StObject.set(x, "userRef", js.undefined)
  }
}

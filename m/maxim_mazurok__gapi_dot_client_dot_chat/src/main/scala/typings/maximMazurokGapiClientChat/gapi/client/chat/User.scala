package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /** The user's display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Obfuscated domain information. */
  var domainId: js.UndefOr[String] = js.undefined
  
  /** True when the user is deleted or the user's proifle is not visible. */
  var isAnonymous: js.UndefOr[Boolean] = js.undefined
  
  /** Resource name, in the format "users/ *". */
  var name: js.UndefOr[String] = js.undefined
  
  /** User type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object User {
  
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDomainId(value: String): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    @scala.inline
    def setIsAnonymous(value: Boolean): Self = StObject.set(x, "isAnonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAnonymousUndefined: Self = StObject.set(x, "isAnonymous", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

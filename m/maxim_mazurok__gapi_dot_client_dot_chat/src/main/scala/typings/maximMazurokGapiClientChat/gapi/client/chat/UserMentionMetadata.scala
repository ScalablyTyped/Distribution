package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserMentionMetadata extends StObject {
  
  /** The type of user mention. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The user mentioned. */
  var user: js.UndefOr[User] = js.native
}
object UserMentionMetadata {
  
  @scala.inline
  def apply(): UserMentionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMentionMetadata]
  }
  
  @scala.inline
  implicit class UserMentionMetadataMutableBuilder[Self <: UserMentionMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}

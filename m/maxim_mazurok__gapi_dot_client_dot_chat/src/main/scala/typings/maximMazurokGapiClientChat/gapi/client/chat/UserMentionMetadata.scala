package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserMentionMetadata extends StObject {
  
  /** The type of user mention. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The user mentioned. */
  var user: js.UndefOr[User] = js.undefined
}
object UserMentionMetadata {
  
  inline def apply(): UserMentionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMentionMetadata]
  }
  
  extension [Self <: UserMentionMetadata](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}

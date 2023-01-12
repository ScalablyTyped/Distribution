package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserMentionData extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  /** If the principal is backed by a gaia id, DO NOT use this field. Use user_gaia_id/user_id fields instead. */
  var user: js.UndefOr[PrincipalProto] = js.undefined
  
  /** An unobfuscated gaia ID: */
  var userGaiaId: js.UndefOr[String] = js.undefined
  
  /** An obfuscated gaia ID: */
  var userId: js.UndefOr[String] = js.undefined
}
object UserMentionData {
  
  inline def apply(): UserMentionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMentionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserMentionData] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setUser(value: PrincipalProto): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserGaiaId(value: String): Self = StObject.set(x, "userGaiaId", value.asInstanceOf[js.Any])
    
    inline def setUserGaiaIdUndefined: Self = StObject.set(x, "userGaiaId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}

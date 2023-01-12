package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteInviteeInfo extends StObject {
  
  /** Email as typed by the user when invited to Room or DM. This value will be canonicalized and hashed before retained in storage. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Unique, immutable ID of the User. */
  var userId: js.UndefOr[AppsDynamiteUserId] = js.undefined
}
object AppsDynamiteInviteeInfo {
  
  inline def apply(): AppsDynamiteInviteeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteInviteeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteInviteeInfo] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setUserId(value: AppsDynamiteUserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

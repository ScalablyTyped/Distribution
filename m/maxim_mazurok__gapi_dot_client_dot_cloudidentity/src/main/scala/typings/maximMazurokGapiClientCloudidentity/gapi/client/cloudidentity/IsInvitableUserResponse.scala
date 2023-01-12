package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsInvitableUserResponse extends StObject {
  
  /** Returns true if the email address is invitable. */
  var isInvitableUser: js.UndefOr[Boolean] = js.undefined
}
object IsInvitableUserResponse {
  
  inline def apply(): IsInvitableUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsInvitableUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsInvitableUserResponse] (val x: Self) extends AnyVal {
    
    inline def setIsInvitableUser(value: Boolean): Self = StObject.set(x, "isInvitableUser", value.asInstanceOf[js.Any])
    
    inline def setIsInvitableUserUndefined: Self = StObject.set(x, "isInvitableUser", js.undefined)
  }
}

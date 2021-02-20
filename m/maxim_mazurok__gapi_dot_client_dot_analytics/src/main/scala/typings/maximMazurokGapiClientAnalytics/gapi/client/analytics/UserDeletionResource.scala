package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDeletionResource extends StObject {
  
  var userDeletionRequest: UserDeletionRequestResource = js.native
}
object UserDeletionResource {
  
  @scala.inline
  def apply(userDeletionRequest: UserDeletionRequestResource): UserDeletionResource = {
    val __obj = js.Dynamic.literal(userDeletionRequest = userDeletionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDeletionResource]
  }
  
  @scala.inline
  implicit class UserDeletionResourceMutableBuilder[Self <: UserDeletionResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserDeletionRequest(value: UserDeletionRequestResource): Self = StObject.set(x, "userDeletionRequest", value.asInstanceOf[js.Any])
  }
}

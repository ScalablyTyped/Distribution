package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDeletionResource extends StObject {
  
  var userDeletionRequest: UserDeletionRequestResource
}
object UserDeletionResource {
  
  inline def apply(userDeletionRequest: UserDeletionRequestResource): UserDeletionResource = {
    val __obj = js.Dynamic.literal(userDeletionRequest = userDeletionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDeletionResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserDeletionResource] (val x: Self) extends AnyVal {
    
    inline def setUserDeletionRequest(value: UserDeletionRequestResource): Self = StObject.set(x, "userDeletionRequest", value.asInstanceOf[js.Any])
  }
}

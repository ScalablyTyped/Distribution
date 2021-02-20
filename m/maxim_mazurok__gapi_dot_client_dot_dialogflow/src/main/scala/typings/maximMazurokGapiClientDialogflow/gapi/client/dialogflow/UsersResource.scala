package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends StObject {
  
  var sessions: SessionsResource = js.native
}
object UsersResource {
  
  @scala.inline
  def apply(sessions: SessionsResource): UsersResource = {
    val __obj = js.Dynamic.literal(sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
  
  @scala.inline
  implicit class UsersResourceMutableBuilder[Self <: UsersResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessions(value: SessionsResource): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
  }
}

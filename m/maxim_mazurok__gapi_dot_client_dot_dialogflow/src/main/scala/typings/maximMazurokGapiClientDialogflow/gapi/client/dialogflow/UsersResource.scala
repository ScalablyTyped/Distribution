package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersResource extends StObject {
  
  var sessions: SessionsResource
}
object UsersResource {
  
  inline def apply(sessions: SessionsResource): UsersResource = {
    val __obj = js.Dynamic.literal(sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
  
  extension [Self <: UsersResource](x: Self) {
    
    inline def setSessions(value: SessionsResource): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
  }
}

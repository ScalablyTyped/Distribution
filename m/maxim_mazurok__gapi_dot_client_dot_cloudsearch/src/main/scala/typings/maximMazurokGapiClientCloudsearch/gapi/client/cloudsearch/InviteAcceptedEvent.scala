package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteAcceptedEvent extends StObject {
  
  var participantId: js.UndefOr[js.Array[StoredParticipantId]] = js.undefined
}
object InviteAcceptedEvent {
  
  inline def apply(): InviteAcceptedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteAcceptedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InviteAcceptedEvent] (val x: Self) extends AnyVal {
    
    inline def setParticipantId(value: js.Array[StoredParticipantId]): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setParticipantIdVarargs(value: StoredParticipantId*): Self = StObject.set(x, "participantId", js.Array(value*))
  }
}

package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HangoutEvent extends StObject {
  
  var hangoutDurationSecs: js.UndefOr[String] = js.undefined
  
  var mediaType: js.UndefOr[String] = js.undefined
  
  var participantId: js.UndefOr[js.Array[StoredParticipantId]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object HangoutEvent {
  
  inline def apply(): HangoutEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HangoutEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HangoutEvent] (val x: Self) extends AnyVal {
    
    inline def setHangoutDurationSecs(value: String): Self = StObject.set(x, "hangoutDurationSecs", value.asInstanceOf[js.Any])
    
    inline def setHangoutDurationSecsUndefined: Self = StObject.set(x, "hangoutDurationSecs", js.undefined)
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setParticipantId(value: js.Array[StoredParticipantId]): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setParticipantIdVarargs(value: StoredParticipantId*): Self = StObject.set(x, "participantId", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

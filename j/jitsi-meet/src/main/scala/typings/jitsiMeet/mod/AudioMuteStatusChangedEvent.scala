package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioMuteStatusChangedEvent extends StObject {
  
  var muted: Boolean
}
object AudioMuteStatusChangedEvent {
  
  inline def apply(muted: Boolean): AudioMuteStatusChangedEvent = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioMuteStatusChangedEvent]
  }
  
  extension [Self <: AudioMuteStatusChangedEvent](x: Self) {
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
  }
}

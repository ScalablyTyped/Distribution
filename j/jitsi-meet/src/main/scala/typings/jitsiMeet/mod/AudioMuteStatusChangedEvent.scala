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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioMuteStatusChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
  }
}

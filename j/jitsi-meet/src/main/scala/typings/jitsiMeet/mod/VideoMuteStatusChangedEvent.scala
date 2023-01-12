package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoMuteStatusChangedEvent extends StObject {
  
  var muted: Boolean
}
object VideoMuteStatusChangedEvent {
  
  inline def apply(muted: Boolean): VideoMuteStatusChangedEvent = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMuteStatusChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoMuteStatusChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
  }
}

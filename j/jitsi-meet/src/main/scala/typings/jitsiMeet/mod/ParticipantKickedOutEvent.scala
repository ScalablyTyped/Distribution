package typings.jitsiMeet.mod

import typings.jitsiMeet.anon.IdString
import typings.jitsiMeet.anon.Local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantKickedOutEvent extends StObject {
  
  var kicked: Local
  
  var kicker: IdString
}
object ParticipantKickedOutEvent {
  
  inline def apply(kicked: Local, kicker: IdString): ParticipantKickedOutEvent = {
    val __obj = js.Dynamic.literal(kicked = kicked.asInstanceOf[js.Any], kicker = kicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantKickedOutEvent]
  }
  
  extension [Self <: ParticipantKickedOutEvent](x: Self) {
    
    inline def setKicked(value: Local): Self = StObject.set(x, "kicked", value.asInstanceOf[js.Any])
    
    inline def setKicker(value: IdString): Self = StObject.set(x, "kicker", value.asInstanceOf[js.Any])
  }
}

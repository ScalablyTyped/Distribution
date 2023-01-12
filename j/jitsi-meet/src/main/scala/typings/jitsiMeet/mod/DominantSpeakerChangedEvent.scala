package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DominantSpeakerChangedEvent extends StObject {
  
  var id: String
}
object DominantSpeakerChangedEvent {
  
  inline def apply(id: String): DominantSpeakerChangedEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DominantSpeakerChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DominantSpeakerChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

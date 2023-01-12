package typings.jitsiMeet.mod

import typings.jitsiMeet.anon.SourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenSharingStatusChangedEvent extends StObject {
  
  var details: SourceType
  
  var on: Boolean
}
object ScreenSharingStatusChangedEvent {
  
  inline def apply(details: SourceType, on: Boolean): ScreenSharingStatusChangedEvent = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenSharingStatusChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScreenSharingStatusChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: SourceType): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}

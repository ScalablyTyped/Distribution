package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var eventTarget: typings.std.EventTarget
  
  var events: StringDictionary[js.Array[typings.interactjsTypes.coreEventsMod.Listener]]
}
object Events {
  
  inline def apply(
    eventTarget: typings.std.EventTarget,
    events: StringDictionary[js.Array[typings.interactjsTypes.coreEventsMod.Listener]]
  ): Events = {
    val __obj = js.Dynamic.literal(eventTarget = eventTarget.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    inline def setEventTarget(value: typings.std.EventTarget): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: StringDictionary[js.Array[typings.interactjsTypes.coreEventsMod.Listener]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
  }
}

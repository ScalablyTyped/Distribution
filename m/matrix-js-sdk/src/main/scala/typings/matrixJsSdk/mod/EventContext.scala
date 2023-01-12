package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.matrixJsSdk.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventContext extends StObject {
  
  var end: String
  
  var events_after: js.Array[MatrixEvent[EventContentTypeMessage, EventType]]
  
  var events_before: js.Array[MatrixEvent[EventContentTypeMessage, EventType]]
  
  var profile_info: js.UndefOr[StringDictionary[Avatarurl]] = js.undefined
  
  var start: String
}
object EventContext {
  
  inline def apply(
    end: String,
    events_after: js.Array[MatrixEvent[EventContentTypeMessage, EventType]],
    events_before: js.Array[MatrixEvent[EventContentTypeMessage, EventType]],
    start: String
  ): EventContext = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], events_after = events_after.asInstanceOf[js.Any], events_before = events_before.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventContext] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEvents_after(value: js.Array[MatrixEvent[EventContentTypeMessage, EventType]]): Self = StObject.set(x, "events_after", value.asInstanceOf[js.Any])
    
    inline def setEvents_afterVarargs(value: (MatrixEvent[EventContentTypeMessage, EventType])*): Self = StObject.set(x, "events_after", js.Array(value*))
    
    inline def setEvents_before(value: js.Array[MatrixEvent[EventContentTypeMessage, EventType]]): Self = StObject.set(x, "events_before", value.asInstanceOf[js.Any])
    
    inline def setEvents_beforeVarargs(value: (MatrixEvent[EventContentTypeMessage, EventType])*): Self = StObject.set(x, "events_before", js.Array(value*))
    
    inline def setProfile_info(value: StringDictionary[Avatarurl]): Self = StObject.set(x, "profile_info", value.asInstanceOf[js.Any])
    
    inline def setProfile_infoUndefined: Self = StObject.set(x, "profile_info", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}

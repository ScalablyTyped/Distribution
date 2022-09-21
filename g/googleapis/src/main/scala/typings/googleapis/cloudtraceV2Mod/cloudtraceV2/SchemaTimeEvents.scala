package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeEvents extends StObject {
  
  /**
    * The number of dropped annotations in all the included time events. If the value is 0, then no annotations were dropped.
    */
  var droppedAnnotationsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of dropped message events in all the included time events. If the value is 0, then no message events were dropped.
    */
  var droppedMessageEventsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A collection of `TimeEvent`s.
    */
  var timeEvent: js.UndefOr[js.Array[SchemaTimeEvent]] = js.undefined
}
object SchemaTimeEvents {
  
  inline def apply(): SchemaTimeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeEvents]
  }
  
  extension [Self <: SchemaTimeEvents](x: Self) {
    
    inline def setDroppedAnnotationsCount(value: Double): Self = StObject.set(x, "droppedAnnotationsCount", value.asInstanceOf[js.Any])
    
    inline def setDroppedAnnotationsCountNull: Self = StObject.set(x, "droppedAnnotationsCount", null)
    
    inline def setDroppedAnnotationsCountUndefined: Self = StObject.set(x, "droppedAnnotationsCount", js.undefined)
    
    inline def setDroppedMessageEventsCount(value: Double): Self = StObject.set(x, "droppedMessageEventsCount", value.asInstanceOf[js.Any])
    
    inline def setDroppedMessageEventsCountNull: Self = StObject.set(x, "droppedMessageEventsCount", null)
    
    inline def setDroppedMessageEventsCountUndefined: Self = StObject.set(x, "droppedMessageEventsCount", js.undefined)
    
    inline def setTimeEvent(value: js.Array[SchemaTimeEvent]): Self = StObject.set(x, "timeEvent", value.asInstanceOf[js.Any])
    
    inline def setTimeEventUndefined: Self = StObject.set(x, "timeEvent", js.undefined)
    
    inline def setTimeEventVarargs(value: SchemaTimeEvent*): Self = StObject.set(x, "timeEvent", js.Array(value*))
  }
}

package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of `TimeEvent`s. A `TimeEvent` is a time-stamped annotation on
  * the span, consisting of either user-supplied key:value pairs, or details of
  * a message sent/received between Spans.
  */
trait SchemaTimeEvents extends StObject {
  
  /**
    * The number of dropped annotations in all the included time events. If the
    * value is 0, then no annotations were dropped.
    */
  var droppedAnnotationsCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of dropped message events in all the included time events. If
    * the value is 0, then no message events were dropped.
    */
  var droppedMessageEventsCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A collection of `TimeEvent`s.
    */
  var timeEvent: js.UndefOr[js.Array[SchemaTimeEvent]] = js.undefined
}
object SchemaTimeEvents {
  
  @scala.inline
  def apply(): SchemaTimeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeEvents]
  }
  
  @scala.inline
  implicit class SchemaTimeEventsMutableBuilder[Self <: SchemaTimeEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDroppedAnnotationsCount(value: Double): Self = StObject.set(x, "droppedAnnotationsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppedAnnotationsCountUndefined: Self = StObject.set(x, "droppedAnnotationsCount", js.undefined)
    
    @scala.inline
    def setDroppedMessageEventsCount(value: Double): Self = StObject.set(x, "droppedMessageEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppedMessageEventsCountUndefined: Self = StObject.set(x, "droppedMessageEventsCount", js.undefined)
    
    @scala.inline
    def setTimeEvent(value: js.Array[SchemaTimeEvent]): Self = StObject.set(x, "timeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeEventUndefined: Self = StObject.set(x, "timeEvent", js.undefined)
    
    @scala.inline
    def setTimeEventVarargs(value: SchemaTimeEvent*): Self = StObject.set(x, "timeEvent", js.Array(value :_*))
  }
}

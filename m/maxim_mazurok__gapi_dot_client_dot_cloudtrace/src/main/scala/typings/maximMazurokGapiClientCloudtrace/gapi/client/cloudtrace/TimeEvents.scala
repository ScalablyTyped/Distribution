package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeEvents extends StObject {
  
  /** The number of dropped annotations in all the included time events. If the value is 0, then no annotations were dropped. */
  var droppedAnnotationsCount: js.UndefOr[Double] = js.native
  
  /** The number of dropped message events in all the included time events. If the value is 0, then no message events were dropped. */
  var droppedMessageEventsCount: js.UndefOr[Double] = js.native
  
  /** A collection of `TimeEvent`s. */
  var timeEvent: js.UndefOr[js.Array[TimeEvent]] = js.native
}
object TimeEvents {
  
  @scala.inline
  def apply(): TimeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeEvents]
  }
  
  @scala.inline
  implicit class TimeEventsMutableBuilder[Self <: TimeEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDroppedAnnotationsCount(value: Double): Self = StObject.set(x, "droppedAnnotationsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppedAnnotationsCountUndefined: Self = StObject.set(x, "droppedAnnotationsCount", js.undefined)
    
    @scala.inline
    def setDroppedMessageEventsCount(value: Double): Self = StObject.set(x, "droppedMessageEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppedMessageEventsCountUndefined: Self = StObject.set(x, "droppedMessageEventsCount", js.undefined)
    
    @scala.inline
    def setTimeEvent(value: js.Array[TimeEvent]): Self = StObject.set(x, "timeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeEventUndefined: Self = StObject.set(x, "timeEvent", js.undefined)
    
    @scala.inline
    def setTimeEventVarargs(value: TimeEvent*): Self = StObject.set(x, "timeEvent", js.Array(value :_*))
  }
}

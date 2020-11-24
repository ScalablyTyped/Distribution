package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of `TimeEvent`s. A `TimeEvent` is a time-stamped annotation on
  * the span, consisting of either user-supplied key:value pairs, or details of
  * a message sent/received between Spans.
  */
@js.native
trait SchemaTimeEvents extends js.Object {
  
  /**
    * The number of dropped annotations in all the included time events. If the
    * value is 0, then no annotations were dropped.
    */
  var droppedAnnotationsCount: js.UndefOr[Double] = js.native
  
  /**
    * The number of dropped message events in all the included time events. If
    * the value is 0, then no message events were dropped.
    */
  var droppedMessageEventsCount: js.UndefOr[Double] = js.native
  
  /**
    * A collection of `TimeEvent`s.
    */
  var timeEvent: js.UndefOr[js.Array[SchemaTimeEvent]] = js.native
}
object SchemaTimeEvents {
  
  @scala.inline
  def apply(): SchemaTimeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeEvents]
  }
  
  @scala.inline
  implicit class SchemaTimeEventsOps[Self <: SchemaTimeEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDroppedAnnotationsCount(value: Double): Self = this.set("droppedAnnotationsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDroppedAnnotationsCount: Self = this.set("droppedAnnotationsCount", js.undefined)
    
    @scala.inline
    def setDroppedMessageEventsCount(value: Double): Self = this.set("droppedMessageEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDroppedMessageEventsCount: Self = this.set("droppedMessageEventsCount", js.undefined)
    
    @scala.inline
    def setTimeEventVarargs(value: SchemaTimeEvent*): Self = this.set("timeEvent", js.Array(value :_*))
    
    @scala.inline
    def setTimeEvent(value: js.Array[SchemaTimeEvent]): Self = this.set("timeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeEvent: Self = this.set("timeEvent", js.undefined)
  }
}

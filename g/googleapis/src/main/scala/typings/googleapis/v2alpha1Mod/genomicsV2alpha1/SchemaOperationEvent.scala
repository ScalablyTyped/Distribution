package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event that occurred during an Operation.
  */
trait SchemaOperationEvent extends StObject {
  
  /**
    * Required description of event.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional time of when event finished. An event can have a start time and
    * no finish time. If an event has a finish time, there must be a start
    * time.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional time of when event started.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaOperationEvent {
  
  @scala.inline
  def apply(): SchemaOperationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationEvent]
  }
  
  @scala.inline
  implicit class SchemaOperationEventMutableBuilder[Self <: SchemaOperationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}

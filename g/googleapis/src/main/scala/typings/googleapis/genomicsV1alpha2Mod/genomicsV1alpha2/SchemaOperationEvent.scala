package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationEvent extends StObject {
  
  /**
    * Required description of event.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional time of when event finished. An event can have a start time and no finish time. If an event has a finish time, there must be a start time.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional time of when event started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaOperationEvent {
  
  inline def apply(): SchemaOperationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationEvent]
  }
  
  extension [Self <: SchemaOperationEvent](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}

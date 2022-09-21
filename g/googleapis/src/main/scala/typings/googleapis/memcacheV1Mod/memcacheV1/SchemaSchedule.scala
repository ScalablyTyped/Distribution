package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchedule extends StObject {
  
  /**
    * Allows to define schedule that runs specified day of the week.
    */
  var day: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Duration of the time window, set by service producer.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time within the window to start the operations.
    */
  var startTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
}
object SchemaSchedule {
  
  inline def apply(): SchemaSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedule]
  }
  
  extension [Self <: SchemaSchedule](x: Self) {
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayNull: Self = StObject.set(x, "day", null)
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStartTime(value: SchemaTimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}

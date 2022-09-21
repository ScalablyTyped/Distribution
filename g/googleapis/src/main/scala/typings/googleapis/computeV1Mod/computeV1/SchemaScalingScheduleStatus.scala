package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScalingScheduleStatus extends StObject {
  
  /**
    * [Output Only] The last time the scaling schedule became active. Note: this is a timestamp when a schedule actually became active, not when it was planned to do so. The timestamp is in RFC3339 text format.
    */
  var lastStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The next time the scaling schedule is to become active. Note: this is a timestamp when a schedule is planned to run, but the actual time might be slightly different. The timestamp is in RFC3339 text format.
    */
  var nextStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The current state of a scaling schedule.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaScalingScheduleStatus {
  
  inline def apply(): SchemaScalingScheduleStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScalingScheduleStatus]
  }
  
  extension [Self <: SchemaScalingScheduleStatus](x: Self) {
    
    inline def setLastStartTime(value: String): Self = StObject.set(x, "lastStartTime", value.asInstanceOf[js.Any])
    
    inline def setLastStartTimeNull: Self = StObject.set(x, "lastStartTime", null)
    
    inline def setLastStartTimeUndefined: Self = StObject.set(x, "lastStartTime", js.undefined)
    
    inline def setNextStartTime(value: String): Self = StObject.set(x, "nextStartTime", value.asInstanceOf[js.Any])
    
    inline def setNextStartTimeNull: Self = StObject.set(x, "nextStartTime", null)
    
    inline def setNextStartTimeUndefined: Self = StObject.set(x, "nextStartTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

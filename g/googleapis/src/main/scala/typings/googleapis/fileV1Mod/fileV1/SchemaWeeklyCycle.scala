package typings.googleapis.fileV1Mod.fileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWeeklyCycle extends StObject {
  
  /**
    * User can specify multiple windows in a week. Minimum of 1 window.
    */
  var schedule: js.UndefOr[js.Array[SchemaSchedule]] = js.undefined
}
object SchemaWeeklyCycle {
  
  inline def apply(): SchemaWeeklyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWeeklyCycle]
  }
  
  extension [Self <: SchemaWeeklyCycle](x: Self) {
    
    inline def setSchedule(value: js.Array[SchemaSchedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setScheduleVarargs(value: SchemaSchedule*): Self = StObject.set(x, "schedule", js.Array(value*))
  }
}

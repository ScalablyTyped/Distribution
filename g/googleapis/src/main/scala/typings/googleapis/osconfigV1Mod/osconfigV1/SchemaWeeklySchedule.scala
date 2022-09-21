package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWeeklySchedule extends StObject {
  
  /**
    * Required. Day of the week.
    */
  var dayOfWeek: js.UndefOr[String | Null] = js.undefined
}
object SchemaWeeklySchedule {
  
  inline def apply(): SchemaWeeklySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWeeklySchedule]
  }
  
  extension [Self <: SchemaWeeklySchedule](x: Self) {
    
    inline def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekNull: Self = StObject.set(x, "dayOfWeek", null)
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
  }
}

package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaintenanceWindow extends StObject {
  
  /**
    * The day of week, when the window starts.
    */
  var dayOfWeek: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hour of day (0-23) when the window starts.
    */
  var hourOfDay: js.UndefOr[Double | Null] = js.undefined
}
object SchemaMaintenanceWindow {
  
  inline def apply(): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
  
  extension [Self <: SchemaMaintenanceWindow](x: Self) {
    
    inline def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekNull: Self = StObject.set(x, "dayOfWeek", null)
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setHourOfDay(value: Double): Self = StObject.set(x, "hourOfDay", value.asInstanceOf[js.Any])
    
    inline def setHourOfDayNull: Self = StObject.set(x, "hourOfDay", null)
    
    inline def setHourOfDayUndefined: Self = StObject.set(x, "hourOfDay", js.undefined)
  }
}

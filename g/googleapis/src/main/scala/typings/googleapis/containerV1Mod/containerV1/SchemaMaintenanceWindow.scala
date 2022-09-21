package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaintenanceWindow extends StObject {
  
  /**
    * DailyMaintenanceWindow specifies a daily maintenance operation window.
    */
  var dailyMaintenanceWindow: js.UndefOr[SchemaDailyMaintenanceWindow] = js.undefined
  
  /**
    * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows.
    */
  var maintenanceExclusions: js.UndefOr[StringDictionary[SchemaTimeWindow] | Null] = js.undefined
  
  /**
    * RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can occur at any time.
    */
  var recurringWindow: js.UndefOr[SchemaRecurringTimeWindow] = js.undefined
}
object SchemaMaintenanceWindow {
  
  inline def apply(): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
  
  extension [Self <: SchemaMaintenanceWindow](x: Self) {
    
    inline def setDailyMaintenanceWindow(value: SchemaDailyMaintenanceWindow): Self = StObject.set(x, "dailyMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setDailyMaintenanceWindowUndefined: Self = StObject.set(x, "dailyMaintenanceWindow", js.undefined)
    
    inline def setMaintenanceExclusions(value: StringDictionary[SchemaTimeWindow]): Self = StObject.set(x, "maintenanceExclusions", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceExclusionsNull: Self = StObject.set(x, "maintenanceExclusions", null)
    
    inline def setMaintenanceExclusionsUndefined: Self = StObject.set(x, "maintenanceExclusions", js.undefined)
    
    inline def setRecurringWindow(value: SchemaRecurringTimeWindow): Self = StObject.set(x, "recurringWindow", value.asInstanceOf[js.Any])
    
    inline def setRecurringWindowUndefined: Self = StObject.set(x, "recurringWindow", js.undefined)
  }
}

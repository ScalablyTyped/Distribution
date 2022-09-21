package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindow extends StObject {
  
  /** DailyMaintenanceWindow specifies a daily maintenance operation window. */
  var dailyMaintenanceWindow: js.UndefOr[DailyMaintenanceWindow] = js.undefined
  
  /** Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. */
  var maintenanceExclusions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.container.gapi.client.container.TimeWindow}
    */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.MaintenanceWindow & TopLevel[Any]
  ] = js.undefined
  
  /**
    * RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can
    * occur at any time.
    */
  var recurringWindow: js.UndefOr[RecurringTimeWindow] = js.undefined
}
object MaintenanceWindow {
  
  inline def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  extension [Self <: MaintenanceWindow](x: Self) {
    
    inline def setDailyMaintenanceWindow(value: DailyMaintenanceWindow): Self = StObject.set(x, "dailyMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setDailyMaintenanceWindowUndefined: Self = StObject.set(x, "dailyMaintenanceWindow", js.undefined)
    
    inline def setMaintenanceExclusions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.container.gapi.client.container.TimeWindow}
      */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.MaintenanceWindow & TopLevel[Any]
    ): Self = StObject.set(x, "maintenanceExclusions", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceExclusionsUndefined: Self = StObject.set(x, "maintenanceExclusions", js.undefined)
    
    inline def setRecurringWindow(value: RecurringTimeWindow): Self = StObject.set(x, "recurringWindow", value.asInstanceOf[js.Any])
    
    inline def setRecurringWindowUndefined: Self = StObject.set(x, "recurringWindow", js.undefined)
  }
}

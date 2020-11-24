package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindow extends js.Object {
  
  /** DailyMaintenanceWindow specifies a daily maintenance operation window. */
  var dailyMaintenanceWindow: js.UndefOr[DailyMaintenanceWindow] = js.native
  
  /** Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. */
  var maintenanceExclusions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.container.gapi.client.container.TimeWindow}
    */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.MaintenanceWindow with TopLevel[js.Any]
  ] = js.native
  
  /**
    * RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can
    * occur at any time.
    */
  var recurringWindow: js.UndefOr[RecurringTimeWindow] = js.native
}
object MaintenanceWindow {
  
  @scala.inline
  def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  @scala.inline
  implicit class MaintenanceWindowOps[Self <: MaintenanceWindow] (val x: Self) extends AnyVal {
    
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
    def setDailyMaintenanceWindow(value: DailyMaintenanceWindow): Self = this.set("dailyMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailyMaintenanceWindow: Self = this.set("dailyMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setMaintenanceExclusions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.container.gapi.client.container.TimeWindow}
      */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.MaintenanceWindow with TopLevel[js.Any]
    ): Self = this.set("maintenanceExclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceExclusions: Self = this.set("maintenanceExclusions", js.undefined)
    
    @scala.inline
    def setRecurringWindow(value: RecurringTimeWindow): Self = this.set("recurringWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurringWindow: Self = this.set("recurringWindow", js.undefined)
  }
}

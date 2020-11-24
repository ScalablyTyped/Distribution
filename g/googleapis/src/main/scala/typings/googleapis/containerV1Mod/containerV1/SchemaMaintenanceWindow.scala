package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MaintenanceWindow defines the maintenance window to be used for the
  * cluster.
  */
@js.native
trait SchemaMaintenanceWindow extends js.Object {
  
  /**
    * DailyMaintenanceWindow specifies a daily maintenance operation window.
    */
  var dailyMaintenanceWindow: js.UndefOr[SchemaDailyMaintenanceWindow] = js.native
}
object SchemaMaintenanceWindow {
  
  @scala.inline
  def apply(): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
  
  @scala.inline
  implicit class SchemaMaintenanceWindowOps[Self <: SchemaMaintenanceWindow] (val x: Self) extends AnyVal {
    
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
    def setDailyMaintenanceWindow(value: SchemaDailyMaintenanceWindow): Self = this.set("dailyMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailyMaintenanceWindow: Self = this.set("dailyMaintenanceWindow", js.undefined)
  }
}

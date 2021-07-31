package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MaintenanceWindow defines the maintenance window to be used for the
  * cluster.
  */
trait SchemaMaintenanceWindow extends StObject {
  
  /**
    * DailyMaintenanceWindow specifies a daily maintenance operation window.
    */
  var dailyMaintenanceWindow: js.UndefOr[SchemaDailyMaintenanceWindow] = js.undefined
}
object SchemaMaintenanceWindow {
  
  @scala.inline
  def apply(): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
  
  @scala.inline
  implicit class SchemaMaintenanceWindowMutableBuilder[Self <: SchemaMaintenanceWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyMaintenanceWindow(value: SchemaDailyMaintenanceWindow): Self = StObject.set(x, "dailyMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyMaintenanceWindowUndefined: Self = StObject.set(x, "dailyMaintenanceWindow", js.undefined)
  }
}

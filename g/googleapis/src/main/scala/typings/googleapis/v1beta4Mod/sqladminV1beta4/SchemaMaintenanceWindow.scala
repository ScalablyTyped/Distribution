package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Maintenance window. This specifies when a v2 Cloud SQL instance should
  * preferably be restarted for system maintenance purposes.
  */
@js.native
trait SchemaMaintenanceWindow extends StObject {
  
  /**
    * day of week (1-7), starting on Monday.
    */
  var day: js.UndefOr[Double] = js.native
  
  /**
    * hour of day - 0 to 23.
    */
  var hour: js.UndefOr[Double] = js.native
  
  /**
    * This is always sql#maintenanceWindow.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Maintenance timing setting: canary (Earlier) or stable (Later).  Learn
    * more.
    */
  var updateTrack: js.UndefOr[String] = js.native
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
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUpdateTrack(value: String): Self = StObject.set(x, "updateTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTrackUndefined: Self = StObject.set(x, "updateTrack", js.undefined)
  }
}

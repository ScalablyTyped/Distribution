package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time window specified for daily maintenance operations.
  */
@js.native
trait SchemaDailyMaintenanceWindow extends StObject {
  
  /**
    * [Output only] Duration of the time window, automatically chosen to be
    * smallest possible in the given scenario.
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * Time within the maintenance window to start the maintenance operations.
    * It must be in format &quot;HH:MM”, where HH : [00-23] and MM : [00-59]
    * GMT.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaDailyMaintenanceWindow {
  
  @scala.inline
  def apply(): SchemaDailyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDailyMaintenanceWindow]
  }
  
  @scala.inline
  implicit class SchemaDailyMaintenanceWindowMutableBuilder[Self <: SchemaDailyMaintenanceWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}

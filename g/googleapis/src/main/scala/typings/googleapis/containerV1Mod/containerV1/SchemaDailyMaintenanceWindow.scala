package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time window specified for daily maintenance operations.
  */
trait SchemaDailyMaintenanceWindow extends StObject {
  
  /**
    * [Output only] Duration of the time window, automatically chosen to be
    * smallest possible in the given scenario. Duration will be in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format
    * &quot;PTnHnMnS&quot;.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /**
    * Time within the maintenance window to start the maintenance operations.
    * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
    * format &quot;HH:MM”, where HH : [00-23] and MM : [00-59] GMT.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaDailyMaintenanceWindow {
  
  inline def apply(): SchemaDailyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDailyMaintenanceWindow]
  }
  
  extension [Self <: SchemaDailyMaintenanceWindow](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}

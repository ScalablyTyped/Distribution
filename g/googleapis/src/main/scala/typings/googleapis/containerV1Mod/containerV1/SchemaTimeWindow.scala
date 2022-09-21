package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeWindow extends StObject {
  
  /**
    * The time that the window ends. The end time should take place after the start time.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * MaintenanceExclusionOptions provides maintenance exclusion related options.
    */
  var maintenanceExclusionOptions: js.UndefOr[SchemaMaintenanceExclusionOptions] = js.undefined
  
  /**
    * The time that the window first starts.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimeWindow {
  
  inline def apply(): SchemaTimeWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeWindow]
  }
  
  extension [Self <: SchemaTimeWindow](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMaintenanceExclusionOptions(value: SchemaMaintenanceExclusionOptions): Self = StObject.set(x, "maintenanceExclusionOptions", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceExclusionOptionsUndefined: Self = StObject.set(x, "maintenanceExclusionOptions", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}

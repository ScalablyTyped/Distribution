package typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaintenanceWindow extends StObject {
  
  /**
    * Daily cycle.
    */
  var dailyCycle: js.UndefOr[SchemaDailyCycle] = js.undefined
  
  /**
    * Weekly cycle.
    */
  var weeklyCycle: js.UndefOr[SchemaWeeklyCycle] = js.undefined
}
object SchemaMaintenanceWindow {
  
  inline def apply(): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
  
  extension [Self <: SchemaMaintenanceWindow](x: Self) {
    
    inline def setDailyCycle(value: SchemaDailyCycle): Self = StObject.set(x, "dailyCycle", value.asInstanceOf[js.Any])
    
    inline def setDailyCycleUndefined: Self = StObject.set(x, "dailyCycle", js.undefined)
    
    inline def setWeeklyCycle(value: SchemaWeeklyCycle): Self = StObject.set(x, "weeklyCycle", value.asInstanceOf[js.Any])
    
    inline def setWeeklyCycleUndefined: Self = StObject.set(x, "weeklyCycle", js.undefined)
  }
}

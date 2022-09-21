package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdatePolicy extends StObject {
  
  /**
    * Optional. Relative scheduling channel applied to resource.
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deny Maintenance Period that is applied to resource to indicate when maintenance is forbidden. User can specify zero or more non-overlapping deny periods. Maximum number of deny_maintenance_periods expected is one.
    */
  var denyMaintenancePeriods: js.UndefOr[js.Array[SchemaDenyMaintenancePeriod]] = js.undefined
  
  /**
    * Optional. Maintenance window that is applied to resources covered by this policy.
    */
  var window: js.UndefOr[SchemaMaintenanceWindow] = js.undefined
}
object SchemaUpdatePolicy {
  
  inline def apply(): SchemaUpdatePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePolicy]
  }
  
  extension [Self <: SchemaUpdatePolicy](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setDenyMaintenancePeriods(value: js.Array[SchemaDenyMaintenancePeriod]): Self = StObject.set(x, "denyMaintenancePeriods", value.asInstanceOf[js.Any])
    
    inline def setDenyMaintenancePeriodsUndefined: Self = StObject.set(x, "denyMaintenancePeriods", js.undefined)
    
    inline def setDenyMaintenancePeriodsVarargs(value: SchemaDenyMaintenancePeriod*): Self = StObject.set(x, "denyMaintenancePeriods", js.Array(value*))
    
    inline def setWindow(value: SchemaMaintenanceWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}

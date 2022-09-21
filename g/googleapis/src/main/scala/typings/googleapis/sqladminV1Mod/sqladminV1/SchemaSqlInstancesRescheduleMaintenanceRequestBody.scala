package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlInstancesRescheduleMaintenanceRequestBody extends StObject {
  
  /**
    * Required. The type of the reschedule the user wants.
    */
  var reschedule: js.UndefOr[SchemaReschedule] = js.undefined
}
object SchemaSqlInstancesRescheduleMaintenanceRequestBody {
  
  inline def apply(): SchemaSqlInstancesRescheduleMaintenanceRequestBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlInstancesRescheduleMaintenanceRequestBody]
  }
  
  extension [Self <: SchemaSqlInstancesRescheduleMaintenanceRequestBody](x: Self) {
    
    inline def setReschedule(value: SchemaReschedule): Self = StObject.set(x, "reschedule", value.asInstanceOf[js.Any])
    
    inline def setRescheduleUndefined: Self = StObject.set(x, "reschedule", js.undefined)
  }
}

package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MaintenancePolicy defines the maintenance policy to be used for the
  * cluster.
  */
trait SchemaMaintenancePolicy extends StObject {
  
  /**
    * Specifies the maintenance window in which maintenance may be performed.
    */
  var window: js.UndefOr[SchemaMaintenanceWindow] = js.undefined
}
object SchemaMaintenancePolicy {
  
  inline def apply(): SchemaMaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenancePolicy]
  }
  
  extension [Self <: SchemaMaintenancePolicy](x: Self) {
    
    inline def setWindow(value: SchemaMaintenanceWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}

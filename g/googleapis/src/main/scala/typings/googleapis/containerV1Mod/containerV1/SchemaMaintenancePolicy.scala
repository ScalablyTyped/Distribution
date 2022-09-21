package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaintenancePolicy extends StObject {
  
  /**
    * A hash identifying the version of this policy, so that updates to fields of the policy won't accidentally undo intermediate changes (and so that users of the API unaware of some fields won't accidentally remove other fields). Make a `get()` request to the cluster to get the current resource version and include it with requests to set the policy.
    */
  var resourceVersion: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    inline def setResourceVersionNull: Self = StObject.set(x, "resourceVersion", null)
    
    inline def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
    
    inline def setWindow(value: SchemaMaintenanceWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}

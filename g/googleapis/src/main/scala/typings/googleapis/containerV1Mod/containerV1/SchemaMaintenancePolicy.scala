package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MaintenancePolicy defines the maintenance policy to be used for the
  * cluster.
  */
@js.native
trait SchemaMaintenancePolicy extends StObject {
  
  /**
    * Specifies the maintenance window in which maintenance may be performed.
    */
  var window: js.UndefOr[SchemaMaintenanceWindow] = js.native
}
object SchemaMaintenancePolicy {
  
  @scala.inline
  def apply(): SchemaMaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenancePolicy]
  }
  
  @scala.inline
  implicit class SchemaMaintenancePolicyMutableBuilder[Self <: SchemaMaintenancePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindow(value: SchemaMaintenanceWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}

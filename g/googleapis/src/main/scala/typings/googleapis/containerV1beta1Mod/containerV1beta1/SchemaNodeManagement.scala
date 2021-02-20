package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeManagement defines the set of node management services turned on for
  * the node pool.
  */
@js.native
trait SchemaNodeManagement extends StObject {
  
  /**
    * Whether the nodes will be automatically repaired.
    */
  var autoRepair: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the nodes will be automatically upgraded.
    */
  var autoUpgrade: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the Auto Upgrade knobs for the node pool.
    */
  var upgradeOptions: js.UndefOr[SchemaAutoUpgradeOptions] = js.native
}
object SchemaNodeManagement {
  
  @scala.inline
  def apply(): SchemaNodeManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeManagement]
  }
  
  @scala.inline
  implicit class SchemaNodeManagementMutableBuilder[Self <: SchemaNodeManagement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRepair(value: Boolean): Self = StObject.set(x, "autoRepair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRepairUndefined: Self = StObject.set(x, "autoRepair", js.undefined)
    
    @scala.inline
    def setAutoUpgrade(value: Boolean): Self = StObject.set(x, "autoUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpgradeUndefined: Self = StObject.set(x, "autoUpgrade", js.undefined)
    
    @scala.inline
    def setUpgradeOptions(value: SchemaAutoUpgradeOptions): Self = StObject.set(x, "upgradeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeOptionsUndefined: Self = StObject.set(x, "upgradeOptions", js.undefined)
  }
}

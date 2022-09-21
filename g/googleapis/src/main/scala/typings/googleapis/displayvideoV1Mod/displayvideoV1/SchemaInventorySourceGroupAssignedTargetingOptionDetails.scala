package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventorySourceGroupAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. ID of the inventory source group. Should refer to the inventory_source_group_id field of an InventorySourceGroup resource.
    */
  var inventorySourceGroupId: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventorySourceGroupAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaInventorySourceGroupAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySourceGroupAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaInventorySourceGroupAssignedTargetingOptionDetails](x: Self) {
    
    inline def setInventorySourceGroupId(value: String): Self = StObject.set(x, "inventorySourceGroupId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceGroupIdNull: Self = StObject.set(x, "inventorySourceGroupId", null)
    
    inline def setInventorySourceGroupIdUndefined: Self = StObject.set(x, "inventorySourceGroupId", js.undefined)
  }
}

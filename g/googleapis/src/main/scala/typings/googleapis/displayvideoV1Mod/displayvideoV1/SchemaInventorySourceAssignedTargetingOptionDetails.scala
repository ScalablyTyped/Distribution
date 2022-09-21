package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventorySourceAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. ID of the inventory source. Should refer to the inventory_source_id field of an InventorySource resource.
    */
  var inventorySourceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventorySourceAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaInventorySourceAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySourceAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaInventorySourceAssignedTargetingOptionDetails](x: Self) {
    
    inline def setInventorySourceId(value: String): Self = StObject.set(x, "inventorySourceId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceIdNull: Self = StObject.set(x, "inventorySourceId", null)
    
    inline def setInventorySourceIdUndefined: Self = StObject.set(x, "inventorySourceId", js.undefined)
  }
}

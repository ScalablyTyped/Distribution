package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedInventorySource extends StObject {
  
  /** Output only. The unique ID of the assigned inventory source. The ID is only unique within a given inventory source group. It may be reused in other contexts. */
  var assignedInventorySourceId: js.UndefOr[String] = js.undefined
  
  /** Required. The ID of the inventory source entity being targeted. */
  var inventorySourceId: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the assigned inventory source. */
  var name: js.UndefOr[String] = js.undefined
}
object AssignedInventorySource {
  
  inline def apply(): AssignedInventorySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedInventorySource]
  }
  
  extension [Self <: AssignedInventorySource](x: Self) {
    
    inline def setAssignedInventorySourceId(value: String): Self = StObject.set(x, "assignedInventorySourceId", value.asInstanceOf[js.Any])
    
    inline def setAssignedInventorySourceIdUndefined: Self = StObject.set(x, "assignedInventorySourceId", js.undefined)
    
    inline def setInventorySourceId(value: String): Self = StObject.set(x, "inventorySourceId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceIdUndefined: Self = StObject.set(x, "inventorySourceId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

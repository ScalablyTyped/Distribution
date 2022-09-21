package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventorySourceGroup extends StObject {
  
  /**
    * Required. The display name of the inventory source group. Must be UTF-8 encoded with a maximum size of 240 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique ID of the inventory source group. Assigned by the system.
    */
  var inventorySourceGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the inventory source group.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventorySourceGroup {
  
  inline def apply(): SchemaInventorySourceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySourceGroup]
  }
  
  extension [Self <: SchemaInventorySourceGroup](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInventorySourceGroupId(value: String): Self = StObject.set(x, "inventorySourceGroupId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceGroupIdNull: Self = StObject.set(x, "inventorySourceGroupId", null)
    
    inline def setInventorySourceGroupIdUndefined: Self = StObject.set(x, "inventorySourceGroupId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

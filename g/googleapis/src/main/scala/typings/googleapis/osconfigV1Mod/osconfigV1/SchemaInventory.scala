package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventory extends StObject {
  
  /**
    * Inventory items related to the VM keyed by an opaque unique identifier for each inventory item. The identifier is unique to each distinct and addressable inventory item and will change, when there is a new package version.
    */
  var items: js.UndefOr[StringDictionary[SchemaInventoryItem] | Null] = js.undefined
  
  /**
    * Output only. The `Inventory` API resource name. Format: `projects/{project_number\}/locations/{location\}/instances/{instance_id\}/inventory`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Base level operating system information for the VM.
    */
  var osInfo: js.UndefOr[SchemaInventoryOsInfo] = js.undefined
  
  /**
    * Output only. Timestamp of the last reported inventory for the VM.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventory {
  
  inline def apply(): SchemaInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventory]
  }
  
  extension [Self <: SchemaInventory](x: Self) {
    
    inline def setItems(value: StringDictionary[SchemaInventoryItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsNull: Self = StObject.set(x, "items", null)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOsInfo(value: SchemaInventoryOsInfo): Self = StObject.set(x, "osInfo", value.asInstanceOf[js.Any])
    
    inline def setOsInfoUndefined: Self = StObject.set(x, "osInfo", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}

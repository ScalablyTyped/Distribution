package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventoryItem extends StObject {
  
  /**
    * Software package available to be installed on the VM instance.
    */
  var availablePackage: js.UndefOr[SchemaInventorySoftwarePackage] = js.undefined
  
  /**
    * When this inventory item was first detected.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier for this item, unique across items for this VM.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Software package present on the VM instance.
    */
  var installedPackage: js.UndefOr[SchemaInventorySoftwarePackage] = js.undefined
  
  /**
    * The origin of this inventory item.
    */
  var originType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The specific type of inventory, correlating to its specific details.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When this inventory item was last modified.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventoryItem {
  
  inline def apply(): SchemaInventoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryItem]
  }
  
  extension [Self <: SchemaInventoryItem](x: Self) {
    
    inline def setAvailablePackage(value: SchemaInventorySoftwarePackage): Self = StObject.set(x, "availablePackage", value.asInstanceOf[js.Any])
    
    inline def setAvailablePackageUndefined: Self = StObject.set(x, "availablePackage", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstalledPackage(value: SchemaInventorySoftwarePackage): Self = StObject.set(x, "installedPackage", value.asInstanceOf[js.Any])
    
    inline def setInstalledPackageUndefined: Self = StObject.set(x, "installedPackage", js.undefined)
    
    inline def setOriginType(value: String): Self = StObject.set(x, "originType", value.asInstanceOf[js.Any])
    
    inline def setOriginTypeNull: Self = StObject.set(x, "originType", null)
    
    inline def setOriginTypeUndefined: Self = StObject.set(x, "originType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}

package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends StObject {
  
  /** Software package available to be installed on the VM instance. */
  var availablePackage: js.UndefOr[SoftwarePackage] = js.native
  
  /** When this inventory item was first detected. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Identifier for this item, unique across items for this VM. */
  var id: js.UndefOr[String] = js.native
  
  /** Software package present on the VM instance. */
  var installedPackage: js.UndefOr[SoftwarePackage] = js.native
  
  /** The origin of this inventory item. */
  var originType: js.UndefOr[String] = js.native
  
  /** The specific type of inventory, correlating to its specific details. */
  var `type`: js.UndefOr[String] = js.native
  
  /** When this inventory item was last modified. */
  var updateTime: js.UndefOr[String] = js.native
}
object Item {
  
  @scala.inline
  def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailablePackage(value: SoftwarePackage): Self = StObject.set(x, "availablePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailablePackageUndefined: Self = StObject.set(x, "availablePackage", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInstalledPackage(value: SoftwarePackage): Self = StObject.set(x, "installedPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledPackageUndefined: Self = StObject.set(x, "installedPackage", js.undefined)
    
    @scala.inline
    def setOriginType(value: String): Self = StObject.set(x, "originType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginTypeUndefined: Self = StObject.set(x, "originType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}

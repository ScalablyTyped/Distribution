package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFetchInventoryResponse extends StObject {
  
  /**
    * Output only. A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the source was last queried (if the result is from the cache).
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of the VMs in a Source of type Vmware.
    */
  var vmwareVms: js.UndefOr[SchemaVmwareVmsDetails] = js.undefined
}
object SchemaFetchInventoryResponse {
  
  inline def apply(): SchemaFetchInventoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchInventoryResponse]
  }
  
  extension [Self <: SchemaFetchInventoryResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVmwareVms(value: SchemaVmwareVmsDetails): Self = StObject.set(x, "vmwareVms", value.asInstanceOf[js.Any])
    
    inline def setVmwareVmsUndefined: Self = StObject.set(x, "vmwareVms", js.undefined)
  }
}

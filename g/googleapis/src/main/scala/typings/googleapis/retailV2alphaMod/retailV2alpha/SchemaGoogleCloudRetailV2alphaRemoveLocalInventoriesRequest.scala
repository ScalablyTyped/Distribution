package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaRemoveLocalInventoriesRequest extends StObject {
  
  /**
    * If set to true, and the Product is not found, the local inventory removal request will still be processed and retained for at most 1 day and processed once the Product is created. If set to false, a NOT_FOUND error is returned if the Product is not found.
    */
  var allowMissing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. A list of place IDs to have their inventory deleted. At most 3000 place IDs are allowed per request.
    */
  var placeIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The time when the inventory deletions are issued. Used to prevent out-of-order updates and deletions on local inventory fields. If not provided, the internal system time will be used.
    */
  var removeTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaRemoveLocalInventoriesRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaRemoveLocalInventoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaRemoveLocalInventoriesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaRemoveLocalInventoriesRequest](x: Self) {
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingNull: Self = StObject.set(x, "allowMissing", null)
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setPlaceIds(value: js.Array[String]): Self = StObject.set(x, "placeIds", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdsNull: Self = StObject.set(x, "placeIds", null)
    
    inline def setPlaceIdsUndefined: Self = StObject.set(x, "placeIds", js.undefined)
    
    inline def setPlaceIdsVarargs(value: String*): Self = StObject.set(x, "placeIds", js.Array(value*))
    
    inline def setRemoveTime(value: String): Self = StObject.set(x, "removeTime", value.asInstanceOf[js.Any])
    
    inline def setRemoveTimeNull: Self = StObject.set(x, "removeTime", null)
    
    inline def setRemoveTimeUndefined: Self = StObject.set(x, "removeTime", js.undefined)
  }
}

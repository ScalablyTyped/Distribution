package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEditInventorySourceReadWriteAccessorsRequest extends StObject {
  
  /**
    * The advertisers to add or remove from the list of advertisers that have read/write access to the inventory source. This change will remove an existing partner read/write accessor.
    */
  var advertisersUpdate: js.UndefOr[SchemaEditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate] = js.undefined
  
  /**
    * Set the partner context as read/write accessor of the inventory source. This will remove all other current read/write advertiser accessors.
    */
  var assignPartner: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The partner context by which the accessors change is being made.
    */
  var partnerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaEditInventorySourceReadWriteAccessorsRequest {
  
  inline def apply(): SchemaEditInventorySourceReadWriteAccessorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditInventorySourceReadWriteAccessorsRequest]
  }
  
  extension [Self <: SchemaEditInventorySourceReadWriteAccessorsRequest](x: Self) {
    
    inline def setAdvertisersUpdate(value: SchemaEditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate): Self = StObject.set(x, "advertisersUpdate", value.asInstanceOf[js.Any])
    
    inline def setAdvertisersUpdateUndefined: Self = StObject.set(x, "advertisersUpdate", js.undefined)
    
    inline def setAssignPartner(value: Boolean): Self = StObject.set(x, "assignPartner", value.asInstanceOf[js.Any])
    
    inline def setAssignPartnerNull: Self = StObject.set(x, "assignPartner", null)
    
    inline def setAssignPartnerUndefined: Self = StObject.set(x, "assignPartner", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdNull: Self = StObject.set(x, "partnerId", null)
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}

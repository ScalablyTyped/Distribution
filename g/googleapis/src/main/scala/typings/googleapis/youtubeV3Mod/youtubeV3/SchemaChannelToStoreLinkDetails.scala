package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelToStoreLinkDetails extends StObject {
  
  /**
    * Google Merchant Center id of the store.
    */
  var merchantId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the store.
    */
  var storeName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Landing page of the store.
    */
  var storeUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannelToStoreLinkDetails {
  
  inline def apply(): SchemaChannelToStoreLinkDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelToStoreLinkDetails]
  }
  
  extension [Self <: SchemaChannelToStoreLinkDetails](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdNull: Self = StObject.set(x, "merchantId", null)
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    inline def setStoreNameNull: Self = StObject.set(x, "storeName", null)
    
    inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    
    inline def setStoreUrl(value: String): Self = StObject.set(x, "storeUrl", value.asInstanceOf[js.Any])
    
    inline def setStoreUrlNull: Self = StObject.set(x, "storeUrl", null)
    
    inline def setStoreUrlUndefined: Self = StObject.set(x, "storeUrl", js.undefined)
  }
}

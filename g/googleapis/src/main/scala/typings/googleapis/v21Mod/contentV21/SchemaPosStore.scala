package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosStore extends StObject {
  
  /**
    * The business type of the store.
    */
  var gcidCategory: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#posStore`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The store phone number.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google Place Id of the store location.
    */
  var placeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The street address of the store.
    */
  var storeAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A store identifier that is unique for the given merchant.
    */
  var storeCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The merchant or store name.
    */
  var storeName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The website url for the store or merchant.
    */
  var websiteUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaPosStore {
  
  inline def apply(): SchemaPosStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosStore]
  }
  
  extension [Self <: SchemaPosStore](x: Self) {
    
    inline def setGcidCategory(value: js.Array[String]): Self = StObject.set(x, "gcidCategory", value.asInstanceOf[js.Any])
    
    inline def setGcidCategoryNull: Self = StObject.set(x, "gcidCategory", null)
    
    inline def setGcidCategoryUndefined: Self = StObject.set(x, "gcidCategory", js.undefined)
    
    inline def setGcidCategoryVarargs(value: String*): Self = StObject.set(x, "gcidCategory", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setStoreAddress(value: String): Self = StObject.set(x, "storeAddress", value.asInstanceOf[js.Any])
    
    inline def setStoreAddressNull: Self = StObject.set(x, "storeAddress", null)
    
    inline def setStoreAddressUndefined: Self = StObject.set(x, "storeAddress", js.undefined)
    
    inline def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    inline def setStoreCodeNull: Self = StObject.set(x, "storeCode", null)
    
    inline def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
    
    inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    inline def setStoreNameNull: Self = StObject.set(x, "storeName", null)
    
    inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlNull: Self = StObject.set(x, "websiteUrl", null)
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}

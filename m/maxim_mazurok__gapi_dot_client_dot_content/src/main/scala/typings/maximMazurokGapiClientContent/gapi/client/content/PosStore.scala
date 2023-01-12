package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PosStore extends StObject {
  
  /** The business type of the store. */
  var gcidCategory: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#posStore`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The store phone number. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /** The Google Place Id of the store location. */
  var placeId: js.UndefOr[String] = js.undefined
  
  /** Required. The street address of the store. */
  var storeAddress: js.UndefOr[String] = js.undefined
  
  /** Required. A store identifier that is unique for the given merchant. */
  var storeCode: js.UndefOr[String] = js.undefined
  
  /** The merchant or store name. */
  var storeName: js.UndefOr[String] = js.undefined
  
  /** The website url for the store or merchant. */
  var websiteUrl: js.UndefOr[String] = js.undefined
}
object PosStore {
  
  inline def apply(): PosStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PosStore] (val x: Self) extends AnyVal {
    
    inline def setGcidCategory(value: js.Array[String]): Self = StObject.set(x, "gcidCategory", value.asInstanceOf[js.Any])
    
    inline def setGcidCategoryUndefined: Self = StObject.set(x, "gcidCategory", js.undefined)
    
    inline def setGcidCategoryVarargs(value: String*): Self = StObject.set(x, "gcidCategory", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setStoreAddress(value: String): Self = StObject.set(x, "storeAddress", value.asInstanceOf[js.Any])
    
    inline def setStoreAddressUndefined: Self = StObject.set(x, "storeAddress", js.undefined)
    
    inline def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    inline def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
    
    inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}

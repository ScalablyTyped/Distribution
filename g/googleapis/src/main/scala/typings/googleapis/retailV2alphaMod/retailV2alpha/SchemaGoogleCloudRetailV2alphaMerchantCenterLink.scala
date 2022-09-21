package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaMerchantCenterLink extends StObject {
  
  /**
    * The branch id (e.g. 0/1/2) within this catalog that products from merchant_center_account_id are streamed to. When updating this field, an empty value will use the currently configured default branch. However, changing the default branch later on won't change the linked branch here. A single branch id can only have one linked merchant center account id.
    */
  var branchId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * String representing the destination to import for, all if left empty. List of possible values is given in [Included destination](https://support.google.com/merchants/answer/7501026). List of allowed string values: "Shopping_ads", "Buy_on_google_listings", "Display_ads", "Local_inventory _ads", "Free_listings", "Free_local_listings" NOTE: The string values are case sensitive.
    */
  var destinations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Language of the title/description and other string attributes. Use language tags defined by [BCP 47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt). ISO 639-1. This specifies the language of offers in Merchant Center that will be accepted. If empty no language filtering will be performed. Example value: `en`.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The linked [Merchant center account id](https://developers.google.com/shopping-content/guides/accountstatuses). The account must be a standalone account or a sub-account of a MCA.
    */
  var merchantCenterAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Region code of offers to accept. 2-letter Uppercase ISO 3166-1 alpha-2 code. List of values can be found [here](https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry) under the `region` tag. If left blank no region filtering will be performed. Example value: `US`.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaMerchantCenterLink {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaMerchantCenterLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaMerchantCenterLink]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaMerchantCenterLink](x: Self) {
    
    inline def setBranchId(value: String): Self = StObject.set(x, "branchId", value.asInstanceOf[js.Any])
    
    inline def setBranchIdNull: Self = StObject.set(x, "branchId", null)
    
    inline def setBranchIdUndefined: Self = StObject.set(x, "branchId", js.undefined)
    
    inline def setDestinations(value: js.Array[String]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsNull: Self = StObject.set(x, "destinations", null)
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: String*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMerchantCenterAccountId(value: String): Self = StObject.set(x, "merchantCenterAccountId", value.asInstanceOf[js.Any])
    
    inline def setMerchantCenterAccountIdNull: Self = StObject.set(x, "merchantCenterAccountId", null)
    
    inline def setMerchantCenterAccountIdUndefined: Self = StObject.set(x, "merchantCenterAccountId", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}

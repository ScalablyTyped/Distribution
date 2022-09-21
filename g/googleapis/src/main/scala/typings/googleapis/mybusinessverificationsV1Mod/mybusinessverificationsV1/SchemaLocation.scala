package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocation extends StObject {
  
  /**
    * Required. A precise, accurate address to describe your business location. PO boxes or mailboxes located at remote locations are not acceptable. At this time, you can specify a maximum of five `address_lines` values in the address.
    */
  var address: js.UndefOr[SchemaPostalAddress] = js.undefined
  
  /**
    * Required. Location name should reflect your business's real-world name, as used consistently on your storefront, website, and stationery, and as known to customers. Any additional information, when relevant, can be included in other fields of the resource (for example, `Address`, `Categories`). Don't add unnecessary information to your name (for example, prefer "Google" over "Google Inc. - Mountain View Corporate Headquarters"). Don't include marketing taglines, store codes, special characters, hours or closed/open status, phone numbers, website URLs, service/product information, location/address or directions, or containment information (for example, "Chase ATM in Duane Reade").
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Id of the category that best describes the core business this location engages in. e.g. gcid:bakery.
    */
  var primaryCategoryId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A phone number that connects to your individual business location as directly as possible. Use a local phone number instead of a central, call center helpline number whenever possible.
    */
  var primaryPhone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A URL for this business. If possible, use a URL that represents this individual business location instead of a generic website/URL that represents all locations, or the brand.
    */
  var websiteUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocation {
  
  inline def apply(): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocation]
  }
  
  extension [Self <: SchemaLocation](x: Self) {
    
    inline def setAddress(value: SchemaPostalAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimaryCategoryId(value: String): Self = StObject.set(x, "primaryCategoryId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryCategoryIdNull: Self = StObject.set(x, "primaryCategoryId", null)
    
    inline def setPrimaryCategoryIdUndefined: Self = StObject.set(x, "primaryCategoryId", js.undefined)
    
    inline def setPrimaryPhone(value: String): Self = StObject.set(x, "primaryPhone", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPhoneNull: Self = StObject.set(x, "primaryPhone", null)
    
    inline def setPrimaryPhoneUndefined: Self = StObject.set(x, "primaryPhone", js.undefined)
    
    inline def setWebsiteUri(value: String): Self = StObject.set(x, "websiteUri", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUriNull: Self = StObject.set(x, "websiteUri", null)
    
    inline def setWebsiteUriUndefined: Self = StObject.set(x, "websiteUri", js.undefined)
  }
}

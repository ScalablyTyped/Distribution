package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocation extends StObject {
  
  /**
    * Optional. Additional information that is surfaced in AdWords.
    */
  var adWordsLocationExtensions: js.UndefOr[SchemaAdWordsLocationExtensions] = js.undefined
  
  /**
    * Optional. The different categories that describe the business.
    */
  var categories: js.UndefOr[SchemaCategories] = js.undefined
  
  /**
    * Optional. A collection of free-form strings to allow you to tag your business. These labels are NOT user facing; only you can see them. Must be between 1-255 characters per label.
    */
  var labels: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Immutable. The language of the location. Set during creation and not updateable.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User-provided latitude and longitude. When creating a location, this field is ignored if the provided address geocodes successfully. This field is only returned on get requests if the user-provided `latlng` value was accepted during create, or the `latlng` value was updated through the Google Business Profile website. This field can only be updated by approved clients.
    */
  var latlng: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * Output only. Additional non-user-editable information.
    */
  var metadata: js.UndefOr[SchemaMetadata] = js.undefined
  
  /**
    * Optional. More hours for a business's different departments or specific customers.
    */
  var moreHours: js.UndefOr[js.Array[SchemaMoreHours]] = js.undefined
  
  /**
    * Google identifier for this location in the form: `locations/{location_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A flag that indicates whether the location is currently open for business.
    */
  var openInfo: js.UndefOr[SchemaOpenInfo] = js.undefined
  
  /**
    * Optional. The different phone numbers that customers can use to get in touch with the business.
    */
  var phoneNumbers: js.UndefOr[SchemaPhoneNumbers] = js.undefined
  
  /**
    * Optional. Describes your business in your own voice and shares with users the unique story of your business and offerings. This field is required for all categories except lodging categories (e.g. hotels, motels, inns).
    */
  var profile: js.UndefOr[SchemaProfile] = js.undefined
  
  /**
    * Optional. Operating hours for the business.
    */
  var regularHours: js.UndefOr[SchemaBusinessHours] = js.undefined
  
  /**
    * Optional. All locations and chain related to this one.
    */
  var relationshipData: js.UndefOr[SchemaRelationshipData] = js.undefined
  
  /**
    * Optional. Service area businesses provide their service at the customer's location. If this business is a service area business, this field describes the area(s) serviced by the business.
    */
  var serviceArea: js.UndefOr[SchemaServiceAreaBusiness] = js.undefined
  
  /**
    * Optional. List of services supported by merchants. A service can be haircut, install water heater, etc. Duplicated service items will be removed automatically.
    */
  var serviceItems: js.UndefOr[js.Array[SchemaServiceItem]] = js.undefined
  
  /**
    * Optional. Special hours for the business. This typically includes holiday hours, and other times outside of regular operating hours. These override regular business hours. This field cannot be set without regular hours.
    */
  var specialHours: js.UndefOr[SchemaSpecialHours] = js.undefined
  
  /**
    * Optional. External identifier for this location, which must be unique within a given account. This is a means of associating the location with your own records.
    */
  var storeCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A precise, accurate address to describe your business location. PO boxes or mailboxes located at remote locations are not acceptable. At this time, you can specify a maximum of five `address_lines` values in the address. This field should only be set for businesses that have a storefront. This field should not be set for locations of type `CUSTOMER_LOCATION_ONLY`.
    */
  var storefrontAddress: js.UndefOr[SchemaPostalAddress] = js.undefined
  
  /**
    * Required. Location name should reflect your business's real-world name, as used consistently on your storefront, website, and stationery, and as known to customers. Any additional information, when relevant, can be included in other fields of the resource (for example, `Address`, `Categories`). Don't add unnecessary information to your name (for example, prefer "Google" over "Google Inc. - Mountain View Corporate Headquarters"). Don't include marketing taglines, store codes, special characters, hours or closed/open status, phone numbers, website URLs, service/product information, location/address or directions, or containment information (for example, "Chase ATM in Duane Reade").
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setAdWordsLocationExtensions(value: SchemaAdWordsLocationExtensions): Self = StObject.set(x, "adWordsLocationExtensions", value.asInstanceOf[js.Any])
    
    inline def setAdWordsLocationExtensionsUndefined: Self = StObject.set(x, "adWordsLocationExtensions", js.undefined)
    
    inline def setCategories(value: SchemaCategories): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLatlng(value: SchemaLatLng): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
    
    inline def setLatlngUndefined: Self = StObject.set(x, "latlng", js.undefined)
    
    inline def setMetadata(value: SchemaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMoreHours(value: js.Array[SchemaMoreHours]): Self = StObject.set(x, "moreHours", value.asInstanceOf[js.Any])
    
    inline def setMoreHoursUndefined: Self = StObject.set(x, "moreHours", js.undefined)
    
    inline def setMoreHoursVarargs(value: SchemaMoreHours*): Self = StObject.set(x, "moreHours", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpenInfo(value: SchemaOpenInfo): Self = StObject.set(x, "openInfo", value.asInstanceOf[js.Any])
    
    inline def setOpenInfoUndefined: Self = StObject.set(x, "openInfo", js.undefined)
    
    inline def setPhoneNumbers(value: SchemaPhoneNumbers): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    inline def setProfile(value: SchemaProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setRegularHours(value: SchemaBusinessHours): Self = StObject.set(x, "regularHours", value.asInstanceOf[js.Any])
    
    inline def setRegularHoursUndefined: Self = StObject.set(x, "regularHours", js.undefined)
    
    inline def setRelationshipData(value: SchemaRelationshipData): Self = StObject.set(x, "relationshipData", value.asInstanceOf[js.Any])
    
    inline def setRelationshipDataUndefined: Self = StObject.set(x, "relationshipData", js.undefined)
    
    inline def setServiceArea(value: SchemaServiceAreaBusiness): Self = StObject.set(x, "serviceArea", value.asInstanceOf[js.Any])
    
    inline def setServiceAreaUndefined: Self = StObject.set(x, "serviceArea", js.undefined)
    
    inline def setServiceItems(value: js.Array[SchemaServiceItem]): Self = StObject.set(x, "serviceItems", value.asInstanceOf[js.Any])
    
    inline def setServiceItemsUndefined: Self = StObject.set(x, "serviceItems", js.undefined)
    
    inline def setServiceItemsVarargs(value: SchemaServiceItem*): Self = StObject.set(x, "serviceItems", js.Array(value*))
    
    inline def setSpecialHours(value: SchemaSpecialHours): Self = StObject.set(x, "specialHours", value.asInstanceOf[js.Any])
    
    inline def setSpecialHoursUndefined: Self = StObject.set(x, "specialHours", js.undefined)
    
    inline def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    inline def setStoreCodeNull: Self = StObject.set(x, "storeCode", null)
    
    inline def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
    
    inline def setStorefrontAddress(value: SchemaPostalAddress): Self = StObject.set(x, "storefrontAddress", value.asInstanceOf[js.Any])
    
    inline def setStorefrontAddressUndefined: Self = StObject.set(x, "storefrontAddress", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWebsiteUri(value: String): Self = StObject.set(x, "websiteUri", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUriNull: Self = StObject.set(x, "websiteUri", null)
    
    inline def setWebsiteUriUndefined: Self = StObject.set(x, "websiteUri", js.undefined)
  }
}

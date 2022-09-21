package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadata extends StObject {
  
  /**
    * Output only. Indicates whether the location can be deleted using the API.
    */
  var canDelete: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates if the listing is eligible for business calls.
    */
  var canHaveBusinessCalls: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates if the listing is eligible for food menu.
    */
  var canHaveFoodMenus: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates if the listing can modify the service list.
    */
  var canModifyServiceList: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates whether the location can operate on Health data.
    */
  var canOperateHealthData: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates if the listing can manage local posts.
    */
  var canOperateLocalPost: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates whether the location can operate on Lodging data.
    */
  var canOperateLodgingData: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The location resource that this location duplicates.
    */
  var duplicateLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates whether the place ID associated with this location has updates that need to be updated or rejected by the client. If this boolean is set, you should call the `getGoogleUpdated` method to lookup information that's needs to be verified.
    */
  var hasGoogleUpdated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates whether any of this Location's properties are in the edit pending state.
    */
  var hasPendingEdits: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates if the listing has Voice of Merchant. If this boolean is false, you should call the locations.getVoiceOfMerchantState API to get details as to why they do not have Voice of Merchant.
    */
  var hasVoiceOfMerchant: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. A link to the location on Maps.
    */
  var mapsUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A link to the page on Google Search where a customer can leave a review for the location.
    */
  var newReviewUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. If this locationappears on Google Maps, this field is populated with the place ID for the location. This ID can be used in various Places APIs. This field can be set during Create calls, but not for Update.
    */
  var placeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetadata {
  
  inline def apply(): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadata]
  }
  
  extension [Self <: SchemaMetadata](x: Self) {
    
    inline def setCanDelete(value: Boolean): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
    
    inline def setCanDeleteNull: Self = StObject.set(x, "canDelete", null)
    
    inline def setCanDeleteUndefined: Self = StObject.set(x, "canDelete", js.undefined)
    
    inline def setCanHaveBusinessCalls(value: Boolean): Self = StObject.set(x, "canHaveBusinessCalls", value.asInstanceOf[js.Any])
    
    inline def setCanHaveBusinessCallsNull: Self = StObject.set(x, "canHaveBusinessCalls", null)
    
    inline def setCanHaveBusinessCallsUndefined: Self = StObject.set(x, "canHaveBusinessCalls", js.undefined)
    
    inline def setCanHaveFoodMenus(value: Boolean): Self = StObject.set(x, "canHaveFoodMenus", value.asInstanceOf[js.Any])
    
    inline def setCanHaveFoodMenusNull: Self = StObject.set(x, "canHaveFoodMenus", null)
    
    inline def setCanHaveFoodMenusUndefined: Self = StObject.set(x, "canHaveFoodMenus", js.undefined)
    
    inline def setCanModifyServiceList(value: Boolean): Self = StObject.set(x, "canModifyServiceList", value.asInstanceOf[js.Any])
    
    inline def setCanModifyServiceListNull: Self = StObject.set(x, "canModifyServiceList", null)
    
    inline def setCanModifyServiceListUndefined: Self = StObject.set(x, "canModifyServiceList", js.undefined)
    
    inline def setCanOperateHealthData(value: Boolean): Self = StObject.set(x, "canOperateHealthData", value.asInstanceOf[js.Any])
    
    inline def setCanOperateHealthDataNull: Self = StObject.set(x, "canOperateHealthData", null)
    
    inline def setCanOperateHealthDataUndefined: Self = StObject.set(x, "canOperateHealthData", js.undefined)
    
    inline def setCanOperateLocalPost(value: Boolean): Self = StObject.set(x, "canOperateLocalPost", value.asInstanceOf[js.Any])
    
    inline def setCanOperateLocalPostNull: Self = StObject.set(x, "canOperateLocalPost", null)
    
    inline def setCanOperateLocalPostUndefined: Self = StObject.set(x, "canOperateLocalPost", js.undefined)
    
    inline def setCanOperateLodgingData(value: Boolean): Self = StObject.set(x, "canOperateLodgingData", value.asInstanceOf[js.Any])
    
    inline def setCanOperateLodgingDataNull: Self = StObject.set(x, "canOperateLodgingData", null)
    
    inline def setCanOperateLodgingDataUndefined: Self = StObject.set(x, "canOperateLodgingData", js.undefined)
    
    inline def setDuplicateLocation(value: String): Self = StObject.set(x, "duplicateLocation", value.asInstanceOf[js.Any])
    
    inline def setDuplicateLocationNull: Self = StObject.set(x, "duplicateLocation", null)
    
    inline def setDuplicateLocationUndefined: Self = StObject.set(x, "duplicateLocation", js.undefined)
    
    inline def setHasGoogleUpdated(value: Boolean): Self = StObject.set(x, "hasGoogleUpdated", value.asInstanceOf[js.Any])
    
    inline def setHasGoogleUpdatedNull: Self = StObject.set(x, "hasGoogleUpdated", null)
    
    inline def setHasGoogleUpdatedUndefined: Self = StObject.set(x, "hasGoogleUpdated", js.undefined)
    
    inline def setHasPendingEdits(value: Boolean): Self = StObject.set(x, "hasPendingEdits", value.asInstanceOf[js.Any])
    
    inline def setHasPendingEditsNull: Self = StObject.set(x, "hasPendingEdits", null)
    
    inline def setHasPendingEditsUndefined: Self = StObject.set(x, "hasPendingEdits", js.undefined)
    
    inline def setHasVoiceOfMerchant(value: Boolean): Self = StObject.set(x, "hasVoiceOfMerchant", value.asInstanceOf[js.Any])
    
    inline def setHasVoiceOfMerchantNull: Self = StObject.set(x, "hasVoiceOfMerchant", null)
    
    inline def setHasVoiceOfMerchantUndefined: Self = StObject.set(x, "hasVoiceOfMerchant", js.undefined)
    
    inline def setMapsUri(value: String): Self = StObject.set(x, "mapsUri", value.asInstanceOf[js.Any])
    
    inline def setMapsUriNull: Self = StObject.set(x, "mapsUri", null)
    
    inline def setMapsUriUndefined: Self = StObject.set(x, "mapsUri", js.undefined)
    
    inline def setNewReviewUri(value: String): Self = StObject.set(x, "newReviewUri", value.asInstanceOf[js.Any])
    
    inline def setNewReviewUriNull: Self = StObject.set(x, "newReviewUri", null)
    
    inline def setNewReviewUriUndefined: Self = StObject.set(x, "newReviewUri", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
  }
}

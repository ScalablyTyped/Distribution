package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchTargetingOptionsRequest extends StObject {
  
  /**
    * Required. The Advertiser this request is being made in the context of.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Search terms for Business Chain targeting options. Can only be used when targeting_type is `TARGETING_TYPE_BUSINESS_CHAIN`.
    */
  var businessChainSearchTerms: js.UndefOr[SchemaBusinessChainSearchTerms] = js.undefined
  
  /**
    * Search terms for geo region targeting options. Can only be used when targeting_type is `TARGETING_TYPE_GEO_REGION`.
    */
  var geoRegionSearchTerms: js.UndefOr[SchemaGeoRegionSearchTerms] = js.undefined
  
  /**
    * Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `SearchTargetingOptions` method. If not specified, the first page of results will be returned.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Search terms for POI targeting options. Can only be used when targeting_type is `TARGETING_TYPE_POI`.
    */
  var poiSearchTerms: js.UndefOr[SchemaPoiSearchTerms] = js.undefined
}
object SchemaSearchTargetingOptionsRequest {
  
  inline def apply(): SchemaSearchTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchTargetingOptionsRequest]
  }
  
  extension [Self <: SchemaSearchTargetingOptionsRequest](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setBusinessChainSearchTerms(value: SchemaBusinessChainSearchTerms): Self = StObject.set(x, "businessChainSearchTerms", value.asInstanceOf[js.Any])
    
    inline def setBusinessChainSearchTermsUndefined: Self = StObject.set(x, "businessChainSearchTerms", js.undefined)
    
    inline def setGeoRegionSearchTerms(value: SchemaGeoRegionSearchTerms): Self = StObject.set(x, "geoRegionSearchTerms", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionSearchTermsUndefined: Self = StObject.set(x, "geoRegionSearchTerms", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPoiSearchTerms(value: SchemaPoiSearchTerms): Self = StObject.set(x, "poiSearchTerms", value.asInstanceOf[js.Any])
    
    inline def setPoiSearchTermsUndefined: Self = StObject.set(x, "poiSearchTerms", js.undefined)
  }
}

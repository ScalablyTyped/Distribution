package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaSearchResponse extends StObject {
  
  /**
    * The fully qualified resource name of applied [controls](https://cloud.google.com/retail/docs/serving-control-rules).
    */
  var appliedControls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A unique search token. This should be included in the UserEvent logs resulting from this search, which enables accurate attribution of search model performance.
    */
  var attributionToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains the spell corrected query, if found. If the spell correction type is AUTOMATIC, then the search results are based on corrected_query. Otherwise the original query is used for search.
    */
  var correctedQuery: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Results of facets requested by user.
    */
  var facets: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaSearchResponseFacet]] = js.undefined
  
  /**
    * The invalid SearchRequest.BoostSpec.condition_boost_specs that are not applied during serving.
    */
  var invalidConditionBoostSpecs: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaSearchRequestBoostSpecConditionBoostSpec]] = js.undefined
  
  /**
    * A token that can be sent as SearchRequest.page_token to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Query expansion information for the returned results.
    */
  var queryExpansionInfo: js.UndefOr[SchemaGoogleCloudRetailV2alphaSearchResponseQueryExpansionInfo] = js.undefined
  
  /**
    * The URI of a customer-defined redirect page. If redirect action is triggered, no search is performed, and only redirect_uri and attribution_token are set in the response.
    */
  var redirectUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of matched items. The order represents the ranking.
    */
  var results: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaSearchResponseSearchResult]] = js.undefined
  
  /**
    * The estimated total count of matched items irrespective of pagination. The count of results returned by pagination may be less than the total_size that matches.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaSearchResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaSearchResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaSearchResponse](x: Self) {
    
    inline def setAppliedControls(value: js.Array[String]): Self = StObject.set(x, "appliedControls", value.asInstanceOf[js.Any])
    
    inline def setAppliedControlsNull: Self = StObject.set(x, "appliedControls", null)
    
    inline def setAppliedControlsUndefined: Self = StObject.set(x, "appliedControls", js.undefined)
    
    inline def setAppliedControlsVarargs(value: String*): Self = StObject.set(x, "appliedControls", js.Array(value*))
    
    inline def setAttributionToken(value: String): Self = StObject.set(x, "attributionToken", value.asInstanceOf[js.Any])
    
    inline def setAttributionTokenNull: Self = StObject.set(x, "attributionToken", null)
    
    inline def setAttributionTokenUndefined: Self = StObject.set(x, "attributionToken", js.undefined)
    
    inline def setCorrectedQuery(value: String): Self = StObject.set(x, "correctedQuery", value.asInstanceOf[js.Any])
    
    inline def setCorrectedQueryNull: Self = StObject.set(x, "correctedQuery", null)
    
    inline def setCorrectedQueryUndefined: Self = StObject.set(x, "correctedQuery", js.undefined)
    
    inline def setFacets(value: js.Array[SchemaGoogleCloudRetailV2alphaSearchResponseFacet]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setFacetsVarargs(value: SchemaGoogleCloudRetailV2alphaSearchResponseFacet*): Self = StObject.set(x, "facets", js.Array(value*))
    
    inline def setInvalidConditionBoostSpecs(value: js.Array[SchemaGoogleCloudRetailV2alphaSearchRequestBoostSpecConditionBoostSpec]): Self = StObject.set(x, "invalidConditionBoostSpecs", value.asInstanceOf[js.Any])
    
    inline def setInvalidConditionBoostSpecsUndefined: Self = StObject.set(x, "invalidConditionBoostSpecs", js.undefined)
    
    inline def setInvalidConditionBoostSpecsVarargs(value: SchemaGoogleCloudRetailV2alphaSearchRequestBoostSpecConditionBoostSpec*): Self = StObject.set(x, "invalidConditionBoostSpecs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setQueryExpansionInfo(value: SchemaGoogleCloudRetailV2alphaSearchResponseQueryExpansionInfo): Self = StObject.set(x, "queryExpansionInfo", value.asInstanceOf[js.Any])
    
    inline def setQueryExpansionInfoUndefined: Self = StObject.set(x, "queryExpansionInfo", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriNull: Self = StObject.set(x, "redirectUri", null)
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setResults(value: js.Array[SchemaGoogleCloudRetailV2alphaSearchResponseSearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaGoogleCloudRetailV2alphaSearchResponseSearchResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}

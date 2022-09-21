package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaServingConfig extends StObject {
  
  /**
    * Condition boost specifications. If a product matches multiple conditions in the specifications, boost scores from these specifications are all applied and combined in a non-linear way. Maximum number of specifications is 100. Notice that if both ServingConfig.boost_control_ids and SearchRequest.boost_spec are set, the boost conditions from both places are evaluated. If a search request matches multiple boost conditions, the final boost score is equal to the sum of the boost scores from all matched boost conditions. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
    */
  var boostControlIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The human readable serving config display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How much diversity to use in recommendation model results e.g. 'medium-diversity' or 'high-diversity'. Currently supported values: * 'no-diversity' * 'low-diversity' * 'medium-diversity' * 'high-diversity' * 'auto-diversity' If not specified, we choose default based on recommendation model type. Default value: 'no-diversity'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
    */
  var diversityLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Condition do not associate specifications. If multiple do not associate conditions match, all matching do not associate controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
    */
  var doNotAssociateControlIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The specification for dynamically generated facets. Notice that only textual facets can be dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
    */
  var dynamicFacetSpec: js.UndefOr[SchemaGoogleCloudRetailV2alphaSearchRequestDynamicFacetSpec] = js.undefined
  
  /**
    * Whether to add additional category filters on the 'similar-items' model. If not specified, we enable it by default. Allowed values are: * 'no-category-match': No additional filtering of original results from the model and the customer's filters. * 'relaxed-category-match': Only keep results with categories that match at least one item categories in the PredictRequests's context item. * If customer also sends filters in the PredictRequest, then the results will satisfy both conditions (user given and category match). Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
    */
  var enableCategoryFilterLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the ids of Control resources with only the Facet control set. These controls are assumed to be in the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
    */
  var facetControlIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Condition filter specifications. If a product matches multiple conditions in the specifications, filters from these specifications are all applied and combined via the AND operator. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
    */
  var filterControlIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Condition ignore specifications. If multiple ignore conditions match, all matching ignore controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
    */
  var ignoreControlIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The id of the model to use at serving time. Currently only RecommendationModels are supported: https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when solution_types is SOLUTION_TYPE_RECOMMENDATION.
    */
  var modelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Fully qualified name `projects/x/locations/global/catalogs/x/servingConfig/x`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all matching oneway synonyms controls in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
    */
  var onewaySynonymsControlIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * How much price ranking we want in serving results. Price reranking causes product items with a similar recommendation probability to be ordered by price, with the highest-priced items first. This setting could result in a decrease in click-through and conversion rates. Allowed values are: * 'no-price-reranking' * 'low-price-raranking' * 'medium-price-reranking' * 'high-price-reranking' If not specified, we choose default based on model type. Default value: 'no-price-reranking'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
    */
  var priceRerankingLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Condition redirect specifications. Only the first triggered redirect action is applied, even if multiple apply. Maximum number of specifications is 1000. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
    */
  var redirectControlIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Condition replacement specifications. - Applied according to the order in the list. - A previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
    */
  var replacementControlIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Immutable. Specifies the solution types that a serving config can be associated with. Currently we support setting only one type of solution.
    */
  var solutionTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms control in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
    */
  var twowaySynonymsControlIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaServingConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaServingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaServingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaServingConfig](x: Self) {
    
    inline def setBoostControlIds(value: js.Array[String]): Self = StObject.set(x, "boostControlIds", value.asInstanceOf[js.Any])
    
    inline def setBoostControlIdsNull: Self = StObject.set(x, "boostControlIds", null)
    
    inline def setBoostControlIdsUndefined: Self = StObject.set(x, "boostControlIds", js.undefined)
    
    inline def setBoostControlIdsVarargs(value: String*): Self = StObject.set(x, "boostControlIds", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDiversityLevel(value: String): Self = StObject.set(x, "diversityLevel", value.asInstanceOf[js.Any])
    
    inline def setDiversityLevelNull: Self = StObject.set(x, "diversityLevel", null)
    
    inline def setDiversityLevelUndefined: Self = StObject.set(x, "diversityLevel", js.undefined)
    
    inline def setDoNotAssociateControlIds(value: js.Array[String]): Self = StObject.set(x, "doNotAssociateControlIds", value.asInstanceOf[js.Any])
    
    inline def setDoNotAssociateControlIdsNull: Self = StObject.set(x, "doNotAssociateControlIds", null)
    
    inline def setDoNotAssociateControlIdsUndefined: Self = StObject.set(x, "doNotAssociateControlIds", js.undefined)
    
    inline def setDoNotAssociateControlIdsVarargs(value: String*): Self = StObject.set(x, "doNotAssociateControlIds", js.Array(value*))
    
    inline def setDynamicFacetSpec(value: SchemaGoogleCloudRetailV2alphaSearchRequestDynamicFacetSpec): Self = StObject.set(x, "dynamicFacetSpec", value.asInstanceOf[js.Any])
    
    inline def setDynamicFacetSpecUndefined: Self = StObject.set(x, "dynamicFacetSpec", js.undefined)
    
    inline def setEnableCategoryFilterLevel(value: String): Self = StObject.set(x, "enableCategoryFilterLevel", value.asInstanceOf[js.Any])
    
    inline def setEnableCategoryFilterLevelNull: Self = StObject.set(x, "enableCategoryFilterLevel", null)
    
    inline def setEnableCategoryFilterLevelUndefined: Self = StObject.set(x, "enableCategoryFilterLevel", js.undefined)
    
    inline def setFacetControlIds(value: js.Array[String]): Self = StObject.set(x, "facetControlIds", value.asInstanceOf[js.Any])
    
    inline def setFacetControlIdsNull: Self = StObject.set(x, "facetControlIds", null)
    
    inline def setFacetControlIdsUndefined: Self = StObject.set(x, "facetControlIds", js.undefined)
    
    inline def setFacetControlIdsVarargs(value: String*): Self = StObject.set(x, "facetControlIds", js.Array(value*))
    
    inline def setFilterControlIds(value: js.Array[String]): Self = StObject.set(x, "filterControlIds", value.asInstanceOf[js.Any])
    
    inline def setFilterControlIdsNull: Self = StObject.set(x, "filterControlIds", null)
    
    inline def setFilterControlIdsUndefined: Self = StObject.set(x, "filterControlIds", js.undefined)
    
    inline def setFilterControlIdsVarargs(value: String*): Self = StObject.set(x, "filterControlIds", js.Array(value*))
    
    inline def setIgnoreControlIds(value: js.Array[String]): Self = StObject.set(x, "ignoreControlIds", value.asInstanceOf[js.Any])
    
    inline def setIgnoreControlIdsNull: Self = StObject.set(x, "ignoreControlIds", null)
    
    inline def setIgnoreControlIdsUndefined: Self = StObject.set(x, "ignoreControlIds", js.undefined)
    
    inline def setIgnoreControlIdsVarargs(value: String*): Self = StObject.set(x, "ignoreControlIds", js.Array(value*))
    
    inline def setModelId(value: String): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdNull: Self = StObject.set(x, "modelId", null)
    
    inline def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnewaySynonymsControlIds(value: js.Array[String]): Self = StObject.set(x, "onewaySynonymsControlIds", value.asInstanceOf[js.Any])
    
    inline def setOnewaySynonymsControlIdsNull: Self = StObject.set(x, "onewaySynonymsControlIds", null)
    
    inline def setOnewaySynonymsControlIdsUndefined: Self = StObject.set(x, "onewaySynonymsControlIds", js.undefined)
    
    inline def setOnewaySynonymsControlIdsVarargs(value: String*): Self = StObject.set(x, "onewaySynonymsControlIds", js.Array(value*))
    
    inline def setPriceRerankingLevel(value: String): Self = StObject.set(x, "priceRerankingLevel", value.asInstanceOf[js.Any])
    
    inline def setPriceRerankingLevelNull: Self = StObject.set(x, "priceRerankingLevel", null)
    
    inline def setPriceRerankingLevelUndefined: Self = StObject.set(x, "priceRerankingLevel", js.undefined)
    
    inline def setRedirectControlIds(value: js.Array[String]): Self = StObject.set(x, "redirectControlIds", value.asInstanceOf[js.Any])
    
    inline def setRedirectControlIdsNull: Self = StObject.set(x, "redirectControlIds", null)
    
    inline def setRedirectControlIdsUndefined: Self = StObject.set(x, "redirectControlIds", js.undefined)
    
    inline def setRedirectControlIdsVarargs(value: String*): Self = StObject.set(x, "redirectControlIds", js.Array(value*))
    
    inline def setReplacementControlIds(value: js.Array[String]): Self = StObject.set(x, "replacementControlIds", value.asInstanceOf[js.Any])
    
    inline def setReplacementControlIdsNull: Self = StObject.set(x, "replacementControlIds", null)
    
    inline def setReplacementControlIdsUndefined: Self = StObject.set(x, "replacementControlIds", js.undefined)
    
    inline def setReplacementControlIdsVarargs(value: String*): Self = StObject.set(x, "replacementControlIds", js.Array(value*))
    
    inline def setSolutionTypes(value: js.Array[String]): Self = StObject.set(x, "solutionTypes", value.asInstanceOf[js.Any])
    
    inline def setSolutionTypesNull: Self = StObject.set(x, "solutionTypes", null)
    
    inline def setSolutionTypesUndefined: Self = StObject.set(x, "solutionTypes", js.undefined)
    
    inline def setSolutionTypesVarargs(value: String*): Self = StObject.set(x, "solutionTypes", js.Array(value*))
    
    inline def setTwowaySynonymsControlIds(value: js.Array[String]): Self = StObject.set(x, "twowaySynonymsControlIds", value.asInstanceOf[js.Any])
    
    inline def setTwowaySynonymsControlIdsNull: Self = StObject.set(x, "twowaySynonymsControlIds", null)
    
    inline def setTwowaySynonymsControlIdsUndefined: Self = StObject.set(x, "twowaySynonymsControlIds", js.undefined)
    
    inline def setTwowaySynonymsControlIdsVarargs(value: String*): Self = StObject.set(x, "twowaySynonymsControlIds", js.Array(value*))
  }
}

package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1Insight extends StObject {
  
  /**
    * Recommendations derived from this insight.
    */
  var associatedRecommendations: js.UndefOr[js.Array[SchemaGoogleCloudRecommenderV1beta1InsightRecommendationReference]] = js.undefined
  
  /**
    * Category being targeted by the insight.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A struct of custom fields to explain the insight. Example: "grantedPermissionsCount": "1000"
    */
  var content: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Free-form human readable summary in English. The maximum length is 500 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fingerprint of the Insight. Provides optimistic locking when updating states.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Insight subtype. Insight content schema will be stable for a given subtype.
    */
  var insightSubtype: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp of the latest data used to generate the insight.
    */
  var lastRefreshTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the insight.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Observation period that led to the insight. The source data used to generate the insight ends at last_refresh_time and begins at (last_refresh_time - observation_period).
    */
  var observationPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Insight's severity.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information state and metadata.
    */
  var stateInfo: js.UndefOr[SchemaGoogleCloudRecommenderV1beta1InsightStateInfo] = js.undefined
  
  /**
    * Fully qualified resource names that this insight is targeting.
    */
  var targetResources: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1Insight {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1Insight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1Insight]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1Insight](x: Self) {
    
    inline def setAssociatedRecommendations(value: js.Array[SchemaGoogleCloudRecommenderV1beta1InsightRecommendationReference]): Self = StObject.set(x, "associatedRecommendations", value.asInstanceOf[js.Any])
    
    inline def setAssociatedRecommendationsUndefined: Self = StObject.set(x, "associatedRecommendations", js.undefined)
    
    inline def setAssociatedRecommendationsVarargs(value: SchemaGoogleCloudRecommenderV1beta1InsightRecommendationReference*): Self = StObject.set(x, "associatedRecommendations", js.Array(value*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setContent(value: StringDictionary[Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setInsightSubtype(value: String): Self = StObject.set(x, "insightSubtype", value.asInstanceOf[js.Any])
    
    inline def setInsightSubtypeNull: Self = StObject.set(x, "insightSubtype", null)
    
    inline def setInsightSubtypeUndefined: Self = StObject.set(x, "insightSubtype", js.undefined)
    
    inline def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimeNull: Self = StObject.set(x, "lastRefreshTime", null)
    
    inline def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObservationPeriod(value: String): Self = StObject.set(x, "observationPeriod", value.asInstanceOf[js.Any])
    
    inline def setObservationPeriodNull: Self = StObject.set(x, "observationPeriod", null)
    
    inline def setObservationPeriodUndefined: Self = StObject.set(x, "observationPeriod", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStateInfo(value: SchemaGoogleCloudRecommenderV1beta1InsightStateInfo): Self = StObject.set(x, "stateInfo", value.asInstanceOf[js.Any])
    
    inline def setStateInfoUndefined: Self = StObject.set(x, "stateInfo", js.undefined)
    
    inline def setTargetResources(value: js.Array[String]): Self = StObject.set(x, "targetResources", value.asInstanceOf[js.Any])
    
    inline def setTargetResourcesNull: Self = StObject.set(x, "targetResources", null)
    
    inline def setTargetResourcesUndefined: Self = StObject.set(x, "targetResources", js.undefined)
    
    inline def setTargetResourcesVarargs(value: String*): Self = StObject.set(x, "targetResources", js.Array(value*))
  }
}

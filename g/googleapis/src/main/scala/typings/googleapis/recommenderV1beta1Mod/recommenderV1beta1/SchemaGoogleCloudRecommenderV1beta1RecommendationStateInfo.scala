package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1RecommendationStateInfo extends StObject {
  
  /**
    * The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map of metadata for the state, provided by user or automations systems.
    */
  var stateMetadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1RecommendationStateInfo {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1RecommendationStateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1RecommendationStateInfo]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1RecommendationStateInfo](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMetadata(value: StringDictionary[String]): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    inline def setStateMetadataNull: Self = StObject.set(x, "stateMetadata", null)
    
    inline def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

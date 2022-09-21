package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1MarkRecommendationSucceededRequest extends StObject {
  
  /**
    * Required. Fingerprint of the Recommendation. Provides optimistic locking.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State properties to include with this state. Overwrites any existing `state_metadata`. Keys must match the regex `/^a-z0-9{0,62\}$/`. Values must match the regex `/^[a-zA-Z0-9_./-]{0,255\}$/`.
    */
  var stateMetadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1MarkRecommendationSucceededRequest {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1MarkRecommendationSucceededRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1MarkRecommendationSucceededRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1MarkRecommendationSucceededRequest](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setStateMetadata(value: StringDictionary[String]): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    inline def setStateMetadataNull: Self = StObject.set(x, "stateMetadata", null)
    
    inline def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
  }
}

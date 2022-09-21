package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1MarkInsightAcceptedRequest extends StObject {
  
  /**
    * Required. Fingerprint of the Insight. Provides optimistic locking.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. State properties user wish to include with this state. Full replace of the current state_metadata.
    */
  var stateMetadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1MarkInsightAcceptedRequest {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1MarkInsightAcceptedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1MarkInsightAcceptedRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1MarkInsightAcceptedRequest](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setStateMetadata(value: StringDictionary[String]): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    inline def setStateMetadataNull: Self = StObject.set(x, "stateMetadata", null)
    
    inline def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
  }
}

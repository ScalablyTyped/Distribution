package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1SmartComposeSuggestionData extends StObject {
  
  /**
    * The system's confidence score that this suggestion is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
    */
  var confidenceScore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Map that contains metadata about the Smart Compose suggestion and the document from which it originates.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The name of the answer record. Format: projects/{project\}/locations/{location\}/answerRecords/{answer_record\}
    */
  var queryRecord: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content of the suggestion.
    */
  var suggestion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1SmartComposeSuggestionData {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1SmartComposeSuggestionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1SmartComposeSuggestionData]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1SmartComposeSuggestionData](x: Self) {
    
    inline def setConfidenceScore(value: Double): Self = StObject.set(x, "confidenceScore", value.asInstanceOf[js.Any])
    
    inline def setConfidenceScoreNull: Self = StObject.set(x, "confidenceScore", null)
    
    inline def setConfidenceScoreUndefined: Self = StObject.set(x, "confidenceScore", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setQueryRecord(value: String): Self = StObject.set(x, "queryRecord", value.asInstanceOf[js.Any])
    
    inline def setQueryRecordNull: Self = StObject.set(x, "queryRecord", null)
    
    inline def setQueryRecordUndefined: Self = StObject.set(x, "queryRecord", js.undefined)
    
    inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setSuggestionNull: Self = StObject.set(x, "suggestion", null)
    
    inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
  }
}

package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ArticleSuggestionData extends StObject {
  
  /**
    * The system's confidence score that this article is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
    */
  var confidenceScore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Map that contains metadata about the Article Suggestion and the document that it originates from.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The name of the answer record. Format: projects/{project\}/locations/{location\}/answerRecords/{answer_record\}
    */
  var queryRecord: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The knowledge document that this answer was extracted from. Format: projects/{project\}/knowledgeBases/{knowledge_base\}/documents/{document\}
    */
  var source: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Article title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Article URI.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ArticleSuggestionData {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ArticleSuggestionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ArticleSuggestionData]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ArticleSuggestionData](x: Self) {
    
    inline def setConfidenceScore(value: Double): Self = StObject.set(x, "confidenceScore", value.asInstanceOf[js.Any])
    
    inline def setConfidenceScoreNull: Self = StObject.set(x, "confidenceScore", null)
    
    inline def setConfidenceScoreUndefined: Self = StObject.set(x, "confidenceScore", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setQueryRecord(value: String): Self = StObject.set(x, "queryRecord", value.asInstanceOf[js.Any])
    
    inline def setQueryRecordNull: Self = StObject.set(x, "queryRecord", null)
    
    inline def setQueryRecordUndefined: Self = StObject.set(x, "queryRecord", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}

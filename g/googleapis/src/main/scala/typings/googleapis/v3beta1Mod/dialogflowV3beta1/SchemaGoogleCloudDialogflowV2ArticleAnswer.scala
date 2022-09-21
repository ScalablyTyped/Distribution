package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ArticleAnswer extends StObject {
  
  /**
    * The name of answer record, in the format of "projects//locations//answerRecords/"
    */
  var answerRecord: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Article match confidence. The system's confidence score that this article is a good match for this conversation, as a value from 0.0 (completely uncertain) to 1.0 (completely certain).
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A map that contains metadata about the answer and the document from which it originates.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Article snippets.
    */
  var snippets: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The article title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The article URI.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ArticleAnswer {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ArticleAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ArticleAnswer]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ArticleAnswer](x: Self) {
    
    inline def setAnswerRecord(value: String): Self = StObject.set(x, "answerRecord", value.asInstanceOf[js.Any])
    
    inline def setAnswerRecordNull: Self = StObject.set(x, "answerRecord", null)
    
    inline def setAnswerRecordUndefined: Self = StObject.set(x, "answerRecord", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSnippets(value: js.Array[String]): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
    
    inline def setSnippetsNull: Self = StObject.set(x, "snippets", null)
    
    inline def setSnippetsUndefined: Self = StObject.set(x, "snippets", js.undefined)
    
    inline def setSnippetsVarargs(value: String*): Self = StObject.set(x, "snippets", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}

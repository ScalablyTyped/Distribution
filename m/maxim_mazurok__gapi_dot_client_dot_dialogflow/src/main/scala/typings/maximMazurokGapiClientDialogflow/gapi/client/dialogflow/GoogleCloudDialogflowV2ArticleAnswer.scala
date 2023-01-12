package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ArticleAnswer extends StObject {
  
  /** The name of answer record, in the format of "projects//locations//answerRecords/" */
  var answerRecord: js.UndefOr[String] = js.undefined
  
  /**
    * Article match confidence. The system's confidence score that this article is a good match for this conversation, as a value from 0.0 (completely uncertain) to 1.0 (completely
    * certain).
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** A map that contains metadata about the answer and the document from which it originates. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Article snippets. */
  var snippets: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The article title. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The article URI. */
  var uri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ArticleAnswer {
  
  inline def apply(): GoogleCloudDialogflowV2ArticleAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ArticleAnswer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2ArticleAnswer] (val x: Self) extends AnyVal {
    
    inline def setAnswerRecord(value: String): Self = StObject.set(x, "answerRecord", value.asInstanceOf[js.Any])
    
    inline def setAnswerRecordUndefined: Self = StObject.set(x, "answerRecord", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSnippets(value: js.Array[String]): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
    
    inline def setSnippetsUndefined: Self = StObject.set(x, "snippets", js.undefined)
    
    inline def setSnippetsVarargs(value: String*): Self = StObject.set(x, "snippets", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}

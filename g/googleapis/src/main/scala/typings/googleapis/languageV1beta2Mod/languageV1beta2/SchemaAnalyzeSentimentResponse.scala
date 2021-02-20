package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The sentiment analysis response message.
  */
@js.native
trait SchemaAnalyzeSentimentResponse extends StObject {
  
  /**
    * The overall sentiment of the input document.
    */
  var documentSentiment: js.UndefOr[SchemaSentiment] = js.native
  
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * The sentiment for all the sentences in the document.
    */
  var sentences: js.UndefOr[js.Array[SchemaSentence]] = js.native
}
object SchemaAnalyzeSentimentResponse {
  
  @scala.inline
  def apply(): SchemaAnalyzeSentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeSentimentResponse]
  }
  
  @scala.inline
  implicit class SchemaAnalyzeSentimentResponseMutableBuilder[Self <: SchemaAnalyzeSentimentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentSentiment(value: SchemaSentiment): Self = StObject.set(x, "documentSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentSentimentUndefined: Self = StObject.set(x, "documentSentiment", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setSentences(value: js.Array[SchemaSentence]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    @scala.inline
    def setSentencesVarargs(value: SchemaSentence*): Self = StObject.set(x, "sentences", js.Array(value :_*))
  }
}

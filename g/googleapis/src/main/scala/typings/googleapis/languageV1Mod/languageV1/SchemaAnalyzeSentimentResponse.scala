package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The sentiment analysis response message.
  */
trait SchemaAnalyzeSentimentResponse extends StObject {
  
  /**
    * The overall sentiment of the input document.
    */
  var documentSentiment: js.UndefOr[SchemaSentiment] = js.undefined
  
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The sentiment for all the sentences in the document.
    */
  var sentences: js.UndefOr[js.Array[SchemaSentence]] = js.undefined
}
object SchemaAnalyzeSentimentResponse {
  
  inline def apply(): SchemaAnalyzeSentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeSentimentResponse]
  }
  
  extension [Self <: SchemaAnalyzeSentimentResponse](x: Self) {
    
    inline def setDocumentSentiment(value: SchemaSentiment): Self = StObject.set(x, "documentSentiment", value.asInstanceOf[js.Any])
    
    inline def setDocumentSentimentUndefined: Self = StObject.set(x, "documentSentiment", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setSentences(value: js.Array[SchemaSentence]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    inline def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    inline def setSentencesVarargs(value: SchemaSentence*): Self = StObject.set(x, "sentences", js.Array(value :_*))
  }
}

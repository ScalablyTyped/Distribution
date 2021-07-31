package typings.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The syntax analysis response message.
  */
trait SchemaAnalyzeSyntaxResponse extends StObject {
  
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Sentences in the input document.
    */
  var sentences: js.UndefOr[js.Array[SchemaSentence]] = js.undefined
  
  /**
    * Tokens, along with their syntactic information, in the input document.
    */
  var tokens: js.UndefOr[js.Array[SchemaToken]] = js.undefined
}
object SchemaAnalyzeSyntaxResponse {
  
  @scala.inline
  def apply(): SchemaAnalyzeSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeSyntaxResponse]
  }
  
  @scala.inline
  implicit class SchemaAnalyzeSyntaxResponseMutableBuilder[Self <: SchemaAnalyzeSyntaxResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setTokens(value: js.Array[SchemaToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    @scala.inline
    def setTokensVarargs(value: SchemaToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}

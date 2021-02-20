package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The entity-level sentiment analysis response message.
  */
@js.native
trait SchemaAnalyzeEntitySentimentResponse extends StObject {
  
  /**
    * The recognized entities in the input document with associated sentiments.
    */
  var entities: js.UndefOr[js.Array[SchemaEntity]] = js.native
  
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
}
object SchemaAnalyzeEntitySentimentResponse {
  
  @scala.inline
  def apply(): SchemaAnalyzeEntitySentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeEntitySentimentResponse]
  }
  
  @scala.inline
  implicit class SchemaAnalyzeEntitySentimentResponseMutableBuilder[Self <: SchemaAnalyzeEntitySentimentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[SchemaEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: SchemaEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}

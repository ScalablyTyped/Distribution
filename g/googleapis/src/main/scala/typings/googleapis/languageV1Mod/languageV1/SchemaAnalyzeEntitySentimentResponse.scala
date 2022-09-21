package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzeEntitySentimentResponse extends StObject {
  
  /**
    * The recognized entities in the input document with associated sentiments.
    */
  var entities: js.UndefOr[js.Array[SchemaEntity]] = js.undefined
  
  /**
    * The language of the text, which will be the same as the language specified in the request or, if not specified, the automatically-detected language. See Document.language field for more details.
    */
  var language: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnalyzeEntitySentimentResponse {
  
  inline def apply(): SchemaAnalyzeEntitySentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeEntitySentimentResponse]
  }
  
  extension [Self <: SchemaAnalyzeEntitySentimentResponse](x: Self) {
    
    inline def setEntities(value: js.Array[SchemaEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SchemaEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}

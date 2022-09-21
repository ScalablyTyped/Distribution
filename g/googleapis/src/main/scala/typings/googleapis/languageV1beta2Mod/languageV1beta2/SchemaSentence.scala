package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSentence extends StObject {
  
  /**
    * For calls to AnalyzeSentiment or if AnnotateTextRequest.Features.extract_document_sentiment is set to true, this field will contain the sentiment for the sentence.
    */
  var sentiment: js.UndefOr[SchemaSentiment] = js.undefined
  
  /**
    * The sentence text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.undefined
}
object SchemaSentence {
  
  inline def apply(): SchemaSentence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSentence]
  }
  
  extension [Self <: SchemaSentence](x: Self) {
    
    inline def setSentiment(value: SchemaSentiment): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    inline def setText(value: SchemaTextSpan): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}

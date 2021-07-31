package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a sentence in the input document.
  */
trait SchemaSentence extends StObject {
  
  /**
    * For calls to AnalyzeSentiment or if
    * AnnotateTextRequest.Features.extract_document_sentiment is set to true,
    * this field will contain the sentiment for the sentence.
    */
  var sentiment: js.UndefOr[SchemaSentiment] = js.undefined
  
  /**
    * The sentence text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.undefined
}
object SchemaSentence {
  
  @scala.inline
  def apply(): SchemaSentence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSentence]
  }
  
  @scala.inline
  implicit class SchemaSentenceMutableBuilder[Self <: SchemaSentence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSentiment(value: SchemaSentiment): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    @scala.inline
    def setText(value: SchemaTextSpan): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}

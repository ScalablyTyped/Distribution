package typings.googleapis.languageV1beta1Mod.languageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a sentence in the input document.
  */
@js.native
trait SchemaSentence extends js.Object {
  
  /**
    * For calls to AnalyzeSentiment or if
    * AnnotateTextRequest.Features.extract_document_sentiment is set to true,
    * this field will contain the sentiment for the sentence.
    */
  var sentiment: js.UndefOr[SchemaSentiment] = js.native
  
  /**
    * The sentence text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.native
}
object SchemaSentence {
  
  @scala.inline
  def apply(): SchemaSentence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSentence]
  }
  
  @scala.inline
  implicit class SchemaSentenceOps[Self <: SchemaSentence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSentiment(value: SchemaSentiment): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
    
    @scala.inline
    def setText(value: SchemaTextSpan): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}

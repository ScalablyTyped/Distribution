package typings.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(sentiment: SchemaSentiment = null, text: SchemaTextSpan = null): SchemaSentence = {
    val __obj = js.Dynamic.literal()
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSentence]
  }
}


package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a mention for an entity in the text. Currently, proper noun
  * mentions are supported.
  */
@js.native
trait SchemaEntityMention extends js.Object {
  /**
    * For calls to AnalyzeEntitySentiment or if
    * AnnotateTextRequest.Features.extract_entity_sentiment is set to true,
    * this field will contain the sentiment expressed for this mention of the
    * entity in the provided document.
    */
  var sentiment: js.UndefOr[SchemaSentiment] = js.native
  /**
    * The mention text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.native
  /**
    * The type of the entity mention.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaEntityMention {
  @scala.inline
  def apply(): SchemaEntityMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityMention]
  }
  @scala.inline
  implicit class SchemaEntityMentionOps[Self <: SchemaEntityMention] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


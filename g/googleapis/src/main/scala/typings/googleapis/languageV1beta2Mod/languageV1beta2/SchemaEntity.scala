package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a phrase in the text that is a known entity, such as a person,
  * an organization, or location. The API associates information, such as
  * salience and mentions, with entities.
  */
@js.native
trait SchemaEntity extends js.Object {
  /**
    * The mentions of this entity in the input document. The API currently
    * supports proper noun mentions.
    */
  var mentions: js.UndefOr[js.Array[SchemaEntityMention]] = js.native
  /**
    * Metadata associated with the entity.  Currently, Wikipedia URLs and
    * Knowledge Graph MIDs are provided, if available. The associated keys are
    * &quot;wikipedia_url&quot; and &quot;mid&quot;, respectively.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The representative name for the entity.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The salience score associated with the entity in the [0, 1.0] range.  The
    * salience score for an entity provides information about the importance or
    * centrality of that entity to the entire document text. Scores closer to 0
    * are less salient, while scores closer to 1.0 are highly salient.
    */
  var salience: js.UndefOr[Double] = js.native
  /**
    * For calls to AnalyzeEntitySentiment or if
    * AnnotateTextRequest.Features.extract_entity_sentiment is set to true,
    * this field will contain the aggregate sentiment expressed for this entity
    * in the provided document.
    */
  var sentiment: js.UndefOr[SchemaSentiment] = js.native
  /**
    * The entity type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaEntity {
  @scala.inline
  def apply(): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntity]
  }
  @scala.inline
  implicit class SchemaEntityOps[Self <: SchemaEntity] (val x: Self) extends AnyVal {
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
    def setMentionsVarargs(value: SchemaEntityMention*): Self = this.set("mentions", js.Array(value :_*))
    @scala.inline
    def setMentions(value: js.Array[SchemaEntityMention]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSalience(value: Double): Self = this.set("salience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalience: Self = this.set("salience", js.undefined)
    @scala.inline
    def setSentiment(value: SchemaSentiment): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


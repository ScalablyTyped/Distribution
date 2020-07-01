package typings.googleapis.languageV1Mod.languageV1

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
  def apply(
    mentions: js.Array[SchemaEntityMention] = null,
    metadata: StringDictionary[String] = null,
    name: String = null,
    salience: js.UndefOr[Double] = js.undefined,
    sentiment: SchemaSentiment = null,
    `type`: String = null
  ): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(salience)) __obj.updateDynamic("salience")(salience.get.asInstanceOf[js.Any])
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntity]
  }
}


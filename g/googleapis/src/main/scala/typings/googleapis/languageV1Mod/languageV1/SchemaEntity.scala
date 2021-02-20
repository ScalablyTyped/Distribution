package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a phrase in the text that is a known entity, such as a person,
  * an organization, or location. The API associates information, such as
  * salience and mentions, with entities.
  */
@js.native
trait SchemaEntity extends StObject {
  
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
  implicit class SchemaEntityMutableBuilder[Self <: SchemaEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMentions(value: js.Array[SchemaEntityMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: SchemaEntityMention*): Self = StObject.set(x, "mentions", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSalience(value: Double): Self = StObject.set(x, "salience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalienceUndefined: Self = StObject.set(x, "salience", js.undefined)
    
    @scala.inline
    def setSentiment(value: SchemaSentiment): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

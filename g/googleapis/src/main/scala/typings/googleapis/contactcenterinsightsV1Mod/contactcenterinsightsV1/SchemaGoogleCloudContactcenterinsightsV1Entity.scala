package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1Entity extends StObject {
  
  /**
    * The representative name for the entity.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata associated with the entity. For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`) and Knowledge Graph MID (`mid`), if they are available. For the metadata associated with other entity types, see the Type table below.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The salience score associated with the entity in the [0, 1.0] range. The salience score for an entity provides information about the importance or centrality of that entity to the entire document text. Scores closer to 0 are less salient, while scores closer to 1.0 are highly salient.
    */
  var salience: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The aggregate sentiment expressed for this entity in the conversation.
    */
  var sentiment: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1SentimentData] = js.undefined
  
  /**
    * The entity type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1Entity {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1Entity]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1Entity](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSalience(value: Double): Self = StObject.set(x, "salience", value.asInstanceOf[js.Any])
    
    inline def setSalienceNull: Self = StObject.set(x, "salience", null)
    
    inline def setSalienceUndefined: Self = StObject.set(x, "salience", js.undefined)
    
    inline def setSentiment(value: SchemaGoogleCloudContactcenterinsightsV1SentimentData): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

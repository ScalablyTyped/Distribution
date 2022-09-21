package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1EntityMentionData extends StObject {
  
  /**
    * The key of this entity in conversation entities. Can be used to retrieve the exact `Entity` this mention is attached to.
    */
  var entityUniqueId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sentiment expressed for this mention of the entity.
    */
  var sentiment: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1SentimentData] = js.undefined
  
  /**
    * The type of the entity mention.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1EntityMentionData {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1EntityMentionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1EntityMentionData]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1EntityMentionData](x: Self) {
    
    inline def setEntityUniqueId(value: String): Self = StObject.set(x, "entityUniqueId", value.asInstanceOf[js.Any])
    
    inline def setEntityUniqueIdNull: Self = StObject.set(x, "entityUniqueId", null)
    
    inline def setEntityUniqueIdUndefined: Self = StObject.set(x, "entityUniqueId", js.undefined)
    
    inline def setSentiment(value: SchemaGoogleCloudContactcenterinsightsV1SentimentData): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

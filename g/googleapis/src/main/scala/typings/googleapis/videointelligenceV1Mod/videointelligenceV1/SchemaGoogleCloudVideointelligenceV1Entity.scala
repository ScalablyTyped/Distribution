package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1Entity extends StObject {
  
  /**
    * Textual description, e.g., `Fixed-gear bicycle`.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph Search API](https://developers.google.com/knowledge-graph/).
    */
  var entityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Language code for `description` in BCP-47 format.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1Entity {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1Entity]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1Entity](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdNull: Self = StObject.set(x, "entityId", null)
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}

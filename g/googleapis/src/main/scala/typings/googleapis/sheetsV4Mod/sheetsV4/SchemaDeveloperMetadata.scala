package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeveloperMetadata extends StObject {
  
  /**
    * The location where the metadata is associated.
    */
  var location: js.UndefOr[SchemaDeveloperMetadataLocation] = js.undefined
  
  /**
    * The spreadsheet-scoped unique ID that identifies the metadata. IDs may be specified when metadata is created, otherwise one will be randomly generated and assigned. Must be positive.
    */
  var metadataId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The metadata key. There may be multiple metadata in a spreadsheet with the same key. Developer metadata must always have a key specified.
    */
  var metadataKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data associated with the metadata's key.
    */
  var metadataValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The metadata visibility. Developer metadata must always have a visibility specified.
    */
  var visibility: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeveloperMetadata {
  
  inline def apply(): SchemaDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeveloperMetadata]
  }
  
  extension [Self <: SchemaDeveloperMetadata](x: Self) {
    
    inline def setLocation(value: SchemaDeveloperMetadataLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMetadataId(value: Double): Self = StObject.set(x, "metadataId", value.asInstanceOf[js.Any])
    
    inline def setMetadataIdNull: Self = StObject.set(x, "metadataId", null)
    
    inline def setMetadataIdUndefined: Self = StObject.set(x, "metadataId", js.undefined)
    
    inline def setMetadataKey(value: String): Self = StObject.set(x, "metadataKey", value.asInstanceOf[js.Any])
    
    inline def setMetadataKeyNull: Self = StObject.set(x, "metadataKey", null)
    
    inline def setMetadataKeyUndefined: Self = StObject.set(x, "metadataKey", js.undefined)
    
    inline def setMetadataValue(value: String): Self = StObject.set(x, "metadataValue", value.asInstanceOf[js.Any])
    
    inline def setMetadataValueNull: Self = StObject.set(x, "metadataValue", null)
    
    inline def setMetadataValueUndefined: Self = StObject.set(x, "metadataValue", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityNull: Self = StObject.set(x, "visibility", null)
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}

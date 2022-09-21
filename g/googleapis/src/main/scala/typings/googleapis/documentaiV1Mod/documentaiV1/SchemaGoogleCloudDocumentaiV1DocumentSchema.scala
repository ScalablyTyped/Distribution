package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentSchema extends StObject {
  
  /**
    * Description of the schema.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name to show to users.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Entity types of the schema.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityType]] = js.undefined
  
  /**
    * Metadata of the schema.
    */
  var metadata: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentSchemaMetadata] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentSchema {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentSchema]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentSchema](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntityTypes(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityType*): Self = StObject.set(x, "entityTypes", js.Array(value*))
    
    inline def setMetadata(value: SchemaGoogleCloudDocumentaiV1DocumentSchemaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}

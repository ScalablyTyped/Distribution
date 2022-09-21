package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchema extends StObject {
  
  /**
    * Display name for the schema.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of fields in the schema.
    */
  var fields: js.UndefOr[js.Array[SchemaSchemaFieldSpec]] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of the schema (Read-only)
    */
  var schemaId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The schema's name. Each `schema_name` must be unique within a customer. Reusing a name results in a `409: Entity already exists` error.
    */
  var schemaName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSchema {
  
  inline def apply(): SchemaSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchema]
  }
  
  extension [Self <: SchemaSchema](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFields(value: js.Array[SchemaSchemaFieldSpec]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaSchemaFieldSpec*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSchemaId(value: String): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
    
    inline def setSchemaIdNull: Self = StObject.set(x, "schemaId", null)
    
    inline def setSchemaIdUndefined: Self = StObject.set(x, "schemaId", js.undefined)
    
    inline def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameNull: Self = StObject.set(x, "schemaName", null)
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "schemaName", js.undefined)
  }
}

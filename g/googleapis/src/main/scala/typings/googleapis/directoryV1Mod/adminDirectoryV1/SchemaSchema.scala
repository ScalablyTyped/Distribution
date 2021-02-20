package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Schema resource in Directory API.
  */
@js.native
trait SchemaSchema extends StObject {
  
  /**
    * Display name for the schema.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Fields of Schema
    */
  var fields: js.UndefOr[js.Array[SchemaSchemaFieldSpec]] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier of Schema (Read-only)
    */
  var schemaId: js.UndefOr[String] = js.native
  
  /**
    * Schema name
    */
  var schemaName: js.UndefOr[String] = js.native
}
object SchemaSchema {
  
  @scala.inline
  def apply(): SchemaSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchema]
  }
  
  @scala.inline
  implicit class SchemaSchemaMutableBuilder[Self <: SchemaSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[SchemaSchemaFieldSpec]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaSchemaFieldSpec*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSchemaId(value: String): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaIdUndefined: Self = StObject.set(x, "schemaId", js.undefined)
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "schemaName", js.undefined)
  }
}

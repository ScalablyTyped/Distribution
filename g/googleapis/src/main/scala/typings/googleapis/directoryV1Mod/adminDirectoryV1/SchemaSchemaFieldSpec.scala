package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.MaxValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchemaFieldSpec extends StObject {
  
  /**
    * Display Name of the field.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ETag of the field.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of the field (Read-only)
    */
  var fieldId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the field.
    */
  var fieldName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the field.
    */
  var fieldType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Boolean specifying whether the field is indexed or not. Default: `true`.
    */
  var indexed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The kind of resource this is. For schema fields this is always `admin#directory#schema#fieldspec`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A boolean specifying whether this is a multi-valued field or not. Default: `false`.
    */
  var multiValued: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indexing spec for a numeric field. By default, only exact match queries will be supported for numeric fields. Setting the `numericIndexingSpec` allows range queries to be supported.
    */
  var numericIndexingSpec: js.UndefOr[MaxValue | Null] = js.undefined
  
  /**
    * Specifies who can view values of this field. See [Retrieve users as a non-administrator](/admin-sdk/directory/v1/guides/manage-users#retrieve_users_non_admin) for more information. Note: It may take up to 24 hours for changes to this field to be reflected.
    */
  var readAccessType: js.UndefOr[String | Null] = js.undefined
}
object SchemaSchemaFieldSpec {
  
  inline def apply(): SchemaSchemaFieldSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemaFieldSpec]
  }
  
  extension [Self <: SchemaSchemaFieldSpec](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdNull: Self = StObject.set(x, "fieldId", null)
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameNull: Self = StObject.set(x, "fieldName", null)
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    inline def setFieldTypeNull: Self = StObject.set(x, "fieldType", null)
    
    inline def setFieldTypeUndefined: Self = StObject.set(x, "fieldType", js.undefined)
    
    inline def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    inline def setIndexedNull: Self = StObject.set(x, "indexed", null)
    
    inline def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMultiValued(value: Boolean): Self = StObject.set(x, "multiValued", value.asInstanceOf[js.Any])
    
    inline def setMultiValuedNull: Self = StObject.set(x, "multiValued", null)
    
    inline def setMultiValuedUndefined: Self = StObject.set(x, "multiValued", js.undefined)
    
    inline def setNumericIndexingSpec(value: MaxValue): Self = StObject.set(x, "numericIndexingSpec", value.asInstanceOf[js.Any])
    
    inline def setNumericIndexingSpecNull: Self = StObject.set(x, "numericIndexingSpec", null)
    
    inline def setNumericIndexingSpecUndefined: Self = StObject.set(x, "numericIndexingSpec", js.undefined)
    
    inline def setReadAccessType(value: String): Self = StObject.set(x, "readAccessType", value.asInstanceOf[js.Any])
    
    inline def setReadAccessTypeNull: Self = StObject.set(x, "readAccessType", null)
    
    inline def setReadAccessTypeUndefined: Self = StObject.set(x, "readAccessType", js.undefined)
  }
}

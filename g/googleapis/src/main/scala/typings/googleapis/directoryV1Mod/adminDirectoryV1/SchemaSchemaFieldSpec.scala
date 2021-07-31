package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.MaxValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for FieldSpec resource for Schemas in Directory API.
  */
trait SchemaSchemaFieldSpec extends StObject {
  
  /**
    * Display Name of the field.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier of Field (Read-only)
    */
  var fieldId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the field.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the field.
    */
  var fieldType: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean specifying whether the field is indexed or not.
    */
  var indexed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean specifying whether this is a multi-valued field or not.
    */
  var multiValued: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indexing spec for a numeric field. By default, only exact match queries
    * will be supported for numeric fields. Setting the numericIndexingSpec
    * allows range queries to be supported.
    */
  var numericIndexingSpec: js.UndefOr[MaxValue] = js.undefined
  
  /**
    * Read ACLs on the field specifying who can view values of this field.
    * Valid values are &quot;ALL_DOMAIN_USERS&quot; and
    * &quot;ADMINS_AND_SELF&quot;.
    */
  var readAccessType: js.UndefOr[String] = js.undefined
}
object SchemaSchemaFieldSpec {
  
  @scala.inline
  def apply(): SchemaSchemaFieldSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemaFieldSpec]
  }
  
  @scala.inline
  implicit class SchemaSchemaFieldSpecMutableBuilder[Self <: SchemaSchemaFieldSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    @scala.inline
    def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTypeUndefined: Self = StObject.set(x, "fieldType", js.undefined)
    
    @scala.inline
    def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMultiValued(value: Boolean): Self = StObject.set(x, "multiValued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValuedUndefined: Self = StObject.set(x, "multiValued", js.undefined)
    
    @scala.inline
    def setNumericIndexingSpec(value: MaxValue): Self = StObject.set(x, "numericIndexingSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericIndexingSpecUndefined: Self = StObject.set(x, "numericIndexingSpec", js.undefined)
    
    @scala.inline
    def setReadAccessType(value: String): Self = StObject.set(x, "readAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAccessTypeUndefined: Self = StObject.set(x, "readAccessType", js.undefined)
  }
}

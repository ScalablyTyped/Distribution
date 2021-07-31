package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type Information. Contains detailed information about a composite type,
  * base type, or base type with specific collection.
  */
trait SchemaTypeInfo extends StObject {
  
  /**
    * The description of the type.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * For swagger 2.0 externalDocs field will be used. For swagger 1.2 this
    * field will be empty.
    */
  var documentationLink: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Type of the output. Always deploymentManager#TypeInfo for
    * TypeInfo.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The base type or composite type name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * For base types with a collection, we return a schema and documentation
    * link For template types, we return only a schema
    */
  var schema: js.UndefOr[SchemaTypeInfoSchemaInfo] = js.undefined
  
  /**
    * Output only. Self link for the type provider.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The title on the API descriptor URL provided.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaTypeInfo {
  
  @scala.inline
  def apply(): SchemaTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeInfo]
  }
  
  @scala.inline
  implicit class SchemaTypeInfoMutableBuilder[Self <: SchemaTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDocumentationLink(value: String): Self = StObject.set(x, "documentationLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationLinkUndefined: Self = StObject.set(x, "documentationLink", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSchema(value: SchemaTypeInfoSchemaInfo): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

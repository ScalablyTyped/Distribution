package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type Information. Contains detailed information about a composite type,
  * base type, or base type with specific collection.
  */
@js.native
trait SchemaTypeInfo extends js.Object {
  
  /**
    * The description of the type.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * For swagger 2.0 externalDocs field will be used. For swagger 1.2 this
    * field will be empty.
    */
  var documentationLink: js.UndefOr[String] = js.native
  
  /**
    * Output only. Type of the output. Always deploymentManager#TypeInfo for
    * TypeInfo.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The base type or composite type name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * For base types with a collection, we return a schema and documentation
    * link For template types, we return only a schema
    */
  var schema: js.UndefOr[SchemaTypeInfoSchemaInfo] = js.native
  
  /**
    * Output only. Self link for the type provider.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * The title on the API descriptor URL provided.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaTypeInfo {
  
  @scala.inline
  def apply(): SchemaTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeInfo]
  }
  
  @scala.inline
  implicit class SchemaTypeInfoOps[Self <: SchemaTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDocumentationLink(value: String): Self = this.set("documentationLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentationLink: Self = this.set("documentationLink", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSchema(value: SchemaTypeInfoSchemaInfo): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}

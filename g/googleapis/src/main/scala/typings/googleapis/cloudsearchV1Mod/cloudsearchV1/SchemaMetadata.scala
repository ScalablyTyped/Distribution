package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata of a matched search result.
  */
@js.native
trait SchemaMetadata extends js.Object {
  
  /**
    * The creation time for this document or object in the search result.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Options that specify how to display a structured data search result.
    */
  var displayOptions: js.UndefOr[SchemaResultDisplayMetadata] = js.native
  
  /**
    * Indexed fields in structured data, returned as a generic named property.
    */
  var fields: js.UndefOr[js.Array[SchemaNamedProperty]] = js.native
  
  /**
    * Mime type of the search result.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Object type of the search result.
    */
  var objectType: js.UndefOr[String] = js.native
  
  /**
    * Owner (usually creator) of the document or object of the search result.
    */
  var owner: js.UndefOr[SchemaPerson] = js.native
  
  /**
    * The named source for the result, such as Gmail.
    */
  var source: js.UndefOr[SchemaSource] = js.native
  
  /**
    * The last modified date for the object in the search result. If not set in
    * the item, the value returned here is empty. When `updateTime` is used for
    * calculating freshness and is not set, this value defaults to 2 years from
    * the current time.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaMetadata {
  
  @scala.inline
  def apply(): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadata]
  }
  
  @scala.inline
  implicit class SchemaMetadataOps[Self <: SchemaMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDisplayOptions(value: SchemaResultDisplayMetadata): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaNamedProperty*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[SchemaNamedProperty]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    
    @scala.inline
    def setOwner(value: SchemaPerson): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}

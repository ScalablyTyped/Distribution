package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics custom data source.
  */
@js.native
trait SchemaCustomDataSource extends js.Object {
  
  /**
    * Account ID to which this custom data source belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  
  var childLink: js.UndefOr[Href] = js.native
  
  /**
    * Time this custom data source was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * Description of custom data source.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Custom data source ID.
    */
  var id: js.UndefOr[String] = js.native
  
  var importBehavior: js.UndefOr[String] = js.native
  
  /**
    * Resource type for Analytics custom data source.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this custom data source.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Parent link for this custom data source. Points to the web property to
    * which this custom data source belongs.
    */
  var parentLink: js.UndefOr[Href] = js.native
  
  /**
    * IDs of views (profiles) linked to the custom data source.
    */
  var profilesLinked: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Collection of schema headers of the custom data source.
    */
  var schema: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Link for this Analytics custom data source.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Type of the custom data source.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Time this custom data source was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * Upload type of the custom data source.
    */
  var uploadType: js.UndefOr[String] = js.native
  
  /**
    * Web property ID of the form UA-XXXXX-YY to which this custom data source
    * belongs.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object SchemaCustomDataSource {
  
  @scala.inline
  def apply(): SchemaCustomDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomDataSource]
  }
  
  @scala.inline
  implicit class SchemaCustomDataSourceOps[Self <: SchemaCustomDataSource] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setChildLink(value: Href): Self = this.set("childLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildLink: Self = this.set("childLink", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImportBehavior(value: String): Self = this.set("importBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportBehavior: Self = this.set("importBehavior", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentLink(value: Href): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    
    @scala.inline
    def setProfilesLinkedVarargs(value: String*): Self = this.set("profilesLinked", js.Array(value :_*))
    
    @scala.inline
    def setProfilesLinked(value: js.Array[String]): Self = this.set("profilesLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfilesLinked: Self = this.set("profilesLinked", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: String*): Self = this.set("schema", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: js.Array[String]): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
}

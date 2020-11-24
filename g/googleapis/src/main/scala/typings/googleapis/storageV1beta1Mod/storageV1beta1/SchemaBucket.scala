package typings.googleapis.storageV1beta1Mod.storageV1beta1

import typings.googleapis.anon.Entity
import typings.googleapis.anon.MainPageSuffix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bucket.
  */
@js.native
trait SchemaBucket extends js.Object {
  
  /**
    * Access controls on the bucket.
    */
  var acl: js.UndefOr[js.Array[SchemaBucketAccessControl]] = js.native
  
  /**
    * Default access controls to apply to new objects when no ACL is provided.
    */
  var defaultObjectAcl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.native
  
  /**
    * The name of the bucket.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The kind of item this is. For buckets, this is always storage#bucket.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The location of the bucket. Object data for objects in the bucket resides
    * in physical storage in this location. Can be US or EU. Defaults to US.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The owner of the bucket. This will always be the project team&#39;s owner
    * group.
    */
  var owner: js.UndefOr[Entity] = js.native
  
  /**
    * The project the bucket belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * The URI of this bucket.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Creation time of the bucket in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String] = js.native
  
  /**
    * The bucket&#39;s website configuration.
    */
  var website: js.UndefOr[MainPageSuffix] = js.native
}
object SchemaBucket {
  
  @scala.inline
  def apply(): SchemaBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucket]
  }
  
  @scala.inline
  implicit class SchemaBucketOps[Self <: SchemaBucket] (val x: Self) extends AnyVal {
    
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
    def setAclVarargs(value: SchemaBucketAccessControl*): Self = this.set("acl", js.Array(value :_*))
    
    @scala.inline
    def setAcl(value: js.Array[SchemaBucketAccessControl]): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    
    @scala.inline
    def setDefaultObjectAclVarargs(value: SchemaObjectAccessControl*): Self = this.set("defaultObjectAcl", js.Array(value :_*))
    
    @scala.inline
    def setDefaultObjectAcl(value: js.Array[SchemaObjectAccessControl]): Self = this.set("defaultObjectAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultObjectAcl: Self = this.set("defaultObjectAcl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setOwner(value: Entity): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    
    @scala.inline
    def setWebsite(value: MainPageSuffix): Self = this.set("website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
}

package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.googleapis.anon.Entity
import typings.googleapis.anon.LogBucket
import typings.googleapis.anon.MainPageSuffix
import typings.googleapis.anon.MaxAgeSeconds
import typings.googleapis.anon.`11`
import typings.googleapis.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The bucket&#39;s Cross-Origin Resource Sharing (CORS) configuration.
    */
  var cors: js.UndefOr[js.Array[MaxAgeSeconds]] = js.native
  /**
    * Default access controls to apply to new objects when no ACL is provided.
    */
  var defaultObjectAcl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.native
  /**
    * HTTP 1.1 Entity tag for the bucket.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID of the bucket.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For buckets, this is always storage#bucket.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s lifecycle configuration. See object lifecycle management
    * for more information.
    */
  var lifecycle: js.UndefOr[`11`] = js.native
  /**
    * The location of the bucket. Object data for objects in the bucket resides
    * in physical storage within this region. Typical values are US and EU.
    * Defaults to US. See the developer&#39;s guide for the authoritative list.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s logging configuration, which defines the destination
    * bucket and optional name prefix for the current bucket&#39;s logs.
    */
  var logging: js.UndefOr[LogBucket] = js.native
  /**
    * The metadata generation of this bucket.
    */
  var metageneration: js.UndefOr[String] = js.native
  /**
    * The name of the bucket.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The owner of the bucket. This is always the project team&#39;s owner
    * group.
    */
  var owner: js.UndefOr[Entity] = js.native
  /**
    * The URI of this bucket.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s storage class. This defines how objects in the bucket
    * are stored and determines the SLA and the cost of storage. Typical values
    * are STANDARD and DURABLE_REDUCED_AVAILABILITY. Defaults to STANDARD. See
    * the developer&#39;s guide for the authoritative list.
    */
  var storageClass: js.UndefOr[String] = js.native
  /**
    * Creation time of the bucket in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s versioning configuration.
    */
  var versioning: js.UndefOr[`9`] = js.native
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
    def setCorsVarargs(value: MaxAgeSeconds*): Self = this.set("cors", js.Array(value :_*))
    @scala.inline
    def setCors(value: js.Array[MaxAgeSeconds]): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setDefaultObjectAclVarargs(value: SchemaObjectAccessControl*): Self = this.set("defaultObjectAcl", js.Array(value :_*))
    @scala.inline
    def setDefaultObjectAcl(value: js.Array[SchemaObjectAccessControl]): Self = this.set("defaultObjectAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultObjectAcl: Self = this.set("defaultObjectAcl", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLifecycle(value: `11`): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycle: Self = this.set("lifecycle", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLogging(value: LogBucket): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setMetageneration(value: String): Self = this.set("metageneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetageneration: Self = this.set("metageneration", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: Entity): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStorageClass(value: String): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    @scala.inline
    def setVersioning(value: `9`): Self = this.set("versioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersioning: Self = this.set("versioning", js.undefined)
    @scala.inline
    def setWebsite(value: MainPageSuffix): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
  
}


package typings.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object.
  */
@js.native
trait SchemaObject extends js.Object {
  /**
    * Access controls on the object.
    */
  var acl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.native
  /**
    * The bucket containing this object.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * Cache-Control directive for the object data.
    */
  var cacheControl: js.UndefOr[String] = js.native
  /**
    * Number of underlying components that make up this object. Components are
    * accumulated by compose operations and are limited to a count of 32.
    */
  var componentCount: js.UndefOr[Double] = js.native
  /**
    * Content-Disposition of the object data.
    */
  var contentDisposition: js.UndefOr[String] = js.native
  /**
    * Content-Encoding of the object data.
    */
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * Content-Language of the object data.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * Content-Type of the object data.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using
    * base64.
    */
  var crc32c: js.UndefOr[String] = js.native
  /**
    * HTTP 1.1 Entity tag for the object.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The content generation of this object. Used for object versioning.
    */
  var generation: js.UndefOr[String] = js.native
  /**
    * The ID of the object.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For objects, this is always storage#object.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * MD5 hash of the data; encoded using base64.
    */
  var md5Hash: js.UndefOr[String] = js.native
  /**
    * Media download link.
    */
  var mediaLink: js.UndefOr[String] = js.native
  /**
    * User-provided metadata, in key/value pairs.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The generation of the metadata for this object at this generation. Used
    * for metadata versioning. Has no meaning outside of the context of this
    * generation.
    */
  var metageneration: js.UndefOr[String] = js.native
  /**
    * The name of this object. Required if not specified by URL parameter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The owner of the object. This will always be the uploader of the object.
    */
  var owner: js.UndefOr[Entity] = js.native
  /**
    * The link to this object.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Content-Length of the data in bytes.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * Storage class of the object.
    */
  var storageClass: js.UndefOr[String] = js.native
  /**
    * Deletion time of the object in RFC 3339 format. Will be returned if and
    * only if this version of the object has been deleted.
    */
  var timeDeleted: js.UndefOr[String] = js.native
  /**
    * Modification time of the object metadata in RFC 3339 format.
    */
  var updated: js.UndefOr[String] = js.native
}

object SchemaObject {
  @scala.inline
  def apply(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
  @scala.inline
  implicit class SchemaObjectOps[Self <: SchemaObject] (val x: Self) extends AnyVal {
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
    def setAclVarargs(value: SchemaObjectAccessControl*): Self = this.set("acl", js.Array(value :_*))
    @scala.inline
    def setAcl(value: js.Array[SchemaObjectAccessControl]): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setCacheControl(value: String): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    @scala.inline
    def setComponentCount(value: Double): Self = this.set("componentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentCount: Self = this.set("componentCount", js.undefined)
    @scala.inline
    def setContentDisposition(value: String): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDisposition: Self = this.set("contentDisposition", js.undefined)
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setCrc32c(value: String): Self = this.set("crc32c", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrc32c: Self = this.set("crc32c", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMd5Hash(value: String): Self = this.set("md5Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5Hash: Self = this.set("md5Hash", js.undefined)
    @scala.inline
    def setMediaLink(value: String): Self = this.set("mediaLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaLink: Self = this.set("mediaLink", js.undefined)
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
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
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStorageClass(value: String): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
    @scala.inline
    def setTimeDeleted(value: String): Self = this.set("timeDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeDeleted: Self = this.set("timeDeleted", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}


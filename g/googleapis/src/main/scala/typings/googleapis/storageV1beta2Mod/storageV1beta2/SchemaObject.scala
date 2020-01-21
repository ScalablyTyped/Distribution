package typings.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.AnonEntity
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
  var owner: js.UndefOr[AnonEntity] = js.native
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
  def apply(
    acl: js.Array[SchemaObjectAccessControl] = null,
    bucket: String = null,
    cacheControl: String = null,
    componentCount: Int | Double = null,
    contentDisposition: String = null,
    contentEncoding: String = null,
    contentLanguage: String = null,
    contentType: String = null,
    crc32c: String = null,
    etag: String = null,
    generation: String = null,
    id: String = null,
    kind: String = null,
    md5Hash: String = null,
    mediaLink: String = null,
    metadata: StringDictionary[String] = null,
    metageneration: String = null,
    name: String = null,
    owner: AnonEntity = null,
    selfLink: String = null,
    size: String = null,
    storageClass: String = null,
    timeDeleted: String = null,
    updated: String = null
  ): SchemaObject = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (componentCount != null) __obj.updateDynamic("componentCount")(componentCount.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (crc32c != null) __obj.updateDynamic("crc32c")(crc32c.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash.asInstanceOf[js.Any])
    if (mediaLink != null) __obj.updateDynamic("mediaLink")(mediaLink.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (metageneration != null) __obj.updateDynamic("metageneration")(metageneration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (timeDeleted != null) __obj.updateDynamic("timeDeleted")(timeDeleted.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObject]
  }
}


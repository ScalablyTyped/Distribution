package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.AnonEncryptionAlgorithm
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
    * The name of the bucket containing this object.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * Cache-Control directive for the object data. If omitted, and the object
    * is accessible to all anonymous users, the default will be public,
    * max-age=3600.
    */
  var cacheControl: js.UndefOr[String] = js.native
  /**
    * Number of underlying components that make up this object. Components are
    * accumulated by compose operations.
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
    * Content-Type of the object data. If an object is stored without a
    * Content-Type, it is served as application/octet-stream.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using
    * base64 in big-endian byte order. For more information about using the
    * CRC32c checksum, see Hashes and ETags: Best Practices.
    */
  var crc32c: js.UndefOr[String] = js.native
  /**
    * Metadata of customer-supplied encryption key, if the object is encrypted
    * by such a key.
    */
  var customerEncryption: js.UndefOr[AnonEncryptionAlgorithm] = js.native
  /**
    * HTTP 1.1 Entity tag for the object.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Whether an object is under event-based hold. Event-based hold is a way to
    * retain objects until an event occurs, which is signified by the
    * hold&#39;s release (i.e. this value is set to false). After being
    * released (set to false), such objects will be subject to bucket-level
    * retention (if any). One sample use case of this flag is for banks to hold
    * loan documents for at least 3 years after loan is paid in full. Here,
    * bucket-level retention is 3 years and the event is the loan being paid in
    * full. In this example, these objects will be held intact for any number
    * of years until the event has occurred (event-based hold on the object is
    * released) and then 3 more years after that. That means retention duration
    * of the objects begins from the moment event-based hold transitioned from
    * true to false.
    */
  var eventBasedHold: js.UndefOr[Boolean] = js.native
  /**
    * The content generation of this object. Used for object versioning.
    */
  var generation: js.UndefOr[String] = js.native
  /**
    * The ID of the object, including the bucket name, object name, and
    * generation number.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For objects, this is always storage#object.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Cloud KMS Key used to encrypt this object, if the object is encrypted by
    * such a key.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
  /**
    * MD5 hash of the data; encoded using base64. For more information about
    * using the MD5 hash, see Hashes and ETags: Best Practices.
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
    * The version of the metadata for this object at this generation. Used for
    * preconditions and for detecting changes in metadata. A metageneration
    * number is only meaningful in the context of a particular generation of a
    * particular object.
    */
  var metageneration: js.UndefOr[String] = js.native
  /**
    * The name of the object. Required if not specified by URL parameter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The owner of the object. This will always be the uploader of the object.
    */
  var owner: js.UndefOr[AnonEntity] = js.native
  /**
    * A server-determined value that specifies the earliest time that the
    * object&#39;s retention period expires. This value is in RFC 3339 format.
    * Note 1: This field is not provided for objects with an active event-based
    * hold, since retention expiration is unknown until the hold is removed.
    * Note 2: This value can be provided even when temporary hold is set (so
    * that the user can reason about policy without having to first unset the
    * temporary hold).
    */
  var retentionExpirationTime: js.UndefOr[String] = js.native
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
    * Whether an object is under temporary hold. While this flag is set to
    * true, the object is protected against deletion and overwrites. A common
    * use case of this flag is regulatory investigations where objects need to
    * be retained while the investigation is ongoing. Note that unlike
    * event-based hold, temporary hold does not impact retention expiration
    * time of an object.
    */
  var temporaryHold: js.UndefOr[Boolean] = js.native
  /**
    * The creation time of the object in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String] = js.native
  /**
    * The deletion time of the object in RFC 3339 format. Will be returned if
    * and only if this version of the object has been deleted.
    */
  var timeDeleted: js.UndefOr[String] = js.native
  /**
    * The time at which the object&#39;s storage class was last changed. When
    * the object is initially created, it will be set to timeCreated.
    */
  var timeStorageClassUpdated: js.UndefOr[String] = js.native
  /**
    * The modification time of the object metadata in RFC 3339 format.
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
    customerEncryption: AnonEncryptionAlgorithm = null,
    etag: String = null,
    eventBasedHold: js.UndefOr[Boolean] = js.undefined,
    generation: String = null,
    id: String = null,
    kind: String = null,
    kmsKeyName: String = null,
    md5Hash: String = null,
    mediaLink: String = null,
    metadata: StringDictionary[String] = null,
    metageneration: String = null,
    name: String = null,
    owner: AnonEntity = null,
    retentionExpirationTime: String = null,
    selfLink: String = null,
    size: String = null,
    storageClass: String = null,
    temporaryHold: js.UndefOr[Boolean] = js.undefined,
    timeCreated: String = null,
    timeDeleted: String = null,
    timeStorageClassUpdated: String = null,
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
    if (customerEncryption != null) __obj.updateDynamic("customerEncryption")(customerEncryption.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(eventBasedHold)) __obj.updateDynamic("eventBasedHold")(eventBasedHold.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash.asInstanceOf[js.Any])
    if (mediaLink != null) __obj.updateDynamic("mediaLink")(mediaLink.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (metageneration != null) __obj.updateDynamic("metageneration")(metageneration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (retentionExpirationTime != null) __obj.updateDynamic("retentionExpirationTime")(retentionExpirationTime.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(temporaryHold)) __obj.updateDynamic("temporaryHold")(temporaryHold.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (timeDeleted != null) __obj.updateDynamic("timeDeleted")(timeDeleted.asInstanceOf[js.Any])
    if (timeStorageClassUpdated != null) __obj.updateDynamic("timeStorageClassUpdated")(timeStorageClassUpdated.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObject]
  }
}


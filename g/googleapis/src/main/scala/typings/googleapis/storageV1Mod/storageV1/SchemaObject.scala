package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.EncryptionAlgorithm
import typings.googleapis.anon.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object.
  */
trait SchemaObject extends StObject {
  
  /**
    * Access controls on the object.
    */
  var acl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.undefined
  
  /**
    * The name of the bucket containing this object.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * Cache-Control directive for the object data. If omitted, and the object
    * is accessible to all anonymous users, the default will be public,
    * max-age=3600.
    */
  var cacheControl: js.UndefOr[String] = js.undefined
  
  /**
    * Number of underlying components that make up this object. Components are
    * accumulated by compose operations.
    */
  var componentCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Content-Disposition of the object data.
    */
  var contentDisposition: js.UndefOr[String] = js.undefined
  
  /**
    * Content-Encoding of the object data.
    */
  var contentEncoding: js.UndefOr[String] = js.undefined
  
  /**
    * Content-Language of the object data.
    */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Content-Type of the object data. If an object is stored without a
    * Content-Type, it is served as application/octet-stream.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using
    * base64 in big-endian byte order. For more information about using the
    * CRC32c checksum, see Hashes and ETags: Best Practices.
    */
  var crc32c: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata of customer-supplied encryption key, if the object is encrypted
    * by such a key.
    */
  var customerEncryption: js.UndefOr[EncryptionAlgorithm] = js.undefined
  
  /**
    * HTTP 1.1 Entity tag for the object.
    */
  var etag: js.UndefOr[String] = js.undefined
  
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
  var eventBasedHold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content generation of this object. Used for object versioning.
    */
  var generation: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the object, including the bucket name, object name, and
    * generation number.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of item this is. For objects, this is always storage#object.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud KMS Key used to encrypt this object, if the object is encrypted by
    * such a key.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * MD5 hash of the data; encoded using base64. For more information about
    * using the MD5 hash, see Hashes and ETags: Best Practices.
    */
  var md5Hash: js.UndefOr[String] = js.undefined
  
  /**
    * Media download link.
    */
  var mediaLink: js.UndefOr[String] = js.undefined
  
  /**
    * User-provided metadata, in key/value pairs.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The version of the metadata for this object at this generation. Used for
    * preconditions and for detecting changes in metadata. A metageneration
    * number is only meaningful in the context of a particular generation of a
    * particular object.
    */
  var metageneration: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the object. Required if not specified by URL parameter.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The owner of the object. This will always be the uploader of the object.
    */
  var owner: js.UndefOr[Entity] = js.undefined
  
  /**
    * A server-determined value that specifies the earliest time that the
    * object&#39;s retention period expires. This value is in RFC 3339 format.
    * Note 1: This field is not provided for objects with an active event-based
    * hold, since retention expiration is unknown until the hold is removed.
    * Note 2: This value can be provided even when temporary hold is set (so
    * that the user can reason about policy without having to first unset the
    * temporary hold).
    */
  var retentionExpirationTime: js.UndefOr[String] = js.undefined
  
  /**
    * The link to this object.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Content-Length of the data in bytes.
    */
  var size: js.UndefOr[String] = js.undefined
  
  /**
    * Storage class of the object.
    */
  var storageClass: js.UndefOr[String] = js.undefined
  
  /**
    * Whether an object is under temporary hold. While this flag is set to
    * true, the object is protected against deletion and overwrites. A common
    * use case of this flag is regulatory investigations where objects need to
    * be retained while the investigation is ongoing. Note that unlike
    * event-based hold, temporary hold does not impact retention expiration
    * time of an object.
    */
  var temporaryHold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The creation time of the object in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String] = js.undefined
  
  /**
    * The deletion time of the object in RFC 3339 format. Will be returned if
    * and only if this version of the object has been deleted.
    */
  var timeDeleted: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the object&#39;s storage class was last changed. When
    * the object is initially created, it will be set to timeCreated.
    */
  var timeStorageClassUpdated: js.UndefOr[String] = js.undefined
  
  /**
    * The modification time of the object metadata in RFC 3339 format.
    */
  var updated: js.UndefOr[String] = js.undefined
}
object SchemaObject {
  
  @scala.inline
  def apply(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
  
  @scala.inline
  implicit class SchemaObjectMutableBuilder[Self <: SchemaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: js.Array[SchemaObjectAccessControl]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def setAclVarargs(value: SchemaObjectAccessControl*): Self = StObject.set(x, "acl", js.Array(value :_*))
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    @scala.inline
    def setComponentCount(value: Double): Self = StObject.set(x, "componentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentCountUndefined: Self = StObject.set(x, "componentCount", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setCrc32c(value: String): Self = StObject.set(x, "crc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrc32cUndefined: Self = StObject.set(x, "crc32c", js.undefined)
    
    @scala.inline
    def setCustomerEncryption(value: EncryptionAlgorithm): Self = StObject.set(x, "customerEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerEncryptionUndefined: Self = StObject.set(x, "customerEncryption", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setEventBasedHold(value: Boolean): Self = StObject.set(x, "eventBasedHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBasedHoldUndefined: Self = StObject.set(x, "eventBasedHold", js.undefined)
    
    @scala.inline
    def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    @scala.inline
    def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    @scala.inline
    def setMediaLink(value: String): Self = StObject.set(x, "mediaLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaLinkUndefined: Self = StObject.set(x, "mediaLink", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetagenerationUndefined: Self = StObject.set(x, "metageneration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: Entity): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRetentionExpirationTime(value: String): Self = StObject.set(x, "retentionExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionExpirationTimeUndefined: Self = StObject.set(x, "retentionExpirationTime", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    @scala.inline
    def setTemporaryHold(value: Boolean): Self = StObject.set(x, "temporaryHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporaryHoldUndefined: Self = StObject.set(x, "temporaryHold", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    @scala.inline
    def setTimeDeleted(value: String): Self = StObject.set(x, "timeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDeletedUndefined: Self = StObject.set(x, "timeDeleted", js.undefined)
    
    @scala.inline
    def setTimeStorageClassUpdated(value: String): Self = StObject.set(x, "timeStorageClassUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStorageClassUpdatedUndefined: Self = StObject.set(x, "timeStorageClassUpdated", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}

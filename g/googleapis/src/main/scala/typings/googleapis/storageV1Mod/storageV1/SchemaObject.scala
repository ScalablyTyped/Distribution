package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.EncryptionAlgorithm
import typings.googleapis.anon.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObject extends StObject {
  
  /**
    * Access controls on the object.
    */
  var acl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.undefined
  
  /**
    * The name of the bucket containing this object.
    */
  var bucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600.
    */
  var cacheControl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of underlying components that make up this object. Components are accumulated by compose operations.
    */
  var componentCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Content-Disposition of the object data.
    */
  var contentDisposition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Content-Encoding of the object data.
    */
  var contentEncoding: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Content-Language of the object data.
    */
  var contentLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream.
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c checksum, see Hashes and ETags: Best Practices.
    */
  var crc32c: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A timestamp in RFC 3339 format specified by the user for an object.
    */
  var customTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
    */
  var customerEncryption: js.UndefOr[EncryptionAlgorithm | Null] = js.undefined
  
  /**
    * HTTP 1.1 Entity tag for the object.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is signified by the hold's release (i.e. this value is set to false). After being released (set to false), such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false.
    */
  var eventBasedHold: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The content generation of this object. Used for object versioning.
    */
  var generation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the object, including the bucket name, object name, and generation number.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of item this is. For objects, this is always storage#object.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Not currently supported. Specifying the parameter causes the request to fail with status code 400 - Bad Request.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices.
    */
  var md5Hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Media download link.
    */
  var mediaLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-provided metadata, in key/value pairs.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number is only meaningful in the context of a particular generation of a particular object.
    */
  var metageneration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the object. Required if not specified by URL parameter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The owner of the object. This will always be the uploader of the object.
    */
  var owner: js.UndefOr[Entity | Null] = js.undefined
  
  /**
    * A server-determined value that specifies the earliest time that the object's retention period expires. This value is in RFC 3339 format. Note 1: This field is not provided for objects with an active event-based hold, since retention expiration is unknown until the hold is removed. Note 2: This value can be provided even when temporary hold is set (so that the user can reason about policy without having to first unset the temporary hold).
    */
  var retentionExpirationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The link to this object.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Content-Length of the data in bytes.
    */
  var size: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Storage class of the object.
    */
  var storageClass: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and overwrites. A common use case of this flag is regulatory investigations where objects need to be retained while the investigation is ongoing. Note that unlike event-based hold, temporary hold does not impact retention expiration time of an object.
    */
  var temporaryHold: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The creation time of the object in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted.
    */
  var timeDeleted: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the object's storage class was last changed. When the object is initially created, it will be set to timeCreated.
    */
  var timeStorageClassUpdated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The modification time of the object metadata in RFC 3339 format. Set initially to object creation time and then updated whenever any metadata of the object changes. This includes changes made by a requester, such as modifying custom metadata, as well as changes made by Cloud Storage on behalf of a requester, such as changing the storage class based on an Object Lifecycle Configuration.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
}
object SchemaObject {
  
  inline def apply(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
  
  extension [Self <: SchemaObject](x: Self) {
    
    inline def setAcl(value: js.Array[SchemaObjectAccessControl]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setAclVarargs(value: SchemaObjectAccessControl*): Self = StObject.set(x, "acl", js.Array(value*))
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketNull: Self = StObject.set(x, "bucket", null)
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlNull: Self = StObject.set(x, "cacheControl", null)
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    inline def setComponentCount(value: Double): Self = StObject.set(x, "componentCount", value.asInstanceOf[js.Any])
    
    inline def setComponentCountNull: Self = StObject.set(x, "componentCount", null)
    
    inline def setComponentCountUndefined: Self = StObject.set(x, "componentCount", js.undefined)
    
    inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionNull: Self = StObject.set(x, "contentDisposition", null)
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingNull: Self = StObject.set(x, "contentEncoding", null)
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageNull: Self = StObject.set(x, "contentLanguage", null)
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCrc32c(value: String): Self = StObject.set(x, "crc32c", value.asInstanceOf[js.Any])
    
    inline def setCrc32cNull: Self = StObject.set(x, "crc32c", null)
    
    inline def setCrc32cUndefined: Self = StObject.set(x, "crc32c", js.undefined)
    
    inline def setCustomTime(value: String): Self = StObject.set(x, "customTime", value.asInstanceOf[js.Any])
    
    inline def setCustomTimeNull: Self = StObject.set(x, "customTime", null)
    
    inline def setCustomTimeUndefined: Self = StObject.set(x, "customTime", js.undefined)
    
    inline def setCustomerEncryption(value: EncryptionAlgorithm): Self = StObject.set(x, "customerEncryption", value.asInstanceOf[js.Any])
    
    inline def setCustomerEncryptionNull: Self = StObject.set(x, "customerEncryption", null)
    
    inline def setCustomerEncryptionUndefined: Self = StObject.set(x, "customerEncryption", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEventBasedHold(value: Boolean): Self = StObject.set(x, "eventBasedHold", value.asInstanceOf[js.Any])
    
    inline def setEventBasedHoldNull: Self = StObject.set(x, "eventBasedHold", null)
    
    inline def setEventBasedHoldUndefined: Self = StObject.set(x, "eventBasedHold", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationNull: Self = StObject.set(x, "generation", null)
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashNull: Self = StObject.set(x, "md5Hash", null)
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    inline def setMediaLink(value: String): Self = StObject.set(x, "mediaLink", value.asInstanceOf[js.Any])
    
    inline def setMediaLinkNull: Self = StObject.set(x, "mediaLink", null)
    
    inline def setMediaLinkUndefined: Self = StObject.set(x, "mediaLink", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
    
    inline def setMetagenerationNull: Self = StObject.set(x, "metageneration", null)
    
    inline def setMetagenerationUndefined: Self = StObject.set(x, "metageneration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: Entity): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRetentionExpirationTime(value: String): Self = StObject.set(x, "retentionExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setRetentionExpirationTimeNull: Self = StObject.set(x, "retentionExpirationTime", null)
    
    inline def setRetentionExpirationTimeUndefined: Self = StObject.set(x, "retentionExpirationTime", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassNull: Self = StObject.set(x, "storageClass", null)
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    inline def setTemporaryHold(value: Boolean): Self = StObject.set(x, "temporaryHold", value.asInstanceOf[js.Any])
    
    inline def setTemporaryHoldNull: Self = StObject.set(x, "temporaryHold", null)
    
    inline def setTemporaryHoldUndefined: Self = StObject.set(x, "temporaryHold", js.undefined)
    
    inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeCreatedNull: Self = StObject.set(x, "timeCreated", null)
    
    inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    inline def setTimeDeleted(value: String): Self = StObject.set(x, "timeDeleted", value.asInstanceOf[js.Any])
    
    inline def setTimeDeletedNull: Self = StObject.set(x, "timeDeleted", null)
    
    inline def setTimeDeletedUndefined: Self = StObject.set(x, "timeDeleted", js.undefined)
    
    inline def setTimeStorageClassUpdated(value: String): Self = StObject.set(x, "timeStorageClassUpdated", value.asInstanceOf[js.Any])
    
    inline def setTimeStorageClassUpdatedNull: Self = StObject.set(x, "timeStorageClassUpdated", null)
    
    inline def setTimeStorageClassUpdatedUndefined: Self = StObject.set(x, "timeStorageClassUpdated", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}

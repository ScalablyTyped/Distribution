package typings.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StringDictionary
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
    * The bucket containing this object.
    */
  var bucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cache-Control directive for the object data.
    */
  var cacheControl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of underlying components that make up this object. Components are accumulated by compose operations and are limited to a count of 32.
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
    * Content-Type of the object data.
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64.
    */
  var crc32c: js.UndefOr[String | Null] = js.undefined
  
  /**
    * HTTP 1.1 Entity tag for the object.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content generation of this object. Used for object versioning.
    */
  var generation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the object.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of item this is. For objects, this is always storage#object.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * MD5 hash of the data; encoded using base64.
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
    * The generation of the metadata for this object at this generation. Used for metadata versioning. Has no meaning outside of the context of this generation.
    */
  var metageneration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of this object. Required if not specified by URL parameter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The owner of the object. This will always be the uploader of the object.
    */
  var owner: js.UndefOr[Entity | Null] = js.undefined
  
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
    * Deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted.
    */
  var timeDeleted: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Modification time of the object metadata in RFC 3339 format.
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
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationNull: Self = StObject.set(x, "generation", null)
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
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
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassNull: Self = StObject.set(x, "storageClass", null)
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    inline def setTimeDeleted(value: String): Self = StObject.set(x, "timeDeleted", value.asInstanceOf[js.Any])
    
    inline def setTimeDeletedNull: Self = StObject.set(x, "timeDeleted", null)
    
    inline def setTimeDeletedUndefined: Self = StObject.set(x, "timeDeleted", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}

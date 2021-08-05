package typings.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StringDictionary
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
    * The bucket containing this object.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * Cache-Control directive for the object data.
    */
  var cacheControl: js.UndefOr[String] = js.undefined
  
  /**
    * Number of underlying components that make up this object. Components are
    * accumulated by compose operations and are limited to a count of 32.
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
    * Content-Type of the object data.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using
    * base64.
    */
  var crc32c: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP 1.1 Entity tag for the object.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The content generation of this object. Used for object versioning.
    */
  var generation: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the object.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of item this is. For objects, this is always storage#object.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * MD5 hash of the data; encoded using base64.
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
    * The generation of the metadata for this object at this generation. Used
    * for metadata versioning. Has no meaning outside of the context of this
    * generation.
    */
  var metageneration: js.UndefOr[String] = js.undefined
  
  /**
    * The name of this object. Required if not specified by URL parameter.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The owner of the object. This will always be the uploader of the object.
    */
  var owner: js.UndefOr[Entity] = js.undefined
  
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
    * Deletion time of the object in RFC 3339 format. Will be returned if and
    * only if this version of the object has been deleted.
    */
  var timeDeleted: js.UndefOr[String] = js.undefined
  
  /**
    * Modification time of the object metadata in RFC 3339 format.
    */
  var updated: js.UndefOr[String] = js.undefined
}
object SchemaObject {
  
  inline def apply(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
  
  extension [Self <: SchemaObject](x: Self) {
    
    inline def setAcl(value: js.Array[SchemaObjectAccessControl]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setAclVarargs(value: SchemaObjectAccessControl*): Self = StObject.set(x, "acl", js.Array(value :_*))
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    inline def setComponentCount(value: Double): Self = StObject.set(x, "componentCount", value.asInstanceOf[js.Any])
    
    inline def setComponentCountUndefined: Self = StObject.set(x, "componentCount", js.undefined)
    
    inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCrc32c(value: String): Self = StObject.set(x, "crc32c", value.asInstanceOf[js.Any])
    
    inline def setCrc32cUndefined: Self = StObject.set(x, "crc32c", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    inline def setMediaLink(value: String): Self = StObject.set(x, "mediaLink", value.asInstanceOf[js.Any])
    
    inline def setMediaLinkUndefined: Self = StObject.set(x, "mediaLink", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
    
    inline def setMetagenerationUndefined: Self = StObject.set(x, "metageneration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: Entity): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    inline def setTimeDeleted(value: String): Self = StObject.set(x, "timeDeleted", value.asInstanceOf[js.Any])
    
    inline def setTimeDeletedUndefined: Self = StObject.set(x, "timeDeleted", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}

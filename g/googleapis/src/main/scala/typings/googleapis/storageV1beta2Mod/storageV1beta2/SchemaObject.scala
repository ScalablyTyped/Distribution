package typings.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object.
  */
@js.native
trait SchemaObject extends StObject {
  
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
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
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
    def setTimeDeleted(value: String): Self = StObject.set(x, "timeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDeletedUndefined: Self = StObject.set(x, "timeDeleted", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}

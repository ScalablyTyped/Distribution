package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata for a revision to a file.
  */
trait SchemaRevision extends StObject {
  
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The ID of the revision.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to keep this revision forever, even if it is no longer the head
    * revision. If not set, the revision will be automatically purged 30 days
    * after newer content is uploaded. This can be set on a maximum of 200
    * revisions for a file. This field is only applicable to files with binary
    * content in Drive.
    */
  var keepForever: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#revision&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The last user to modify this revision.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The MD5 checksum of the revision&#39;s content. This is only applicable
    * to files with binary content in Drive.
    */
  var md5Checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The MIME type of the revision.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * The last time the revision was modified (RFC 3339 date-time).
    */
  var modifiedTime: js.UndefOr[String] = js.undefined
  
  /**
    * The original filename used to create this revision. This is only
    * applicable to files with binary content in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.undefined
  
  /**
    * Whether subsequent revisions will be automatically republished. This is
    * only applicable to Google Docs.
    */
  var publishAuto: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this revision is published. This is only applicable to Google
    * Docs.
    */
  var published: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this revision is published outside the domain. This is only
    * applicable to Google Docs.
    */
  var publishedOutsideDomain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the revision&#39;s content in bytes. This is only applicable
    * to files with binary content in Drive.
    */
  var size: js.UndefOr[String] = js.undefined
}
object SchemaRevision {
  
  inline def apply(): SchemaRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevision]
  }
  
  extension [Self <: SchemaRevision](x: Self) {
    
    inline def setExportLinks(value: StringDictionary[String]): Self = StObject.set(x, "exportLinks", value.asInstanceOf[js.Any])
    
    inline def setExportLinksUndefined: Self = StObject.set(x, "exportLinks", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeepForever(value: Boolean): Self = StObject.set(x, "keepForever", value.asInstanceOf[js.Any])
    
    inline def setKeepForeverUndefined: Self = StObject.set(x, "keepForever", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifyingUser(value: SchemaUser): Self = StObject.set(x, "lastModifyingUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifyingUserUndefined: Self = StObject.set(x, "lastModifyingUser", js.undefined)
    
    inline def setMd5Checksum(value: String): Self = StObject.set(x, "md5Checksum", value.asInstanceOf[js.Any])
    
    inline def setMd5ChecksumUndefined: Self = StObject.set(x, "md5Checksum", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setModifiedTime(value: String): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    
    inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
    
    inline def setOriginalFilenameUndefined: Self = StObject.set(x, "originalFilename", js.undefined)
    
    inline def setPublishAuto(value: Boolean): Self = StObject.set(x, "publishAuto", value.asInstanceOf[js.Any])
    
    inline def setPublishAutoUndefined: Self = StObject.set(x, "publishAuto", js.undefined)
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedOutsideDomain(value: Boolean): Self = StObject.set(x, "publishedOutsideDomain", value.asInstanceOf[js.Any])
    
    inline def setPublishedOutsideDomainUndefined: Self = StObject.set(x, "publishedOutsideDomain", js.undefined)
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

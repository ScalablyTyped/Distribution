package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRevision extends StObject {
  
  /**
    * Links for exporting Docs Editors files to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The ID of the revision.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to keep this revision forever, even if it is no longer the head revision. If not set, the revision will be automatically purged 30 days after newer content is uploaded. This can be set on a maximum of 200 revisions for a file.
    * This field is only applicable to files with binary content in Drive.
    */
  var keepForever: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "drive#revision".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last user to modify this revision.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The MD5 checksum of the revision's content. This is only applicable to files with binary content in Drive.
    */
  var md5Checksum: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The MIME type of the revision.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last time the revision was modified (RFC 3339 date-time).
    */
  var modifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The original filename used to create this revision. This is only applicable to files with binary content in Drive.
    */
  var originalFilename: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether subsequent revisions will be automatically republished. This is only applicable to Docs Editors files.
    */
  var publishAuto: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this revision is published. This is only applicable to Docs Editors files.
    */
  var published: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A link to the published revision. This is only populated for Google Sites files.
    */
  var publishedLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this revision is published outside the domain. This is only applicable to Docs Editors files.
    */
  var publishedOutsideDomain: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The size of the revision's content in bytes. This is only applicable to files with binary content in Drive.
    */
  var size: js.UndefOr[String | Null] = js.undefined
}
object SchemaRevision {
  
  inline def apply(): SchemaRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevision]
  }
  
  extension [Self <: SchemaRevision](x: Self) {
    
    inline def setExportLinks(value: StringDictionary[String]): Self = StObject.set(x, "exportLinks", value.asInstanceOf[js.Any])
    
    inline def setExportLinksNull: Self = StObject.set(x, "exportLinks", null)
    
    inline def setExportLinksUndefined: Self = StObject.set(x, "exportLinks", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeepForever(value: Boolean): Self = StObject.set(x, "keepForever", value.asInstanceOf[js.Any])
    
    inline def setKeepForeverNull: Self = StObject.set(x, "keepForever", null)
    
    inline def setKeepForeverUndefined: Self = StObject.set(x, "keepForever", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifyingUser(value: SchemaUser): Self = StObject.set(x, "lastModifyingUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifyingUserUndefined: Self = StObject.set(x, "lastModifyingUser", js.undefined)
    
    inline def setMd5Checksum(value: String): Self = StObject.set(x, "md5Checksum", value.asInstanceOf[js.Any])
    
    inline def setMd5ChecksumNull: Self = StObject.set(x, "md5Checksum", null)
    
    inline def setMd5ChecksumUndefined: Self = StObject.set(x, "md5Checksum", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setModifiedTime(value: String): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeNull: Self = StObject.set(x, "modifiedTime", null)
    
    inline def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    
    inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
    
    inline def setOriginalFilenameNull: Self = StObject.set(x, "originalFilename", null)
    
    inline def setOriginalFilenameUndefined: Self = StObject.set(x, "originalFilename", js.undefined)
    
    inline def setPublishAuto(value: Boolean): Self = StObject.set(x, "publishAuto", value.asInstanceOf[js.Any])
    
    inline def setPublishAutoNull: Self = StObject.set(x, "publishAuto", null)
    
    inline def setPublishAutoUndefined: Self = StObject.set(x, "publishAuto", js.undefined)
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedLink(value: String): Self = StObject.set(x, "publishedLink", value.asInstanceOf[js.Any])
    
    inline def setPublishedLinkNull: Self = StObject.set(x, "publishedLink", null)
    
    inline def setPublishedLinkUndefined: Self = StObject.set(x, "publishedLink", js.undefined)
    
    inline def setPublishedNull: Self = StObject.set(x, "published", null)
    
    inline def setPublishedOutsideDomain(value: Boolean): Self = StObject.set(x, "publishedOutsideDomain", value.asInstanceOf[js.Any])
    
    inline def setPublishedOutsideDomainNull: Self = StObject.set(x, "publishedOutsideDomain", null)
    
    inline def setPublishedOutsideDomainUndefined: Self = StObject.set(x, "publishedOutsideDomain", js.undefined)
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

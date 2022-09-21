package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRevision extends StObject {
  
  var downloadUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ETag of the revision.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Links for exporting Docs Editors files to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The size of the revision in bytes. This will only be populated on files with content stored in Drive.
    */
  var fileSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the revision.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always drive#revision.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last user to modify this revision.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Name of the last user to modify this revision.
    */
  var lastModifyingUserName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An MD5 checksum for the content of this revision. This will only be populated on files with content stored in Drive.
    */
  var md5Checksum: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The MIME type of the revision.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last time this revision was modified (formatted RFC 3339 timestamp).
    */
  var modifiedDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The original filename when this revision was created. This will only be populated on files with content stored in Drive.
    */
  var originalFilename: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this revision is pinned to prevent automatic purging. If not set, the revision is automatically purged 30 days after newer content is uploaded. This field can only be modified on files with content stored in Drive, excluding Docs Editors files. Revisions can also be pinned when they are created through the drive.files.insert/update/copy by using the pinned query parameter. Pinned revisions are stored indefinitely using additional storage quota, up to a maximum of 200 revisions.
    */
  var pinned: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether subsequent revisions will be automatically republished. This is only populated and can only be modified for Docs Editors files.
    */
  var publishAuto: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this revision is published. This is only populated and can only be modified for Docs Editors files.
    */
  var published: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A link to the published revision. This is only populated for Google Sites files.
    */
  var publishedLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this revision is published outside the domain. This is only populated and can only be modified for Docs Editors files.
    */
  var publishedOutsideDomain: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A link back to this revision.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaRevision {
  
  inline def apply(): SchemaRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevision]
  }
  
  extension [Self <: SchemaRevision](x: Self) {
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlNull: Self = StObject.set(x, "downloadUrl", null)
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExportLinks(value: StringDictionary[String]): Self = StObject.set(x, "exportLinks", value.asInstanceOf[js.Any])
    
    inline def setExportLinksNull: Self = StObject.set(x, "exportLinks", null)
    
    inline def setExportLinksUndefined: Self = StObject.set(x, "exportLinks", js.undefined)
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeNull: Self = StObject.set(x, "fileSize", null)
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifyingUser(value: SchemaUser): Self = StObject.set(x, "lastModifyingUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifyingUserName(value: String): Self = StObject.set(x, "lastModifyingUserName", value.asInstanceOf[js.Any])
    
    inline def setLastModifyingUserNameNull: Self = StObject.set(x, "lastModifyingUserName", null)
    
    inline def setLastModifyingUserNameUndefined: Self = StObject.set(x, "lastModifyingUserName", js.undefined)
    
    inline def setLastModifyingUserUndefined: Self = StObject.set(x, "lastModifyingUser", js.undefined)
    
    inline def setMd5Checksum(value: String): Self = StObject.set(x, "md5Checksum", value.asInstanceOf[js.Any])
    
    inline def setMd5ChecksumNull: Self = StObject.set(x, "md5Checksum", null)
    
    inline def setMd5ChecksumUndefined: Self = StObject.set(x, "md5Checksum", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateNull: Self = StObject.set(x, "modifiedDate", null)
    
    inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
    
    inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
    
    inline def setOriginalFilenameNull: Self = StObject.set(x, "originalFilename", null)
    
    inline def setOriginalFilenameUndefined: Self = StObject.set(x, "originalFilename", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedNull: Self = StObject.set(x, "pinned", null)
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
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
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}

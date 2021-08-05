package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A revision of a file.
  */
trait SchemaRevision extends StObject {
  
  /**
    * Short term download URL for the file. This will only be populated on
    * files with content stored in Drive.
    */
  var downloadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The ETag of the revision.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The size of the revision in bytes. This will only be populated on files
    * with content stored in Drive.
    */
  var fileSize: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the revision.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * This is always drive#revision.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The last user to modify this revision.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Name of the last user to modify this revision.
    */
  var lastModifyingUserName: js.UndefOr[String] = js.undefined
  
  /**
    * An MD5 checksum for the content of this revision. This will only be
    * populated on files with content stored in Drive.
    */
  var md5Checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The MIME type of the revision.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Last time this revision was modified (formatted RFC 3339 timestamp).
    */
  var modifiedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The original filename when this revision was created. This will only be
    * populated on files with content stored in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this revision is pinned to prevent automatic purging. This will
    * only be populated and can only be modified on files with content stored
    * in Drive which are not Google Docs. Revisions can also be pinned when
    * they are created through the drive.files.insert/update/copy by using the
    * pinned query parameter.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether subsequent revisions will be automatically republished. This is
    * only populated and can only be modified for Google Docs.
    */
  var publishAuto: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this revision is published. This is only populated and can only
    * be modified for Google Docs.
    */
  var published: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A link to the published revision.
    */
  var publishedLink: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this revision is published outside the domain. This is only
    * populated and can only be modified for Google Docs.
    */
  var publishedOutsideDomain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A link back to this revision.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaRevision {
  
  inline def apply(): SchemaRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevision]
  }
  
  extension [Self <: SchemaRevision](x: Self) {
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExportLinks(value: StringDictionary[String]): Self = StObject.set(x, "exportLinks", value.asInstanceOf[js.Any])
    
    inline def setExportLinksUndefined: Self = StObject.set(x, "exportLinks", js.undefined)
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifyingUser(value: SchemaUser): Self = StObject.set(x, "lastModifyingUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifyingUserName(value: String): Self = StObject.set(x, "lastModifyingUserName", value.asInstanceOf[js.Any])
    
    inline def setLastModifyingUserNameUndefined: Self = StObject.set(x, "lastModifyingUserName", js.undefined)
    
    inline def setLastModifyingUserUndefined: Self = StObject.set(x, "lastModifyingUser", js.undefined)
    
    inline def setMd5Checksum(value: String): Self = StObject.set(x, "md5Checksum", value.asInstanceOf[js.Any])
    
    inline def setMd5ChecksumUndefined: Self = StObject.set(x, "md5Checksum", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
    
    inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
    
    inline def setOriginalFilenameUndefined: Self = StObject.set(x, "originalFilename", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setPublishAuto(value: Boolean): Self = StObject.set(x, "publishAuto", value.asInstanceOf[js.Any])
    
    inline def setPublishAutoUndefined: Self = StObject.set(x, "publishAuto", js.undefined)
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedLink(value: String): Self = StObject.set(x, "publishedLink", value.asInstanceOf[js.Any])
    
    inline def setPublishedLinkUndefined: Self = StObject.set(x, "publishedLink", js.undefined)
    
    inline def setPublishedOutsideDomain(value: Boolean): Self = StObject.set(x, "publishedOutsideDomain", value.asInstanceOf[js.Any])
    
    inline def setPublishedOutsideDomainUndefined: Self = StObject.set(x, "publishedOutsideDomain", js.undefined)
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}

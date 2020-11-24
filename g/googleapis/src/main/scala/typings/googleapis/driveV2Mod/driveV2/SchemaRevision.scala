package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A revision of a file.
  */
@js.native
trait SchemaRevision extends js.Object {
  
  /**
    * Short term download URL for the file. This will only be populated on
    * files with content stored in Drive.
    */
  var downloadUrl: js.UndefOr[String] = js.native
  
  /**
    * The ETag of the revision.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The size of the revision in bytes. This will only be populated on files
    * with content stored in Drive.
    */
  var fileSize: js.UndefOr[String] = js.native
  
  /**
    * The ID of the revision.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * This is always drive#revision.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The last user to modify this revision.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.native
  
  /**
    * Name of the last user to modify this revision.
    */
  var lastModifyingUserName: js.UndefOr[String] = js.native
  
  /**
    * An MD5 checksum for the content of this revision. This will only be
    * populated on files with content stored in Drive.
    */
  var md5Checksum: js.UndefOr[String] = js.native
  
  /**
    * The MIME type of the revision.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Last time this revision was modified (formatted RFC 3339 timestamp).
    */
  var modifiedDate: js.UndefOr[String] = js.native
  
  /**
    * The original filename when this revision was created. This will only be
    * populated on files with content stored in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.native
  
  /**
    * Whether this revision is pinned to prevent automatic purging. This will
    * only be populated and can only be modified on files with content stored
    * in Drive which are not Google Docs. Revisions can also be pinned when
    * they are created through the drive.files.insert/update/copy by using the
    * pinned query parameter.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether subsequent revisions will be automatically republished. This is
    * only populated and can only be modified for Google Docs.
    */
  var publishAuto: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this revision is published. This is only populated and can only
    * be modified for Google Docs.
    */
  var published: js.UndefOr[Boolean] = js.native
  
  /**
    * A link to the published revision.
    */
  var publishedLink: js.UndefOr[String] = js.native
  
  /**
    * Whether this revision is published outside the domain. This is only
    * populated and can only be modified for Google Docs.
    */
  var publishedOutsideDomain: js.UndefOr[Boolean] = js.native
  
  /**
    * A link back to this revision.
    */
  var selfLink: js.UndefOr[String] = js.native
}
object SchemaRevision {
  
  @scala.inline
  def apply(): SchemaRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevision]
  }
  
  @scala.inline
  implicit class SchemaRevisionOps[Self <: SchemaRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExportLinks(value: StringDictionary[String]): Self = this.set("exportLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportLinks: Self = this.set("exportLinks", js.undefined)
    
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifyingUser(value: SchemaUser): Self = this.set("lastModifyingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifyingUser: Self = this.set("lastModifyingUser", js.undefined)
    
    @scala.inline
    def setLastModifyingUserName(value: String): Self = this.set("lastModifyingUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifyingUserName: Self = this.set("lastModifyingUserName", js.undefined)
    
    @scala.inline
    def setMd5Checksum(value: String): Self = this.set("md5Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Checksum: Self = this.set("md5Checksum", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    
    @scala.inline
    def setOriginalFilename(value: String): Self = this.set("originalFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalFilename: Self = this.set("originalFilename", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    
    @scala.inline
    def setPublishAuto(value: Boolean): Self = this.set("publishAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishAuto: Self = this.set("publishAuto", js.undefined)
    
    @scala.inline
    def setPublished(value: Boolean): Self = this.set("published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    
    @scala.inline
    def setPublishedLink(value: String): Self = this.set("publishedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedLink: Self = this.set("publishedLink", js.undefined)
    
    @scala.inline
    def setPublishedOutsideDomain(value: Boolean): Self = this.set("publishedOutsideDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedOutsideDomain: Self = this.set("publishedOutsideDomain", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}

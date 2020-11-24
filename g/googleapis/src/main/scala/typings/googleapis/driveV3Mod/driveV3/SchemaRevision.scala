package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata for a revision to a file.
  */
@js.native
trait SchemaRevision extends js.Object {
  
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The ID of the revision.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether to keep this revision forever, even if it is no longer the head
    * revision. If not set, the revision will be automatically purged 30 days
    * after newer content is uploaded. This can be set on a maximum of 200
    * revisions for a file. This field is only applicable to files with binary
    * content in Drive.
    */
  var keepForever: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#revision&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The last user to modify this revision.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.native
  
  /**
    * The MD5 checksum of the revision&#39;s content. This is only applicable
    * to files with binary content in Drive.
    */
  var md5Checksum: js.UndefOr[String] = js.native
  
  /**
    * The MIME type of the revision.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * The last time the revision was modified (RFC 3339 date-time).
    */
  var modifiedTime: js.UndefOr[String] = js.native
  
  /**
    * The original filename used to create this revision. This is only
    * applicable to files with binary content in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.native
  
  /**
    * Whether subsequent revisions will be automatically republished. This is
    * only applicable to Google Docs.
    */
  var publishAuto: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this revision is published. This is only applicable to Google
    * Docs.
    */
  var published: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this revision is published outside the domain. This is only
    * applicable to Google Docs.
    */
  var publishedOutsideDomain: js.UndefOr[Boolean] = js.native
  
  /**
    * The size of the revision&#39;s content in bytes. This is only applicable
    * to files with binary content in Drive.
    */
  var size: js.UndefOr[String] = js.native
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
    def setExportLinks(value: StringDictionary[String]): Self = this.set("exportLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportLinks: Self = this.set("exportLinks", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKeepForever(value: Boolean): Self = this.set("keepForever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepForever: Self = this.set("keepForever", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifyingUser(value: SchemaUser): Self = this.set("lastModifyingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifyingUser: Self = this.set("lastModifyingUser", js.undefined)
    
    @scala.inline
    def setMd5Checksum(value: String): Self = this.set("md5Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Checksum: Self = this.set("md5Checksum", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setModifiedTime(value: String): Self = this.set("modifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTime: Self = this.set("modifiedTime", js.undefined)
    
    @scala.inline
    def setOriginalFilename(value: String): Self = this.set("originalFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalFilename: Self = this.set("originalFilename", js.undefined)
    
    @scala.inline
    def setPublishAuto(value: Boolean): Self = this.set("publishAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishAuto: Self = this.set("publishAuto", js.undefined)
    
    @scala.inline
    def setPublished(value: Boolean): Self = this.set("published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    
    @scala.inline
    def setPublishedOutsideDomain(value: Boolean): Self = this.set("publishedOutsideDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedOutsideDomain: Self = this.set("publishedOutsideDomain", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}

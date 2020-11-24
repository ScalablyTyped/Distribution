package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.Aperture
import typings.googleapis.anon.CanAddChildren
import typings.googleapis.anon.DurationMillis
import typings.googleapis.anon.Hidden
import typings.googleapis.anon.MimeType
import typings.googleapis.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata for a file.
  */
@js.native
trait SchemaFile extends js.Object {
  
  /**
    * A link for opening the file in a relevant Google editor or viewer.
    */
  var alternateLink: js.UndefOr[String] = js.native
  
  /**
    * Whether this file is in the Application Data folder.
    */
  var appDataContents: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated: use capabilities/canComment.
    */
  var canComment: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated: use capabilities/canReadRevisions.
    */
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  
  /**
    * Capabilities the current user has on this file. Each capability
    * corresponds to a fine-grained action that a user may take.
    */
  var capabilities: js.UndefOr[CanAddChildren] = js.native
  
  /**
    * Whether the options to copy, print, or download this file, should be
    * disabled for readers and commenters.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated: use capabilities/canCopy.
    */
  var copyable: js.UndefOr[Boolean] = js.native
  
  /**
    * Create time for this file (formatted RFC 3339 timestamp).
    */
  var createdDate: js.UndefOr[String] = js.native
  
  /**
    * A link to open this file with the user&#39;s default app for this file.
    * Only populated when the drive.apps.readonly scope is used.
    */
  var defaultOpenWithLink: js.UndefOr[String] = js.native
  
  /**
    * A short description of the file.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Short lived download URL for the file. This field is only populated for
    * files with content stored in Drive; it is not populated for Google Docs
    * or shortcut files.
    */
  var downloadUrl: js.UndefOr[String] = js.native
  
  /**
    * Deprecated: use capabilities/canEdit.
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * A link for embedding the file.
    */
  var embedLink: js.UndefOr[String] = js.native
  
  /**
    * ETag of the file.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Whether this file has been explicitly trashed, as opposed to recursively
    * trashed.
    */
  var explicitlyTrashed: js.UndefOr[Boolean] = js.native
  
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The final component of fullFileExtension with trailing text that does not
    * appear to be part of the extension removed. This field is only populated
    * for files with content stored in Drive; it is not populated for Google
    * Docs or shortcut files.
    */
  var fileExtension: js.UndefOr[String] = js.native
  
  /**
    * The size of the file in bytes. This field is only populated for files
    * with content stored in Drive; it is not populated for Google Docs or
    * shortcut files.
    */
  var fileSize: js.UndefOr[String] = js.native
  
  /**
    * Folder color as an RGB hex string if the file is a folder. The list of
    * supported colors is available in the folderColorPalette field of the
    * About resource. If an unsupported color is specified, it will be changed
    * to the closest color in the palette. Not populated for Team Drive files.
    */
  var folderColorRgb: js.UndefOr[String] = js.native
  
  /**
    * The full file extension; extracted from the title. May contain multiple
    * concatenated extensions, such as &quot;tar.gz&quot;. Removing an
    * extension from the title does not clear this field; however, changing the
    * extension on the title does update this field. This field is only
    * populated for files with content stored in Drive; it is not populated for
    * Google Docs or shortcut files.
    */
  var fullFileExtension: js.UndefOr[String] = js.native
  
  /**
    * Whether any users are granted file access directly on this file. This
    * field is only populated for Team Drive files.
    */
  var hasAugmentedPermissions: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this file has a thumbnail. This does not indicate whether the
    * requesting app has access to the thumbnail. To check access, look for the
    * presence of the thumbnailLink field.
    */
  var hasThumbnail: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the file&#39;s head revision. This field is only populated for
    * files with content stored in Drive; it is not populated for Google Docs
    * or shortcut files.
    */
  var headRevisionId: js.UndefOr[String] = js.native
  
  /**
    * A link to the file&#39;s icon.
    */
  var iconLink: js.UndefOr[String] = js.native
  
  /**
    * The ID of the file.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Metadata about image media. This will only be present for image types,
    * and its contents will depend on what can be parsed from the image
    * content.
    */
  var imageMediaMetadata: js.UndefOr[Aperture] = js.native
  
  /**
    * Indexable text attributes for the file (can only be written)
    */
  var indexableText: js.UndefOr[Text] = js.native
  
  /**
    * Whether the file was created or opened by the requesting app.
    */
  var isAppAuthorized: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of file. This is always drive#file.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A group of labels for the file.
    */
  var labels: js.UndefOr[Hidden] = js.native
  
  /**
    * The last user to modify this file.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.native
  
  /**
    * Name of the last user to modify this file.
    */
  var lastModifyingUserName: js.UndefOr[String] = js.native
  
  /**
    * Last time this file was viewed by the user (formatted RFC 3339
    * timestamp).
    */
  var lastViewedByMeDate: js.UndefOr[String] = js.native
  
  /**
    * Deprecated.
    */
  var markedViewedByMeDate: js.UndefOr[String] = js.native
  
  /**
    * An MD5 checksum for the content of this file. This field is only
    * populated for files with content stored in Drive; it is not populated for
    * Google Docs or shortcut files.
    */
  var md5Checksum: js.UndefOr[String] = js.native
  
  /**
    * The MIME type of the file. This is only mutable on update when uploading
    * new content. This field can be left blank, and the mimetype will be
    * determined from the uploaded content&#39;s MIME type.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Last time this file was modified by the user (formatted RFC 3339
    * timestamp). Note that setting modifiedDate will also update the
    * modifiedByMe date for the user which set the date.
    */
  var modifiedByMeDate: js.UndefOr[String] = js.native
  
  /**
    * Last time this file was modified by anyone (formatted RFC 3339
    * timestamp). This is only mutable on update when the setModifiedDate
    * parameter is set.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  
  /**
    * A map of the id of each of the user&#39;s apps to a link to open this
    * file with that app. Only populated when the drive.apps.readonly scope is
    * used.
    */
  var openWithLinks: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The original filename of the uploaded content if available, or else the
    * original value of the title field. This is only available for files with
    * binary content in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.native
  
  /**
    * Whether the file is owned by the current user. Not populated for Team
    * Drive files.
    */
  var ownedByMe: js.UndefOr[Boolean] = js.native
  
  /**
    * Name(s) of the owner(s) of this file. Not populated for Team Drive files.
    */
  var ownerNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The owner(s) of this file. Not populated for Team Drive files.
    */
  var owners: js.UndefOr[js.Array[SchemaUser]] = js.native
  
  /**
    * Collection of parent folders which contain this file. If not specified as
    * part of an insert request, the file will be placed directly in the
    * user&#39;s My Drive folder. If not specified as part of a copy request,
    * the file will inherit any discoverable parents of the source file. Update
    * requests can also use the addParents and removeParents parameters to
    * modify the parents list.
    */
  var parents: js.UndefOr[js.Array[SchemaParentReference]] = js.native
  
  /**
    * List of permission IDs for users with access to this file.
    */
  var permissionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of permissions for users with access to this file. Not populated
    * for Team Drive files.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  
  /**
    * The list of properties.
    */
  var properties: js.UndefOr[js.Array[SchemaProperty]] = js.native
  
  /**
    * The number of quota bytes used by this file.
    */
  var quotaBytesUsed: js.UndefOr[String] = js.native
  
  /**
    * A link back to this file.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Deprecated: use capabilities/canShare.
    */
  var shareable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the file has been shared. Not populated for Team Drive files.
    */
  var shared: js.UndefOr[Boolean] = js.native
  
  /**
    * Time at which this file was shared with the user (formatted RFC 3339
    * timestamp).
    */
  var sharedWithMeDate: js.UndefOr[String] = js.native
  
  /**
    * User that shared the item with the current user, if available.
    */
  var sharingUser: js.UndefOr[SchemaUser] = js.native
  
  /**
    * The list of spaces which contain the file. Supported values are
    * &#39;drive&#39;, &#39;appDataFolder&#39; and &#39;photos&#39;.
    */
  var spaces: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * ID of the Team Drive the file resides in.
    */
  var teamDriveId: js.UndefOr[String] = js.native
  
  /**
    * A thumbnail for the file. This will only be used if Drive cannot generate
    * a standard thumbnail.
    */
  var thumbnail: js.UndefOr[MimeType] = js.native
  
  /**
    * A short-lived link to the file&#39;s thumbnail. Typically lasts on the
    * order of hours. Only populated when the requesting app can access the
    * file&#39;s content.
    */
  var thumbnailLink: js.UndefOr[String] = js.native
  
  /**
    * The thumbnail version for use in thumbnail cache invalidation.
    */
  var thumbnailVersion: js.UndefOr[String] = js.native
  
  /**
    * The title of this file. Note that for immutable items such as the top
    * level folders of Team Drives, My Drive root folder, and Application Data
    * folder the title is constant.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The time that the item was trashed (formatted RFC 3339 timestamp). Only
    * populated for Team Drive files.
    */
  var trashedDate: js.UndefOr[String] = js.native
  
  /**
    * If the file has been explicitly trashed, the user who trashed it. Only
    * populated for Team Drive files.
    */
  var trashingUser: js.UndefOr[SchemaUser] = js.native
  
  /**
    * The permissions for the authenticated user on this file.
    */
  var userPermission: js.UndefOr[SchemaPermission] = js.native
  
  /**
    * A monotonically increasing version number for the file. This reflects
    * every change made to the file on the server, even those not visible to
    * the requesting user.
    */
  var version: js.UndefOr[String] = js.native
  
  /**
    * Metadata about video media. This will only be present for video types.
    */
  var videoMediaMetadata: js.UndefOr[DurationMillis] = js.native
  
  /**
    * A link for downloading the content of the file in a browser using cookie
    * based authentication. In cases where the content is shared publicly, the
    * content can be downloaded without any credentials.
    */
  var webContentLink: js.UndefOr[String] = js.native
  
  /**
    * A link only available on public folders for viewing their static web
    * assets (HTML, CSS, JS, etc) via Google Drive&#39;s Website Hosting.
    */
  var webViewLink: js.UndefOr[String] = js.native
  
  /**
    * Whether writers can share the document with other users. Not populated
    * for Team Drive files.
    */
  var writersCanShare: js.UndefOr[Boolean] = js.native
}
object SchemaFile {
  
  @scala.inline
  def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  
  @scala.inline
  implicit class SchemaFileOps[Self <: SchemaFile] (val x: Self) extends AnyVal {
    
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
    def setAlternateLink(value: String): Self = this.set("alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateLink: Self = this.set("alternateLink", js.undefined)
    
    @scala.inline
    def setAppDataContents(value: Boolean): Self = this.set("appDataContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppDataContents: Self = this.set("appDataContents", js.undefined)
    
    @scala.inline
    def setCanComment(value: Boolean): Self = this.set("canComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanComment: Self = this.set("canComment", js.undefined)
    
    @scala.inline
    def setCanReadRevisions(value: Boolean): Self = this.set("canReadRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanReadRevisions: Self = this.set("canReadRevisions", js.undefined)
    
    @scala.inline
    def setCapabilities(value: CanAddChildren): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setCopyRequiresWriterPermission(value: Boolean): Self = this.set("copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyRequiresWriterPermission: Self = this.set("copyRequiresWriterPermission", js.undefined)
    
    @scala.inline
    def setCopyable(value: Boolean): Self = this.set("copyable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyable: Self = this.set("copyable", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDefaultOpenWithLink(value: String): Self = this.set("defaultOpenWithLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOpenWithLink: Self = this.set("defaultOpenWithLink", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEmbedLink(value: String): Self = this.set("embedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbedLink: Self = this.set("embedLink", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExplicitlyTrashed(value: Boolean): Self = this.set("explicitlyTrashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitlyTrashed: Self = this.set("explicitlyTrashed", js.undefined)
    
    @scala.inline
    def setExportLinks(value: StringDictionary[String]): Self = this.set("exportLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportLinks: Self = this.set("exportLinks", js.undefined)
    
    @scala.inline
    def setFileExtension(value: String): Self = this.set("fileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileExtension: Self = this.set("fileExtension", js.undefined)
    
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setFolderColorRgb(value: String): Self = this.set("folderColorRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderColorRgb: Self = this.set("folderColorRgb", js.undefined)
    
    @scala.inline
    def setFullFileExtension(value: String): Self = this.set("fullFileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullFileExtension: Self = this.set("fullFileExtension", js.undefined)
    
    @scala.inline
    def setHasAugmentedPermissions(value: Boolean): Self = this.set("hasAugmentedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAugmentedPermissions: Self = this.set("hasAugmentedPermissions", js.undefined)
    
    @scala.inline
    def setHasThumbnail(value: Boolean): Self = this.set("hasThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasThumbnail: Self = this.set("hasThumbnail", js.undefined)
    
    @scala.inline
    def setHeadRevisionId(value: String): Self = this.set("headRevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadRevisionId: Self = this.set("headRevisionId", js.undefined)
    
    @scala.inline
    def setIconLink(value: String): Self = this.set("iconLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconLink: Self = this.set("iconLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImageMediaMetadata(value: Aperture): Self = this.set("imageMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageMediaMetadata: Self = this.set("imageMediaMetadata", js.undefined)
    
    @scala.inline
    def setIndexableText(value: Text): Self = this.set("indexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexableText: Self = this.set("indexableText", js.undefined)
    
    @scala.inline
    def setIsAppAuthorized(value: Boolean): Self = this.set("isAppAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAppAuthorized: Self = this.set("isAppAuthorized", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabels(value: Hidden): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLastModifyingUser(value: SchemaUser): Self = this.set("lastModifyingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifyingUser: Self = this.set("lastModifyingUser", js.undefined)
    
    @scala.inline
    def setLastModifyingUserName(value: String): Self = this.set("lastModifyingUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifyingUserName: Self = this.set("lastModifyingUserName", js.undefined)
    
    @scala.inline
    def setLastViewedByMeDate(value: String): Self = this.set("lastViewedByMeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastViewedByMeDate: Self = this.set("lastViewedByMeDate", js.undefined)
    
    @scala.inline
    def setMarkedViewedByMeDate(value: String): Self = this.set("markedViewedByMeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkedViewedByMeDate: Self = this.set("markedViewedByMeDate", js.undefined)
    
    @scala.inline
    def setMd5Checksum(value: String): Self = this.set("md5Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Checksum: Self = this.set("md5Checksum", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setModifiedByMeDate(value: String): Self = this.set("modifiedByMeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedByMeDate: Self = this.set("modifiedByMeDate", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    
    @scala.inline
    def setOpenWithLinks(value: StringDictionary[String]): Self = this.set("openWithLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenWithLinks: Self = this.set("openWithLinks", js.undefined)
    
    @scala.inline
    def setOriginalFilename(value: String): Self = this.set("originalFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalFilename: Self = this.set("originalFilename", js.undefined)
    
    @scala.inline
    def setOwnedByMe(value: Boolean): Self = this.set("ownedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnedByMe: Self = this.set("ownedByMe", js.undefined)
    
    @scala.inline
    def setOwnerNamesVarargs(value: String*): Self = this.set("ownerNames", js.Array(value :_*))
    
    @scala.inline
    def setOwnerNames(value: js.Array[String]): Self = this.set("ownerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerNames: Self = this.set("ownerNames", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: SchemaUser*): Self = this.set("owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: js.Array[SchemaUser]): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    
    @scala.inline
    def setParentsVarargs(value: SchemaParentReference*): Self = this.set("parents", js.Array(value :_*))
    
    @scala.inline
    def setParents(value: js.Array[SchemaParentReference]): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
    
    @scala.inline
    def setPermissionIdsVarargs(value: String*): Self = this.set("permissionIds", js.Array(value :_*))
    
    @scala.inline
    def setPermissionIds(value: js.Array[String]): Self = this.set("permissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionIds: Self = this.set("permissionIds", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaPermission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaPermission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: SchemaProperty*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[SchemaProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setQuotaBytesUsed(value: String): Self = this.set("quotaBytesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaBytesUsed: Self = this.set("quotaBytesUsed", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setShareable(value: Boolean): Self = this.set("shareable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareable: Self = this.set("shareable", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setSharedWithMeDate(value: String): Self = this.set("sharedWithMeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedWithMeDate: Self = this.set("sharedWithMeDate", js.undefined)
    
    @scala.inline
    def setSharingUser(value: SchemaUser): Self = this.set("sharingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingUser: Self = this.set("sharingUser", js.undefined)
    
    @scala.inline
    def setSpacesVarargs(value: String*): Self = this.set("spaces", js.Array(value :_*))
    
    @scala.inline
    def setSpaces(value: js.Array[String]): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
    
    @scala.inline
    def setTeamDriveId(value: String): Self = this.set("teamDriveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDriveId: Self = this.set("teamDriveId", js.undefined)
    
    @scala.inline
    def setThumbnail(value: MimeType): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setThumbnailLink(value: String): Self = this.set("thumbnailLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailLink: Self = this.set("thumbnailLink", js.undefined)
    
    @scala.inline
    def setThumbnailVersion(value: String): Self = this.set("thumbnailVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailVersion: Self = this.set("thumbnailVersion", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTrashedDate(value: String): Self = this.set("trashedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrashedDate: Self = this.set("trashedDate", js.undefined)
    
    @scala.inline
    def setTrashingUser(value: SchemaUser): Self = this.set("trashingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrashingUser: Self = this.set("trashingUser", js.undefined)
    
    @scala.inline
    def setUserPermission(value: SchemaPermission): Self = this.set("userPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPermission: Self = this.set("userPermission", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVideoMediaMetadata(value: DurationMillis): Self = this.set("videoMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoMediaMetadata: Self = this.set("videoMediaMetadata", js.undefined)
    
    @scala.inline
    def setWebContentLink(value: String): Self = this.set("webContentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebContentLink: Self = this.set("webContentLink", js.undefined)
    
    @scala.inline
    def setWebViewLink(value: String): Self = this.set("webViewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebViewLink: Self = this.set("webViewLink", js.undefined)
    
    @scala.inline
    def setWritersCanShare(value: Boolean): Self = this.set("writersCanShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritersCanShare: Self = this.set("writersCanShare", js.undefined)
  }
}

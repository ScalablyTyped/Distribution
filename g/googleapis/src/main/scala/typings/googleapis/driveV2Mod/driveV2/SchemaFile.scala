package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.Aperture
import typings.googleapis.anon.CanAddChildren
import typings.googleapis.anon.DurationMillis
import typings.googleapis.anon.Hidden
import typings.googleapis.anon.MimeType
import typings.googleapis.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata for a file.
  */
trait SchemaFile extends StObject {
  
  /**
    * A link for opening the file in a relevant Google editor or viewer.
    */
  var alternateLink: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this file is in the Application Data folder.
    */
  var appDataContents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated: use capabilities/canComment.
    */
  var canComment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated: use capabilities/canReadRevisions.
    */
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Capabilities the current user has on this file. Each capability
    * corresponds to a fine-grained action that a user may take.
    */
  var capabilities: js.UndefOr[CanAddChildren] = js.undefined
  
  /**
    * Whether the options to copy, print, or download this file, should be
    * disabled for readers and commenters.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated: use capabilities/canCopy.
    */
  var copyable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Create time for this file (formatted RFC 3339 timestamp).
    */
  var createdDate: js.UndefOr[String] = js.undefined
  
  /**
    * A link to open this file with the user&#39;s default app for this file.
    * Only populated when the drive.apps.readonly scope is used.
    */
  var defaultOpenWithLink: js.UndefOr[String] = js.undefined
  
  /**
    * A short description of the file.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Short lived download URL for the file. This field is only populated for
    * files with content stored in Drive; it is not populated for Google Docs
    * or shortcut files.
    */
  var downloadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated: use capabilities/canEdit.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A link for embedding the file.
    */
  var embedLink: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the file.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this file has been explicitly trashed, as opposed to recursively
    * trashed.
    */
  var explicitlyTrashed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The final component of fullFileExtension with trailing text that does not
    * appear to be part of the extension removed. This field is only populated
    * for files with content stored in Drive; it is not populated for Google
    * Docs or shortcut files.
    */
  var fileExtension: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the file in bytes. This field is only populated for files
    * with content stored in Drive; it is not populated for Google Docs or
    * shortcut files.
    */
  var fileSize: js.UndefOr[String] = js.undefined
  
  /**
    * Folder color as an RGB hex string if the file is a folder. The list of
    * supported colors is available in the folderColorPalette field of the
    * About resource. If an unsupported color is specified, it will be changed
    * to the closest color in the palette. Not populated for Team Drive files.
    */
  var folderColorRgb: js.UndefOr[String] = js.undefined
  
  /**
    * The full file extension; extracted from the title. May contain multiple
    * concatenated extensions, such as &quot;tar.gz&quot;. Removing an
    * extension from the title does not clear this field; however, changing the
    * extension on the title does update this field. This field is only
    * populated for files with content stored in Drive; it is not populated for
    * Google Docs or shortcut files.
    */
  var fullFileExtension: js.UndefOr[String] = js.undefined
  
  /**
    * Whether any users are granted file access directly on this file. This
    * field is only populated for Team Drive files.
    */
  var hasAugmentedPermissions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this file has a thumbnail. This does not indicate whether the
    * requesting app has access to the thumbnail. To check access, look for the
    * presence of the thumbnailLink field.
    */
  var hasThumbnail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the file&#39;s head revision. This field is only populated for
    * files with content stored in Drive; it is not populated for Google Docs
    * or shortcut files.
    */
  var headRevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the file&#39;s icon.
    */
  var iconLink: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the file.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about image media. This will only be present for image types,
    * and its contents will depend on what can be parsed from the image
    * content.
    */
  var imageMediaMetadata: js.UndefOr[Aperture] = js.undefined
  
  /**
    * Indexable text attributes for the file (can only be written)
    */
  var indexableText: js.UndefOr[Text] = js.undefined
  
  /**
    * Whether the file was created or opened by the requesting app.
    */
  var isAppAuthorized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of file. This is always drive#file.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A group of labels for the file.
    */
  var labels: js.UndefOr[Hidden] = js.undefined
  
  /**
    * The last user to modify this file.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Name of the last user to modify this file.
    */
  var lastModifyingUserName: js.UndefOr[String] = js.undefined
  
  /**
    * Last time this file was viewed by the user (formatted RFC 3339
    * timestamp).
    */
  var lastViewedByMeDate: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var markedViewedByMeDate: js.UndefOr[String] = js.undefined
  
  /**
    * An MD5 checksum for the content of this file. This field is only
    * populated for files with content stored in Drive; it is not populated for
    * Google Docs or shortcut files.
    */
  var md5Checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The MIME type of the file. This is only mutable on update when uploading
    * new content. This field can be left blank, and the mimetype will be
    * determined from the uploaded content&#39;s MIME type.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Last time this file was modified by the user (formatted RFC 3339
    * timestamp). Note that setting modifiedDate will also update the
    * modifiedByMe date for the user which set the date.
    */
  var modifiedByMeDate: js.UndefOr[String] = js.undefined
  
  /**
    * Last time this file was modified by anyone (formatted RFC 3339
    * timestamp). This is only mutable on update when the setModifiedDate
    * parameter is set.
    */
  var modifiedDate: js.UndefOr[String] = js.undefined
  
  /**
    * A map of the id of each of the user&#39;s apps to a link to open this
    * file with that app. Only populated when the drive.apps.readonly scope is
    * used.
    */
  var openWithLinks: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The original filename of the uploaded content if available, or else the
    * original value of the title field. This is only available for files with
    * binary content in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the file is owned by the current user. Not populated for Team
    * Drive files.
    */
  var ownedByMe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name(s) of the owner(s) of this file. Not populated for Team Drive files.
    */
  var ownerNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The owner(s) of this file. Not populated for Team Drive files.
    */
  var owners: js.UndefOr[js.Array[SchemaUser]] = js.undefined
  
  /**
    * Collection of parent folders which contain this file. If not specified as
    * part of an insert request, the file will be placed directly in the
    * user&#39;s My Drive folder. If not specified as part of a copy request,
    * the file will inherit any discoverable parents of the source file. Update
    * requests can also use the addParents and removeParents parameters to
    * modify the parents list.
    */
  var parents: js.UndefOr[js.Array[SchemaParentReference]] = js.undefined
  
  /**
    * List of permission IDs for users with access to this file.
    */
  var permissionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of permissions for users with access to this file. Not populated
    * for Team Drive files.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.undefined
  
  /**
    * The list of properties.
    */
  var properties: js.UndefOr[js.Array[SchemaProperty]] = js.undefined
  
  /**
    * The number of quota bytes used by this file.
    */
  var quotaBytesUsed: js.UndefOr[String] = js.undefined
  
  /**
    * A link back to this file.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated: use capabilities/canShare.
    */
  var shareable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the file has been shared. Not populated for Team Drive files.
    */
  var shared: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Time at which this file was shared with the user (formatted RFC 3339
    * timestamp).
    */
  var sharedWithMeDate: js.UndefOr[String] = js.undefined
  
  /**
    * User that shared the item with the current user, if available.
    */
  var sharingUser: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The list of spaces which contain the file. Supported values are
    * &#39;drive&#39;, &#39;appDataFolder&#39; and &#39;photos&#39;.
    */
  var spaces: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * ID of the Team Drive the file resides in.
    */
  var teamDriveId: js.UndefOr[String] = js.undefined
  
  /**
    * A thumbnail for the file. This will only be used if Drive cannot generate
    * a standard thumbnail.
    */
  var thumbnail: js.UndefOr[MimeType] = js.undefined
  
  /**
    * A short-lived link to the file&#39;s thumbnail. Typically lasts on the
    * order of hours. Only populated when the requesting app can access the
    * file&#39;s content.
    */
  var thumbnailLink: js.UndefOr[String] = js.undefined
  
  /**
    * The thumbnail version for use in thumbnail cache invalidation.
    */
  var thumbnailVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The title of this file. Note that for immutable items such as the top
    * level folders of Team Drives, My Drive root folder, and Application Data
    * folder the title is constant.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The time that the item was trashed (formatted RFC 3339 timestamp). Only
    * populated for Team Drive files.
    */
  var trashedDate: js.UndefOr[String] = js.undefined
  
  /**
    * If the file has been explicitly trashed, the user who trashed it. Only
    * populated for Team Drive files.
    */
  var trashingUser: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The permissions for the authenticated user on this file.
    */
  var userPermission: js.UndefOr[SchemaPermission] = js.undefined
  
  /**
    * A monotonically increasing version number for the file. This reflects
    * every change made to the file on the server, even those not visible to
    * the requesting user.
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about video media. This will only be present for video types.
    */
  var videoMediaMetadata: js.UndefOr[DurationMillis] = js.undefined
  
  /**
    * A link for downloading the content of the file in a browser using cookie
    * based authentication. In cases where the content is shared publicly, the
    * content can be downloaded without any credentials.
    */
  var webContentLink: js.UndefOr[String] = js.undefined
  
  /**
    * A link only available on public folders for viewing their static web
    * assets (HTML, CSS, JS, etc) via Google Drive&#39;s Website Hosting.
    */
  var webViewLink: js.UndefOr[String] = js.undefined
  
  /**
    * Whether writers can share the document with other users. Not populated
    * for Team Drive files.
    */
  var writersCanShare: js.UndefOr[Boolean] = js.undefined
}
object SchemaFile {
  
  inline def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  
  extension [Self <: SchemaFile](x: Self) {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    inline def setAppDataContents(value: Boolean): Self = StObject.set(x, "appDataContents", value.asInstanceOf[js.Any])
    
    inline def setAppDataContentsUndefined: Self = StObject.set(x, "appDataContents", js.undefined)
    
    inline def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
    
    inline def setCanCommentUndefined: Self = StObject.set(x, "canComment", js.undefined)
    
    inline def setCanReadRevisions(value: Boolean): Self = StObject.set(x, "canReadRevisions", value.asInstanceOf[js.Any])
    
    inline def setCanReadRevisionsUndefined: Self = StObject.set(x, "canReadRevisions", js.undefined)
    
    inline def setCapabilities(value: CanAddChildren): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    inline def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
    
    inline def setCopyable(value: Boolean): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
    
    inline def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
    
    inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDefaultOpenWithLink(value: String): Self = StObject.set(x, "defaultOpenWithLink", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenWithLinkUndefined: Self = StObject.set(x, "defaultOpenWithLink", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEmbedLink(value: String): Self = StObject.set(x, "embedLink", value.asInstanceOf[js.Any])
    
    inline def setEmbedLinkUndefined: Self = StObject.set(x, "embedLink", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExplicitlyTrashed(value: Boolean): Self = StObject.set(x, "explicitlyTrashed", value.asInstanceOf[js.Any])
    
    inline def setExplicitlyTrashedUndefined: Self = StObject.set(x, "explicitlyTrashed", js.undefined)
    
    inline def setExportLinks(value: StringDictionary[String]): Self = StObject.set(x, "exportLinks", value.asInstanceOf[js.Any])
    
    inline def setExportLinksUndefined: Self = StObject.set(x, "exportLinks", js.undefined)
    
    inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
    
    inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setFolderColorRgb(value: String): Self = StObject.set(x, "folderColorRgb", value.asInstanceOf[js.Any])
    
    inline def setFolderColorRgbUndefined: Self = StObject.set(x, "folderColorRgb", js.undefined)
    
    inline def setFullFileExtension(value: String): Self = StObject.set(x, "fullFileExtension", value.asInstanceOf[js.Any])
    
    inline def setFullFileExtensionUndefined: Self = StObject.set(x, "fullFileExtension", js.undefined)
    
    inline def setHasAugmentedPermissions(value: Boolean): Self = StObject.set(x, "hasAugmentedPermissions", value.asInstanceOf[js.Any])
    
    inline def setHasAugmentedPermissionsUndefined: Self = StObject.set(x, "hasAugmentedPermissions", js.undefined)
    
    inline def setHasThumbnail(value: Boolean): Self = StObject.set(x, "hasThumbnail", value.asInstanceOf[js.Any])
    
    inline def setHasThumbnailUndefined: Self = StObject.set(x, "hasThumbnail", js.undefined)
    
    inline def setHeadRevisionId(value: String): Self = StObject.set(x, "headRevisionId", value.asInstanceOf[js.Any])
    
    inline def setHeadRevisionIdUndefined: Self = StObject.set(x, "headRevisionId", js.undefined)
    
    inline def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
    
    inline def setIconLinkUndefined: Self = StObject.set(x, "iconLink", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageMediaMetadata(value: Aperture): Self = StObject.set(x, "imageMediaMetadata", value.asInstanceOf[js.Any])
    
    inline def setImageMediaMetadataUndefined: Self = StObject.set(x, "imageMediaMetadata", js.undefined)
    
    inline def setIndexableText(value: Text): Self = StObject.set(x, "indexableText", value.asInstanceOf[js.Any])
    
    inline def setIndexableTextUndefined: Self = StObject.set(x, "indexableText", js.undefined)
    
    inline def setIsAppAuthorized(value: Boolean): Self = StObject.set(x, "isAppAuthorized", value.asInstanceOf[js.Any])
    
    inline def setIsAppAuthorizedUndefined: Self = StObject.set(x, "isAppAuthorized", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: Hidden): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastModifyingUser(value: SchemaUser): Self = StObject.set(x, "lastModifyingUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifyingUserName(value: String): Self = StObject.set(x, "lastModifyingUserName", value.asInstanceOf[js.Any])
    
    inline def setLastModifyingUserNameUndefined: Self = StObject.set(x, "lastModifyingUserName", js.undefined)
    
    inline def setLastModifyingUserUndefined: Self = StObject.set(x, "lastModifyingUser", js.undefined)
    
    inline def setLastViewedByMeDate(value: String): Self = StObject.set(x, "lastViewedByMeDate", value.asInstanceOf[js.Any])
    
    inline def setLastViewedByMeDateUndefined: Self = StObject.set(x, "lastViewedByMeDate", js.undefined)
    
    inline def setMarkedViewedByMeDate(value: String): Self = StObject.set(x, "markedViewedByMeDate", value.asInstanceOf[js.Any])
    
    inline def setMarkedViewedByMeDateUndefined: Self = StObject.set(x, "markedViewedByMeDate", js.undefined)
    
    inline def setMd5Checksum(value: String): Self = StObject.set(x, "md5Checksum", value.asInstanceOf[js.Any])
    
    inline def setMd5ChecksumUndefined: Self = StObject.set(x, "md5Checksum", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setModifiedByMeDate(value: String): Self = StObject.set(x, "modifiedByMeDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedByMeDateUndefined: Self = StObject.set(x, "modifiedByMeDate", js.undefined)
    
    inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
    
    inline def setOpenWithLinks(value: StringDictionary[String]): Self = StObject.set(x, "openWithLinks", value.asInstanceOf[js.Any])
    
    inline def setOpenWithLinksUndefined: Self = StObject.set(x, "openWithLinks", js.undefined)
    
    inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
    
    inline def setOriginalFilenameUndefined: Self = StObject.set(x, "originalFilename", js.undefined)
    
    inline def setOwnedByMe(value: Boolean): Self = StObject.set(x, "ownedByMe", value.asInstanceOf[js.Any])
    
    inline def setOwnedByMeUndefined: Self = StObject.set(x, "ownedByMe", js.undefined)
    
    inline def setOwnerNames(value: js.Array[String]): Self = StObject.set(x, "ownerNames", value.asInstanceOf[js.Any])
    
    inline def setOwnerNamesUndefined: Self = StObject.set(x, "ownerNames", js.undefined)
    
    inline def setOwnerNamesVarargs(value: String*): Self = StObject.set(x, "ownerNames", js.Array(value :_*))
    
    inline def setOwners(value: js.Array[SchemaUser]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    inline def setOwnersVarargs(value: SchemaUser*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    inline def setParents(value: js.Array[SchemaParentReference]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
    
    inline def setParentsVarargs(value: SchemaParentReference*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    inline def setPermissionIds(value: js.Array[String]): Self = StObject.set(x, "permissionIds", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdsUndefined: Self = StObject.set(x, "permissionIds", js.undefined)
    
    inline def setPermissionIdsVarargs(value: String*): Self = StObject.set(x, "permissionIds", js.Array(value :_*))
    
    inline def setPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    inline def setProperties(value: js.Array[SchemaProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: SchemaProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    inline def setQuotaBytesUsed(value: String): Self = StObject.set(x, "quotaBytesUsed", value.asInstanceOf[js.Any])
    
    inline def setQuotaBytesUsedUndefined: Self = StObject.set(x, "quotaBytesUsed", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setShareable(value: Boolean): Self = StObject.set(x, "shareable", value.asInstanceOf[js.Any])
    
    inline def setShareableUndefined: Self = StObject.set(x, "shareable", js.undefined)
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setSharedWithMeDate(value: String): Self = StObject.set(x, "sharedWithMeDate", value.asInstanceOf[js.Any])
    
    inline def setSharedWithMeDateUndefined: Self = StObject.set(x, "sharedWithMeDate", js.undefined)
    
    inline def setSharingUser(value: SchemaUser): Self = StObject.set(x, "sharingUser", value.asInstanceOf[js.Any])
    
    inline def setSharingUserUndefined: Self = StObject.set(x, "sharingUser", js.undefined)
    
    inline def setSpaces(value: js.Array[String]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    inline def setSpacesVarargs(value: String*): Self = StObject.set(x, "spaces", js.Array(value :_*))
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
    
    inline def setThumbnail(value: MimeType): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailLink(value: String): Self = StObject.set(x, "thumbnailLink", value.asInstanceOf[js.Any])
    
    inline def setThumbnailLinkUndefined: Self = StObject.set(x, "thumbnailLink", js.undefined)
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setThumbnailVersion(value: String): Self = StObject.set(x, "thumbnailVersion", value.asInstanceOf[js.Any])
    
    inline def setThumbnailVersionUndefined: Self = StObject.set(x, "thumbnailVersion", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrashedDate(value: String): Self = StObject.set(x, "trashedDate", value.asInstanceOf[js.Any])
    
    inline def setTrashedDateUndefined: Self = StObject.set(x, "trashedDate", js.undefined)
    
    inline def setTrashingUser(value: SchemaUser): Self = StObject.set(x, "trashingUser", value.asInstanceOf[js.Any])
    
    inline def setTrashingUserUndefined: Self = StObject.set(x, "trashingUser", js.undefined)
    
    inline def setUserPermission(value: SchemaPermission): Self = StObject.set(x, "userPermission", value.asInstanceOf[js.Any])
    
    inline def setUserPermissionUndefined: Self = StObject.set(x, "userPermission", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVideoMediaMetadata(value: DurationMillis): Self = StObject.set(x, "videoMediaMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoMediaMetadataUndefined: Self = StObject.set(x, "videoMediaMetadata", js.undefined)
    
    inline def setWebContentLink(value: String): Self = StObject.set(x, "webContentLink", value.asInstanceOf[js.Any])
    
    inline def setWebContentLinkUndefined: Self = StObject.set(x, "webContentLink", js.undefined)
    
    inline def setWebViewLink(value: String): Self = StObject.set(x, "webViewLink", value.asInstanceOf[js.Any])
    
    inline def setWebViewLinkUndefined: Self = StObject.set(x, "webViewLink", js.undefined)
    
    inline def setWritersCanShare(value: Boolean): Self = StObject.set(x, "writersCanShare", value.asInstanceOf[js.Any])
    
    inline def setWritersCanShareUndefined: Self = StObject.set(x, "writersCanShare", js.undefined)
  }
}

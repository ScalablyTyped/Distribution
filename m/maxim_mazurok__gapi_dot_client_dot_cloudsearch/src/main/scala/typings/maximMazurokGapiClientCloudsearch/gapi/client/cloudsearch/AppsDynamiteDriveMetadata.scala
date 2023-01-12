package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteDriveMetadata extends StObject {
  
  var aclFixRequest: js.UndefOr[AppsDynamiteDriveMetadataAclFixRequest] = js.undefined
  
  var aclFixStatus: js.UndefOr[AppsDynamiteDriveMetadataAclFixStatus] = js.undefined
  
  /** Can the current user edit this resource */
  var canEdit: js.UndefOr[Boolean] = js.undefined
  
  /** Can the current user share this resource */
  var canShare: js.UndefOr[Boolean] = js.undefined
  
  /** Can the current user view this resource */
  var canView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * DriveAction for organizing this file in Drive. If the user does not have access to the Drive file, the value will be DriveAction.DRIVE_ACTION_UNSPECIFIED. This field is only set
    * when part of a FileResult in a ListFilesResponse.
    */
  var driveAction: js.UndefOr[String] = js.undefined
  
  var driveState: js.UndefOr[String] = js.undefined
  
  /** Output only. Trusted Resource URL for drive file embedding. */
  var embedUrl: js.UndefOr[TrustedResourceUrlProto] = js.undefined
  
  /** Indicates whether the Drive link contains an encrypted doc ID. If true, Dynamite should not attempt to query the doc ID in Drive Service. See go/docid-encryption for details. */
  var encryptedDocId: js.UndefOr[Boolean] = js.undefined
  
  /** This is deprecated and unneeded. TODO (b/182479059): Remove this. */
  var encryptedResourceKey: js.UndefOr[String] = js.undefined
  
  /** External mimetype of the Drive Resource (Useful for creating Drive URL) See: http://b/35219462 */
  var externalMimetype: js.UndefOr[String] = js.undefined
  
  /** Drive resource ID of the artifact. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Whether the setting to restrict downloads is enabled for this file. This was previously used to determine whether to hide the download and print buttons in the UI, but
    * is no longer used by clients, because Projector now independently queries Drive to ensure that we have the most up-to-date value.
    */
  var isDownloadRestricted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the current user is the Drive file's owner. The field is currently only set for Annotations for the ListFiles action (as opposed to fetching Topics/Messages with Drive
    * annotations).
    */
  var isOwner: js.UndefOr[Boolean] = js.undefined
  
  /** Only present if this DriveMetadata is converted from an UploadMetadata. */
  var legacyUploadMetadata: js.UndefOr[AppsDynamiteDriveMetadataLegacyUploadMetadata] = js.undefined
  
  /** Mimetype of the Drive Resource */
  var mimetype: js.UndefOr[String] = js.undefined
  
  /** The display name of the organization owning the Drive item. */
  var organizationDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * Shortcut ID of this drive file in the shared drive, which is associated with a named room this file was shared in. Shortcuts will not be created for DMs or unnamed rooms. This is
    * populated after the DriveMetadata is migrated to shared drive. go/chat-shared-drive-uploads.
    */
  var shortcutAuthorizedItemId: js.UndefOr[AuthorizedItemId] = js.undefined
  
  /** If this field is set to true, server should still contact external backends to get metadata for search but clients should not render this chip. */
  var shouldNotRender: js.UndefOr[Boolean] = js.undefined
  
  /** Thumbnail image of the Drive Resource */
  var thumbnailHeight: js.UndefOr[Double] = js.undefined
  
  /** Thumbnail image of the Drive Resource */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  
  /** Thumbnail image of the Drive Resource */
  var thumbnailWidth: js.UndefOr[Double] = js.undefined
  
  /** Title of the Drive Resource */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Url string fragment that generally indicates the specific location in the linked file. Example: #header=h.123abc456. If the fragment is not present this will not be present and
    * therefore default to an empty string. The "#" will not be included.
    */
  var urlFragment: js.UndefOr[String] = js.undefined
  
  /** This is considered SPII and should not be logged. */
  var wrappedResourceKey: js.UndefOr[WrappedResourceKey] = js.undefined
}
object AppsDynamiteDriveMetadata {
  
  inline def apply(): AppsDynamiteDriveMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteDriveMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteDriveMetadata] (val x: Self) extends AnyVal {
    
    inline def setAclFixRequest(value: AppsDynamiteDriveMetadataAclFixRequest): Self = StObject.set(x, "aclFixRequest", value.asInstanceOf[js.Any])
    
    inline def setAclFixRequestUndefined: Self = StObject.set(x, "aclFixRequest", js.undefined)
    
    inline def setAclFixStatus(value: AppsDynamiteDriveMetadataAclFixStatus): Self = StObject.set(x, "aclFixStatus", value.asInstanceOf[js.Any])
    
    inline def setAclFixStatusUndefined: Self = StObject.set(x, "aclFixStatus", js.undefined)
    
    inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    inline def setCanEditUndefined: Self = StObject.set(x, "canEdit", js.undefined)
    
    inline def setCanShare(value: Boolean): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
    
    inline def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
    
    inline def setCanView(value: Boolean): Self = StObject.set(x, "canView", value.asInstanceOf[js.Any])
    
    inline def setCanViewUndefined: Self = StObject.set(x, "canView", js.undefined)
    
    inline def setDriveAction(value: String): Self = StObject.set(x, "driveAction", value.asInstanceOf[js.Any])
    
    inline def setDriveActionUndefined: Self = StObject.set(x, "driveAction", js.undefined)
    
    inline def setDriveState(value: String): Self = StObject.set(x, "driveState", value.asInstanceOf[js.Any])
    
    inline def setDriveStateUndefined: Self = StObject.set(x, "driveState", js.undefined)
    
    inline def setEmbedUrl(value: TrustedResourceUrlProto): Self = StObject.set(x, "embedUrl", value.asInstanceOf[js.Any])
    
    inline def setEmbedUrlUndefined: Self = StObject.set(x, "embedUrl", js.undefined)
    
    inline def setEncryptedDocId(value: Boolean): Self = StObject.set(x, "encryptedDocId", value.asInstanceOf[js.Any])
    
    inline def setEncryptedDocIdUndefined: Self = StObject.set(x, "encryptedDocId", js.undefined)
    
    inline def setEncryptedResourceKey(value: String): Self = StObject.set(x, "encryptedResourceKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptedResourceKeyUndefined: Self = StObject.set(x, "encryptedResourceKey", js.undefined)
    
    inline def setExternalMimetype(value: String): Self = StObject.set(x, "externalMimetype", value.asInstanceOf[js.Any])
    
    inline def setExternalMimetypeUndefined: Self = StObject.set(x, "externalMimetype", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsDownloadRestricted(value: Boolean): Self = StObject.set(x, "isDownloadRestricted", value.asInstanceOf[js.Any])
    
    inline def setIsDownloadRestrictedUndefined: Self = StObject.set(x, "isDownloadRestricted", js.undefined)
    
    inline def setIsOwner(value: Boolean): Self = StObject.set(x, "isOwner", value.asInstanceOf[js.Any])
    
    inline def setIsOwnerUndefined: Self = StObject.set(x, "isOwner", js.undefined)
    
    inline def setLegacyUploadMetadata(value: AppsDynamiteDriveMetadataLegacyUploadMetadata): Self = StObject.set(x, "legacyUploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setLegacyUploadMetadataUndefined: Self = StObject.set(x, "legacyUploadMetadata", js.undefined)
    
    inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
    
    inline def setOrganizationDisplayName(value: String): Self = StObject.set(x, "organizationDisplayName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationDisplayNameUndefined: Self = StObject.set(x, "organizationDisplayName", js.undefined)
    
    inline def setShortcutAuthorizedItemId(value: AuthorizedItemId): Self = StObject.set(x, "shortcutAuthorizedItemId", value.asInstanceOf[js.Any])
    
    inline def setShortcutAuthorizedItemIdUndefined: Self = StObject.set(x, "shortcutAuthorizedItemId", js.undefined)
    
    inline def setShouldNotRender(value: Boolean): Self = StObject.set(x, "shouldNotRender", value.asInstanceOf[js.Any])
    
    inline def setShouldNotRenderUndefined: Self = StObject.set(x, "shouldNotRender", js.undefined)
    
    inline def setThumbnailHeight(value: Double): Self = StObject.set(x, "thumbnailHeight", value.asInstanceOf[js.Any])
    
    inline def setThumbnailHeightUndefined: Self = StObject.set(x, "thumbnailHeight", js.undefined)
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setThumbnailWidth(value: Double): Self = StObject.set(x, "thumbnailWidth", value.asInstanceOf[js.Any])
    
    inline def setThumbnailWidthUndefined: Self = StObject.set(x, "thumbnailWidth", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrlFragment(value: String): Self = StObject.set(x, "urlFragment", value.asInstanceOf[js.Any])
    
    inline def setUrlFragmentUndefined: Self = StObject.set(x, "urlFragment", js.undefined)
    
    inline def setWrappedResourceKey(value: WrappedResourceKey): Self = StObject.set(x, "wrappedResourceKey", value.asInstanceOf[js.Any])
    
    inline def setWrappedResourceKeyUndefined: Self = StObject.set(x, "wrappedResourceKey", js.undefined)
  }
}

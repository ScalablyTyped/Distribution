package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.BackgroundImageLink
import typings.googleapis.anon.BytesUsed
import typings.googleapis.anon.FeatureName
import typings.googleapis.anon.RoleSets
import typings.googleapis.anon.SizeType
import typings.googleapis.anon.Targets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAbout extends StObject {
  
  /**
    * Information about supported additional roles per file type. The most specific type takes precedence.
    */
  var additionalRoleInfo: js.UndefOr[js.Array[RoleSets] | Null] = js.undefined
  
  /**
    * Whether the user can create shared drives.
    */
  var canCreateDrives: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Deprecated - use canCreateDrives instead.
    */
  var canCreateTeamDrives: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The domain sharing policy for the current user. Possible values are:
    * - allowed
    * - allowedWithWarning
    * - incomingOnly
    * - disallowed
    */
  var domainSharingPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of themes that are supported for shared drives.
    */
  var driveThemes: js.UndefOr[js.Array[BackgroundImageLink] | Null] = js.undefined
  
  /**
    * The ETag of the item.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The allowable export formats.
    */
  var exportFormats: js.UndefOr[js.Array[Targets] | Null] = js.undefined
  
  /**
    * List of additional features enabled on this account.
    */
  var features: js.UndefOr[js.Array[FeatureName] | Null] = js.undefined
  
  /**
    * The palette of allowable folder colors as RGB hex strings.
    */
  var folderColorPalette: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The allowable import formats.
    */
  var importFormats: js.UndefOr[js.Array[Targets] | Null] = js.undefined
  
  /**
    * A boolean indicating whether the authenticated app is installed by the authenticated user.
    */
  var isCurrentAppInstalled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This is always drive#about.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's language or locale code, as defined by BCP 47, with some extensions from Unicode's LDML format (http://www.unicode.org/reports/tr35/).
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The largest change id.
    */
  var largestChangeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of max upload sizes for each file type. The most specific type takes precedence.
    */
  var maxUploadSizes: js.UndefOr[js.Array[SizeType] | Null] = js.undefined
  
  /**
    * The name of the current user.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current user's ID as visible in the permissions collection.
    */
  var permissionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount of storage quota used by different Google services.
    */
  var quotaBytesByService: js.UndefOr[js.Array[BytesUsed] | Null] = js.undefined
  
  /**
    * The total number of quota bytes. This is only relevant when quotaType is LIMITED.
    */
  var quotaBytesTotal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of quota bytes used by Google Drive.
    */
  var quotaBytesUsed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of quota bytes used by all Google apps (Drive, Picasa, etc.).
    */
  var quotaBytesUsedAggregate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of quota bytes used by trashed items.
    */
  var quotaBytesUsedInTrash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the user's storage quota. Possible values are:
    * - LIMITED
    * - UNLIMITED
    */
  var quotaType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of remaining change ids, limited to no more than 2500.
    */
  var remainingChangeIds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id of the root folder.
    */
  var rootFolderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link back to this item.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated - use driveThemes instead.
    */
  var teamDriveThemes: js.UndefOr[js.Array[BackgroundImageLink] | Null] = js.undefined
  
  /**
    * The authenticated user.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
}
object SchemaAbout {
  
  inline def apply(): SchemaAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbout]
  }
  
  extension [Self <: SchemaAbout](x: Self) {
    
    inline def setAdditionalRoleInfo(value: js.Array[RoleSets]): Self = StObject.set(x, "additionalRoleInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalRoleInfoNull: Self = StObject.set(x, "additionalRoleInfo", null)
    
    inline def setAdditionalRoleInfoUndefined: Self = StObject.set(x, "additionalRoleInfo", js.undefined)
    
    inline def setAdditionalRoleInfoVarargs(value: RoleSets*): Self = StObject.set(x, "additionalRoleInfo", js.Array(value*))
    
    inline def setCanCreateDrives(value: Boolean): Self = StObject.set(x, "canCreateDrives", value.asInstanceOf[js.Any])
    
    inline def setCanCreateDrivesNull: Self = StObject.set(x, "canCreateDrives", null)
    
    inline def setCanCreateDrivesUndefined: Self = StObject.set(x, "canCreateDrives", js.undefined)
    
    inline def setCanCreateTeamDrives(value: Boolean): Self = StObject.set(x, "canCreateTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setCanCreateTeamDrivesNull: Self = StObject.set(x, "canCreateTeamDrives", null)
    
    inline def setCanCreateTeamDrivesUndefined: Self = StObject.set(x, "canCreateTeamDrives", js.undefined)
    
    inline def setDomainSharingPolicy(value: String): Self = StObject.set(x, "domainSharingPolicy", value.asInstanceOf[js.Any])
    
    inline def setDomainSharingPolicyNull: Self = StObject.set(x, "domainSharingPolicy", null)
    
    inline def setDomainSharingPolicyUndefined: Self = StObject.set(x, "domainSharingPolicy", js.undefined)
    
    inline def setDriveThemes(value: js.Array[BackgroundImageLink]): Self = StObject.set(x, "driveThemes", value.asInstanceOf[js.Any])
    
    inline def setDriveThemesNull: Self = StObject.set(x, "driveThemes", null)
    
    inline def setDriveThemesUndefined: Self = StObject.set(x, "driveThemes", js.undefined)
    
    inline def setDriveThemesVarargs(value: BackgroundImageLink*): Self = StObject.set(x, "driveThemes", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExportFormats(value: js.Array[Targets]): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
    
    inline def setExportFormatsNull: Self = StObject.set(x, "exportFormats", null)
    
    inline def setExportFormatsUndefined: Self = StObject.set(x, "exportFormats", js.undefined)
    
    inline def setExportFormatsVarargs(value: Targets*): Self = StObject.set(x, "exportFormats", js.Array(value*))
    
    inline def setFeatures(value: js.Array[FeatureName]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesNull: Self = StObject.set(x, "features", null)
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: FeatureName*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFolderColorPalette(value: js.Array[String]): Self = StObject.set(x, "folderColorPalette", value.asInstanceOf[js.Any])
    
    inline def setFolderColorPaletteNull: Self = StObject.set(x, "folderColorPalette", null)
    
    inline def setFolderColorPaletteUndefined: Self = StObject.set(x, "folderColorPalette", js.undefined)
    
    inline def setFolderColorPaletteVarargs(value: String*): Self = StObject.set(x, "folderColorPalette", js.Array(value*))
    
    inline def setImportFormats(value: js.Array[Targets]): Self = StObject.set(x, "importFormats", value.asInstanceOf[js.Any])
    
    inline def setImportFormatsNull: Self = StObject.set(x, "importFormats", null)
    
    inline def setImportFormatsUndefined: Self = StObject.set(x, "importFormats", js.undefined)
    
    inline def setImportFormatsVarargs(value: Targets*): Self = StObject.set(x, "importFormats", js.Array(value*))
    
    inline def setIsCurrentAppInstalled(value: Boolean): Self = StObject.set(x, "isCurrentAppInstalled", value.asInstanceOf[js.Any])
    
    inline def setIsCurrentAppInstalledNull: Self = StObject.set(x, "isCurrentAppInstalled", null)
    
    inline def setIsCurrentAppInstalledUndefined: Self = StObject.set(x, "isCurrentAppInstalled", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLargestChangeId(value: String): Self = StObject.set(x, "largestChangeId", value.asInstanceOf[js.Any])
    
    inline def setLargestChangeIdNull: Self = StObject.set(x, "largestChangeId", null)
    
    inline def setLargestChangeIdUndefined: Self = StObject.set(x, "largestChangeId", js.undefined)
    
    inline def setMaxUploadSizes(value: js.Array[SizeType]): Self = StObject.set(x, "maxUploadSizes", value.asInstanceOf[js.Any])
    
    inline def setMaxUploadSizesNull: Self = StObject.set(x, "maxUploadSizes", null)
    
    inline def setMaxUploadSizesUndefined: Self = StObject.set(x, "maxUploadSizes", js.undefined)
    
    inline def setMaxUploadSizesVarargs(value: SizeType*): Self = StObject.set(x, "maxUploadSizes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdNull: Self = StObject.set(x, "permissionId", null)
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    inline def setQuotaBytesByService(value: js.Array[BytesUsed]): Self = StObject.set(x, "quotaBytesByService", value.asInstanceOf[js.Any])
    
    inline def setQuotaBytesByServiceNull: Self = StObject.set(x, "quotaBytesByService", null)
    
    inline def setQuotaBytesByServiceUndefined: Self = StObject.set(x, "quotaBytesByService", js.undefined)
    
    inline def setQuotaBytesByServiceVarargs(value: BytesUsed*): Self = StObject.set(x, "quotaBytesByService", js.Array(value*))
    
    inline def setQuotaBytesTotal(value: String): Self = StObject.set(x, "quotaBytesTotal", value.asInstanceOf[js.Any])
    
    inline def setQuotaBytesTotalNull: Self = StObject.set(x, "quotaBytesTotal", null)
    
    inline def setQuotaBytesTotalUndefined: Self = StObject.set(x, "quotaBytesTotal", js.undefined)
    
    inline def setQuotaBytesUsed(value: String): Self = StObject.set(x, "quotaBytesUsed", value.asInstanceOf[js.Any])
    
    inline def setQuotaBytesUsedAggregate(value: String): Self = StObject.set(x, "quotaBytesUsedAggregate", value.asInstanceOf[js.Any])
    
    inline def setQuotaBytesUsedAggregateNull: Self = StObject.set(x, "quotaBytesUsedAggregate", null)
    
    inline def setQuotaBytesUsedAggregateUndefined: Self = StObject.set(x, "quotaBytesUsedAggregate", js.undefined)
    
    inline def setQuotaBytesUsedInTrash(value: String): Self = StObject.set(x, "quotaBytesUsedInTrash", value.asInstanceOf[js.Any])
    
    inline def setQuotaBytesUsedInTrashNull: Self = StObject.set(x, "quotaBytesUsedInTrash", null)
    
    inline def setQuotaBytesUsedInTrashUndefined: Self = StObject.set(x, "quotaBytesUsedInTrash", js.undefined)
    
    inline def setQuotaBytesUsedNull: Self = StObject.set(x, "quotaBytesUsed", null)
    
    inline def setQuotaBytesUsedUndefined: Self = StObject.set(x, "quotaBytesUsed", js.undefined)
    
    inline def setQuotaType(value: String): Self = StObject.set(x, "quotaType", value.asInstanceOf[js.Any])
    
    inline def setQuotaTypeNull: Self = StObject.set(x, "quotaType", null)
    
    inline def setQuotaTypeUndefined: Self = StObject.set(x, "quotaType", js.undefined)
    
    inline def setRemainingChangeIds(value: String): Self = StObject.set(x, "remainingChangeIds", value.asInstanceOf[js.Any])
    
    inline def setRemainingChangeIdsNull: Self = StObject.set(x, "remainingChangeIds", null)
    
    inline def setRemainingChangeIdsUndefined: Self = StObject.set(x, "remainingChangeIds", js.undefined)
    
    inline def setRootFolderId(value: String): Self = StObject.set(x, "rootFolderId", value.asInstanceOf[js.Any])
    
    inline def setRootFolderIdNull: Self = StObject.set(x, "rootFolderId", null)
    
    inline def setRootFolderIdUndefined: Self = StObject.set(x, "rootFolderId", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTeamDriveThemes(value: js.Array[BackgroundImageLink]): Self = StObject.set(x, "teamDriveThemes", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveThemesNull: Self = StObject.set(x, "teamDriveThemes", null)
    
    inline def setTeamDriveThemesUndefined: Self = StObject.set(x, "teamDriveThemes", js.undefined)
    
    inline def setTeamDriveThemesVarargs(value: BackgroundImageLink*): Self = StObject.set(x, "teamDriveThemes", js.Array(value*))
    
    inline def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}

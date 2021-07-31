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

/**
  * An item with user information and settings.
  */
trait SchemaAbout extends StObject {
  
  /**
    * Information about supported additional roles per file type. The most
    * specific type takes precedence.
    */
  var additionalRoleInfo: js.UndefOr[js.Array[RoleSets]] = js.undefined
  
  /**
    * Whether the user can create Team Drives.
    */
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The domain sharing policy for the current user. Possible values are:   -
    * allowed  - allowedWithWarning  - incomingOnly  - disallowed
    */
  var domainSharingPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The ETag of the item.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The allowable export formats.
    */
  var exportFormats: js.UndefOr[js.Array[Targets]] = js.undefined
  
  /**
    * List of additional features enabled on this account.
    */
  var features: js.UndefOr[js.Array[FeatureName]] = js.undefined
  
  /**
    * The palette of allowable folder colors as RGB hex strings.
    */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The allowable import formats.
    */
  var importFormats: js.UndefOr[js.Array[Targets]] = js.undefined
  
  /**
    * A boolean indicating whether the authenticated app is installed by the
    * authenticated user.
    */
  var isCurrentAppInstalled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is always drive#about.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s language or locale code, as defined by BCP 47, with some
    * extensions from Unicode&#39;s LDML format
    * (http://www.unicode.org/reports/tr35/).
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * The largest change id.
    */
  var largestChangeId: js.UndefOr[String] = js.undefined
  
  /**
    * List of max upload sizes for each file type. The most specific type takes
    * precedence.
    */
  var maxUploadSizes: js.UndefOr[js.Array[SizeType]] = js.undefined
  
  /**
    * The name of the current user.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The current user&#39;s ID as visible in the permissions collection.
    */
  var permissionId: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of storage quota used by different Google services.
    */
  var quotaBytesByService: js.UndefOr[js.Array[BytesUsed]] = js.undefined
  
  /**
    * The total number of quota bytes.
    */
  var quotaBytesTotal: js.UndefOr[String] = js.undefined
  
  /**
    * The number of quota bytes used by Google Drive.
    */
  var quotaBytesUsed: js.UndefOr[String] = js.undefined
  
  /**
    * The number of quota bytes used by all Google apps (Drive, Picasa, etc.).
    */
  var quotaBytesUsedAggregate: js.UndefOr[String] = js.undefined
  
  /**
    * The number of quota bytes used by trashed items.
    */
  var quotaBytesUsedInTrash: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the user&#39;s storage quota. Possible values are:   -
    * LIMITED  - UNLIMITED
    */
  var quotaType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of remaining change ids, limited to no more than 2500.
    */
  var remainingChangeIds: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the root folder.
    */
  var rootFolderId: js.UndefOr[String] = js.undefined
  
  /**
    * A link back to this item.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * A list of themes that are supported for Team Drives.
    */
  var teamDriveThemes: js.UndefOr[js.Array[BackgroundImageLink]] = js.undefined
  
  /**
    * The authenticated user.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
}
object SchemaAbout {
  
  @scala.inline
  def apply(): SchemaAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbout]
  }
  
  @scala.inline
  implicit class SchemaAboutMutableBuilder[Self <: SchemaAbout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalRoleInfo(value: js.Array[RoleSets]): Self = StObject.set(x, "additionalRoleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalRoleInfoUndefined: Self = StObject.set(x, "additionalRoleInfo", js.undefined)
    
    @scala.inline
    def setAdditionalRoleInfoVarargs(value: RoleSets*): Self = StObject.set(x, "additionalRoleInfo", js.Array(value :_*))
    
    @scala.inline
    def setCanCreateTeamDrives(value: Boolean): Self = StObject.set(x, "canCreateTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCreateTeamDrivesUndefined: Self = StObject.set(x, "canCreateTeamDrives", js.undefined)
    
    @scala.inline
    def setDomainSharingPolicy(value: String): Self = StObject.set(x, "domainSharingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainSharingPolicyUndefined: Self = StObject.set(x, "domainSharingPolicy", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setExportFormats(value: js.Array[Targets]): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatsUndefined: Self = StObject.set(x, "exportFormats", js.undefined)
    
    @scala.inline
    def setExportFormatsVarargs(value: Targets*): Self = StObject.set(x, "exportFormats", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[FeatureName]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: FeatureName*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setFolderColorPalette(value: js.Array[String]): Self = StObject.set(x, "folderColorPalette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderColorPaletteUndefined: Self = StObject.set(x, "folderColorPalette", js.undefined)
    
    @scala.inline
    def setFolderColorPaletteVarargs(value: String*): Self = StObject.set(x, "folderColorPalette", js.Array(value :_*))
    
    @scala.inline
    def setImportFormats(value: js.Array[Targets]): Self = StObject.set(x, "importFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportFormatsUndefined: Self = StObject.set(x, "importFormats", js.undefined)
    
    @scala.inline
    def setImportFormatsVarargs(value: Targets*): Self = StObject.set(x, "importFormats", js.Array(value :_*))
    
    @scala.inline
    def setIsCurrentAppInstalled(value: Boolean): Self = StObject.set(x, "isCurrentAppInstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCurrentAppInstalledUndefined: Self = StObject.set(x, "isCurrentAppInstalled", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setLargestChangeId(value: String): Self = StObject.set(x, "largestChangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargestChangeIdUndefined: Self = StObject.set(x, "largestChangeId", js.undefined)
    
    @scala.inline
    def setMaxUploadSizes(value: js.Array[SizeType]): Self = StObject.set(x, "maxUploadSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUploadSizesUndefined: Self = StObject.set(x, "maxUploadSizes", js.undefined)
    
    @scala.inline
    def setMaxUploadSizesVarargs(value: SizeType*): Self = StObject.set(x, "maxUploadSizes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    @scala.inline
    def setQuotaBytesByService(value: js.Array[BytesUsed]): Self = StObject.set(x, "quotaBytesByService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaBytesByServiceUndefined: Self = StObject.set(x, "quotaBytesByService", js.undefined)
    
    @scala.inline
    def setQuotaBytesByServiceVarargs(value: BytesUsed*): Self = StObject.set(x, "quotaBytesByService", js.Array(value :_*))
    
    @scala.inline
    def setQuotaBytesTotal(value: String): Self = StObject.set(x, "quotaBytesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaBytesTotalUndefined: Self = StObject.set(x, "quotaBytesTotal", js.undefined)
    
    @scala.inline
    def setQuotaBytesUsed(value: String): Self = StObject.set(x, "quotaBytesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaBytesUsedAggregate(value: String): Self = StObject.set(x, "quotaBytesUsedAggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaBytesUsedAggregateUndefined: Self = StObject.set(x, "quotaBytesUsedAggregate", js.undefined)
    
    @scala.inline
    def setQuotaBytesUsedInTrash(value: String): Self = StObject.set(x, "quotaBytesUsedInTrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaBytesUsedInTrashUndefined: Self = StObject.set(x, "quotaBytesUsedInTrash", js.undefined)
    
    @scala.inline
    def setQuotaBytesUsedUndefined: Self = StObject.set(x, "quotaBytesUsed", js.undefined)
    
    @scala.inline
    def setQuotaType(value: String): Self = StObject.set(x, "quotaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaTypeUndefined: Self = StObject.set(x, "quotaType", js.undefined)
    
    @scala.inline
    def setRemainingChangeIds(value: String): Self = StObject.set(x, "remainingChangeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingChangeIdsUndefined: Self = StObject.set(x, "remainingChangeIds", js.undefined)
    
    @scala.inline
    def setRootFolderId(value: String): Self = StObject.set(x, "rootFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFolderIdUndefined: Self = StObject.set(x, "rootFolderId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTeamDriveThemes(value: js.Array[BackgroundImageLink]): Self = StObject.set(x, "teamDriveThemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveThemesUndefined: Self = StObject.set(x, "teamDriveThemes", js.undefined)
    
    @scala.inline
    def setTeamDriveThemesVarargs(value: BackgroundImageLink*): Self = StObject.set(x, "teamDriveThemes", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}

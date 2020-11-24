package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.BackgroundImageLink
import typings.googleapis.anon.BytesUsed
import typings.googleapis.anon.FeatureName
import typings.googleapis.anon.RoleSets
import typings.googleapis.anon.SizeType
import typings.googleapis.anon.Targets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An item with user information and settings.
  */
@js.native
trait SchemaAbout extends js.Object {
  
  /**
    * Information about supported additional roles per file type. The most
    * specific type takes precedence.
    */
  var additionalRoleInfo: js.UndefOr[js.Array[RoleSets]] = js.native
  
  /**
    * Whether the user can create Team Drives.
    */
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.native
  
  /**
    * The domain sharing policy for the current user. Possible values are:   -
    * allowed  - allowedWithWarning  - incomingOnly  - disallowed
    */
  var domainSharingPolicy: js.UndefOr[String] = js.native
  
  /**
    * The ETag of the item.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The allowable export formats.
    */
  var exportFormats: js.UndefOr[js.Array[Targets]] = js.native
  
  /**
    * List of additional features enabled on this account.
    */
  var features: js.UndefOr[js.Array[FeatureName]] = js.native
  
  /**
    * The palette of allowable folder colors as RGB hex strings.
    */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The allowable import formats.
    */
  var importFormats: js.UndefOr[js.Array[Targets]] = js.native
  
  /**
    * A boolean indicating whether the authenticated app is installed by the
    * authenticated user.
    */
  var isCurrentAppInstalled: js.UndefOr[Boolean] = js.native
  
  /**
    * This is always drive#about.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s language or locale code, as defined by BCP 47, with some
    * extensions from Unicode&#39;s LDML format
    * (http://www.unicode.org/reports/tr35/).
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * The largest change id.
    */
  var largestChangeId: js.UndefOr[String] = js.native
  
  /**
    * List of max upload sizes for each file type. The most specific type takes
    * precedence.
    */
  var maxUploadSizes: js.UndefOr[js.Array[SizeType]] = js.native
  
  /**
    * The name of the current user.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The current user&#39;s ID as visible in the permissions collection.
    */
  var permissionId: js.UndefOr[String] = js.native
  
  /**
    * The amount of storage quota used by different Google services.
    */
  var quotaBytesByService: js.UndefOr[js.Array[BytesUsed]] = js.native
  
  /**
    * The total number of quota bytes.
    */
  var quotaBytesTotal: js.UndefOr[String] = js.native
  
  /**
    * The number of quota bytes used by Google Drive.
    */
  var quotaBytesUsed: js.UndefOr[String] = js.native
  
  /**
    * The number of quota bytes used by all Google apps (Drive, Picasa, etc.).
    */
  var quotaBytesUsedAggregate: js.UndefOr[String] = js.native
  
  /**
    * The number of quota bytes used by trashed items.
    */
  var quotaBytesUsedInTrash: js.UndefOr[String] = js.native
  
  /**
    * The type of the user&#39;s storage quota. Possible values are:   -
    * LIMITED  - UNLIMITED
    */
  var quotaType: js.UndefOr[String] = js.native
  
  /**
    * The number of remaining change ids, limited to no more than 2500.
    */
  var remainingChangeIds: js.UndefOr[String] = js.native
  
  /**
    * The id of the root folder.
    */
  var rootFolderId: js.UndefOr[String] = js.native
  
  /**
    * A link back to this item.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * A list of themes that are supported for Team Drives.
    */
  var teamDriveThemes: js.UndefOr[js.Array[BackgroundImageLink]] = js.native
  
  /**
    * The authenticated user.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}
object SchemaAbout {
  
  @scala.inline
  def apply(): SchemaAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbout]
  }
  
  @scala.inline
  implicit class SchemaAboutOps[Self <: SchemaAbout] (val x: Self) extends AnyVal {
    
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
    def setAdditionalRoleInfoVarargs(value: RoleSets*): Self = this.set("additionalRoleInfo", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalRoleInfo(value: js.Array[RoleSets]): Self = this.set("additionalRoleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalRoleInfo: Self = this.set("additionalRoleInfo", js.undefined)
    
    @scala.inline
    def setCanCreateTeamDrives(value: Boolean): Self = this.set("canCreateTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanCreateTeamDrives: Self = this.set("canCreateTeamDrives", js.undefined)
    
    @scala.inline
    def setDomainSharingPolicy(value: String): Self = this.set("domainSharingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainSharingPolicy: Self = this.set("domainSharingPolicy", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExportFormatsVarargs(value: Targets*): Self = this.set("exportFormats", js.Array(value :_*))
    
    @scala.inline
    def setExportFormats(value: js.Array[Targets]): Self = this.set("exportFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportFormats: Self = this.set("exportFormats", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: FeatureName*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[FeatureName]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setFolderColorPaletteVarargs(value: String*): Self = this.set("folderColorPalette", js.Array(value :_*))
    
    @scala.inline
    def setFolderColorPalette(value: js.Array[String]): Self = this.set("folderColorPalette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderColorPalette: Self = this.set("folderColorPalette", js.undefined)
    
    @scala.inline
    def setImportFormatsVarargs(value: Targets*): Self = this.set("importFormats", js.Array(value :_*))
    
    @scala.inline
    def setImportFormats(value: js.Array[Targets]): Self = this.set("importFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportFormats: Self = this.set("importFormats", js.undefined)
    
    @scala.inline
    def setIsCurrentAppInstalled(value: Boolean): Self = this.set("isCurrentAppInstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCurrentAppInstalled: Self = this.set("isCurrentAppInstalled", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setLargestChangeId(value: String): Self = this.set("largestChangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargestChangeId: Self = this.set("largestChangeId", js.undefined)
    
    @scala.inline
    def setMaxUploadSizesVarargs(value: SizeType*): Self = this.set("maxUploadSizes", js.Array(value :_*))
    
    @scala.inline
    def setMaxUploadSizes(value: js.Array[SizeType]): Self = this.set("maxUploadSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUploadSizes: Self = this.set("maxUploadSizes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPermissionId(value: String): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionId: Self = this.set("permissionId", js.undefined)
    
    @scala.inline
    def setQuotaBytesByServiceVarargs(value: BytesUsed*): Self = this.set("quotaBytesByService", js.Array(value :_*))
    
    @scala.inline
    def setQuotaBytesByService(value: js.Array[BytesUsed]): Self = this.set("quotaBytesByService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaBytesByService: Self = this.set("quotaBytesByService", js.undefined)
    
    @scala.inline
    def setQuotaBytesTotal(value: String): Self = this.set("quotaBytesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaBytesTotal: Self = this.set("quotaBytesTotal", js.undefined)
    
    @scala.inline
    def setQuotaBytesUsed(value: String): Self = this.set("quotaBytesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaBytesUsed: Self = this.set("quotaBytesUsed", js.undefined)
    
    @scala.inline
    def setQuotaBytesUsedAggregate(value: String): Self = this.set("quotaBytesUsedAggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaBytesUsedAggregate: Self = this.set("quotaBytesUsedAggregate", js.undefined)
    
    @scala.inline
    def setQuotaBytesUsedInTrash(value: String): Self = this.set("quotaBytesUsedInTrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaBytesUsedInTrash: Self = this.set("quotaBytesUsedInTrash", js.undefined)
    
    @scala.inline
    def setQuotaType(value: String): Self = this.set("quotaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaType: Self = this.set("quotaType", js.undefined)
    
    @scala.inline
    def setRemainingChangeIds(value: String): Self = this.set("remainingChangeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemainingChangeIds: Self = this.set("remainingChangeIds", js.undefined)
    
    @scala.inline
    def setRootFolderId(value: String): Self = this.set("rootFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootFolderId: Self = this.set("rootFolderId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setTeamDriveThemesVarargs(value: BackgroundImageLink*): Self = this.set("teamDriveThemes", js.Array(value :_*))
    
    @scala.inline
    def setTeamDriveThemes(value: js.Array[BackgroundImageLink]): Self = this.set("teamDriveThemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDriveThemes: Self = this.set("teamDriveThemes", js.undefined)
    
    @scala.inline
    def setUser(value: SchemaUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}

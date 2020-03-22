package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.AnonBackgroundImageLink
import typings.googleapis.AnonBytesUsed
import typings.googleapis.AnonFeatureName
import typings.googleapis.AnonRoleSets
import typings.googleapis.AnonSizeType
import typings.googleapis.AnonTargets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item with user information and settings.
  */
@js.native
trait SchemaAbout extends js.Object {
  /**
    * Information about supported additional roles per file type. The most
    * specific type takes precedence.
    */
  var additionalRoleInfo: js.UndefOr[js.Array[AnonRoleSets]] = js.native
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
  var exportFormats: js.UndefOr[js.Array[AnonTargets]] = js.native
  /**
    * List of additional features enabled on this account.
    */
  var features: js.UndefOr[js.Array[AnonFeatureName]] = js.native
  /**
    * The palette of allowable folder colors as RGB hex strings.
    */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.native
  /**
    * The allowable import formats.
    */
  var importFormats: js.UndefOr[js.Array[AnonTargets]] = js.native
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
  var maxUploadSizes: js.UndefOr[js.Array[AnonSizeType]] = js.native
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
  var quotaBytesByService: js.UndefOr[js.Array[AnonBytesUsed]] = js.native
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
  var teamDriveThemes: js.UndefOr[js.Array[AnonBackgroundImageLink]] = js.native
  /**
    * The authenticated user.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaAbout {
  @scala.inline
  def apply(
    additionalRoleInfo: js.Array[AnonRoleSets] = null,
    canCreateTeamDrives: js.UndefOr[Boolean] = js.undefined,
    domainSharingPolicy: String = null,
    etag: String = null,
    exportFormats: js.Array[AnonTargets] = null,
    features: js.Array[AnonFeatureName] = null,
    folderColorPalette: js.Array[String] = null,
    importFormats: js.Array[AnonTargets] = null,
    isCurrentAppInstalled: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    languageCode: String = null,
    largestChangeId: String = null,
    maxUploadSizes: js.Array[AnonSizeType] = null,
    name: String = null,
    permissionId: String = null,
    quotaBytesByService: js.Array[AnonBytesUsed] = null,
    quotaBytesTotal: String = null,
    quotaBytesUsed: String = null,
    quotaBytesUsedAggregate: String = null,
    quotaBytesUsedInTrash: String = null,
    quotaType: String = null,
    remainingChangeIds: String = null,
    rootFolderId: String = null,
    selfLink: String = null,
    teamDriveThemes: js.Array[AnonBackgroundImageLink] = null,
    user: SchemaUser = null
  ): SchemaAbout = {
    val __obj = js.Dynamic.literal()
    if (additionalRoleInfo != null) __obj.updateDynamic("additionalRoleInfo")(additionalRoleInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(canCreateTeamDrives)) __obj.updateDynamic("canCreateTeamDrives")(canCreateTeamDrives.asInstanceOf[js.Any])
    if (domainSharingPolicy != null) __obj.updateDynamic("domainSharingPolicy")(domainSharingPolicy.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (exportFormats != null) __obj.updateDynamic("exportFormats")(exportFormats.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (folderColorPalette != null) __obj.updateDynamic("folderColorPalette")(folderColorPalette.asInstanceOf[js.Any])
    if (importFormats != null) __obj.updateDynamic("importFormats")(importFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(isCurrentAppInstalled)) __obj.updateDynamic("isCurrentAppInstalled")(isCurrentAppInstalled.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (largestChangeId != null) __obj.updateDynamic("largestChangeId")(largestChangeId.asInstanceOf[js.Any])
    if (maxUploadSizes != null) __obj.updateDynamic("maxUploadSizes")(maxUploadSizes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (quotaBytesByService != null) __obj.updateDynamic("quotaBytesByService")(quotaBytesByService.asInstanceOf[js.Any])
    if (quotaBytesTotal != null) __obj.updateDynamic("quotaBytesTotal")(quotaBytesTotal.asInstanceOf[js.Any])
    if (quotaBytesUsed != null) __obj.updateDynamic("quotaBytesUsed")(quotaBytesUsed.asInstanceOf[js.Any])
    if (quotaBytesUsedAggregate != null) __obj.updateDynamic("quotaBytesUsedAggregate")(quotaBytesUsedAggregate.asInstanceOf[js.Any])
    if (quotaBytesUsedInTrash != null) __obj.updateDynamic("quotaBytesUsedInTrash")(quotaBytesUsedInTrash.asInstanceOf[js.Any])
    if (quotaType != null) __obj.updateDynamic("quotaType")(quotaType.asInstanceOf[js.Any])
    if (remainingChangeIds != null) __obj.updateDynamic("remainingChangeIds")(remainingChangeIds.asInstanceOf[js.Any])
    if (rootFolderId != null) __obj.updateDynamic("rootFolderId")(rootFolderId.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (teamDriveThemes != null) __obj.updateDynamic("teamDriveThemes")(teamDriveThemes.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAbout]
  }
}


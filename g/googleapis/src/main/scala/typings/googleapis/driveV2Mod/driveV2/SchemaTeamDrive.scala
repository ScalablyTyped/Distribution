package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.AnonAdminManagedRestrictions
import typings.googleapis.AnonCanAddChildrenCanChangeCopyRequiresWriterPermissionRestriction
import typings.googleapis.AnonIdWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a Team Drive.
  */
@js.native
trait SchemaTeamDrive extends js.Object {
  /**
    * An image file and cropping parameters from which a background image for
    * this Team Drive is set. This is a write only field; it can only be set on
    * drive.teamdrives.update requests that don&#39;t set themeId. When
    * specified, all fields of the backgroundImageFile must be set.
    */
  var backgroundImageFile: js.UndefOr[AnonIdWidth] = js.native
  /**
    * A short-lived link to this Team Drive&#39;s background image.
    */
  var backgroundImageLink: js.UndefOr[String] = js.native
  /**
    * Capabilities the current user has on this Team Drive.
    */
  var capabilities: js.UndefOr[AnonCanAddChildrenCanChangeCopyRequiresWriterPermissionRestriction] = js.native
  /**
    * The color of this Team Drive as an RGB hex string. It can only be set on
    * a drive.teamdrives.update request that does not set themeId.
    */
  var colorRgb: js.UndefOr[String] = js.native
  /**
    * The time at which the Team Drive was created (RFC 3339 date-time).
    */
  var createdDate: js.UndefOr[String] = js.native
  /**
    * The ID of this Team Drive which is also the ID of the top level folder of
    * this Team Drive.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#teamDrive
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of this Team Drive.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A set of restrictions that apply to this Team Drive or items inside this
    * Team Drive.
    */
  var restrictions: js.UndefOr[AnonAdminManagedRestrictions] = js.native
  /**
    * The ID of the theme from which the background image and color will be
    * set. The set of possible teamDriveThemes can be retrieved from a
    * drive.about.get response. When not specified on a drive.teamdrives.insert
    * request, a random theme is chosen from which the background image and
    * color are set. This is a write-only field; it can only be set on requests
    * that don&#39;t set colorRgb or backgroundImageFile.
    */
  var themeId: js.UndefOr[String] = js.native
}

object SchemaTeamDrive {
  @scala.inline
  def apply(
    backgroundImageFile: AnonIdWidth = null,
    backgroundImageLink: String = null,
    capabilities: AnonCanAddChildrenCanChangeCopyRequiresWriterPermissionRestriction = null,
    colorRgb: String = null,
    createdDate: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    restrictions: AnonAdminManagedRestrictions = null,
    themeId: String = null
  ): SchemaTeamDrive = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageFile != null) __obj.updateDynamic("backgroundImageFile")(backgroundImageFile.asInstanceOf[js.Any])
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (themeId != null) __obj.updateDynamic("themeId")(themeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTeamDrive]
  }
}


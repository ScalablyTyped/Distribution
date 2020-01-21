package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Export advanced options
  */
@js.native
trait SchemaExportOptions extends js.Object {
  /**
    * Option available for Drive export.
    */
  var driveOptions: js.UndefOr[SchemaDriveExportOptions] = js.native
  /**
    * Option available for groups export.
    */
  var groupsOptions: js.UndefOr[SchemaGroupsExportOptions] = js.native
  /**
    * Option available for hangouts chat export.
    */
  var hangoutsChatOptions: js.UndefOr[SchemaHangoutsChatExportOptions] = js.native
  /**
    * Option available for mail export.
    */
  var mailOptions: js.UndefOr[SchemaMailExportOptions] = js.native
  /**
    * The requested export location.
    */
  var region: js.UndefOr[String] = js.native
}

object SchemaExportOptions {
  @scala.inline
  def apply(
    driveOptions: SchemaDriveExportOptions = null,
    groupsOptions: SchemaGroupsExportOptions = null,
    hangoutsChatOptions: SchemaHangoutsChatExportOptions = null,
    mailOptions: SchemaMailExportOptions = null,
    region: String = null
  ): SchemaExportOptions = {
    val __obj = js.Dynamic.literal()
    if (driveOptions != null) __obj.updateDynamic("driveOptions")(driveOptions.asInstanceOf[js.Any])
    if (groupsOptions != null) __obj.updateDynamic("groupsOptions")(groupsOptions.asInstanceOf[js.Any])
    if (hangoutsChatOptions != null) __obj.updateDynamic("hangoutsChatOptions")(hangoutsChatOptions.asInstanceOf[js.Any])
    if (mailOptions != null) __obj.updateDynamic("mailOptions")(mailOptions.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExportOptions]
  }
}


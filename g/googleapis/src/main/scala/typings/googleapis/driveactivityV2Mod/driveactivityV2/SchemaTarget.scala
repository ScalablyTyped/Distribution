package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the target of activity.
  */
@js.native
trait SchemaTarget extends js.Object {
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[SchemaDriveItem] = js.native
  /**
    * The target is a comment on a Drive file.
    */
  var fileComment: js.UndefOr[SchemaFileComment] = js.native
  /**
    * The target is a Team Drive.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.native
}

object SchemaTarget {
  @scala.inline
  def apply(
    driveItem: SchemaDriveItem = null,
    fileComment: SchemaFileComment = null,
    teamDrive: SchemaTeamDrive = null
  ): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem.asInstanceOf[js.Any])
    if (fileComment != null) __obj.updateDynamic("fileComment")(fileComment.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTarget]
  }
}


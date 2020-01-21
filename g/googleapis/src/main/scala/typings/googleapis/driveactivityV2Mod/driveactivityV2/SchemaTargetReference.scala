package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A lightweight reference to the target of activity.
  */
@js.native
trait SchemaTargetReference extends js.Object {
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[SchemaDriveItemReference] = js.native
  /**
    * The target is a Team Drive.
    */
  var teamDrive: js.UndefOr[SchemaTeamDriveReference] = js.native
}

object SchemaTargetReference {
  @scala.inline
  def apply(driveItem: SchemaDriveItemReference = null, teamDrive: SchemaTeamDriveReference = null): SchemaTargetReference = {
    val __obj = js.Dynamic.literal()
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetReference]
  }
}


package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the owner of a Drive item.
  */
@js.native
trait SchemaOwner extends js.Object {
  /**
    * The domain of the Drive item owner.
    */
  var domain: js.UndefOr[SchemaDomain] = js.native
  /**
    * The Team Drive that owns the Drive item.
    */
  var teamDrive: js.UndefOr[SchemaTeamDriveReference] = js.native
  /**
    * The user that owns the Drive item.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaOwner {
  @scala.inline
  def apply(domain: SchemaDomain = null, teamDrive: SchemaTeamDriveReference = null, user: SchemaUser = null): SchemaOwner = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOwner]
  }
}


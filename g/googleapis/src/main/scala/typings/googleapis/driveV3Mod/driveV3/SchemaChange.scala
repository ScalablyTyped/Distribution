package typings.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A change to a file or Team Drive.
  */
@js.native
trait SchemaChange extends js.Object {
  /**
    * The updated state of the file. Present if the type is file and the file
    * has not been removed from this list of changes.
    */
  var file: js.UndefOr[SchemaFile] = js.native
  /**
    * The ID of the file which has changed.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#change&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether the file or Team Drive has been removed from this list of
    * changes, for example by deletion or loss of access.
    */
  var removed: js.UndefOr[Boolean] = js.native
  /**
    * The updated state of the Team Drive. Present if the type is teamDrive,
    * the user is still a member of the Team Drive, and the Team Drive has not
    * been removed.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.native
  /**
    * The ID of the Team Drive associated with this change.
    */
  var teamDriveId: js.UndefOr[String] = js.native
  /**
    * The time of this change (RFC 3339 date-time).
    */
  var time: js.UndefOr[String] = js.native
  /**
    * The type of the change. Possible values are file and teamDrive.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaChange {
  @scala.inline
  def apply(
    file: SchemaFile = null,
    fileId: String = null,
    kind: String = null,
    removed: js.UndefOr[Boolean] = js.undefined,
    teamDrive: SchemaTeamDrive = null,
    teamDriveId: String = null,
    time: String = null,
    `type`: String = null
  ): SchemaChange = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed.get.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChange]
  }
}


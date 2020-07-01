package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a change to a file or Team Drive.
  */
@js.native
trait SchemaChange extends js.Object {
  /**
    * Whether the file or Team Drive has been removed from this list of
    * changes, for example by deletion or loss of access.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The updated state of the file. Present if the type is file and the file
    * has not been removed from this list of changes.
    */
  var file: js.UndefOr[SchemaFile] = js.native
  /**
    * The ID of the file associated with this change.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * The ID of the change.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#change.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time of this modification.
    */
  var modificationDate: js.UndefOr[String] = js.native
  /**
    * A link back to this change.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The updated state of the Team Drive. Present if the type is teamDrive,
    * the user is still a member of the Team Drive, and the Team Drive has not
    * been deleted.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.native
  /**
    * The ID of the Team Drive associated with this change.
    */
  var teamDriveId: js.UndefOr[String] = js.native
  /**
    * The type of the change. Possible values are file and teamDrive.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaChange {
  @scala.inline
  def apply(
    deleted: js.UndefOr[Boolean] = js.undefined,
    file: SchemaFile = null,
    fileId: String = null,
    id: String = null,
    kind: String = null,
    modificationDate: String = null,
    selfLink: String = null,
    teamDrive: SchemaTeamDrive = null,
    teamDriveId: String = null,
    `type`: String = null
  ): SchemaChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (modificationDate != null) __obj.updateDynamic("modificationDate")(modificationDate.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChange]
  }
}


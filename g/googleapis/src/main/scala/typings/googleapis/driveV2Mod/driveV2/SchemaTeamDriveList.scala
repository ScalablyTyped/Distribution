package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Team Drives.
  */
@js.native
trait SchemaTeamDriveList extends js.Object {
  /**
    * The list of Team Drives.
    */
  var items: js.UndefOr[js.Array[SchemaTeamDrive]] = js.native
  /**
    * This is always drive#teamDriveList
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of Team Drives.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaTeamDriveList {
  @scala.inline
  def apply(items: js.Array[SchemaTeamDrive] = null, kind: String = null, nextPageToken: String = null): SchemaTeamDriveList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTeamDriveList]
  }
}


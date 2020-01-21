package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Team Drives to search
  */
@js.native
trait SchemaTeamDriveInfo extends js.Object {
  /**
    * List of Team Drive ids, as provided by &lt;a
    * href=&quot;https://developers.google.com/drive&quot;&gt;Drive
    * API&lt;/a&gt;.
    */
  var teamDriveIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTeamDriveInfo {
  @scala.inline
  def apply(teamDriveIds: js.Array[String] = null): SchemaTeamDriveInfo = {
    val __obj = js.Dynamic.literal()
    if (teamDriveIds != null) __obj.updateDynamic("teamDriveIds")(teamDriveIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTeamDriveInfo]
  }
}


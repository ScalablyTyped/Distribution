package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Query options for Drive holds.
  */
@js.native
trait SchemaHeldDriveQuery extends js.Object {
  /**
    * If true, include files in Team Drives in the hold.
    */
  var includeTeamDriveFiles: js.UndefOr[Boolean] = js.native
}

object SchemaHeldDriveQuery {
  @scala.inline
  def apply(includeTeamDriveFiles: js.UndefOr[Boolean] = js.undefined): SchemaHeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTeamDriveFiles)) __obj.updateDynamic("includeTeamDriveFiles")(includeTeamDriveFiles.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHeldDriveQuery]
  }
}


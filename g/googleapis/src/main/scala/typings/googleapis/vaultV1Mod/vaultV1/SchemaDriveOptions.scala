package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive search advanced options
  */
@js.native
trait SchemaDriveOptions extends js.Object {
  /**
    * Set to true to include Team Drive.
    */
  var includeTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * Search the versions of the Drive file as of the reference date. These
    * timestamps are in GMT and rounded down to the given date.
    */
  var versionDate: js.UndefOr[String] = js.native
}

object SchemaDriveOptions {
  @scala.inline
  def apply(includeTeamDrives: js.UndefOr[Boolean] = js.undefined, versionDate: String = null): SchemaDriveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTeamDrives)) __obj.updateDynamic("includeTeamDrives")(includeTeamDrives.get.asInstanceOf[js.Any])
    if (versionDate != null) __obj.updateDynamic("versionDate")(versionDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDriveOptions]
  }
}


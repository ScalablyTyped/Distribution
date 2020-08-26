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
  def apply(): SchemaHeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldDriveQuery]
  }
  @scala.inline
  implicit class SchemaHeldDriveQueryOps[Self <: SchemaHeldDriveQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIncludeTeamDriveFiles(value: Boolean): Self = this.set("includeTeamDriveFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeTeamDriveFiles: Self = this.set("includeTeamDriveFiles", js.undefined)
  }
  
}


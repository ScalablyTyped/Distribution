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
  def apply(): SchemaTeamDriveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDriveInfo]
  }
  @scala.inline
  implicit class SchemaTeamDriveInfoOps[Self <: SchemaTeamDriveInfo] (val x: Self) extends AnyVal {
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
    def setTeamDriveIdsVarargs(value: String*): Self = this.set("teamDriveIds", js.Array(value :_*))
    @scala.inline
    def setTeamDriveIds(value: js.Array[String]): Self = this.set("teamDriveIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDriveIds: Self = this.set("teamDriveIds", js.undefined)
  }
  
}


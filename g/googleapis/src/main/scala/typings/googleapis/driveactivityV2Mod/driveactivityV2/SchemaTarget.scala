package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the target of activity.
  */
@js.native
trait SchemaTarget extends js.Object {
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[SchemaDriveItem] = js.native
  /**
    * The target is a comment on a Drive file.
    */
  var fileComment: js.UndefOr[SchemaFileComment] = js.native
  /**
    * The target is a Team Drive.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.native
}

object SchemaTarget {
  @scala.inline
  def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  @scala.inline
  implicit class SchemaTargetOps[Self <: SchemaTarget] (val x: Self) extends AnyVal {
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
    def setDriveItem(value: SchemaDriveItem): Self = this.set("driveItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveItem: Self = this.set("driveItem", js.undefined)
    @scala.inline
    def setFileComment(value: SchemaFileComment): Self = this.set("fileComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileComment: Self = this.set("fileComment", js.undefined)
    @scala.inline
    def setTeamDrive(value: SchemaTeamDrive): Self = this.set("teamDrive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDrive: Self = this.set("teamDrive", js.undefined)
  }
  
}


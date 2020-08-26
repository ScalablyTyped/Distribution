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
  def apply(): SchemaOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOwner]
  }
  @scala.inline
  implicit class SchemaOwnerOps[Self <: SchemaOwner] (val x: Self) extends AnyVal {
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
    def setDomain(value: SchemaDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setTeamDrive(value: SchemaTeamDriveReference): Self = this.set("teamDrive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDrive: Self = this.set("teamDrive", js.undefined)
    @scala.inline
    def setUser(value: SchemaUser): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}


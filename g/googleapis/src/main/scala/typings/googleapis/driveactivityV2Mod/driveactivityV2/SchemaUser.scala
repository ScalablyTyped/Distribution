package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an end user.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * A user whose account has since been deleted.
    */
  var deletedUser: js.UndefOr[SchemaDeletedUser] = js.native
  /**
    * A known user.
    */
  var knownUser: js.UndefOr[SchemaKnownUser] = js.native
  /**
    * A user about whom nothing is currently known.
    */
  var unknownUser: js.UndefOr[SchemaUnknownUser] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  @scala.inline
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
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
    def setDeletedUser(value: SchemaDeletedUser): Self = this.set("deletedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedUser: Self = this.set("deletedUser", js.undefined)
    @scala.inline
    def setKnownUser(value: SchemaKnownUser): Self = this.set("knownUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnownUser: Self = this.set("knownUser", js.undefined)
    @scala.inline
    def setUnknownUser(value: SchemaUnknownUser): Self = this.set("unknownUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknownUser: Self = this.set("unknownUser", js.undefined)
  }
  
}


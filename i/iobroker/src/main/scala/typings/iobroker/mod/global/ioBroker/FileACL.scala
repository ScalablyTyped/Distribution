package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines access rights for a single file */
@js.native
trait FileACL extends js.Object {
  /** Full name of the user who owns this file, e.g. "system.user.admin" */
  var owner: String = js.native
  /** Full name of the group who owns this file, e.g. "system.group.administrator" */
  var ownerGroup: String = js.native
  /** Linux-type permissions defining access to this file */
  var permissions: Double = js.native
}

object FileACL {
  @scala.inline
  def apply(owner: String, ownerGroup: String, permissions: Double): FileACL = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerGroup = ownerGroup.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileACL]
  }
  @scala.inline
  implicit class FileACLOps[Self <: FileACL] (val x: Self) extends AnyVal {
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerGroup(value: String): Self = this.set("ownerGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: Double): Self = this.set("permissions", value.asInstanceOf[js.Any])
  }
  
}


package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines access rights for a single object type */
@js.native
trait ObjectOperationPermissions extends js.Object {
  /** Whether a user may create objects of this type */
  var create: Boolean = js.native
  /** Whether a user may delete objects of this type */
  var delete: Boolean = js.native
  /** Whether a user may enumerate objects of this type */
  var list: Boolean = js.native
  /** Whether a user may read objects of this type */
  var read: Boolean = js.native
  /** Whether a user may write objects of this type */
  var write: Boolean = js.native
}

object ObjectOperationPermissions {
  @scala.inline
  def apply(create: Boolean, delete: Boolean, list: Boolean, read: Boolean, write: Boolean): ObjectOperationPermissions = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOperationPermissions]
  }
  @scala.inline
  implicit class ObjectOperationPermissionsOps[Self <: ObjectOperationPermissions] (val x: Self) extends AnyVal {
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
    def setCreate(value: Boolean): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: Boolean): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: Boolean): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrite(value: Boolean): Self = this.set("write", value.asInstanceOf[js.Any])
  }
  
}


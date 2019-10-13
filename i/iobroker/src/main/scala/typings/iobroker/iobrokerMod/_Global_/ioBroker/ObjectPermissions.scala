package typings.iobroker.iobrokerMod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the rights a user or group has to change objects */
trait ObjectPermissions extends js.Object {
  /** The access rights for files */
  var file: ObjectOperationPermissions
  /** The access rights for objects */
  var `object`: ObjectOperationPermissions
  /** The access rights for states */
  var state: js.UndefOr[ObjectOperationPermissions] = js.undefined
  /** The access rights for users/groups */
  var users: ObjectOperationPermissions
}

object ObjectPermissions {
  @scala.inline
  def apply(
    file: ObjectOperationPermissions,
    `object`: ObjectOperationPermissions,
    users: ObjectOperationPermissions,
    state: ObjectOperationPermissions = null
  ): ObjectPermissions = {
    val __obj = js.Dynamic.literal(file = file, users = users)
    __obj.updateDynamic("object")(`object`)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ObjectPermissions]
  }
}


package typings.iobroker.mod._Global_.ioBroker

import typings.iobroker.AnonExecute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defined the complete set of access rights a user has */
trait PermissionSet extends ObjectPermissions {
  /** The name of the groups this ACL was merged from */
  var groups: js.Array[String]
  /** The access rights for certain commands */
  var other: AnonExecute
  /** The name of the user this ACL is for */
  var user: String
}

object PermissionSet {
  @scala.inline
  def apply(
    file: ObjectOperationPermissions,
    groups: js.Array[String],
    `object`: ObjectOperationPermissions,
    other: AnonExecute,
    user: String,
    users: ObjectOperationPermissions,
    state: ObjectOperationPermissions = null
  ): PermissionSet = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionSet]
  }
}


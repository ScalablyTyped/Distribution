package typings.iobroker.iobrokerMod._Global_.ioBroker

import typings.iobroker.Anon_Execute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defined the complete set of access rights a user has */
trait PermissionSet extends ObjectPermissions {
  /** The name of the groups this ACL was merged from */
  var groups: js.Array[String]
  /** The access rights for certain commands */
  var other: Anon_Execute
  /** The name of the user this ACL is for */
  var user: String
}

object PermissionSet {
  @scala.inline
  def apply(
    file: ObjectOperationPermissions,
    groups: js.Array[String],
    `object`: ObjectOperationPermissions,
    other: Anon_Execute,
    user: String,
    users: ObjectOperationPermissions,
    state: ObjectOperationPermissions = null
  ): PermissionSet = {
    val __obj = js.Dynamic.literal(file = file, groups = groups, other = other, user = user, users = users)
    __obj.updateDynamic("object")(`object`)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PermissionSet]
  }
}


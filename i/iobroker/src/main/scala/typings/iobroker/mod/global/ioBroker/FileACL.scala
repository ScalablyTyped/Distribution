package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines access rights for a single file */
trait FileACL extends js.Object {
  /** Full name of the user who owns this file, e.g. "system.user.admin" */
  var owner: String
  /** Full name of the group who owns this file, e.g. "system.group.administrator" */
  var ownerGroup: String
  /** Linux-type permissions defining access to this file */
  var permissions: Double
}

object FileACL {
  @scala.inline
  def apply(owner: String, ownerGroup: String, permissions: Double): FileACL = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerGroup = ownerGroup.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileACL]
  }
}


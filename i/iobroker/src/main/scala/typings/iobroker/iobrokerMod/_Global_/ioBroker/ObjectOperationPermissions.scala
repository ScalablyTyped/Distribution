package typings.iobroker.iobrokerMod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines access rights for a single object type */
trait ObjectOperationPermissions extends js.Object {
  /** Whether a user may create objects of this type */
  var create: Boolean
  /** Whether a user may delete objects of this type */
  var delete: Boolean
  /** Whether a user may enumerate objects of this type */
  var list: Boolean
  /** Whether a user may read objects of this type */
  var read: Boolean
  /** Whether a user may write objects of this type */
  var write: Boolean
}

object ObjectOperationPermissions {
  @scala.inline
  def apply(create: Boolean, delete: Boolean, list: Boolean, read: Boolean, write: Boolean): ObjectOperationPermissions = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, list = list, read = read, write = write)
  
    __obj.asInstanceOf[ObjectOperationPermissions]
  }
}


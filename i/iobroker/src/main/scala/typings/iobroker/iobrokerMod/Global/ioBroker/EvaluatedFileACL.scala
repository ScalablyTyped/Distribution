package typings.iobroker.iobrokerMod.Global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines access rights for a single file, applied to a user or group */
trait EvaluatedFileACL extends FileACL {
  /** Whether the user may read the file */
  var read: Boolean
  /** Whether the user may write the file */
  var write: Boolean
}

object EvaluatedFileACL {
  @scala.inline
  def apply(owner: String, ownerGroup: String, permissions: Double, read: Boolean, write: Boolean): EvaluatedFileACL = {
    val __obj = js.Dynamic.literal(owner = owner, ownerGroup = ownerGroup, permissions = permissions, read = read, write = write)
  
    __obj.asInstanceOf[EvaluatedFileACL]
  }
}


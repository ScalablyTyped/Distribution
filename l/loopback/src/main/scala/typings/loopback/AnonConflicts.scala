package typings.loopback

import typings.loopback.mod.Conflict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConflicts extends js.Object {
  var conflicts: js.Array[Conflict]
  var params: js.Any
}

object AnonConflicts {
  @scala.inline
  def apply(conflicts: js.Array[Conflict], params: js.Any): AnonConflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConflicts]
  }
}


package typings.loopback.anon

import typings.loopback.mod.Conflict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conflicts extends js.Object {
  var conflicts: js.Array[Conflict]
  var params: js.Any
}

object Conflicts {
  @scala.inline
  def apply(conflicts: js.Array[Conflict], params: js.Any): Conflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
}


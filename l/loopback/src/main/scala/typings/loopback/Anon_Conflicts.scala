package typings.loopback

import typings.loopback.loopbackMod.Conflict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Conflicts extends js.Object {
  var conflicts: js.Array[Conflict]
  var params: js.Any
}

object Anon_Conflicts {
  @scala.inline
  def apply(conflicts: js.Array[Conflict], params: js.Any): Anon_Conflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts, params = params)
  
    __obj.asInstanceOf[Anon_Conflicts]
  }
}


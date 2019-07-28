package typings.jsonDashPatch.jsonDashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Patch extends js.Object {
  var path: String
}

object Patch {
  @scala.inline
  def apply(path: String): Patch = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[Patch]
  }
}


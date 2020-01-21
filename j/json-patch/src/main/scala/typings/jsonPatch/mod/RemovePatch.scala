package typings.jsonPatch.mod

import typings.jsonPatch.jsonPatchStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovePatch
  extends Patch
     with OpPatch {
  var op: remove
}

object RemovePatch {
  @scala.inline
  def apply(op: remove, path: String): RemovePatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemovePatch]
  }
}


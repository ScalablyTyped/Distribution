package typings.jsonPatch.mod

import typings.jsonPatch.jsonPatchStrings.copy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyPatch
  extends Patch
     with OpPatch {
  var from: String
  var op: copy
}

object CopyPatch {
  @scala.inline
  def apply(from: String, op: copy, path: String): CopyPatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CopyPatch]
  }
}


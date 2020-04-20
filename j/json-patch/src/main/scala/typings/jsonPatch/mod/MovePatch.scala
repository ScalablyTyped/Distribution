package typings.jsonPatch.mod

import typings.jsonPatch.jsonPatchStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovePatch
  extends Patch
     with OpPatch {
  var from: String
  var op: move
}

object MovePatch {
  @scala.inline
  def apply(from: String, op: move, path: String): MovePatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovePatch]
  }
}


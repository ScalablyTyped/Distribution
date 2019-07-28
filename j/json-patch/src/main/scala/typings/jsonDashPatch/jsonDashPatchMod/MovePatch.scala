package typings.jsonDashPatch.jsonDashPatchMod

import typings.jsonDashPatch.jsonDashPatchStrings.move
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
    val __obj = js.Dynamic.literal(from = from, op = op, path = path)
  
    __obj.asInstanceOf[MovePatch]
  }
}


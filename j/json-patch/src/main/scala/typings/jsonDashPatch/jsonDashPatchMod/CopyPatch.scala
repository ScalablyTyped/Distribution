package typings.jsonDashPatch.jsonDashPatchMod

import typings.jsonDashPatch.jsonDashPatchStrings.copy
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
    val __obj = js.Dynamic.literal(from = from, op = op, path = path)
  
    __obj.asInstanceOf[CopyPatch]
  }
}


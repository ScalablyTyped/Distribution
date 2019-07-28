package typings.jsonDashPatch.jsonDashPatchMod

import typings.jsonDashPatch.jsonDashPatchStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplacePatch
  extends Patch
     with OpPatch {
  var op: replace
  var value: js.Any
}

object ReplacePatch {
  @scala.inline
  def apply(op: replace, path: String, value: js.Any): ReplacePatch = {
    val __obj = js.Dynamic.literal(op = op, path = path, value = value)
  
    __obj.asInstanceOf[ReplacePatch]
  }
}


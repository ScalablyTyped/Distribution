package typings
package jsonDashPatchLib.jsonDashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplacePatch
  extends Patch
     with OpPatch {
  var op: jsonDashPatchLib.jsonDashPatchLibStrings.replace
  var value: js.Any
}

object ReplacePatch {
  @scala.inline
  def apply(op: jsonDashPatchLib.jsonDashPatchLibStrings.replace, path: java.lang.String, value: js.Any): ReplacePatch = {
    val __obj = js.Dynamic.literal(op = op, path = path, value = value)
  
    __obj.asInstanceOf[ReplacePatch]
  }
}


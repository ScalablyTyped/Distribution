package typings
package jsonDashPatchLib.jsonDashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPatch
  extends Patch
     with OpPatch {
  var op: jsonDashPatchLib.jsonDashPatchLibStrings.add
  var value: js.Any
}

object AddPatch {
  @scala.inline
  def apply(op: jsonDashPatchLib.jsonDashPatchLibStrings.add, path: java.lang.String, value: js.Any): AddPatch = {
    val __obj = js.Dynamic.literal(op = op, path = path, value = value)
  
    __obj.asInstanceOf[AddPatch]
  }
}


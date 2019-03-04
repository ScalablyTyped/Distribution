package typings
package jsonDashPatchLib.jsonDashPatchMod.jsonpatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyPatch
  extends Patch
     with OpPatch {
  var from: java.lang.String
  var op: jsonDashPatchLib.jsonDashPatchLibStrings.copy
}

object CopyPatch {
  @scala.inline
  def apply(from: java.lang.String, op: jsonDashPatchLib.jsonDashPatchLibStrings.copy, path: java.lang.String): CopyPatch = {
    val __obj = js.Dynamic.literal(from = from, op = op, path = path)
  
    __obj.asInstanceOf[CopyPatch]
  }
}


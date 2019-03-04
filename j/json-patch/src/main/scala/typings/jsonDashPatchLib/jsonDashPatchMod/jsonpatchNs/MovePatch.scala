package typings
package jsonDashPatchLib.jsonDashPatchMod.jsonpatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovePatch
  extends Patch
     with OpPatch {
  var from: java.lang.String
  var op: jsonDashPatchLib.jsonDashPatchLibStrings.move
}

object MovePatch {
  @scala.inline
  def apply(from: java.lang.String, op: jsonDashPatchLib.jsonDashPatchLibStrings.move, path: java.lang.String): MovePatch = {
    val __obj = js.Dynamic.literal(from = from, op = op, path = path)
  
    __obj.asInstanceOf[MovePatch]
  }
}


package typings
package jsonDashPatchLib.jsonDashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-patch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("apply")
  def apply(document: js.Any, patches: js.Array[jsonDashPatchLib.jsonDashPatchMod.jsonpatchNs.OpPatch]): js.Any = js.native
  def compile(patches: js.Array[jsonDashPatchLib.jsonDashPatchMod.jsonpatchNs.OpPatch]): js.Function1[/* document */ js.Any, _] = js.native
}


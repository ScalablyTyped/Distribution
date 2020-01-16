package typings.json8DashPatch.json8DashPatchMod

import typings.json8DashPatch.Anon_False
import typings.json8DashPatch.Anon_Reversible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json8-patch", "patch")
@js.native
object patch extends js.Object {
  def apply(doc: js.Any, patch: JsonPatch): PatchResult = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: Anon_False): PatchResult = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: Anon_Reversible): PatchResultWithRevert = js.native
}


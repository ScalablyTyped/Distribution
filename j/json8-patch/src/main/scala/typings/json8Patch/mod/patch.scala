package typings.json8Patch.mod

import typings.json8Patch.AnonFalse
import typings.json8Patch.AnonReversible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json8-patch", "patch")
@js.native
object patch extends js.Object {
  def apply(doc: js.Any, patch: JsonPatch): PatchResult = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: AnonFalse): PatchResult = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: AnonReversible): PatchResultWithRevert = js.native
}


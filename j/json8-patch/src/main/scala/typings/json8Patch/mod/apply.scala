package typings.json8Patch.mod

import typings.json8Patch.Anon0
import typings.json8Patch.AnonReversible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json8-patch", "apply")
@js.native
object apply extends js.Object {
  def apply(doc: js.Any, patch: JsonPatch): ApplyResult = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: Anon0): ApplyResultWithRevert = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: AnonReversible): ApplyResult = js.native
}


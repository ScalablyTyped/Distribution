package typings.json8Patch.mod

import typings.json8Patch.AnonFalse
import typings.json8Patch.AnonReversible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json8-patch", "apply")
@js.native
object apply extends js.Object {
  def apply(doc: js.Any, patch: JsonPatch): ApplyResult = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: AnonFalse): ApplyResult = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: AnonReversible): ApplyResultWithRevert = js.native
}


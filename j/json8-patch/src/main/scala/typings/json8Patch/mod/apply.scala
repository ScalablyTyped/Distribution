package typings.json8Patch.mod

import typings.json8Patch.anon.Reversible
import typings.json8Patch.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json8-patch", "apply")
@js.native
object apply extends js.Object {
  
  def apply(doc: js.Any, patch: JsonPatch): ApplyResult = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: Reversible): ApplyResult = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: `0`): ApplyResultWithRevert = js.native
}

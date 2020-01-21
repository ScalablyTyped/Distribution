package typings.jsonPatchGen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonPatchGen.jsonPatchGenStrings.replace
  - typings.jsonPatchGen.jsonPatchGenStrings.add
  - typings.jsonPatchGen.jsonPatchGenStrings.remove
*/
trait PatchOperation extends js.Object

object PatchOperation {
  @scala.inline
  def add: typings.jsonPatchGen.jsonPatchGenStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def remove: typings.jsonPatchGen.jsonPatchGenStrings.remove = this.cast("remove")
  @scala.inline
  def replace: typings.jsonPatchGen.jsonPatchGenStrings.replace = this.cast("replace")
}


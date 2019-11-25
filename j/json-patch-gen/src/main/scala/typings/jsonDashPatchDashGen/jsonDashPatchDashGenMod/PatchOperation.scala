package typings.jsonDashPatchDashGen.jsonDashPatchDashGenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.replace
  - typings.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.add
  - typings.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.remove
*/
trait PatchOperation extends js.Object

object PatchOperation {
  @scala.inline
  def add: typings.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def remove: typings.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.remove = this.cast("remove")
  @scala.inline
  def replace: typings.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.replace = this.cast("replace")
}


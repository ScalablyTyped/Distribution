package typings.json8DashPatch.json8DashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyResultWithRevert extends ApplyResult {
  var revert: JsonPatch
}

object ApplyResultWithRevert {
  @scala.inline
  def apply(doc: js.Any, revert: JsonPatch): ApplyResultWithRevert = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplyResultWithRevert]
  }
}


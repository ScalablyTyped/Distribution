package typings.jestDashDiff

import typings.jestDashDiff.buildCleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Diffs extends js.Object {
  var diffs: js.Array[Diff]
  var isMultiline: Boolean
}

object Anon_Diffs {
  @scala.inline
  def apply(diffs: js.Array[Diff], isMultiline: Boolean): Anon_Diffs = {
    val __obj = js.Dynamic.literal(diffs = diffs.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Diffs]
  }
}


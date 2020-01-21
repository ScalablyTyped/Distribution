package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiffs extends js.Object {
  var diffs: js.Array[Diff]
  var isMultiline: Boolean
}

object AnonDiffs {
  @scala.inline
  def apply(diffs: js.Array[Diff], isMultiline: Boolean): AnonDiffs = {
    val __obj = js.Dynamic.literal(diffs = diffs.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDiffs]
  }
}


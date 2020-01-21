package typings.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MagicStringOptions extends js.Object {
  var filename: String
  var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange]
}

object MagicStringOptions {
  @scala.inline
  def apply(filename: String, indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange]): MagicStringOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], indentExclusionRanges = indentExclusionRanges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MagicStringOptions]
  }
}


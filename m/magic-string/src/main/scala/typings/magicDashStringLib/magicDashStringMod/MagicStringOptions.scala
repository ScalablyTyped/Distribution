package typings
package magicDashStringLib.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MagicStringOptions extends js.Object {
  var filename: java.lang.String
  var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange]
}

object MagicStringOptions {
  @scala.inline
  def apply(filename: java.lang.String, indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange]): MagicStringOptions = {
    val __obj = js.Dynamic.literal(filename = filename, indentExclusionRanges = indentExclusionRanges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MagicStringOptions]
  }
}


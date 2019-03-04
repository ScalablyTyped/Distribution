package typings
package markedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: markedLib.markedLibStrings.center | markedLib.markedLibStrings.left | markedLib.markedLibStrings.right | scala.Null
  var header: scala.Boolean
}

object Anon_Align {
  @scala.inline
  def apply(
    header: scala.Boolean,
    align: markedLib.markedLibStrings.center | markedLib.markedLibStrings.left | markedLib.markedLibStrings.right = null
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(header = header)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Align]
  }
}


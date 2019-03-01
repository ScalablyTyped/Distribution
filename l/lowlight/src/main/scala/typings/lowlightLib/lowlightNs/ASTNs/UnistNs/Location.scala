package typings
package lowlightLib.lowlightNs.ASTNs.UnistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var end: Position
  var indent: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var start: Position
}

object Location {
  @scala.inline
  def apply(end: Position, start: Position, indent: js.Array[scala.Double] = null): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    __obj.asInstanceOf[Location]
  }
}


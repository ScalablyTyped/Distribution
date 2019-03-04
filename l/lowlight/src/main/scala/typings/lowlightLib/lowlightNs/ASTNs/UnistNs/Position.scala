package typings
package lowlightLib.lowlightNs.ASTNs.UnistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object Position {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, offset: scala.Int | scala.Double = null): Position = {
    val __obj = js.Dynamic.literal(column = column, line = line)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}


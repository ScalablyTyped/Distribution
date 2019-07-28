package typings.lowlight.lowlightNs.ASTNs.UnistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: Double
  var line: Double
  var offset: js.UndefOr[Double] = js.undefined
}

object Position {
  @scala.inline
  def apply(column: Double, line: Double, offset: Int | Double = null): Position = {
    val __obj = js.Dynamic.literal(column = column, line = line)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}


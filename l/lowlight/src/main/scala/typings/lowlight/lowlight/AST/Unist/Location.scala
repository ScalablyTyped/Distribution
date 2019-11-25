package typings.lowlight.lowlight.AST.Unist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var end: Position
  var indent: js.UndefOr[js.Array[Double]] = js.undefined
  var start: Position
}

object Location {
  @scala.inline
  def apply(end: Position, start: Position, indent: js.Array[Double] = null): Location = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}


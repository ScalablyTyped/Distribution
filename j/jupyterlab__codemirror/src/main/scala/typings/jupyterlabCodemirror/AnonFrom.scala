package typings.jupyterlabCodemirror

import typings.codemirror.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var from: Position
  var to: Position
}

object AnonFrom {
  @scala.inline
  def apply(from: Position, to: Position): AnonFrom = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFrom]
  }
}


package typings.lowlight.lowlight.AST.Unist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var data: js.UndefOr[Data] = js.undefined
  var position: js.UndefOr[Location] = js.undefined
  var `type`: String
}

object Node {
  @scala.inline
  def apply(`type`: String, data: Data = null, position: Location = null): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}


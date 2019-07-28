package typings.lowlight.lowlightNs.ASTNs.UnistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent extends Node {
  var children: js.Array[Node]
}

object Parent {
  @scala.inline
  def apply(children: js.Array[Node], `type`: String, data: Data = null, position: Location = null): Parent = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Parent]
  }
}


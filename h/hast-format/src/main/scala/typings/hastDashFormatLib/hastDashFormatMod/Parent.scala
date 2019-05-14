package typings
package hastDashFormatLib.hastDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent
  extends unistLib.unistMod.Parent {
  /**
    * List representing the children of a node.
    */
  @JSName("children")
  var children_Parent: js.Array[Element | DocType | Comment | Text]
}

object Parent {
  @scala.inline
  def apply(
    children: js.Array[Element | DocType | Comment | Text],
    `type`: java.lang.String,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Parent = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Parent]
  }
}


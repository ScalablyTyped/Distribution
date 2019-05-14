package typings
package hastDashFormatLib.hastDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends Parent {
  /**
    * Represents this variant of a Node.
    */
  @JSName("type")
  var type_Root: hastDashFormatLib.hastDashFormatLibStrings.root
}

object Root {
  @scala.inline
  def apply(
    children: js.Array[Element | DocType | Comment | Text],
    `type`: hastDashFormatLib.hastDashFormatLibStrings.root,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Root = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Root]
  }
}


package typings
package lowlightLib.lowlightNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root
  extends lowlightLib.lowlightNs.ASTNs.UnistNs.Parent
     with lowlightLib.lowlightNs.HastNode {
  @JSName("type")
  var type_Root: lowlightLib.lowlightLibStrings.root
}

object Root {
  @scala.inline
  def apply(
    children: js.Array[lowlightLib.lowlightNs.ASTNs.UnistNs.Node],
    `type`: lowlightLib.lowlightLibStrings.root,
    data: lowlightLib.lowlightNs.ASTNs.UnistNs.Data = null,
    position: lowlightLib.lowlightNs.ASTNs.UnistNs.Location = null
  ): Root = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Root]
  }
}


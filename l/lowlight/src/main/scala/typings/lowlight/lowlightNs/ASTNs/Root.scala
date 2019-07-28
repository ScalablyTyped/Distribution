package typings.lowlight.lowlightNs.ASTNs

import typings.lowlight.lowlightNs.ASTNs.UnistNs.Data
import typings.lowlight.lowlightNs.ASTNs.UnistNs.Location
import typings.lowlight.lowlightNs.ASTNs.UnistNs.Node
import typings.lowlight.lowlightNs.ASTNs.UnistNs.Parent
import typings.lowlight.lowlightNs.HastNode
import typings.lowlight.lowlightStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root
  extends Parent
     with HastNode {
  @JSName("type")
  var type_Root: root
}

object Root {
  @scala.inline
  def apply(children: js.Array[Node], `type`: root, data: Data = null, position: Location = null): Root = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Root]
  }
}


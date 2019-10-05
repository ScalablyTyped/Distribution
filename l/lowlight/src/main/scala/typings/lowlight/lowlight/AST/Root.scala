package typings.lowlight.lowlight.AST

import typings.lowlight.lowlight.AST.Unist.Data
import typings.lowlight.lowlight.AST.Unist.Location
import typings.lowlight.lowlight.AST.Unist.Node
import typings.lowlight.lowlight.AST.Unist.Parent
import typings.lowlight.lowlight.HastNode
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


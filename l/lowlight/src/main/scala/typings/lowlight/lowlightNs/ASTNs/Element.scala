package typings.lowlight.lowlightNs.ASTNs

import typings.lowlight.lowlightNs.ASTNs.UnistNs.Data
import typings.lowlight.lowlightNs.ASTNs.UnistNs.Location
import typings.lowlight.lowlightNs.ASTNs.UnistNs.Node
import typings.lowlight.lowlightNs.ASTNs.UnistNs.Parent
import typings.lowlight.lowlightNs.HastNode
import typings.lowlight.lowlightStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element
  extends Parent
     with HastNode {
  var properties: Properties
  var tagName: String
  @JSName("type")
  var type_Element: element
}

object Element {
  @scala.inline
  def apply(
    children: js.Array[Node],
    properties: Properties,
    tagName: String,
    `type`: element,
    data: Data = null,
    position: Location = null
  ): Element = {
    val __obj = js.Dynamic.literal(children = children, properties = properties, tagName = tagName)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Element]
  }
}


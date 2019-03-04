package typings
package lowlightLib.lowlightNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element
  extends lowlightLib.lowlightNs.ASTNs.UnistNs.Parent
     with lowlightLib.lowlightNs.HastNode {
  var properties: Properties
  var tagName: java.lang.String
  @JSName("type")
  var type_Element: lowlightLib.lowlightLibStrings.element
}

object Element {
  @scala.inline
  def apply(
    children: js.Array[lowlightLib.lowlightNs.ASTNs.UnistNs.Node],
    properties: Properties,
    tagName: java.lang.String,
    `type`: lowlightLib.lowlightLibStrings.element,
    data: lowlightLib.lowlightNs.ASTNs.UnistNs.Data = null,
    position: lowlightLib.lowlightNs.ASTNs.UnistNs.Location = null
  ): Element = {
    val __obj = js.Dynamic.literal(children = children, properties = properties, tagName = tagName)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Element]
  }
}


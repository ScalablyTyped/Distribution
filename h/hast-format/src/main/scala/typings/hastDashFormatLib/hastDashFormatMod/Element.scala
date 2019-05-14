package typings
package hastDashFormatLib.hastDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends Parent {
  /**
    * List representing the children of a node.
    */
  @JSName("children")
  var children_Element: js.Array[Element | Comment | Text]
  /**
    * If the tagName field is 'template', a content field can be present.
    */
  var content: js.UndefOr[Root] = js.undefined
  /**
    * Represents information associated with the element.
    */
  var properties: js.UndefOr[Properties] = js.undefined
  /**
    * Represents the element’s local name.
    */
  var tagName: java.lang.String
  /**
    * Represents this variant of a Node.
    */
  @JSName("type")
  var type_Element: hastDashFormatLib.hastDashFormatLibStrings.element
}

object Element {
  @scala.inline
  def apply(
    children: js.Array[Element | Comment | Text],
    tagName: java.lang.String,
    `type`: hastDashFormatLib.hastDashFormatLibStrings.element,
    content: Root = null,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null,
    properties: Properties = null
  ): Element = {
    val __obj = js.Dynamic.literal(children = children, tagName = tagName)
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Element]
  }
}


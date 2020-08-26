package typings.hast.mod

import typings.hast.hastStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends Parent {
  /**
    * List representing the children of a node.
    */
  @JSName("children")
  var children_Element: js.Array[Element | Comment | Text] = js.native
  /**
    * If the tagName field is 'template', a content field can be present.
    */
  var content: js.UndefOr[Root] = js.native
  /**
    * Represents information associated with the element.
    */
  var properties: js.UndefOr[Properties] = js.native
  /**
    * Represents the element’s local name.
    */
  var tagName: String = js.native
  /**
    * Represents this variant of a Node.
    */
  @JSName("type")
  var type_Element: element = js.native
}

object Element {
  @scala.inline
  def apply(children: js.Array[Element | Comment | Text], tagName: String, `type`: element): Element = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenVarargs(value: (Element | Comment | Text)*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Element | Comment | Text]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: element): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: Root): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setProperties(value: Properties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}


package typings.lowlight.lowlight.AST

import typings.lowlight.lowlight.AST.Unist.Node
import typings.lowlight.lowlight.AST.Unist.Parent
import typings.lowlight.lowlight.HastNode
import typings.lowlight.lowlightStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element
  extends Parent
     with HastNode {
  
  var properties: Properties = js.native
  
  var tagName: String = js.native
  
  @JSName("type")
  var type_Element: element = js.native
}
object Element {
  
  @scala.inline
  def apply(children: js.Array[Node], properties: Properties, tagName: String, `type`: element): Element = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
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
    def setProperties(value: Properties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: element): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

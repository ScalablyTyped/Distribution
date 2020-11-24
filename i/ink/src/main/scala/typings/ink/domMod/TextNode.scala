package typings.ink.domMod

import typings.ink.stylesMod.Styles
import typings.yogaLayout.mod.YogaNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  nodeName :ink.ink/build/dom.TextName,   nodeValue :string} & ink.ink/build/dom.InkNode */
@js.native
trait TextNode
  extends DOMNode[js.Any] {
  
  var internal_static: js.UndefOr[Boolean] = js.native
  
  var nodeName: TextName = js.native
  
  var nodeValue: String = js.native
  
  var parentNode: DOMElement | Null = js.native
  
  var style: Styles = js.native
  
  var yogaNode: js.UndefOr[YogaNode] = js.native
}
object TextNode {
  
  @scala.inline
  def apply(nodeName: TextName, nodeValue: String, style: Styles): TextNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  
  @scala.inline
  implicit class TextNodeOps[Self <: TextNode] (val x: Self) extends AnyVal {
    
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
    def setNodeName(value: TextName): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Styles): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal_static(value: Boolean): Self = this.set("internal_static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternal_static: Self = this.set("internal_static", js.undefined)
    
    @scala.inline
    def setParentNode(value: DOMElement): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeNull: Self = this.set("parentNode", null)
    
    @scala.inline
    def setYogaNode(value: YogaNode): Self = this.set("yogaNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYogaNode: Self = this.set("yogaNode", js.undefined)
  }
}

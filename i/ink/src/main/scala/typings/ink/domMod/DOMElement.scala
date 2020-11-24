package typings.ink.domMod

import org.scalablytyped.runtime.StringDictionary
import typings.ink.anon.NodeName
import typings.ink.renderNodeToOutputMod.OutputTransformer
import typings.ink.stylesMod.Styles
import typings.yogaLayout.mod.YogaNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  nodeName :ink.ink/build/dom.ElementNames,   attributes :{[key: string] : ink.ink/build/dom.DOMNodeAttribute},   childNodes :std.Array<ink.ink/build/dom.DOMNode<{  nodeName :ink.ink/build/dom.NodeNames}>>,   internal_transform :ink.ink/build/render-node-to-output.OutputTransformer | undefined,   isStaticDirty :boolean | undefined,   staticNode :any | undefined,   onRender :(): void | undefined,   onImmediateRender :(): void | undefined} & ink.ink/build/dom.InkNode */
@js.native
trait DOMElement
  extends DOMNode[js.Any] {
  
  var attributes: StringDictionary[DOMNodeAttribute] = js.native
  
  var childNodes: js.Array[DOMNode[NodeName]] = js.native
  
  var internal_static: js.UndefOr[Boolean] = js.native
  
  var internal_transform: js.UndefOr[OutputTransformer] = js.native
  
  var isStaticDirty: js.UndefOr[Boolean] = js.native
  
  var nodeName: ElementNames = js.native
  
  var onImmediateRender: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRender: js.UndefOr[js.Function0[Unit]] = js.native
  
  var parentNode: DOMElement | Null = js.native
  
  var staticNode: js.UndefOr[js.Any] = js.native
  
  var style: Styles = js.native
  
  var yogaNode: js.UndefOr[YogaNode] = js.native
}
object DOMElement {
  
  @scala.inline
  def apply(
    attributes: StringDictionary[DOMNodeAttribute],
    childNodes: js.Array[DOMNode[NodeName]],
    nodeName: ElementNames,
    style: Styles
  ): DOMElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMElement]
  }
  
  @scala.inline
  implicit class DOMElementOps[Self <: DOMElement] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: StringDictionary[DOMNodeAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodesVarargs(value: DOMNode[NodeName]*): Self = this.set("childNodes", js.Array(value :_*))
    
    @scala.inline
    def setChildNodes(value: js.Array[DOMNode[NodeName]]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: ElementNames): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Styles): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal_static(value: Boolean): Self = this.set("internal_static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternal_static: Self = this.set("internal_static", js.undefined)
    
    @scala.inline
    def setInternal_transform(value: /* s */ String => String): Self = this.set("internal_transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInternal_transform: Self = this.set("internal_transform", js.undefined)
    
    @scala.inline
    def setIsStaticDirty(value: Boolean): Self = this.set("isStaticDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStaticDirty: Self = this.set("isStaticDirty", js.undefined)
    
    @scala.inline
    def setOnImmediateRender(value: () => Unit): Self = this.set("onImmediateRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnImmediateRender: Self = this.set("onImmediateRender", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    
    @scala.inline
    def setParentNode(value: DOMElement): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeNull: Self = this.set("parentNode", null)
    
    @scala.inline
    def setStaticNode(value: js.Any): Self = this.set("staticNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticNode: Self = this.set("staticNode", js.undefined)
    
    @scala.inline
    def setYogaNode(value: YogaNode): Self = this.set("yogaNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYogaNode: Self = this.set("yogaNode", js.undefined)
  }
}

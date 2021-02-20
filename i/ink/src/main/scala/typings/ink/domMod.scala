package typings.ink

import org.scalablytyped.runtime.StringDictionary
import typings.ink.anon.NodeName
import typings.ink.inkStrings.Numbersigntext
import typings.ink.renderNodeToOutputMod.OutputTransformer
import typings.ink.stylesMod.Styles
import typings.yogaLayout.mod.YogaNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("ink/build/dom", "TEXT_NAME")
  @js.native
  val TEXT_NAME: /* "#text" */ String = js.native
  
  @JSImport("ink/build/dom", "appendChildNode")
  @js.native
  def appendChildNode(node: DOMElement, childNode: DOMElement): Unit = js.native
  
  @JSImport("ink/build/dom", "createNode")
  @js.native
  def createNode(nodeName: ElementNames): DOMElement = js.native
  
  @JSImport("ink/build/dom", "createTextNode")
  @js.native
  def createTextNode(text: String): TextNode = js.native
  
  @JSImport("ink/build/dom", "insertBeforeNode")
  @js.native
  def insertBeforeNode(node: DOMElement, newChildNode: DOMNode[NodeName], beforeChildNode: DOMNode[NodeName]): Unit = js.native
  
  @JSImport("ink/build/dom", "removeChildNode")
  @js.native
  def removeChildNode(node: DOMElement, removeNode: DOMNode[NodeName]): Unit = js.native
  
  @JSImport("ink/build/dom", "setAttribute")
  @js.native
  def setAttribute(node: DOMElement, key: String, value: DOMNodeAttribute): Unit = js.native
  
  @JSImport("ink/build/dom", "setStyle")
  @js.native
  def setStyle(node: DOMNode[NodeName], style: Styles): Unit = js.native
  
  @JSImport("ink/build/dom", "setTextNodeValue")
  @js.native
  def setTextNodeValue(node: TextNode, text: String): Unit = js.native
  
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
    implicit class DOMElementMutableBuilder[Self <: DOMElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[DOMNodeAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildNodes(value: js.Array[DOMNode[NodeName]]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildNodesVarargs(value: DOMNode[NodeName]*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
      
      @scala.inline
      def setInternal_static(value: Boolean): Self = StObject.set(x, "internal_static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternal_staticUndefined: Self = StObject.set(x, "internal_static", js.undefined)
      
      @scala.inline
      def setInternal_transform(value: /* s */ String => String): Self = StObject.set(x, "internal_transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInternal_transformUndefined: Self = StObject.set(x, "internal_transform", js.undefined)
      
      @scala.inline
      def setIsStaticDirty(value: Boolean): Self = StObject.set(x, "isStaticDirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStaticDirtyUndefined: Self = StObject.set(x, "isStaticDirty", js.undefined)
      
      @scala.inline
      def setNodeName(value: ElementNames): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnImmediateRender(value: () => Unit): Self = StObject.set(x, "onImmediateRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnImmediateRenderUndefined: Self = StObject.set(x, "onImmediateRender", js.undefined)
      
      @scala.inline
      def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      @scala.inline
      def setParentNode(value: DOMElement): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      @scala.inline
      def setStaticNode(value: js.Any): Self = StObject.set(x, "staticNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticNodeUndefined: Self = StObject.set(x, "staticNode", js.undefined)
      
      @scala.inline
      def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYogaNode(value: YogaNode): Self = StObject.set(x, "yogaNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYogaNodeUndefined: Self = StObject.set(x, "yogaNode", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ink.domMod.DOMElement
    - typings.ink.domMod.TextNode
  */
  trait DOMNode[T] extends StObject
  object DOMNode {
    
    @scala.inline
    def DOMElement(
      attributes: StringDictionary[DOMNodeAttribute],
      childNodes: js.Array[DOMNode[NodeName]],
      nodeName: ElementNames,
      style: Styles
    ): typings.ink.domMod.DOMElement = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ink.domMod.DOMElement]
    }
    
    @scala.inline
    def TextNode(nodeName: TextName, nodeValue: String, style: Styles): typings.ink.domMod.TextNode = {
      val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ink.domMod.TextNode]
    }
  }
  
  type DOMNodeAttribute = Boolean | String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.ink.inkStrings.`ink-root`
    - typings.ink.inkStrings.`ink-box`
    - typings.ink.inkStrings.`ink-text`
    - typings.ink.inkStrings.`ink-virtual-text`
  */
  trait ElementNames extends StObject
  object ElementNames {
    
    @scala.inline
    def `ink-box`: typings.ink.inkStrings.`ink-box` = "ink-box".asInstanceOf[typings.ink.inkStrings.`ink-box`]
    
    @scala.inline
    def `ink-root`: typings.ink.inkStrings.`ink-root` = "ink-root".asInstanceOf[typings.ink.inkStrings.`ink-root`]
    
    @scala.inline
    def `ink-text`: typings.ink.inkStrings.`ink-text` = "ink-text".asInstanceOf[typings.ink.inkStrings.`ink-text`]
    
    @scala.inline
    def `ink-virtual-text`: typings.ink.inkStrings.`ink-virtual-text` = "ink-virtual-text".asInstanceOf[typings.ink.inkStrings.`ink-virtual-text`]
  }
  
  @js.native
  trait InkNode extends StObject {
    
    var internal_static: js.UndefOr[Boolean] = js.native
    
    var parentNode: DOMElement | Null = js.native
    
    var style: Styles = js.native
    
    var yogaNode: js.UndefOr[YogaNode] = js.native
  }
  object InkNode {
    
    @scala.inline
    def apply(style: Styles): InkNode = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[InkNode]
    }
    
    @scala.inline
    implicit class InkNodeMutableBuilder[Self <: InkNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInternal_static(value: Boolean): Self = StObject.set(x, "internal_static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternal_staticUndefined: Self = StObject.set(x, "internal_static", js.undefined)
      
      @scala.inline
      def setParentNode(value: DOMElement): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      @scala.inline
      def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYogaNode(value: YogaNode): Self = StObject.set(x, "yogaNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYogaNodeUndefined: Self = StObject.set(x, "yogaNode", js.undefined)
    }
  }
  
  type NodeNames = ElementNames | TextName
  
  type TextName = Numbersigntext
  
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
    implicit class TextNodeMutableBuilder[Self <: TextNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInternal_static(value: Boolean): Self = StObject.set(x, "internal_static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternal_staticUndefined: Self = StObject.set(x, "internal_static", js.undefined)
      
      @scala.inline
      def setNodeName(value: TextName): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNode(value: DOMElement): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      @scala.inline
      def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYogaNode(value: YogaNode): Self = StObject.set(x, "yogaNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYogaNodeUndefined: Self = StObject.set(x, "yogaNode", js.undefined)
    }
  }
}

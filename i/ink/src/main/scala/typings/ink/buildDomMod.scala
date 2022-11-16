package typings.ink

import org.scalablytyped.runtime.StringDictionary
import typings.ink.anon.NodeName
import typings.ink.buildRenderNodeToOutputMod.OutputTransformer
import typings.ink.buildStylesMod.Styles
import typings.ink.inkStrings.Numbersigntext
import typings.yogaLayout.mod.YogaNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildDomMod {
  
  @JSImport("ink/build/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ink/build/dom", "TEXT_NAME")
  @js.native
  val TEXT_NAME: /* "#text" */ String = js.native
  
  inline def appendChildNode(node: DOMElement, childNode: DOMElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendChildNode")(node.asInstanceOf[js.Any], childNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createNode(nodeName: ElementNames): DOMElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(nodeName.asInstanceOf[js.Any]).asInstanceOf[DOMElement]
  
  inline def createTextNode(text: String): TextNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextNode")(text.asInstanceOf[js.Any]).asInstanceOf[TextNode]
  
  inline def insertBeforeNode(node: DOMElement, newChildNode: DOMNode[NodeName], beforeChildNode: DOMNode[NodeName]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBeforeNode")(node.asInstanceOf[js.Any], newChildNode.asInstanceOf[js.Any], beforeChildNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeChildNode(node: DOMElement, removeNode: DOMNode[NodeName]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeChildNode")(node.asInstanceOf[js.Any], removeNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setAttribute(node: DOMElement, key: String, value: DOMNodeAttribute): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setStyle(node: DOMNode[NodeName], style: Styles): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(node.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTextNodeValue(node: TextNode, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTextNodeValue")(node.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DOMElement
    extends StObject
       with InkNode {
    
    var attributes: StringDictionary[DOMNodeAttribute]
    
    var childNodes: js.Array[DOMNode[NodeName]]
    
    var internal_transform: js.UndefOr[OutputTransformer] = js.undefined
    
    var isStaticDirty: js.UndefOr[Boolean] = js.undefined
    
    var nodeName: ElementNames
    
    var onImmediateRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var staticNode: js.UndefOr[Any] = js.undefined
  }
  object DOMElement {
    
    inline def apply(
      attributes: StringDictionary[DOMNodeAttribute],
      childNodes: js.Array[DOMNode[NodeName]],
      nodeName: ElementNames,
      style: Styles
    ): DOMElement = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[DOMElement]
    }
    
    extension [Self <: DOMElement](x: Self) {
      
      inline def setAttributes(value: StringDictionary[DOMNodeAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildNodes(value: js.Array[DOMNode[NodeName]]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: DOMNode[NodeName]*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setInternal_transform(value: /* s */ String => String): Self = StObject.set(x, "internal_transform", js.Any.fromFunction1(value))
      
      inline def setInternal_transformUndefined: Self = StObject.set(x, "internal_transform", js.undefined)
      
      inline def setIsStaticDirty(value: Boolean): Self = StObject.set(x, "isStaticDirty", value.asInstanceOf[js.Any])
      
      inline def setIsStaticDirtyUndefined: Self = StObject.set(x, "isStaticDirty", js.undefined)
      
      inline def setNodeName(value: ElementNames): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setOnImmediateRender(value: () => Unit): Self = StObject.set(x, "onImmediateRender", js.Any.fromFunction0(value))
      
      inline def setOnImmediateRenderUndefined: Self = StObject.set(x, "onImmediateRender", js.undefined)
      
      inline def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setStaticNode(value: Any): Self = StObject.set(x, "staticNode", value.asInstanceOf[js.Any])
      
      inline def setStaticNodeUndefined: Self = StObject.set(x, "staticNode", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends {  nodeName :infer U} ? U extends '#text' ? ink.ink/build/dom.TextNode : ink.ink/build/dom.DOMElement : never
    }}}
    */
  type DOMNode[T] = TextNode
  
  type DOMNodeAttribute = Boolean | String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.ink.inkStrings.`ink-root`
    - typings.ink.inkStrings.`ink-box`
    - typings.ink.inkStrings.`ink-text`
    - typings.ink.inkStrings.`ink-virtual-text`
  */
  trait ElementNames extends StObject
  object ElementNames {
    
    inline def `ink-box`: typings.ink.inkStrings.`ink-box` = "ink-box".asInstanceOf[typings.ink.inkStrings.`ink-box`]
    
    inline def `ink-root`: typings.ink.inkStrings.`ink-root` = "ink-root".asInstanceOf[typings.ink.inkStrings.`ink-root`]
    
    inline def `ink-text`: typings.ink.inkStrings.`ink-text` = "ink-text".asInstanceOf[typings.ink.inkStrings.`ink-text`]
    
    inline def `ink-virtual-text`: typings.ink.inkStrings.`ink-virtual-text` = "ink-virtual-text".asInstanceOf[typings.ink.inkStrings.`ink-virtual-text`]
  }
  
  trait InkNode extends StObject {
    
    var internal_static: js.UndefOr[Boolean] = js.undefined
    
    var parentNode: DOMElement | Null
    
    var style: Styles
    
    var yogaNode: js.UndefOr[YogaNode] = js.undefined
  }
  object InkNode {
    
    inline def apply(style: Styles): InkNode = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[InkNode]
    }
    
    extension [Self <: InkNode](x: Self) {
      
      inline def setInternal_static(value: Boolean): Self = StObject.set(x, "internal_static", value.asInstanceOf[js.Any])
      
      inline def setInternal_staticUndefined: Self = StObject.set(x, "internal_static", js.undefined)
      
      inline def setParentNode(value: DOMElement): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      inline def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setYogaNode(value: YogaNode): Self = StObject.set(x, "yogaNode", value.asInstanceOf[js.Any])
      
      inline def setYogaNodeUndefined: Self = StObject.set(x, "yogaNode", js.undefined)
    }
  }
  
  type NodeNames = ElementNames | TextName
  
  type TextName = Numbersigntext
  
  trait TextNode
    extends StObject
       with InkNode {
    
    var nodeName: TextName
    
    var nodeValue: String
  }
  object TextNode {
    
    inline def apply(nodeName: TextName, nodeValue: String, style: Styles): TextNode = {
      val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[TextNode]
    }
    
    extension [Self <: TextNode](x: Self) {
      
      inline def setNodeName(value: TextName): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    }
  }
}

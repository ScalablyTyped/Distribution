package typings.lib0.mod

import typings.lib0.pairMod.Pair
import typings.std.DOMParser
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.EventListener
import typings.std.EventTarget
import typings.std.HTMLCanvasElement
import typings.std.HTMLCollection
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Node
import typings.std.NodeListOf
import typings.std.ShadowRoot
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dom {
  
  @JSImport("lib0", "dom")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0", "dom.CDATA_SECTION_NODE")
  @js.native
  val CDATA_SECTION_NODE: Double = js.native
  
  @JSImport("lib0", "dom.COMMENT_NODE")
  @js.native
  val COMMENT_NODE: Double = js.native
  
  @JSImport("lib0", "dom.DOCUMENT_FRAGMENT_NODE")
  @js.native
  val DOCUMENT_FRAGMENT_NODE: Double = js.native
  
  @JSImport("lib0", "dom.DOCUMENT_NODE")
  @js.native
  val DOCUMENT_NODE: Double = js.native
  
  @JSImport("lib0", "dom.DOCUMENT_TYPE_NODE")
  @js.native
  val DOCUMENT_TYPE_NODE: Double = js.native
  
  @JSImport("lib0", "dom.ELEMENT_NODE")
  @js.native
  val ELEMENT_NODE: Double = js.native
  
  @JSImport("lib0", "dom.TEXT_NODE")
  @js.native
  val TEXT_NODE: Double = js.native
  
  inline def addEventListener(el: EventTarget, name: String, f: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListeners(node: Node, listeners: js.Array[Pair[String, EventListener]]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListeners")(node.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def append(parent: Element, nodes: js.Array[Node]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(parent.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def appendChild(parent: Node, child: Node): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("appendChild")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def canvas(width: Double, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  inline def checkNodeType(node: Any, `type`: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNodeType")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createDocumentFragment(): DocumentFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("createDocumentFragment")().asInstanceOf[DocumentFragment]
  
  inline def createElement(name: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(name.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def createTextNode(text: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextNode")(text.asInstanceOf[js.Any]).asInstanceOf[Text]
  
  @JSImport("lib0", "dom.doc")
  @js.native
  val doc: Document = js.native
  
  @JSImport("lib0", "dom.domParser")
  @js.native
  val domParser: DOMParser = js.native
  
  inline def element(name: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("element")(name.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def element(name: String, attrs: js.Array[Pair[String, Boolean | String]]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("element")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def element(name: String, attrs: js.Array[Pair[String, Boolean | String]], children: js.Array[Node]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("element")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def element(name: String, attrs: Unit, children: js.Array[Node]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("element")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def emitCustomEvent(el: HTMLElement, name: String, opts: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emitCustomEvent")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fragment(children: js.Array[Node]): DocumentFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(children.asInstanceOf[js.Any]).asInstanceOf[DocumentFragment]
  inline def fragment(children: HTMLCollection): DocumentFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(children.asInstanceOf[js.Any]).asInstanceOf[DocumentFragment]
  
  inline def getElementById(id: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def insertBefore(parent: HTMLElement, el: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(parent.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def insertBefore(parent: HTMLElement, el: HTMLElement, ref: Node): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(parent.asInstanceOf[js.Any], el.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def isParentOf(parent: Node, child: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParentOf")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mapToStyleString(m: Map[String, String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToStyleString")(m.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pairToStyleString(pair: Pair[String, String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pairToStyleString")(pair.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pairsToStyleString(pairs: js.Array[Pair[String, String]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pairsToStyleString")(pairs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseElement(html: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("parseElement")(html.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def parseFragment(html: String): DocumentFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(html.asInstanceOf[js.Any]).asInstanceOf[DocumentFragment]
  
  inline def querySelector(el: HTMLElement, query: String): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelector")(el.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def querySelector(el: ShadowRoot, query: String): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelector")(el.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def querySelectorAll(el: HTMLElement, query: String): NodeListOf[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(el.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[NodeListOf[HTMLElement]]
  inline def querySelectorAll(el: ShadowRoot, query: String): NodeListOf[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(el.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[NodeListOf[HTMLElement]]
  
  inline def remove(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeEventListener(el: EventTarget, name: String, f: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListeners(node: Node, listeners: js.Array[Pair[String, EventListener]]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListeners")(node.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def replaceWith(oldEl: HTMLElement, newEl: DocumentFragment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceWith")(oldEl.asInstanceOf[js.Any], newEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceWith(oldEl: HTMLElement, newEl: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceWith")(oldEl.asInstanceOf[js.Any], newEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setAttributes(el: Element, attrs: js.Array[Pair[String, String | Boolean]]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttributes")(el.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def setAttributesMap(el: Element, attrs: Map[String, String]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttributesMap")(el.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def text(text: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(text.asInstanceOf[js.Any]).asInstanceOf[Text]
}

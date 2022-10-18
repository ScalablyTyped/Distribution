package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesDomElementContainerMod.ElementContainer
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomNodeParserMod {
  
  @JSImport("html2canvas/dist/types/dom/node-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBodyElement(node: Element): /* is std.HTMLBodyElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBodyElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLBodyElement */ Boolean]
  
  inline def isCanvasElement(node: Element): /* is std.HTMLCanvasElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCanvasElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLCanvasElement */ Boolean]
  
  inline def isCustomElement(node: Element): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  
  inline def isElementNode(node: Node): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
  
  inline def isHTMLElement(node: Element): /* is std.HTMLHtmlElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLHtmlElement */ Boolean]
  
  inline def isHTMLElementNode(node: Node): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLElementNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  
  inline def isIFrameElement(node: Element): /* is std.HTMLIFrameElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIFrameElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLIFrameElement */ Boolean]
  
  inline def isImageElement(node: Element): /* is std.HTMLImageElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLImageElement */ Boolean]
  
  inline def isInputElement(node: Element): /* is std.HTMLInputElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLInputElement */ Boolean]
  
  inline def isLIElement(node: Element): /* is std.HTMLLIElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLIElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLLIElement */ Boolean]
  
  inline def isOLElement(node: Element): /* is std.HTMLOListElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOLElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLOListElement */ Boolean]
  
  inline def isSVGElement(node: Element): /* is std.SVGSVGElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.SVGSVGElement */ Boolean]
  
  inline def isSVGElementNode(element: Element): /* is std.SVGElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGElementNode")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.SVGElement */ Boolean]
  
  inline def isScriptElement(node: Element): /* is std.HTMLScriptElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScriptElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLScriptElement */ Boolean]
  
  inline def isSelectElement(node: Element): /* is std.HTMLSelectElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLSelectElement */ Boolean]
  
  inline def isSlotElement(node: Element): /* is std.HTMLSlotElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlotElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLSlotElement */ Boolean]
  
  inline def isStyleElement(node: Element): /* is std.HTMLStyleElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyleElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLStyleElement */ Boolean]
  
  inline def isTextNode(node: Node): /* is std.Text */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.Text */ Boolean]
  
  inline def isTextareaElement(node: Element): /* is std.HTMLTextAreaElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextareaElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLTextAreaElement */ Boolean]
  
  inline def isVideoElement(node: Element): /* is std.HTMLVideoElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVideoElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLVideoElement */ Boolean]
  
  inline def parseTree(context: Context, element: HTMLElement): ElementContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTree")(context.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[ElementContainer]
}

package typings.handsontable

import typings.handsontable.anon.Left
import typings.std.CSSRule
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  @JSImport("handsontable/helpers/dom/element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/helpers/dom/element", "HTML_CHARACTERS")
  @js.native
  val HTML_CHARACTERS: js.RegExp = js.native
  
  inline def addClass(element: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addClass(element: HTMLElement, className: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEvent(element: HTMLElement, event: String, callback: js.Function1[/* event */ js.UndefOr[Event], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearTextSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTextSelection")().asInstanceOf[Unit]
  inline def clearTextSelection(rootWindow: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTextSelection")(rootWindow.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def closest(element: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("closest")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def closest(element: HTMLElement, nodes: js.Array[String | HTMLElement]): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(element.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def closest(element: HTMLElement, nodes: js.Array[String | HTMLElement], until: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(element.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], until.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def closest(element: HTMLElement, nodes: Unit, until: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(element.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], until.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def closestDown(element: HTMLElement, nodes: js.Array[HTMLElement]): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("closestDown")(element.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def closestDown(element: HTMLElement, nodes: js.Array[HTMLElement], until: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("closestDown")(element.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], until.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def empty(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fastInnerHTML(element: HTMLElement, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fastInnerHTML")(element.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fastInnerHTML(element: HTMLElement, content: String, sanitizeContent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fastInnerHTML")(element.asInstanceOf[js.Any], content.asInstanceOf[js.Any], sanitizeContent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fastInnerText(element: HTMLElement, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fastInnerText")(element.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCaretPosition(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCaretPosition")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getComputedStyle(element: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getComputedStyle(element: HTMLElement, rootWindow: Window): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(element.asInstanceOf[js.Any], rootWindow.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getCssTransform(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCssTransform")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getFrameElement(frame: Window): HTMLIFrameElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrameElement")(frame.asInstanceOf[js.Any]).asInstanceOf[HTMLIFrameElement]
  
  inline def getParent(element: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def getParent(element: HTMLElement, level: Double): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(element.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def getParentWindow(frame: Window): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentWindow")(frame.asInstanceOf[js.Any]).asInstanceOf[Window]
  
  inline def getScrollLeft(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollLeft")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getScrollLeft(element: HTMLElement, rootWindow: Window): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollLeft")(element.asInstanceOf[js.Any], rootWindow.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getScrollTop(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollTop")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getScrollTop(element: HTMLElement, rootWindow: Window): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollTop")(element.asInstanceOf[js.Any], rootWindow.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getScrollableElement(element: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollableElement")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def getScrollbarWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollbarWidth")().asInstanceOf[Double]
  inline def getScrollbarWidth(rootDocument: Document): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollbarWidth")(rootDocument.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getSelectionEndPosition(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectionEndPosition")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getSelectionText(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectionText")().asInstanceOf[String]
  inline def getSelectionText(rootWindow: Window): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectionText")(rootWindow.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStyle(element: HTMLElement, prop: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(element.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStyle(element: HTMLElement, prop: String, rootWindow: Window): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(element.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], rootWindow.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTrimmingContainer(base: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getTrimmingContainer")(base.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def getWindowScrollLeft(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowScrollLeft")().asInstanceOf[Double]
  inline def getWindowScrollLeft(rootWindow: Window): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowScrollLeft")(rootWindow.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getWindowScrollTop(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowScrollTop")().asInstanceOf[Double]
  inline def getWindowScrollTop(rootWindow: Window): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowScrollTop")(rootWindow.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hasAccessToParentWindow(frame: Window): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAccessToParentWindow")(frame.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasClass(element: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasHorizontalScrollbar(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasHorizontalScrollbar")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasVerticalScrollbar(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasVerticalScrollbar")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def index(element: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def innerHeight(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("innerHeight")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def innerWidth(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("innerWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isChildOf(child: HTMLElement, parent: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isChildOf")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isChildOf(child: HTMLElement, parent: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isChildOf")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDetached(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDetached")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInput(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInput")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isOutsideInput(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOutsideInput")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVisible(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def matchesCSSRules(element: Element, rule: CSSRule): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesCSSRules")(element.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def offset(element: HTMLElement): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(element.asInstanceOf[js.Any]).asInstanceOf[Left]
  
  inline def outerHeight(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("outerHeight")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def outerWidth(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("outerWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def overlayContainsElement(overlayType: String, element: HTMLElement, root: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("overlayContainsElement")(overlayType.asInstanceOf[js.Any], element.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeClass(element: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeClass(element: HTMLElement, className: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEvent(element: HTMLElement, event: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeTextNodes(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTextNodes")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetCssTransform(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCssTransform")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def selectElementIfAllowed(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectElementIfAllowed")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setCaretPosition(element: Element, pos: Double, endPos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCaretPosition")(element.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], endPos.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOverlayPosition(overlayElem: HTMLElement, left: String, top: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOverlayPosition")(overlayElem.asInstanceOf[js.Any], left.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setOverlayPosition(overlayElem: HTMLElement, left: String, top: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOverlayPosition")(overlayElem.asInstanceOf[js.Any], left.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setOverlayPosition(overlayElem: HTMLElement, left: Double, top: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOverlayPosition")(overlayElem.asInstanceOf[js.Any], left.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setOverlayPosition(overlayElem: HTMLElement, left: Double, top: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOverlayPosition")(overlayElem.asInstanceOf[js.Any], left.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

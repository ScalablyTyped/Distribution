package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.wot.OverlayType
import typings.std.CSSRule
import typings.std.CSSStyleDeclaration
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import typings.std.RegExp
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dom extends js.Object {
  var HTML_CHARACTERS: RegExp = js.native
  def addClass(element: HTMLElement, className: String): Unit = js.native
  def addClass(element: HTMLElement, className: js.Array[_]): Unit = js.native
  def addEvent(element: HTMLElement, event: String, callback: js.Function1[/* event */ Event, Unit]): Unit = js.native
  def clearTextSelection(): Unit = js.native
  def clearTextSelection(rootWindow: Window): Unit = js.native
  def closest(element: HTMLElement, nodes: js.Array[_]): HTMLElement | Unit = js.native
  def closest(element: HTMLElement, nodes: js.Array[_], until: HTMLElement): HTMLElement | Unit = js.native
  def closestDown(element: HTMLElement, nodes: js.Array[_]): HTMLElement | Unit = js.native
  def closestDown(element: HTMLElement, nodes: js.Array[_], until: HTMLElement): HTMLElement | Unit = js.native
  def empty(element: HTMLElement): Unit = js.native
  def fastInnerHTML(element: HTMLElement, content: String): Unit = js.native
  def fastInnerText(element: HTMLElement, content: String): Unit = js.native
  def getCaretPosition(el: HTMLElement): Double = js.native
  def getComputedStyle(element: HTMLElement): CSSStyleDeclaration | js.Object = js.native
  def getComputedStyle(element: HTMLElement, rootWindow: Window): CSSStyleDeclaration | js.Object = js.native
  def getCssTransform(element: HTMLElement): Double | Unit = js.native
  def getFrameElement(frame: Window): HTMLIFrameElement | Null = js.native
  def getParent(element: HTMLElement): HTMLElement | Unit = js.native
  def getParent(element: HTMLElement, level: Double): HTMLElement | Unit = js.native
  def getParentWindow(frame: Window): Window | Null = js.native
  def getScrollLeft(element: HTMLElement): Double = js.native
  def getScrollLeft(element: HTMLElement, rootWindow: Window): Double = js.native
  def getScrollTop(element: HTMLElement): Double = js.native
  def getScrollTop(element: HTMLElement, rootWindow: Window): Double = js.native
  def getScrollableElement(element: HTMLElement): HTMLElement = js.native
  def getScrollbarWidth(): Double = js.native
  def getScrollbarWidth(rootDocument: Document): Double = js.native
  def getSelectionEndPosition(el: HTMLElement): Double = js.native
  def getSelectionText(): String = js.native
  def getSelectionText(rootWindow: Window): String = js.native
  def getStyle(element: HTMLElement, prop: String): String = js.native
  def getStyle(element: HTMLElement, prop: String, rootWindow: Window): String = js.native
  def getTrimmingContainer(base: HTMLElement): HTMLElement = js.native
  def getWindowScrollLeft(): Double = js.native
  def getWindowScrollLeft(rootWindow: Window): Double = js.native
  def getWindowScrollTop(): Double = js.native
  def getWindowScrollTop(rootWindow: Window): Double = js.native
  def hasAccessToParentWindow(frame: Window): Boolean = js.native
  def hasClass(element: HTMLElement, className: String): Boolean = js.native
  def hasHorizontalScrollbar(element: HTMLElement): Boolean = js.native
  def hasVerticalScrollbar(element: HTMLElement): Boolean = js.native
  def index(element: Element): Double = js.native
  def innerHeight(element: HTMLElement): Double = js.native
  def innerWidth(element: HTMLElement): Double = js.native
  def isChildOf(child: HTMLElement, parent: String): Boolean = js.native
  def isChildOf(child: HTMLElement, parent: js.Object): Boolean = js.native
  def isChildOfWebComponentTable(element: Element): Boolean = js.native
  def isImmediatePropagationStopped(event: Event): Boolean = js.native
  def isInput(element: HTMLElement): Boolean = js.native
  def isLeftClick(event: Event): Boolean = js.native
  def isOutsideInput(element: HTMLElement): Boolean = js.native
  def isRightClick(event: Event): Boolean = js.native
  def isVisible(elem: HTMLElement): Boolean = js.native
  def matchesCSSRules(elem: HTMLElement, rule: CSSRule): Boolean = js.native
  def offset(elem: HTMLElement): js.Object = js.native
  def outerHeight(elem: HTMLElement): Double = js.native
  def outerWidth(element: HTMLElement): Double = js.native
  def overlayContainsElement(overlayType: OverlayType, element: HTMLElement, root: HTMLElement): Boolean = js.native
  def pageX(event: Event): Double = js.native
  def pageY(event: Event): Double = js.native
  def polymerUnwrap(element: HTMLElement): js.Any | Unit = js.native
  def polymerWrap(element: HTMLElement): js.Any | Unit = js.native
  def removeClass(element: HTMLElement, className: String): Unit = js.native
  def removeClass(element: HTMLElement, className: js.Array[_]): Unit = js.native
  def removeEvent(element: HTMLElement, event: String, callback: js.Function0[Unit]): Unit = js.native
  def removeTextNodes(element: HTMLElement, parent: HTMLElement): Unit = js.native
  def resetCssTransform(element: HTMLElement): Unit = js.native
  def setCaretPosition(element: HTMLElement, pos: Double, endPos: Double): Unit = js.native
  def setOverlayPosition(overlayElem: HTMLElement, left: Double, top: Double): Unit = js.native
  def stopImmediatePropagation(event: Event): Unit = js.native
  def stopPropagation(event: Event): Unit = js.native
}


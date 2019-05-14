package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dom extends js.Object {
  var HTML_CHARACTERS: stdLib.RegExp = js.native
  def addClass(element: stdLib.HTMLElement, className: java.lang.String): scala.Unit = js.native
  def addClass(element: stdLib.HTMLElement, className: js.Array[_]): scala.Unit = js.native
  def addEvent(element: stdLib.HTMLElement, event: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def clearTextSelection(): scala.Unit = js.native
  def clearTextSelection(rootWindow: stdLib.Window): scala.Unit = js.native
  def closest(element: stdLib.HTMLElement, nodes: js.Array[_]): stdLib.HTMLElement | scala.Unit = js.native
  def closest(element: stdLib.HTMLElement, nodes: js.Array[_], until: stdLib.HTMLElement): stdLib.HTMLElement | scala.Unit = js.native
  def closestDown(element: stdLib.HTMLElement, nodes: js.Array[_]): stdLib.HTMLElement | scala.Unit = js.native
  def closestDown(element: stdLib.HTMLElement, nodes: js.Array[_], until: stdLib.HTMLElement): stdLib.HTMLElement | scala.Unit = js.native
  def empty(element: stdLib.HTMLElement): scala.Unit = js.native
  def fastInnerHTML(element: stdLib.HTMLElement, content: java.lang.String): scala.Unit = js.native
  def fastInnerText(element: stdLib.HTMLElement, content: java.lang.String): scala.Unit = js.native
  def getCaretPosition(el: stdLib.HTMLElement): scala.Double = js.native
  def getComputedStyle(element: stdLib.HTMLElement): stdLib.CSSStyleDeclaration | js.Object = js.native
  def getComputedStyle(element: stdLib.HTMLElement, rootWindow: stdLib.Window): stdLib.CSSStyleDeclaration | js.Object = js.native
  def getCssTransform(element: stdLib.HTMLElement): scala.Double | scala.Unit = js.native
  def getParent(element: stdLib.HTMLElement): stdLib.HTMLElement | scala.Unit = js.native
  def getParent(element: stdLib.HTMLElement, level: scala.Double): stdLib.HTMLElement | scala.Unit = js.native
  def getScrollLeft(element: stdLib.HTMLElement): scala.Double = js.native
  def getScrollLeft(element: stdLib.HTMLElement, rootWindow: stdLib.Window): scala.Double = js.native
  def getScrollTop(element: stdLib.HTMLElement): scala.Double = js.native
  def getScrollTop(element: stdLib.HTMLElement, rootWindow: stdLib.Window): scala.Double = js.native
  def getScrollableElement(element: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def getScrollbarWidth(): scala.Double = js.native
  def getScrollbarWidth(rootDocument: stdLib.Document): scala.Double = js.native
  def getSelectionEndPosition(el: stdLib.HTMLElement): scala.Double = js.native
  def getSelectionText(): java.lang.String = js.native
  def getSelectionText(rootWindow: stdLib.Window): java.lang.String = js.native
  def getStyle(element: stdLib.HTMLElement, prop: java.lang.String): java.lang.String = js.native
  def getStyle(element: stdLib.HTMLElement, prop: java.lang.String, rootWindow: stdLib.Window): java.lang.String = js.native
  def getTrimmingContainer(base: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def getWindowScrollLeft(): scala.Double = js.native
  def getWindowScrollLeft(rootWindow: stdLib.Window): scala.Double = js.native
  def getWindowScrollTop(): scala.Double = js.native
  def getWindowScrollTop(rootWindow: stdLib.Window): scala.Double = js.native
  def hasClass(element: stdLib.HTMLElement, className: java.lang.String): scala.Boolean = js.native
  def hasHorizontalScrollbar(element: stdLib.HTMLElement): scala.Boolean = js.native
  def hasVerticalScrollbar(element: stdLib.HTMLElement): scala.Boolean = js.native
  def index(element: stdLib.Element): scala.Double = js.native
  def innerHeight(element: stdLib.HTMLElement): scala.Double = js.native
  def innerWidth(element: stdLib.HTMLElement): scala.Double = js.native
  def isChildOf(child: stdLib.HTMLElement, parent: java.lang.String): scala.Boolean = js.native
  def isChildOf(child: stdLib.HTMLElement, parent: js.Object): scala.Boolean = js.native
  def isChildOfWebComponentTable(element: stdLib.Element): scala.Boolean = js.native
  def isImmediatePropagationStopped(event: stdLib.Event): scala.Boolean = js.native
  def isInput(element: stdLib.HTMLElement): scala.Boolean = js.native
  def isLeftClick(event: stdLib.Event): scala.Boolean = js.native
  def isOutsideInput(element: stdLib.HTMLElement): scala.Boolean = js.native
  def isRightClick(event: stdLib.Event): scala.Boolean = js.native
  def isVisible(elem: stdLib.HTMLElement): scala.Boolean = js.native
  def offset(elem: stdLib.HTMLElement): js.Object = js.native
  def outerHeight(elem: stdLib.HTMLElement): scala.Double = js.native
  def outerWidth(element: stdLib.HTMLElement): scala.Double = js.native
  def overlayContainsElement(
    overlayType: handsontableLib.handsontableMod.HandsontableNs.wotNs.OverlayType,
    element: stdLib.HTMLElement,
    root: stdLib.HTMLElement
  ): scala.Boolean = js.native
  def pageX(event: stdLib.Event): scala.Double = js.native
  def pageY(event: stdLib.Event): scala.Double = js.native
  def polymerUnwrap(element: stdLib.HTMLElement): js.Any | scala.Unit = js.native
  def polymerWrap(element: stdLib.HTMLElement): js.Any | scala.Unit = js.native
  def removeClass(element: stdLib.HTMLElement, className: java.lang.String): scala.Unit = js.native
  def removeClass(element: stdLib.HTMLElement, className: js.Array[_]): scala.Unit = js.native
  def removeEvent(element: stdLib.HTMLElement, event: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeTextNodes(element: stdLib.HTMLElement, parent: stdLib.HTMLElement): scala.Unit = js.native
  def resetCssTransform(element: stdLib.HTMLElement): scala.Unit = js.native
  def setCaretPosition(element: stdLib.HTMLElement, pos: scala.Double, endPos: scala.Double): scala.Unit = js.native
  def setOverlayPosition(overlayElem: stdLib.HTMLElement, left: scala.Double, top: scala.Double): scala.Unit = js.native
  def stopImmediatePropagation(event: stdLib.Event): scala.Unit = js.native
  def stopPropagation(event: stdLib.Event): scala.Unit = js.native
}


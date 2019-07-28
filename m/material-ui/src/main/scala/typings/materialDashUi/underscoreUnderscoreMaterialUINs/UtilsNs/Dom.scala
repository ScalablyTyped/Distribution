package typings.materialDashUi.underscoreUnderscoreMaterialUINs.UtilsNs

import typings.materialDashUi.Anon_Left
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom extends js.Object {
  def addClass(el: Element, className: String): Unit
  def forceRedraw(el: HTMLElement): Unit
  def getStyleAttributeAsNumber(el: HTMLElement, attr: String): Double
  def hasClass(el: Element, className: String): Boolean
  def isDescendant(parent: Node, child: Node): Boolean
  def offset(el: Element): Anon_Left
  def removeClass(el: Element, className: String): Unit
  def toggleClass(el: Element, className: String): Unit
  def withoutTransition(el: HTMLElement, callback: js.Function0[Unit]): Unit
}

object Dom {
  @scala.inline
  def apply(
    addClass: (Element, String) => Unit,
    forceRedraw: HTMLElement => Unit,
    getStyleAttributeAsNumber: (HTMLElement, String) => Double,
    hasClass: (Element, String) => Boolean,
    isDescendant: (Node, Node) => Boolean,
    offset: Element => Anon_Left,
    removeClass: (Element, String) => Unit,
    toggleClass: (Element, String) => Unit,
    withoutTransition: (HTMLElement, js.Function0[Unit]) => Unit
  ): Dom = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction2(addClass), forceRedraw = js.Any.fromFunction1(forceRedraw), getStyleAttributeAsNumber = js.Any.fromFunction2(getStyleAttributeAsNumber), hasClass = js.Any.fromFunction2(hasClass), isDescendant = js.Any.fromFunction2(isDescendant), offset = js.Any.fromFunction1(offset), removeClass = js.Any.fromFunction2(removeClass), toggleClass = js.Any.fromFunction2(toggleClass), withoutTransition = js.Any.fromFunction2(withoutTransition))
  
    __obj.asInstanceOf[Dom]
  }
}


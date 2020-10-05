package typings.materialUi.MaterialUI.Utils

import typings.materialUi.anon.Left
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dom extends js.Object {
  def addClass(el: Element, className: String): Unit = js.native
  def forceRedraw(el: HTMLElement): Unit = js.native
  def getStyleAttributeAsNumber(el: HTMLElement, attr: String): Double = js.native
  def hasClass(el: Element, className: String): Boolean = js.native
  def isDescendant(parent: Node, child: Node): Boolean = js.native
  def offset(el: Element): Left = js.native
  def removeClass(el: Element, className: String): Unit = js.native
  def toggleClass(el: Element, className: String): Unit = js.native
  def withoutTransition(el: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
}

object Dom {
  @scala.inline
  def apply(
    addClass: (Element, String) => Unit,
    forceRedraw: HTMLElement => Unit,
    getStyleAttributeAsNumber: (HTMLElement, String) => Double,
    hasClass: (Element, String) => Boolean,
    isDescendant: (Node, Node) => Boolean,
    offset: Element => Left,
    removeClass: (Element, String) => Unit,
    toggleClass: (Element, String) => Unit,
    withoutTransition: (HTMLElement, js.Function0[Unit]) => Unit
  ): Dom = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction2(addClass), forceRedraw = js.Any.fromFunction1(forceRedraw), getStyleAttributeAsNumber = js.Any.fromFunction2(getStyleAttributeAsNumber), hasClass = js.Any.fromFunction2(hasClass), isDescendant = js.Any.fromFunction2(isDescendant), offset = js.Any.fromFunction1(offset), removeClass = js.Any.fromFunction2(removeClass), toggleClass = js.Any.fromFunction2(toggleClass), withoutTransition = js.Any.fromFunction2(withoutTransition))
    __obj.asInstanceOf[Dom]
  }
  @scala.inline
  implicit class DomOps[Self <: Dom] (val x: Self) extends AnyVal {
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
    def setAddClass(value: (Element, String) => Unit): Self = this.set("addClass", js.Any.fromFunction2(value))
    @scala.inline
    def setForceRedraw(value: HTMLElement => Unit): Self = this.set("forceRedraw", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStyleAttributeAsNumber(value: (HTMLElement, String) => Double): Self = this.set("getStyleAttributeAsNumber", js.Any.fromFunction2(value))
    @scala.inline
    def setHasClass(value: (Element, String) => Boolean): Self = this.set("hasClass", js.Any.fromFunction2(value))
    @scala.inline
    def setIsDescendant(value: (Node, Node) => Boolean): Self = this.set("isDescendant", js.Any.fromFunction2(value))
    @scala.inline
    def setOffset(value: Element => Left): Self = this.set("offset", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveClass(value: (Element, String) => Unit): Self = this.set("removeClass", js.Any.fromFunction2(value))
    @scala.inline
    def setToggleClass(value: (Element, String) => Unit): Self = this.set("toggleClass", js.Any.fromFunction2(value))
    @scala.inline
    def setWithoutTransition(value: (HTMLElement, js.Function0[Unit]) => Unit): Self = this.set("withoutTransition", js.Any.fromFunction2(value))
  }
  
}


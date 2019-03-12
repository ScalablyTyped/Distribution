package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.UtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom extends js.Object {
  def addClass(el: stdLib.Element, className: java.lang.String): scala.Unit
  def forceRedraw(el: stdLib.HTMLElement): scala.Unit
  def getStyleAttributeAsNumber(el: stdLib.HTMLElement, attr: java.lang.String): scala.Double
  def hasClass(el: stdLib.Element, className: java.lang.String): scala.Boolean
  def isDescendant(parent: stdLib.Node, child: stdLib.Node): scala.Boolean
  def offset(el: stdLib.Element): materialDashUiLib.Anon_Left
  def removeClass(el: stdLib.Element, className: java.lang.String): scala.Unit
  def toggleClass(el: stdLib.Element, className: java.lang.String): scala.Unit
  def withoutTransition(el: stdLib.HTMLElement, callback: js.Function0[scala.Unit]): scala.Unit
}

object Dom {
  @scala.inline
  def apply(
    addClass: (stdLib.Element, java.lang.String) => scala.Unit,
    forceRedraw: stdLib.HTMLElement => scala.Unit,
    getStyleAttributeAsNumber: (stdLib.HTMLElement, java.lang.String) => scala.Double,
    hasClass: (stdLib.Element, java.lang.String) => scala.Boolean,
    isDescendant: (stdLib.Node, stdLib.Node) => scala.Boolean,
    offset: stdLib.Element => materialDashUiLib.Anon_Left,
    removeClass: (stdLib.Element, java.lang.String) => scala.Unit,
    toggleClass: (stdLib.Element, java.lang.String) => scala.Unit,
    withoutTransition: (stdLib.HTMLElement, js.Function0[scala.Unit]) => scala.Unit
  ): Dom = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction2(addClass), forceRedraw = js.Any.fromFunction1(forceRedraw), getStyleAttributeAsNumber = js.Any.fromFunction2(getStyleAttributeAsNumber), hasClass = js.Any.fromFunction2(hasClass), isDescendant = js.Any.fromFunction2(isDescendant), offset = js.Any.fromFunction1(offset), removeClass = js.Any.fromFunction2(removeClass), toggleClass = js.Any.fromFunction2(toggleClass), withoutTransition = js.Any.fromFunction2(withoutTransition))
  
    __obj.asInstanceOf[Dom]
  }
}


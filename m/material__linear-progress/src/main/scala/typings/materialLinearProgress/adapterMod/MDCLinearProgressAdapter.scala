package typings.materialLinearProgress.adapterMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCLinearProgressAdapter extends js.Object {
  def addClass(className: String): Unit
  def getBuffer(): Element
  def getPrimaryBar(): Element
  def hasClass(className: String): Boolean
  def removeClass(className: String): Unit
  def setStyle(el: Element, styleProperty: String, value: Double): Unit
}

object MDCLinearProgressAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    getBuffer: () => Element,
    getPrimaryBar: () => Element,
    hasClass: String => Boolean,
    removeClass: String => Unit,
    setStyle: (Element, String, Double) => Unit
  ): MDCLinearProgressAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getBuffer = js.Any.fromFunction0(getBuffer), getPrimaryBar = js.Any.fromFunction0(getPrimaryBar), hasClass = js.Any.fromFunction1(hasClass), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction3(setStyle))
    __obj.asInstanceOf[MDCLinearProgressAdapter]
  }
}


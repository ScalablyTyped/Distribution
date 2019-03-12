package typings
package atMaterialLinearDashProgressLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCLinearProgressAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def getBuffer(): stdLib.Element
  def getPrimaryBar(): stdLib.Element
  def hasClass(className: java.lang.String): scala.Boolean
  def removeClass(className: java.lang.String): scala.Unit
  def setStyle(el: stdLib.Element, styleProperty: java.lang.String, value: scala.Double): scala.Unit
}

object MDCLinearProgressAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    getBuffer: () => stdLib.Element,
    getPrimaryBar: () => stdLib.Element,
    hasClass: java.lang.String => scala.Boolean,
    removeClass: java.lang.String => scala.Unit,
    setStyle: (stdLib.Element, java.lang.String, scala.Double) => scala.Unit
  ): MDCLinearProgressAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getBuffer = js.Any.fromFunction0(getBuffer), getPrimaryBar = js.Any.fromFunction0(getPrimaryBar), hasClass = js.Any.fromFunction1(hasClass), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction3(setStyle))
  
    __obj.asInstanceOf[MDCLinearProgressAdapter]
  }
}


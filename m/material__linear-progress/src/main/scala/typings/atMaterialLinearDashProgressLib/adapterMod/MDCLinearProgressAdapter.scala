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
    addClass: js.Function1[java.lang.String, scala.Unit],
    getBuffer: js.Function0[stdLib.Element],
    getPrimaryBar: js.Function0[stdLib.Element],
    hasClass: js.Function1[java.lang.String, scala.Boolean],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    setStyle: js.Function3[stdLib.Element, java.lang.String, scala.Double, scala.Unit]
  ): MDCLinearProgressAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, getBuffer = getBuffer, getPrimaryBar = getPrimaryBar, hasClass = hasClass, removeClass = removeClass, setStyle = setStyle)
  
    __obj.asInstanceOf[MDCLinearProgressAdapter]
  }
}


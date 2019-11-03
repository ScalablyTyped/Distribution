package typings.atMaterialIconDashButton.adapterMod

import typings.atMaterialIconDashButton.typesMod.MDCIconButtonToggleEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCIconButtonToggleAdapter extends js.Object {
  def addClass(className: String): Unit
  def hasClass(className: String): Boolean
  def notifyChange(evtData: MDCIconButtonToggleEventDetail): Unit
  def removeClass(className: String): Unit
  def setAttr(attrName: String, attrValue: String): Unit
}

object MDCIconButtonToggleAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    hasClass: String => Boolean,
    notifyChange: MDCIconButtonToggleEventDetail => Unit,
    removeClass: String => Unit,
    setAttr: (String, String) => Unit
  ): MDCIconButtonToggleAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1(notifyChange), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr))
  
    __obj.asInstanceOf[MDCIconButtonToggleAdapter]
  }
}


package typings
package atMaterialCheckboxLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCCheckboxAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def deregisterAnimationEndHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterChangeHandler(handler: stdLib.EventListener): scala.Unit
  def forceLayout(): scala.Unit
  def getNativeControl(): atMaterialSelectionDashControlLib.atMaterialSelectionDashControlMod.MDCSelectionControlState
  def isAttachedToDOM(): scala.Boolean
  def registerAnimationEndHandler(handler: stdLib.EventListener): scala.Unit
  def registerChangeHandler(handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def removeNativeControlAttr(attr: java.lang.String): scala.Unit
  def setNativeControlAttr(attr: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCCheckboxAdapter {
  @scala.inline
  def apply(
    addClass: js.Function1[java.lang.String, scala.Unit],
    deregisterAnimationEndHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterChangeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    forceLayout: js.Function0[scala.Unit],
    getNativeControl: js.Function0[
      atMaterialSelectionDashControlLib.atMaterialSelectionDashControlMod.MDCSelectionControlState
    ],
    isAttachedToDOM: js.Function0[scala.Boolean],
    registerAnimationEndHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerChangeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    removeNativeControlAttr: js.Function1[java.lang.String, scala.Unit],
    setNativeControlAttr: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): MDCCheckboxAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, deregisterAnimationEndHandler = deregisterAnimationEndHandler, deregisterChangeHandler = deregisterChangeHandler, forceLayout = forceLayout, getNativeControl = getNativeControl, isAttachedToDOM = isAttachedToDOM, registerAnimationEndHandler = registerAnimationEndHandler, registerChangeHandler = registerChangeHandler, removeClass = removeClass, removeNativeControlAttr = removeNativeControlAttr, setNativeControlAttr = setNativeControlAttr)
  
    __obj.asInstanceOf[MDCCheckboxAdapter]
  }
}


package typings.materialRadio.adapterMod

import typings.materialSelectionControl.mod.MDCSelectionControlState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCRadioAdapter extends js.Object {
  def addClass(className: String): Unit
  def getNativeControl(): MDCSelectionControlState
  def removeClass(className: String): Unit
}

object MDCRadioAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    getNativeControl: () => MDCSelectionControlState,
    removeClass: String => Unit
  ): MDCRadioAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getNativeControl = js.Any.fromFunction0(getNativeControl), removeClass = js.Any.fromFunction1(removeClass))
  
    __obj.asInstanceOf[MDCRadioAdapter]
  }
}


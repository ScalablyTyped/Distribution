package typings
package atMaterialRadioLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCRadioAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def getNativeControl(): atMaterialSelectionDashControlLib.atMaterialSelectionDashControlMod.MDCSelectionControlState
  def removeClass(className: java.lang.String): scala.Unit
}

object MDCRadioAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    getNativeControl: () => atMaterialSelectionDashControlLib.atMaterialSelectionDashControlMod.MDCSelectionControlState,
    removeClass: java.lang.String => scala.Unit
  ): MDCRadioAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getNativeControl = js.Any.fromFunction0(getNativeControl), removeClass = js.Any.fromFunction1(removeClass))
  
    __obj.asInstanceOf[MDCRadioAdapter]
  }
}


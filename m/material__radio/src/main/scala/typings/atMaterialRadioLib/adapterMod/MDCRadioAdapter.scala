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
    addClass: js.Function1[java.lang.String, scala.Unit],
    getNativeControl: js.Function0[
      atMaterialSelectionDashControlLib.atMaterialSelectionDashControlMod.MDCSelectionControlState
    ],
    removeClass: js.Function1[java.lang.String, scala.Unit]
  ): MDCRadioAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, getNativeControl = getNativeControl, removeClass = removeClass)
  
    __obj.asInstanceOf[MDCRadioAdapter]
  }
}


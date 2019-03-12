package typings
package atMaterialFormDashFieldLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCFormFieldAdapter extends js.Object {
  def activateInputRipple(): scala.Unit
  def deactivateInputRipple(): scala.Unit
  def deregisterInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def registerInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
}

object MDCFormFieldAdapter {
  @scala.inline
  def apply(
    activateInputRipple: () => scala.Unit,
    deactivateInputRipple: () => scala.Unit,
    deregisterInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    registerInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit
  ): MDCFormFieldAdapter = {
    val __obj = js.Dynamic.literal(activateInputRipple = js.Any.fromFunction0(activateInputRipple), deactivateInputRipple = js.Any.fromFunction0(deactivateInputRipple), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler))
  
    __obj.asInstanceOf[MDCFormFieldAdapter]
  }
}


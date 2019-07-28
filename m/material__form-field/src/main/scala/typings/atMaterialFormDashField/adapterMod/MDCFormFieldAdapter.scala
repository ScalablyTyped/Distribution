package typings.atMaterialFormDashField.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCFormFieldAdapter extends js.Object {
  def activateInputRipple(): Unit
  def deactivateInputRipple(): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
}

object MDCFormFieldAdapter {
  @scala.inline
  def apply(
    activateInputRipple: () => Unit,
    deactivateInputRipple: () => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    registerInteractionHandler: (String, EventListener) => Unit
  ): MDCFormFieldAdapter = {
    val __obj = js.Dynamic.literal(activateInputRipple = js.Any.fromFunction0(activateInputRipple), deactivateInputRipple = js.Any.fromFunction0(deactivateInputRipple), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler))
  
    __obj.asInstanceOf[MDCFormFieldAdapter]
  }
}


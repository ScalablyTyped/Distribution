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
    activateInputRipple: js.Function0[scala.Unit],
    deactivateInputRipple: js.Function0[scala.Unit],
    deregisterInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    registerInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit]
  ): MDCFormFieldAdapter = {
    val __obj = js.Dynamic.literal(activateInputRipple = activateInputRipple, deactivateInputRipple = deactivateInputRipple, deregisterInteractionHandler = deregisterInteractionHandler, registerInteractionHandler = registerInteractionHandler)
  
    __obj.asInstanceOf[MDCFormFieldAdapter]
  }
}


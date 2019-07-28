package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotConfiguratorEvent extends js.Object {
  var preventDefault: js.Function
  var sender: PivotConfigurator
  def isDefaultPrevented(): Boolean
}

object PivotConfiguratorEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PivotConfigurator): PivotConfiguratorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[PivotConfiguratorEvent]
  }
}


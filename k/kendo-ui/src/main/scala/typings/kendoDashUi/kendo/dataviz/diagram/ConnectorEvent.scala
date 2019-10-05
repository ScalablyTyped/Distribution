package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Connector
  def isDefaultPrevented(): Boolean
}

object ConnectorEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Connector): ConnectorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ConnectorEvent]
  }
}


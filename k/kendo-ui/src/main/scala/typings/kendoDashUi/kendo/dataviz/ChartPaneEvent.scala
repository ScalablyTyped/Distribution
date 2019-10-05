package typings.kendoDashUi.kendo.dataviz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPaneEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ChartPane
  def isDefaultPrevented(): Boolean
}

object ChartPaneEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ChartPane): ChartPaneEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ChartPaneEvent]
  }
}


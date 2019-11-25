package typings.kendoDashUi.kendo.dataviz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ChartAxis
  def isDefaultPrevented(): Boolean
}

object ChartAxisEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ChartAxis): ChartAxisEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChartAxisEvent]
  }
}


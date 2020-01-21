package typings.kendoUi.kendo.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationEvent extends js.Object {
  var sender: Application
}

object ApplicationEvent {
  @scala.inline
  def apply(sender: Application): ApplicationEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplicationEvent]
  }
}


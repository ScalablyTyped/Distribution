package typings
package kendoDashUiLib.kendoNs.mobileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationEvent extends js.Object {
  var sender: Application
}

object ApplicationEvent {
  @scala.inline
  def apply(sender: Application): ApplicationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[ApplicationEvent]
  }
}


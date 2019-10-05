package typings.kendoDashUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Router
  var url: String
  def isDefaultPrevented(): Boolean
}

object RouterEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Router, url: String): RouterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender, url = url)
  
    __obj.asInstanceOf[RouterEvent]
  }
}


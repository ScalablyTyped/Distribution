package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Router
  var url: java.lang.String
  def isDefaultPrevented(): scala.Boolean
}

object RouterEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Router,
    url: java.lang.String
  ): RouterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender, url = url)
  
    __obj.asInstanceOf[RouterEvent]
  }
}


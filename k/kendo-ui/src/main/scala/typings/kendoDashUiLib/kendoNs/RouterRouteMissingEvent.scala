package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterRouteMissingEvent extends RouterEvent {
  var params: js.Any
}

object RouterRouteMissingEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    params: js.Any,
    preventDefault: js.Function,
    sender: Router,
    url: java.lang.String
  ): RouterRouteMissingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, params = params, preventDefault = preventDefault, sender = sender, url = url)
  
    __obj.asInstanceOf[RouterRouteMissingEvent]
  }
}


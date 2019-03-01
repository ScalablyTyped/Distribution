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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RouterRouteMissingEvent]
  }
}


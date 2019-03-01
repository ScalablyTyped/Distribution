package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterChangeEvent extends RouterEvent {
  var backButtonPressed: scala.Boolean
  var params: js.Any
}

object RouterChangeEvent {
  @scala.inline
  def apply(
    backButtonPressed: scala.Boolean,
    isDefaultPrevented: js.Function0[scala.Boolean],
    params: js.Any,
    preventDefault: js.Function,
    sender: Router,
    url: java.lang.String
  ): RouterChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backButtonPressed")(backButtonPressed)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RouterChangeEvent]
  }
}


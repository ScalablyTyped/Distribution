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
    isDefaultPrevented: () => scala.Boolean,
    params: js.Any,
    preventDefault: js.Function,
    sender: Router,
    url: java.lang.String
  ): RouterChangeEvent = {
    val __obj = js.Dynamic.literal(backButtonPressed = backButtonPressed, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), params = params, preventDefault = preventDefault, sender = sender, url = url)
  
    __obj.asInstanceOf[RouterChangeEvent]
  }
}


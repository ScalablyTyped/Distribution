package typings
package jasmineDashJqueryLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryEventSpy extends js.Object {
  var eventName: java.lang.String
  var selector: java.lang.String
  def handler(eventObject: jqueryLib.JQueryEventObject): js.Any
  def reset(): js.Any
}

object JQueryEventSpy {
  @scala.inline
  def apply(
    eventName: java.lang.String,
    handler: js.Function1[jqueryLib.JQueryEventObject, js.Any],
    reset: js.Function0[js.Any],
    selector: java.lang.String
  ): JQueryEventSpy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventName")(eventName)
    __obj.updateDynamic("handler")(handler)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[JQueryEventSpy]
  }
}


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
    handler: jqueryLib.JQueryEventObject => js.Any,
    reset: () => js.Any,
    selector: java.lang.String
  ): JQueryEventSpy = {
    val __obj = js.Dynamic.literal(eventName = eventName, handler = js.Any.fromFunction1(handler), reset = js.Any.fromFunction0(reset), selector = selector)
  
    __obj.asInstanceOf[JQueryEventSpy]
  }
}


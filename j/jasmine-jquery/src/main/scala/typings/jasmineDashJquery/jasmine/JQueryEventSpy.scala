package typings.jasmineDashJquery.jasmine

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryEventSpy extends js.Object {
  var eventName: String
  var selector: String
  def handler(eventObject: JQueryEventObject): js.Any
  def reset(): js.Any
}

object JQueryEventSpy {
  @scala.inline
  def apply(eventName: String, handler: JQueryEventObject => js.Any, reset: () => js.Any, selector: String): JQueryEventSpy = {
    val __obj = js.Dynamic.literal(eventName = eventName, handler = js.Any.fromFunction1(handler), reset = js.Any.fromFunction0(reset), selector = selector)
  
    __obj.asInstanceOf[JQueryEventSpy]
  }
}


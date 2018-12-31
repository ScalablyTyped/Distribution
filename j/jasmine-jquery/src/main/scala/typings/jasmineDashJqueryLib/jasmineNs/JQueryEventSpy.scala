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


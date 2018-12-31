package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventWatcherOptions extends js.Object {
  var event_selector: java.lang.String
  var key: js.UndefOr[java.lang.String] = js.undefined
  def emitter(newEmitter: js.Any): scala.Unit
  def update(newValue: js.Any): scala.Unit
}


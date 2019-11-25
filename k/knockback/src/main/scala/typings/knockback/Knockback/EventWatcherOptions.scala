package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventWatcherOptions extends js.Object {
  var event_selector: String
  var key: js.UndefOr[String] = js.undefined
  def emitter(newEmitter: js.Any): Unit
  def update(newValue: js.Any): Unit
}

object EventWatcherOptions {
  @scala.inline
  def apply(emitter: js.Any => Unit, event_selector: String, update: js.Any => Unit, key: String = null): EventWatcherOptions = {
    val __obj = js.Dynamic.literal(emitter = js.Any.fromFunction1(emitter), event_selector = event_selector.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventWatcherOptions]
  }
}


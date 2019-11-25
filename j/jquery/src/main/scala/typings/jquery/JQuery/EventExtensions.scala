package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Event extensions
// #region Event extensions
trait EventExtensions extends js.Object {
  /**
    * The jQuery special event hooks are a set of per-event-name functions and properties that allow code to control the behavior of event processing within jQuery. The mechanism is similar to `fixHooks` in that the special event information is stored in `jQuery.event.special.NAME`, where `NAME` is the name of the special event. Event names are case sensitive.
    *
    * As with `fixHooks`, the special event hooks design assumes it will be very rare that two unrelated pieces of code want to process the same event name. Special event authors who need to modify events with existing hooks will need to take precautions to avoid introducing unwanted side-effects by clobbering those hooks.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#special-event-hooks }\`
    */
  var special: SpecialEventHooks
}

object EventExtensions {
  @scala.inline
  def apply(special: SpecialEventHooks): EventExtensions = {
    val __obj = js.Dynamic.literal(special = special.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventExtensions]
  }
}


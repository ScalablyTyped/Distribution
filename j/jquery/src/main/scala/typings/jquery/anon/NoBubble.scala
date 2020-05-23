package typings.jquery.anon

import typings.jquery.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoBubble
  extends _SpecialEventHook[js.Any, js.Any] {
  /**
    * Indicates whether this event type should be bubbled when the `.trigger()` method is called; by default it is `false`, meaning that a triggered event will bubble to the element's parents up to the document (if attached to a document) and then to the window. Note that defining `noBubble` on an event will effectively prevent that event from being used for delegated events with `.trigger()`.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#nobubble-boolean }\`
    */
  var noBubble: Boolean
}

object NoBubble {
  @scala.inline
  def apply(noBubble: Boolean): NoBubble = {
    val __obj = js.Dynamic.literal(noBubble = noBubble.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoBubble]
  }
}


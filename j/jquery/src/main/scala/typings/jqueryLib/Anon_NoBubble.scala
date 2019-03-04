package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoBubble
  extends jqueryLib.JQueryNs._SpecialEventHook[js.Any, js.Any] {
  /**
    * Indicates whether this event type should be bubbled when the `.trigger()` method is called; by default it is `false`, meaning that a triggered event will bubble to the element's parents up to the document (if attached to a document) and then to the window. Note that defining `noBubble` on an event will effectively prevent that event from being used for delegated events with `.trigger()`.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#nobubble-boolean }\`
    */
  var noBubble: scala.Boolean
}

object Anon_NoBubble {
  @scala.inline
  def apply(noBubble: scala.Boolean): Anon_NoBubble = {
    val __obj = js.Dynamic.literal(noBubble = noBubble)
  
    __obj.asInstanceOf[Anon_NoBubble]
  }
}


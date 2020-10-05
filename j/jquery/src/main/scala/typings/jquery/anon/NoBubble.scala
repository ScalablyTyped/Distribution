package typings.jquery.anon

import typings.jquery.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoBubble
  extends _SpecialEventHook[js.Any, js.Any] {
  /**
    * Indicates whether this event type should be bubbled when the `.trigger()` method is called; by default it is `false`, meaning that a triggered event will bubble to the element's parents up to the document (if attached to a document) and then to the window. Note that defining `noBubble` on an event will effectively prevent that event from being used for delegated events with `.trigger()`.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#nobubble-boolean }\`
    */
  var noBubble: Boolean = js.native
}

object NoBubble {
  @scala.inline
  def apply(noBubble: Boolean): NoBubble = {
    val __obj = js.Dynamic.literal(noBubble = noBubble.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoBubble]
  }
  @scala.inline
  implicit class NoBubbleOps[Self <: NoBubble] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNoBubble(value: Boolean): Self = this.set("noBubble", value.asInstanceOf[js.Any])
  }
  
}


package typings.jquery.anon

import typings.jquery.JQuery.Event
import typings.jquery.JQuery._SpecialEventHook
import typings.jquery.jqueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trigger[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * Called when the `.trigger()` or `.triggerHandler()` methods are used to trigger an event for the special type from code, as opposed to events that originate from within the browser. The `this` keyword will be the element being triggered, and the event argument will be a `jQuery.Event` object constructed from the caller's input. At minimum, the event type, data, namespace, and target properties are set on the event. The data argument represents additional data passed by `.trigger()` if present.
    *
    * The trigger hook is called early in the process of triggering an event, just after the `jQuery.Event` object is constructed and before any handlers have been called. It can process the triggered event in any way, for example by calling `event.stopPropagation()` or `event.preventDefault()` before returning. If the hook returns `false`, jQuery does not perform any further event triggering actions and returns immediately. Otherwise, it performs the normal trigger processing, calling any event handlers for the element and bubbling the event (unless propagation is stopped in advance or `noBubble` was specified for the special event) to call event handlers attached to parent elements.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#trigger-function-event-jquery-event-data-object }\`
    */
  def trigger(event: Event, data: TData): Unit | `false` = js.native
}

object Trigger {
  @scala.inline
  def apply[TTarget, TData](trigger: (Event, TData) => Unit | `false`): Trigger[TTarget, TData] = {
    val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction2(trigger))
    __obj.asInstanceOf[Trigger[TTarget, TData]]
  }
  @scala.inline
  implicit class TriggerOps[Self <: Trigger[_, _], TTarget, TData] (val x: Self with (Trigger[TTarget, TData])) extends AnyVal {
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
    def setTrigger(value: (Event, TData) => Unit | `false`): Self = this.set("trigger", js.Any.fromFunction2(value))
  }
  
}


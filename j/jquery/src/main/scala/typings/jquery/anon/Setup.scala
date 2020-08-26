package typings.jquery.anon

import typings.jquery.JQuery.EventHandler
import typings.jquery.JQuery._SpecialEventHook
import typings.jquery.jqueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setup[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * The setup hook is called the first time an event of a particular type is attached to an element; this provides the hook an opportunity to do processing that will apply to all events of this type on this element. The `this` keyword will be a reference to the element where the event is being attached and `eventHandle` is jQuery's event handler function. In most cases the `namespaces` argument should not be used, since it only represents the namespaces of the _first_ event being attached; subsequent events may not have this same namespaces.
    *
    * This hook can perform whatever processing it desires, including attaching its own event handlers to the element or to other elements and recording setup information on the element using the `jQuery.data()` method. If the setup hook wants jQuery to add a browser event (via `addEventListener` or `attachEvent`, depending on browser) it should return `false`. In all other cases, jQuery will not add the browser event, but will continue all its other bookkeeping for the event. This would be appropriate, for example, if the event was never fired by the browser but invoked by `.trigger()`. To attach the jQuery event handler in the setup hook, use the `eventHandle` argument.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#setup-function-data-object-namespaces-eventhandle-function }\`
    */
  def setup(data: TData, namespaces: String, eventHandle: EventHandler[TTarget, TData]): Unit | `false` = js.native
}

object Setup {
  @scala.inline
  def apply[TTarget, TData](setup: (TData, String, EventHandler[TTarget, TData]) => Unit | `false`): Setup[TTarget, TData] = {
    val __obj = js.Dynamic.literal(setup = js.Any.fromFunction3(setup))
    __obj.asInstanceOf[Setup[TTarget, TData]]
  }
  @scala.inline
  implicit class SetupOps[Self <: Setup[_, _], TTarget, TData] (val x: Self with (Setup[TTarget, TData])) extends AnyVal {
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
    def setSetup(value: (TData, String, EventHandler[TTarget, TData]) => Unit | `false`): Self = this.set("setup", js.Any.fromFunction3(value))
  }
  
}


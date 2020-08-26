package typings.jquery.anon

import typings.jquery.JQuery._SpecialEventHook
import typings.jquery.jqueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Teardown[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  /**
    * The teardown hook is called when the final event of a particular type is removed from an element. The `this` keyword will be a reference to the element where the event is being cleaned up. This hook should return `false` if it wants jQuery to remove the event from the browser's event system (via `removeEventListener` or `detachEvent`). In most cases, the setup and teardown hooks should return the same value.
    *
    * If the setup hook attached event handlers or added data to an element through a mechanism such as `jQuery.data()`, the teardown hook should reverse the process and remove them. jQuery will generally remove the data and events when an element is totally removed from the document, but failing to remove data or events on teardown will cause a memory leak if the element stays in the document.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#teardown-function }\`
    */
  def teardown(): Unit | `false` = js.native
}

object Teardown {
  @scala.inline
  def apply[TTarget](teardown: () => Unit | `false`): Teardown[TTarget] = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[Teardown[TTarget]]
  }
  @scala.inline
  implicit class TeardownOps[Self <: Teardown[_], TTarget] (val x: Self with Teardown[TTarget]) extends AnyVal {
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
    def setTeardown(value: () => Unit | `false`): Self = this.set("teardown", js.Any.fromFunction0(value))
  }
  
}


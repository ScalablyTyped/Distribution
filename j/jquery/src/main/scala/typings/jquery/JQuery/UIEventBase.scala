package typings.jquery.JQuery

import typings.jquery.UIEvent
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region UIEvent
// #region UIEvent
@js.native
trait UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // Event
  @JSName("bubbles")
  var bubbles_UIEventBase: Boolean = js.native
  @JSName("cancelable")
  var cancelable_UIEventBase: Boolean = js.native
  // UIEvent
  @JSName("detail")
  var detail_UIEventBase: Double = js.native
  @JSName("eventPhase")
  var eventPhase_UIEventBase: Double = js.native
  @JSName("originalEvent")
  var originalEvent_UIEventBase: js.UndefOr[UIEvent] = js.native
  @JSName("view")
  var view_UIEventBase: Window = js.native
}

object UIEventBase {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    `type`: String,
    view: Window
  ): UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  @scala.inline
  implicit class UIEventBaseOps[Self <: UIEventBase[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetail(value: Double): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: Window): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: UIEvent): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
  }
  
}


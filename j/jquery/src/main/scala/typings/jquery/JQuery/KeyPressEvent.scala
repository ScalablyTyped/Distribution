package typings.jquery.JQuery

import typings.jquery.jqueryStrings.keypress
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPressEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends KeyboardEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  @JSName("type")
  var type_KeyPressEvent: keypress = js.native
}

object KeyPressEvent {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    charCode: Double,
    ctrlKey: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    key: String,
    keyCode: Double,
    metaKey: Boolean,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    `type`: keypress,
    view: Window,
    which: Double
  ): KeyPressEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPressEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  @scala.inline
  implicit class KeyPressEventOps[Self <: KeyPressEvent[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (KeyPressEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
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
    def setType(value: keypress): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


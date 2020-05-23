package typings.jquery.JQuery

import typings.jquery.MouseEvent
import typings.jquery.jqueryStrings.mouseover
import typings.std.Element
import typings.std.EventTarget
import typings.std.TouchList
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends MouseEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // Special handling by jQuery.
  @JSName("type")
  var type_MouseEnterEvent: mouseover
}

object MouseEnterEvent {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    metaKey: Boolean,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    preventDefault: () => Unit,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    toElement: Element,
    `type`: mouseover,
    view: Window,
    which: Double,
    changedTouches: TouchList = null,
    char: String = null,
    charCode: js.UndefOr[Double] = js.undefined,
    key: String = null,
    keyCode: js.UndefOr[Double] = js.undefined,
    namespace: String = null,
    originalEvent: MouseEvent = null,
    pointerId: js.UndefOr[Double] = js.undefined,
    pointerType: String = null,
    relatedTarget: js.UndefOr[Null | EventTarget] = js.undefined,
    result: js.Any = null,
    targetTouches: TouchList = null,
    touches: TouchList = null
  ): MouseEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches.asInstanceOf[js.Any])
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    if (!js.isUndefined(charCode)) __obj.updateDynamic("charCode")(charCode.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode.get.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(pointerId)) __obj.updateDynamic("pointerId")(pointerId.get.asInstanceOf[js.Any])
    if (pointerType != null) __obj.updateDynamic("pointerType")(pointerType.asInstanceOf[js.Any])
    if (!js.isUndefined(relatedTarget)) __obj.updateDynamic("relatedTarget")(relatedTarget.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (targetTouches != null) __obj.updateDynamic("targetTouches")(targetTouches.asInstanceOf[js.Any])
    if (touches != null) __obj.updateDynamic("touches")(touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}


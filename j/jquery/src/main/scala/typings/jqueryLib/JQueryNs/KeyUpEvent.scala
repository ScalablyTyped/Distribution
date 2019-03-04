package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends KeyboardEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  @JSName("type")
  var type_KeyUpEvent: jqueryLib.jqueryLibStrings.keyup
}

object KeyUpEvent {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    altKey: scala.Boolean,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    charCode: scala.Double,
    ctrlKey: scala.Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: scala.Double,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    key: java.lang.String,
    keyCode: scala.Double,
    metaKey: scala.Boolean,
    preventDefault: js.Function0[scala.Unit],
    shiftKey: scala.Boolean,
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: TTarget,
    timeStamp: scala.Double,
    `type`: jqueryLib.jqueryLibStrings.keyup,
    view: stdLib.Window,
    which: scala.Double,
    button: js.UndefOr[scala.Nothing] = js.undefined,
    buttons: js.UndefOr[scala.Nothing] = js.undefined,
    changedTouches: js.UndefOr[scala.Nothing] = js.undefined,
    char: java.lang.String = null,
    clientX: js.UndefOr[scala.Nothing] = js.undefined,
    clientY: js.UndefOr[scala.Nothing] = js.undefined,
    namespace: java.lang.String = null,
    offsetX: js.UndefOr[scala.Nothing] = js.undefined,
    offsetY: js.UndefOr[scala.Nothing] = js.undefined,
    originalEvent: jqueryLib._KeyboardEvent = null,
    pageX: js.UndefOr[scala.Nothing] = js.undefined,
    pageY: js.UndefOr[scala.Nothing] = js.undefined,
    pointerId: js.UndefOr[scala.Nothing] = js.undefined,
    pointerType: js.UndefOr[scala.Nothing] = js.undefined,
    relatedTarget: js.UndefOr[scala.Nothing] = js.undefined,
    result: js.Any = null,
    screenX: js.UndefOr[scala.Nothing] = js.undefined,
    screenY: js.UndefOr[scala.Nothing] = js.undefined,
    targetTouches: js.UndefOr[scala.Nothing] = js.undefined,
    toElement: js.UndefOr[scala.Nothing] = js.undefined,
    touches: js.UndefOr[scala.Nothing] = js.undefined
  ): KeyUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, cancelable = cancelable, charCode = charCode, ctrlKey = ctrlKey, currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail, eventPhase = eventPhase, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, key = key, keyCode = keyCode, metaKey = metaKey, preventDefault = preventDefault, shiftKey = shiftKey, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target.asInstanceOf[js.Any], timeStamp = timeStamp, view = view, which = which)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(changedTouches)) __obj.updateDynamic("changedTouches")(changedTouches)
    if (char != null) __obj.updateDynamic("char")(char)
    if (!js.isUndefined(clientX)) __obj.updateDynamic("clientX")(clientX)
    if (!js.isUndefined(clientY)) __obj.updateDynamic("clientY")(clientY)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX)
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (!js.isUndefined(pageX)) __obj.updateDynamic("pageX")(pageX)
    if (!js.isUndefined(pageY)) __obj.updateDynamic("pageY")(pageY)
    if (!js.isUndefined(pointerId)) __obj.updateDynamic("pointerId")(pointerId)
    if (!js.isUndefined(pointerType)) __obj.updateDynamic("pointerType")(pointerType)
    if (!js.isUndefined(relatedTarget)) __obj.updateDynamic("relatedTarget")(relatedTarget)
    if (result != null) __obj.updateDynamic("result")(result)
    if (!js.isUndefined(screenX)) __obj.updateDynamic("screenX")(screenX)
    if (!js.isUndefined(screenY)) __obj.updateDynamic("screenY")(screenY)
    if (!js.isUndefined(targetTouches)) __obj.updateDynamic("targetTouches")(targetTouches)
    if (!js.isUndefined(toElement)) __obj.updateDynamic("toElement")(toElement)
    if (!js.isUndefined(touches)) __obj.updateDynamic("touches")(touches)
    __obj.asInstanceOf[KeyUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}


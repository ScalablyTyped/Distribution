package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  @JSName("type")
  var type_ResizeEvent: jqueryLib.jqueryLibStrings.resize
}

object ResizeEvent {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    preventDefault: js.Function0[scala.Unit],
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: TTarget,
    timeStamp: scala.Double,
    `type`: jqueryLib.jqueryLibStrings.resize,
    altKey: js.UndefOr[scala.Nothing] = js.undefined,
    button: js.UndefOr[scala.Nothing] = js.undefined,
    buttons: js.UndefOr[scala.Nothing] = js.undefined,
    changedTouches: js.UndefOr[scala.Nothing] = js.undefined,
    char: js.UndefOr[scala.Nothing] = js.undefined,
    charCode: js.UndefOr[scala.Nothing] = js.undefined,
    clientX: js.UndefOr[scala.Nothing] = js.undefined,
    clientY: js.UndefOr[scala.Nothing] = js.undefined,
    ctrlKey: js.UndefOr[scala.Nothing] = js.undefined,
    detail: js.UndefOr[scala.Nothing] = js.undefined,
    key: js.UndefOr[scala.Nothing] = js.undefined,
    keyCode: js.UndefOr[scala.Nothing] = js.undefined,
    metaKey: js.UndefOr[scala.Nothing] = js.undefined,
    namespace: java.lang.String = null,
    offsetX: js.UndefOr[scala.Nothing] = js.undefined,
    offsetY: js.UndefOr[scala.Nothing] = js.undefined,
    originalEvent: jqueryLib._Event = null,
    pageX: js.UndefOr[scala.Nothing] = js.undefined,
    pageY: js.UndefOr[scala.Nothing] = js.undefined,
    pointerId: js.UndefOr[scala.Nothing] = js.undefined,
    pointerType: js.UndefOr[scala.Nothing] = js.undefined,
    relatedTarget: js.UndefOr[scala.Nothing] = js.undefined,
    result: js.Any = null,
    screenX: js.UndefOr[scala.Nothing] = js.undefined,
    screenY: js.UndefOr[scala.Nothing] = js.undefined,
    shiftKey: js.UndefOr[scala.Nothing] = js.undefined,
    targetTouches: js.UndefOr[scala.Nothing] = js.undefined,
    toElement: js.UndefOr[scala.Nothing] = js.undefined,
    touches: js.UndefOr[scala.Nothing] = js.undefined,
    view: js.UndefOr[scala.Nothing] = js.undefined,
    which: js.UndefOr[scala.Nothing] = js.undefined
  ): ResizeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], eventPhase = eventPhase, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, preventDefault = preventDefault, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target.asInstanceOf[js.Any], timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(changedTouches)) __obj.updateDynamic("changedTouches")(changedTouches)
    if (!js.isUndefined(char)) __obj.updateDynamic("char")(char)
    if (!js.isUndefined(charCode)) __obj.updateDynamic("charCode")(charCode)
    if (!js.isUndefined(clientX)) __obj.updateDynamic("clientX")(clientX)
    if (!js.isUndefined(clientY)) __obj.updateDynamic("clientY")(clientY)
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (!js.isUndefined(detail)) __obj.updateDynamic("detail")(detail)
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode)
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey)
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
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (!js.isUndefined(targetTouches)) __obj.updateDynamic("targetTouches")(targetTouches)
    if (!js.isUndefined(toElement)) __obj.updateDynamic("toElement")(toElement)
    if (!js.isUndefined(touches)) __obj.updateDynamic("touches")(touches)
    if (!js.isUndefined(view)) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(which)) __obj.updateDynamic("which")(which)
    __obj.asInstanceOf[ResizeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}


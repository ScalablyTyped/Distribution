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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("altKey")(altKey)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("charCode")(charCode)
    __obj.updateDynamic("ctrlKey")(ctrlKey)
    __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("delegateTarget")(delegateTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("keyCode")(keyCode)
    __obj.updateDynamic("metaKey")(metaKey)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("view")(view)
    __obj.updateDynamic("which")(which)
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


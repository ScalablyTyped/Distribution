package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends MouseEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  /**
    * The other DOM element involved in the event, if any.
    * @see \`{@link https://api.jquery.com/event.relatedTarget/ }\`
    * @since 1.1.4
    * @example ​ ````On mouseout of anchors, alert the element type being entered.
    ```javascript
    $( "a" ).mouseout(function( event ) {
    alert( event.relatedTarget.nodeName ); // "DIV"
    });
    ```
    */
  @JSName("relatedTarget")
  var relatedTarget_MouseUpEvent: js.UndefOr[scala.Null] = js.undefined
  @JSName("type")
  var type_MouseUpEvent: jqueryLib.jqueryLibStrings.mouseup
}

object MouseUpEvent {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    altKey: scala.Boolean,
    bubbles: scala.Boolean,
    button: scala.Double,
    buttons: scala.Double,
    cancelable: scala.Boolean,
    clientX: scala.Double,
    clientY: scala.Double,
    ctrlKey: scala.Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: scala.Double,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    metaKey: scala.Boolean,
    offsetX: scala.Double,
    offsetY: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    preventDefault: js.Function0[scala.Unit],
    screenX: scala.Double,
    screenY: scala.Double,
    shiftKey: scala.Boolean,
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: TTarget,
    timeStamp: scala.Double,
    toElement: stdLib.Element,
    `type`: jqueryLib.jqueryLibStrings.mouseup,
    view: stdLib.Window,
    which: scala.Double,
    changedTouches: js.UndefOr[scala.Nothing] = js.undefined,
    char: js.UndefOr[scala.Nothing] = js.undefined,
    charCode: js.UndefOr[scala.Nothing] = js.undefined,
    key: js.UndefOr[scala.Nothing] = js.undefined,
    keyCode: js.UndefOr[scala.Nothing] = js.undefined,
    namespace: java.lang.String = null,
    originalEvent: jqueryLib._MouseEvent = null,
    pointerId: js.UndefOr[scala.Nothing] = js.undefined,
    pointerType: js.UndefOr[scala.Nothing] = js.undefined,
    relatedTarget: scala.Null = null,
    result: js.Any = null,
    targetTouches: js.UndefOr[scala.Nothing] = js.undefined,
    touches: js.UndefOr[scala.Nothing] = js.undefined
  ): MouseUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("altKey")(altKey)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("clientX")(clientX)
    __obj.updateDynamic("clientY")(clientY)
    __obj.updateDynamic("ctrlKey")(ctrlKey)
    __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("delegateTarget")(delegateTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("metaKey")(metaKey)
    __obj.updateDynamic("offsetX")(offsetX)
    __obj.updateDynamic("offsetY")(offsetY)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("screenX")(screenX)
    __obj.updateDynamic("screenY")(screenY)
    __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("toElement")(toElement)
    __obj.updateDynamic("view")(view)
    __obj.updateDynamic("which")(which)
    if (!js.isUndefined(changedTouches)) __obj.updateDynamic("changedTouches")(changedTouches)
    if (!js.isUndefined(char)) __obj.updateDynamic("char")(char)
    if (!js.isUndefined(charCode)) __obj.updateDynamic("charCode")(charCode)
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (!js.isUndefined(pointerId)) __obj.updateDynamic("pointerId")(pointerId)
    if (!js.isUndefined(pointerType)) __obj.updateDynamic("pointerType")(pointerType)
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget)
    if (result != null) __obj.updateDynamic("result")(result)
    if (!js.isUndefined(targetTouches)) __obj.updateDynamic("targetTouches")(targetTouches)
    if (!js.isUndefined(touches)) __obj.updateDynamic("touches")(touches)
    __obj.asInstanceOf[MouseUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}


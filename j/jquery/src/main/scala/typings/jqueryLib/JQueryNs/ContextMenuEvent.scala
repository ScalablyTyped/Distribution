package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends MouseEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
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
  var relatedTarget_ContextMenuEvent: js.UndefOr[scala.Null] = js.undefined
  @JSName("type")
  var type_ContextMenuEvent: jqueryLib.jqueryLibStrings.contextmenu
}

object ContextMenuEvent {
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
    `type`: jqueryLib.jqueryLibStrings.contextmenu,
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
  ): ContextMenuEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, button = button, buttons = buttons, cancelable = cancelable, clientX = clientX, clientY = clientY, ctrlKey = ctrlKey, currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail, eventPhase = eventPhase, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, metaKey = metaKey, offsetX = offsetX, offsetY = offsetY, pageX = pageX, pageY = pageY, preventDefault = preventDefault, screenX = screenX, screenY = screenY, shiftKey = shiftKey, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target.asInstanceOf[js.Any], timeStamp = timeStamp, toElement = toElement, view = view, which = which)
    __obj.updateDynamic("type")(`type`)
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
    __obj.asInstanceOf[ContextMenuEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}


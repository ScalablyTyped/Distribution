package typings
package jqueryDashCountdownLib.jQueryCountdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event
  extends jqueryLib.JQueryNs.Event {
  /**
    * Passed away the final date?
    */
  var elapsed: scala.Boolean
  /**
    * The parsed final date native object
    */
  var finalDate: stdLib.Date
  var offset: OffsetEvent
  /**
    * The formatter function
    */
  def strftime(format: java.lang.String): java.lang.String
}

object Event {
  @scala.inline
  def apply(
    elapsed: scala.Boolean,
    finalDate: stdLib.Date,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    offset: OffsetEvent,
    preventDefault: js.Function0[scala.Unit],
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    strftime: js.Function1[java.lang.String, java.lang.String],
    timeStamp: scala.Double,
    `type`: java.lang.String,
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    button: scala.Int | scala.Double = null,
    buttons: scala.Int | scala.Double = null,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    changedTouches: stdLib.TouchList = null,
    char: java.lang.String = null,
    charCode: scala.Int | scala.Double = null,
    clientX: scala.Int | scala.Double = null,
    clientY: scala.Int | scala.Double = null,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    detail: scala.Int | scala.Double = null,
    eventPhase: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    keyCode: scala.Int | scala.Double = null,
    metaKey: js.UndefOr[scala.Boolean] = js.undefined,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    pageX: scala.Int | scala.Double = null,
    pageY: scala.Int | scala.Double = null,
    pointerId: scala.Int | scala.Double = null,
    pointerType: java.lang.String = null,
    screenX: scala.Int | scala.Double = null,
    screenY: scala.Int | scala.Double = null,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    targetTouches: stdLib.TouchList = null,
    toElement: stdLib.Element = null,
    touches: stdLib.TouchList = null,
    view: stdLib.Window = null,
    which: scala.Int | scala.Double = null
  ): Event = {
    val __obj = js.Dynamic.literal(elapsed = elapsed, finalDate = finalDate, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, offset = offset, preventDefault = preventDefault, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, strftime = strftime, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches)
    if (char != null) __obj.updateDynamic("char")(char)
    if (charCode != null) __obj.updateDynamic("charCode")(charCode.asInstanceOf[js.Any])
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (pointerId != null) __obj.updateDynamic("pointerId")(pointerId.asInstanceOf[js.Any])
    if (pointerType != null) __obj.updateDynamic("pointerType")(pointerType)
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (targetTouches != null) __obj.updateDynamic("targetTouches")(targetTouches)
    if (toElement != null) __obj.updateDynamic("toElement")(toElement)
    if (touches != null) __obj.updateDynamic("touches")(touches)
    if (view != null) __obj.updateDynamic("view")(view)
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}


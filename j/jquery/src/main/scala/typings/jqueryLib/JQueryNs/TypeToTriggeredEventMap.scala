package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
trait TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget]
  extends /* type */ org.scalablytyped.runtime.StringDictionary[TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]] {
  // FocusEvent
  var blur: BlurEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  // Event
  var change: ChangeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  // UIEvent
  // MouseEvent
  var click: ClickEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var contextmenu: ContextMenuEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var dblclick: DoubleClickEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var focus: FocusEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var focusin: FocusInEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var focusout: FocusOutEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  // KeyboardEvent
  var keydown: KeyDownEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var keypress: KeyPressEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var keyup: KeyUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var mousedown: MouseDownEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var mouseenter: MouseEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var mouseleave: MouseLeaveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var mousemove: MouseMoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var mouseout: MouseOutEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var mouseover: MouseOverEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var mouseup: MouseUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var resize: ResizeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var scroll: ScrollEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var select: SelectEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var submit: SubmitEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  // TouchEvent
  var touchcancel: TouchCancelEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var touchend: TouchEndEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var touchmove: TouchMoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  var touchstart: TouchStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
}

object TypeToTriggeredEventMap {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    blur: BlurEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    change: ChangeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    click: ClickEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    contextmenu: ContextMenuEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    dblclick: DoubleClickEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    focus: FocusEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    focusin: FocusInEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    focusout: FocusOutEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    keydown: KeyDownEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    keypress: KeyPressEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    keyup: KeyUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    mousedown: MouseDownEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    mouseenter: MouseEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    mouseleave: MouseLeaveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    mousemove: MouseMoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    mouseout: MouseOutEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    mouseover: MouseOverEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    mouseup: MouseUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    resize: ResizeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    scroll: ScrollEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    select: SelectEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    submit: SubmitEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    touchcancel: TouchCancelEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    touchend: TouchEndEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    touchmove: TouchMoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    touchstart: TouchStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    StringDictionary: /* type */ org.scalablytyped.runtime.StringDictionary[TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]] = null
  ): TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blur")(blur)
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("contextmenu")(contextmenu)
    __obj.updateDynamic("dblclick")(dblclick)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("focusin")(focusin)
    __obj.updateDynamic("focusout")(focusout)
    __obj.updateDynamic("keydown")(keydown)
    __obj.updateDynamic("keypress")(keypress)
    __obj.updateDynamic("keyup")(keyup)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mouseenter")(mouseenter)
    __obj.updateDynamic("mouseleave")(mouseleave)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("mouseout")(mouseout)
    __obj.updateDynamic("mouseover")(mouseover)
    __obj.updateDynamic("mouseup")(mouseup)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("scroll")(scroll)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("submit")(submit)
    __obj.updateDynamic("touchcancel")(touchcancel)
    __obj.updateDynamic("touchend")(touchend)
    __obj.updateDynamic("touchmove")(touchmove)
    __obj.updateDynamic("touchstart")(touchstart)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}


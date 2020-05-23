package typings.jquery.JQuery

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.jqueryBooleans.`false`
import typings.jquery.jqueryStrings.blur
import typings.jquery.jqueryStrings.change
import typings.jquery.jqueryStrings.click
import typings.jquery.jqueryStrings.contextmenu
import typings.jquery.jqueryStrings.dblclick
import typings.jquery.jqueryStrings.drag
import typings.jquery.jqueryStrings.dragend
import typings.jquery.jqueryStrings.dragenter
import typings.jquery.jqueryStrings.dragexit
import typings.jquery.jqueryStrings.dragleave
import typings.jquery.jqueryStrings.dragover
import typings.jquery.jqueryStrings.dragstart
import typings.jquery.jqueryStrings.drop
import typings.jquery.jqueryStrings.focus
import typings.jquery.jqueryStrings.focusin
import typings.jquery.jqueryStrings.focusout
import typings.jquery.jqueryStrings.keydown
import typings.jquery.jqueryStrings.keypress
import typings.jquery.jqueryStrings.keyup
import typings.jquery.jqueryStrings.mousedown
import typings.jquery.jqueryStrings.mouseenter
import typings.jquery.jqueryStrings.mouseleave
import typings.jquery.jqueryStrings.mousemove
import typings.jquery.jqueryStrings.mouseout
import typings.jquery.jqueryStrings.mouseover
import typings.jquery.jqueryStrings.mouseup
import typings.jquery.jqueryStrings.resize
import typings.jquery.jqueryStrings.scroll
import typings.jquery.jqueryStrings.select
import typings.jquery.jqueryStrings.submit
import typings.jquery.jqueryStrings.touchcancel
import typings.jquery.jqueryStrings.touchend
import typings.jquery.jqueryStrings.touchmove
import typings.jquery.jqueryStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget]
  extends _TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget]
     with // No idea why it's necessary to include `object` in the union but otherwise TypeScript complains that
// derived types of Event are not assignable to Event.
/* type */ StringDictionary[
      js.UndefOr[
        (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, String]) | `false` | js.Object
      ]
    ]

object TypeEventHandlers {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    StringDictionary: // No idea why it's necessary to include `object` in the union but otherwise TypeScript complains that
  // derived types of Event are not assignable to Event.
  /* type */ StringDictionary[
      js.UndefOr[
        (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, String]) | `false` | js.Object
      ]
    ] = null,
    blur: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, blur]) | `false` | js.Object = null,
    change: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, change]) | `false` | js.Object = null,
    click: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, click]) | `false` | js.Object = null,
    contextmenu: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, contextmenu]) | `false` | js.Object = null,
    dblclick: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, dblclick]) | `false` | js.Object = null,
    drag: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, drag]) | `false` | js.Object = null,
    dragend: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, dragend]) | `false` | js.Object = null,
    dragenter: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, dragenter]) | `false` | js.Object = null,
    dragexit: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, dragexit]) | `false` | js.Object = null,
    dragleave: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, dragleave]) | `false` | js.Object = null,
    dragover: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, dragover]) | `false` | js.Object = null,
    dragstart: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, dragstart]) | `false` | js.Object = null,
    drop: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, drop]) | `false` | js.Object = null,
    focus: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, focus]) | `false` | js.Object = null,
    focusin: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, focusin]) | `false` | js.Object = null,
    focusout: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, focusout]) | `false` | js.Object = null,
    keydown: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, keydown]) | `false` | js.Object = null,
    keypress: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, keypress]) | `false` | js.Object = null,
    keyup: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, keyup]) | `false` | js.Object = null,
    mousedown: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, mousedown]) | `false` | js.Object = null,
    mouseenter: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, mouseenter]) | `false` | js.Object = null,
    mouseleave: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, mouseleave]) | `false` | js.Object = null,
    mousemove: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, mousemove]) | `false` | js.Object = null,
    mouseout: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, mouseout]) | `false` | js.Object = null,
    mouseover: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, mouseover]) | `false` | js.Object = null,
    mouseup: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, mouseup]) | `false` | js.Object = null,
    resize: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, resize]) | `false` | js.Object = null,
    scroll: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, scroll]) | `false` | js.Object = null,
    select: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, select]) | `false` | js.Object = null,
    submit: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, submit]) | `false` | js.Object = null,
    touchcancel: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, touchcancel]) | `false` | js.Object = null,
    touchend: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, touchend]) | `false` | js.Object = null,
    touchmove: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, touchmove]) | `false` | js.Object = null,
    touchstart: (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, touchstart]) | `false` | js.Object = null
  ): TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(change.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (dblclick != null) __obj.updateDynamic("dblclick")(dblclick.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (dragend != null) __obj.updateDynamic("dragend")(dragend.asInstanceOf[js.Any])
    if (dragenter != null) __obj.updateDynamic("dragenter")(dragenter.asInstanceOf[js.Any])
    if (dragexit != null) __obj.updateDynamic("dragexit")(dragexit.asInstanceOf[js.Any])
    if (dragleave != null) __obj.updateDynamic("dragleave")(dragleave.asInstanceOf[js.Any])
    if (dragover != null) __obj.updateDynamic("dragover")(dragover.asInstanceOf[js.Any])
    if (dragstart != null) __obj.updateDynamic("dragstart")(dragstart.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (focusin != null) __obj.updateDynamic("focusin")(focusin.asInstanceOf[js.Any])
    if (focusout != null) __obj.updateDynamic("focusout")(focusout.asInstanceOf[js.Any])
    if (keydown != null) __obj.updateDynamic("keydown")(keydown.asInstanceOf[js.Any])
    if (keypress != null) __obj.updateDynamic("keypress")(keypress.asInstanceOf[js.Any])
    if (keyup != null) __obj.updateDynamic("keyup")(keyup.asInstanceOf[js.Any])
    if (mousedown != null) __obj.updateDynamic("mousedown")(mousedown.asInstanceOf[js.Any])
    if (mouseenter != null) __obj.updateDynamic("mouseenter")(mouseenter.asInstanceOf[js.Any])
    if (mouseleave != null) __obj.updateDynamic("mouseleave")(mouseleave.asInstanceOf[js.Any])
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove.asInstanceOf[js.Any])
    if (mouseout != null) __obj.updateDynamic("mouseout")(mouseout.asInstanceOf[js.Any])
    if (mouseover != null) __obj.updateDynamic("mouseover")(mouseover.asInstanceOf[js.Any])
    if (mouseup != null) __obj.updateDynamic("mouseup")(mouseup.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (touchcancel != null) __obj.updateDynamic("touchcancel")(touchcancel.asInstanceOf[js.Any])
    if (touchend != null) __obj.updateDynamic("touchend")(touchend.asInstanceOf[js.Any])
    if (touchmove != null) __obj.updateDynamic("touchmove")(touchmove.asInstanceOf[js.Any])
    if (touchstart != null) __obj.updateDynamic("touchstart")(touchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}


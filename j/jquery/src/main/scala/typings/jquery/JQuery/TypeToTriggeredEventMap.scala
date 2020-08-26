package typings.jquery.JQuery

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
@js.native
trait TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget] extends /* type */ StringDictionary[TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]] {
  // FocusEvent
  var blur: BlurEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  // Event
  var change: ChangeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  // UIEvent
  // MouseEvent
  var click: ClickEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var contextmenu: ContextMenuEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var dblclick: DoubleClickEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  // DragEvent
  var drag: DragEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var dragend: DragEndEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var dragenter: DragEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var dragexit: DragExitEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var dragleave: DragLeaveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var dragover: DragOverEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var dragstart: DragStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var drop: DropEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var focus: FocusEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var focusin: FocusInEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var focusout: FocusOutEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  // KeyboardEvent
  var keydown: KeyDownEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var keypress: KeyPressEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var keyup: KeyUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var mousedown: MouseDownEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var mouseenter: MouseEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var mouseleave: MouseLeaveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var mousemove: MouseMoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var mouseout: MouseOutEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var mouseover: MouseOverEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var mouseup: MouseUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var resize: ResizeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var scroll: ScrollEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var select: SelectEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var submit: SubmitEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  // TouchEvent
  var touchcancel: TouchCancelEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var touchend: TouchEndEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var touchmove: TouchMoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  var touchstart: TouchStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
}

object TypeToTriggeredEventMap {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    blur: BlurEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    change: ChangeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    click: ClickEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    contextmenu: ContextMenuEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    dblclick: DoubleClickEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    drag: DragEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    dragend: DragEndEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    dragenter: DragEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    dragexit: DragExitEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    dragleave: DragLeaveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    dragover: DragOverEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    dragstart: DragStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    drop: DropEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
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
    touchstart: TouchStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  ): TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  @scala.inline
  implicit class TypeToTriggeredEventMapOps[Self <: TypeToTriggeredEventMap[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
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
    def setBlur(value: BlurEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def setChange(value: ChangeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: ClickEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextmenu(value: ContextMenuEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: DoubleClickEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag(value: DragEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragend(value: DragEndEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("dragend", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragenter(value: DragEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("dragenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragexit(value: DragExitEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("dragexit", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragleave(value: DragLeaveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("dragleave", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragover(value: DragOverEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("dragover", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragstart(value: DragStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrop(value: DropEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: FocusEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusin(value: FocusInEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("focusin", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusout(value: FocusOutEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("focusout", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeydown(value: KeyDownEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("keydown", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeypress(value: KeyPressEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("keypress", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyup(value: KeyUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("keyup", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousedown(value: MouseDownEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseenter(value: MouseEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("mouseenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseleave(value: MouseLeaveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("mouseleave", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousemove(value: MouseMoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseout(value: MouseOutEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseover(value: MouseOverEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseup(value: MouseUpEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def setResize(value: ResizeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def setScroll(value: ScrollEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: SelectEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmit(value: SubmitEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("submit", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: TouchCancelEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: TouchEndEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: TouchMoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: TouchStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set("touchstart", value.asInstanceOf[js.Any])
  }
  
}


package typings.luminoVirtualdom.mod

import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MediaStreamErrorEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {readonly [ T in keyof @lumino/virtualdom.@lumino/virtualdom.ElementEventMap ]:? (this : std.HTMLElement, event : @lumino/virtualdom.@lumino/virtualdom.ElementEventMap[T]): any} */
@js.native
trait ElementEventAttrs extends js.Object {
  val onabort: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
  val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onblur: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.native
  val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val oncopy: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
  val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val oncut: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
  val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val ondrag: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondrop: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onemptied: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onended: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]] = js.native
  val onerror: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]] = js.native
  val onfocus: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.native
  val oninput: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
  val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
  val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
  val onload: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onloadend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmousewheel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]] = js.native
  val onpaste: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
  val onpause: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onplaying: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onprogress: js.UndefOr[
    js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent[EventTarget], _]
  ] = js.native
  val onratechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onreset: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onscroll: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
  val onseeked: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onseeking: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onselect: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
  val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onstalled: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
}

object ElementEventAttrs {
  @scala.inline
  def apply(): ElementEventAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementEventAttrs]
  }
  @scala.inline
  implicit class ElementEventAttrsOps[Self <: ElementEventAttrs] (val x: Self) extends AnyVal {
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
    def setOnabort(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = this.set("onabort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnabort: Self = this.set("onabort", js.undefined)
    @scala.inline
    def setOnauxclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onauxclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnauxclick: Self = this.set("onauxclick", js.undefined)
    @scala.inline
    def setOnblur(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]): Self = this.set("onblur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    @scala.inline
    def setOncanplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("oncanplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncanplay: Self = this.set("oncanplay", js.undefined)
    @scala.inline
    def setOncanplaythrough(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("oncanplaythrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncanplaythrough: Self = this.set("oncanplaythrough", js.undefined)
    @scala.inline
    def setOnchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    @scala.inline
    def setOnclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setOncontextmenu(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("oncontextmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncontextmenu: Self = this.set("oncontextmenu", js.undefined)
    @scala.inline
    def setOncopy(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = this.set("oncopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncopy: Self = this.set("oncopy", js.undefined)
    @scala.inline
    def setOncuechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("oncuechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncuechange: Self = this.set("oncuechange", js.undefined)
    @scala.inline
    def setOncut(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = this.set("oncut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncut: Self = this.set("oncut", js.undefined)
    @scala.inline
    def setOndblclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("ondblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndblclick: Self = this.set("ondblclick", js.undefined)
    @scala.inline
    def setOndrag(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndrag: Self = this.set("ondrag", js.undefined)
    @scala.inline
    def setOndragend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragend: Self = this.set("ondragend", js.undefined)
    @scala.inline
    def setOndragenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragenter: Self = this.set("ondragenter", js.undefined)
    @scala.inline
    def setOndragexit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragexit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragexit: Self = this.set("ondragexit", js.undefined)
    @scala.inline
    def setOndragleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragleave: Self = this.set("ondragleave", js.undefined)
    @scala.inline
    def setOndragover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragover: Self = this.set("ondragover", js.undefined)
    @scala.inline
    def setOndragstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragstart: Self = this.set("ondragstart", js.undefined)
    @scala.inline
    def setOndrop(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndrop: Self = this.set("ondrop", js.undefined)
    @scala.inline
    def setOndurationchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("ondurationchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndurationchange: Self = this.set("ondurationchange", js.undefined)
    @scala.inline
    def setOnemptied(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onemptied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnemptied: Self = this.set("onemptied", js.undefined)
    @scala.inline
    def setOnended(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]): Self = this.set("onended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnended: Self = this.set("onended", js.undefined)
    @scala.inline
    def setOnerror(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]): Self = this.set("onerror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOnfocus(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]): Self = this.set("onfocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnfocus: Self = this.set("onfocus", js.undefined)
    @scala.inline
    def setOninput(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("oninput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOninput: Self = this.set("oninput", js.undefined)
    @scala.inline
    def setOninvalid(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("oninvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOninvalid: Self = this.set("oninvalid", js.undefined)
    @scala.inline
    def setOnkeydown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = this.set("onkeydown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeydown: Self = this.set("onkeydown", js.undefined)
    @scala.inline
    def setOnkeypress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = this.set("onkeypress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeypress: Self = this.set("onkeypress", js.undefined)
    @scala.inline
    def setOnkeyup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = this.set("onkeyup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeyup: Self = this.set("onkeyup", js.undefined)
    @scala.inline
    def setOnload(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setOnloadeddata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onloadeddata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadeddata: Self = this.set("onloadeddata", js.undefined)
    @scala.inline
    def setOnloadedmetadata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onloadedmetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadedmetadata: Self = this.set("onloadedmetadata", js.undefined)
    @scala.inline
    def setOnloadend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onloadend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadend: Self = this.set("onloadend", js.undefined)
    @scala.inline
    def setOnloadstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onloadstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadstart: Self = this.set("onloadstart", js.undefined)
    @scala.inline
    def setOnmousedown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmousedown: Self = this.set("onmousedown", js.undefined)
    @scala.inline
    def setOnmouseenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmouseenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseenter: Self = this.set("onmouseenter", js.undefined)
    @scala.inline
    def setOnmouseleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmouseleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseleave: Self = this.set("onmouseleave", js.undefined)
    @scala.inline
    def setOnmousemove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmousemove: Self = this.set("onmousemove", js.undefined)
    @scala.inline
    def setOnmouseout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    @scala.inline
    def setOnmouseover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    @scala.inline
    def setOnmouseup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseup: Self = this.set("onmouseup", js.undefined)
    @scala.inline
    def setOnmousewheel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]): Self = this.set("onmousewheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmousewheel: Self = this.set("onmousewheel", js.undefined)
    @scala.inline
    def setOnpaste(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = this.set("onpaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpaste: Self = this.set("onpaste", js.undefined)
    @scala.inline
    def setOnpause(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onpause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpause: Self = this.set("onpause", js.undefined)
    @scala.inline
    def setOnplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnplay: Self = this.set("onplay", js.undefined)
    @scala.inline
    def setOnplaying(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onplaying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnplaying: Self = this.set("onplaying", js.undefined)
    @scala.inline
    def setOnpointercancel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointercancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointercancel: Self = this.set("onpointercancel", js.undefined)
    @scala.inline
    def setOnpointerdown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerdown: Self = this.set("onpointerdown", js.undefined)
    @scala.inline
    def setOnpointerenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerenter: Self = this.set("onpointerenter", js.undefined)
    @scala.inline
    def setOnpointerleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerleave: Self = this.set("onpointerleave", js.undefined)
    @scala.inline
    def setOnpointermove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointermove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointermove: Self = this.set("onpointermove", js.undefined)
    @scala.inline
    def setOnpointerout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerout: Self = this.set("onpointerout", js.undefined)
    @scala.inline
    def setOnpointerover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerover: Self = this.set("onpointerover", js.undefined)
    @scala.inline
    def setOnpointerup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerup: Self = this.set("onpointerup", js.undefined)
    @scala.inline
    def setOnprogress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent[EventTarget], _]): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
    @scala.inline
    def setOnratechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onratechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnratechange: Self = this.set("onratechange", js.undefined)
    @scala.inline
    def setOnreset(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnreset: Self = this.set("onreset", js.undefined)
    @scala.inline
    def setOnscroll(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = this.set("onscroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnscroll: Self = this.set("onscroll", js.undefined)
    @scala.inline
    def setOnseeked(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onseeked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnseeked: Self = this.set("onseeked", js.undefined)
    @scala.inline
    def setOnseeking(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onseeking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnseeking: Self = this.set("onseeking", js.undefined)
    @scala.inline
    def setOnselect(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = this.set("onselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselect: Self = this.set("onselect", js.undefined)
    @scala.inline
    def setOnselectstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onselectstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselectstart: Self = this.set("onselectstart", js.undefined)
    @scala.inline
    def setOnstalled(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onstalled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnstalled: Self = this.set("onstalled", js.undefined)
    @scala.inline
    def setOnsubmit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onsubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsubmit: Self = this.set("onsubmit", js.undefined)
    @scala.inline
    def setOnsuspend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onsuspend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsuspend: Self = this.set("onsuspend", js.undefined)
    @scala.inline
    def setOntimeupdate(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("ontimeupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntimeupdate: Self = this.set("ontimeupdate", js.undefined)
    @scala.inline
    def setOnvolumechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onvolumechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnvolumechange: Self = this.set("onvolumechange", js.undefined)
    @scala.inline
    def setOnwaiting(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onwaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnwaiting: Self = this.set("onwaiting", js.undefined)
  }
  
}


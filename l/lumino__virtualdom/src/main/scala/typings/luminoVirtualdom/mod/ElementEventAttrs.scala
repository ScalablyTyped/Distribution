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
trait ElementEventAttrs extends js.Object {
  val onabort: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.undefined
  val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onblur: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.undefined
  val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val oncopy: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.undefined
  val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val oncut: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.undefined
  val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val ondrag: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondrop: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onemptied: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onended: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]] = js.undefined
  val onerror: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]] = js.undefined
  val onfocus: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.undefined
  val oninput: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.undefined
  val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.undefined
  val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.undefined
  val onload: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onloadend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmousewheel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]] = js.undefined
  val onpaste: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.undefined
  val onpause: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onplaying: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onprogress: js.UndefOr[
    js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent[EventTarget], _]
  ] = js.undefined
  val onratechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onreset: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onscroll: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.undefined
  val onseeked: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onseeking: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onselect: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.undefined
  val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onstalled: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
}

object ElementEventAttrs {
  @scala.inline
  def apply(
    onabort: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _] = null,
    onauxclick: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onblur: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _] = null,
    oncanplay: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    oncanplaythrough: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onchange: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onclick: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    oncontextmenu: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    oncopy: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _] = null,
    oncuechange: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    oncut: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _] = null,
    ondblclick: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    ondrag: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragend: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragenter: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragexit: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragleave: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragover: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragstart: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondrop: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondurationchange: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onemptied: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onended: js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _] = null,
    onerror: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _] = null,
    onfocus: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _] = null,
    oninput: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    oninvalid: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onkeydown: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _] = null,
    onkeypress: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _] = null,
    onkeyup: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _] = null,
    onload: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onloadeddata: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onloadedmetadata: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onloadend: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onloadstart: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onmousedown: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmouseenter: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmouseleave: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmousemove: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmouseout: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmouseover: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmouseup: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmousewheel: js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _] = null,
    onpaste: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _] = null,
    onpause: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onplay: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onplaying: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onpointercancel: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerdown: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerenter: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerleave: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointermove: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerout: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerover: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerup: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onprogress: js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent[EventTarget], _] = null,
    onratechange: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onreset: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onscroll: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _] = null,
    onseeked: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onseeking: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onselect: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _] = null,
    onselectstart: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onstalled: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onsubmit: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onsuspend: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    ontimeupdate: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onvolumechange: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onwaiting: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null
  ): ElementEventAttrs = {
    val __obj = js.Dynamic.literal()
    if (onabort != null) __obj.updateDynamic("onabort")(onabort.asInstanceOf[js.Any])
    if (onauxclick != null) __obj.updateDynamic("onauxclick")(onauxclick.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (oncanplay != null) __obj.updateDynamic("oncanplay")(oncanplay.asInstanceOf[js.Any])
    if (oncanplaythrough != null) __obj.updateDynamic("oncanplaythrough")(oncanplaythrough.asInstanceOf[js.Any])
    if (onchange != null) __obj.updateDynamic("onchange")(onchange.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu.asInstanceOf[js.Any])
    if (oncopy != null) __obj.updateDynamic("oncopy")(oncopy.asInstanceOf[js.Any])
    if (oncuechange != null) __obj.updateDynamic("oncuechange")(oncuechange.asInstanceOf[js.Any])
    if (oncut != null) __obj.updateDynamic("oncut")(oncut.asInstanceOf[js.Any])
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick.asInstanceOf[js.Any])
    if (ondrag != null) __obj.updateDynamic("ondrag")(ondrag.asInstanceOf[js.Any])
    if (ondragend != null) __obj.updateDynamic("ondragend")(ondragend.asInstanceOf[js.Any])
    if (ondragenter != null) __obj.updateDynamic("ondragenter")(ondragenter.asInstanceOf[js.Any])
    if (ondragexit != null) __obj.updateDynamic("ondragexit")(ondragexit.asInstanceOf[js.Any])
    if (ondragleave != null) __obj.updateDynamic("ondragleave")(ondragleave.asInstanceOf[js.Any])
    if (ondragover != null) __obj.updateDynamic("ondragover")(ondragover.asInstanceOf[js.Any])
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(ondragstart.asInstanceOf[js.Any])
    if (ondrop != null) __obj.updateDynamic("ondrop")(ondrop.asInstanceOf[js.Any])
    if (ondurationchange != null) __obj.updateDynamic("ondurationchange")(ondurationchange.asInstanceOf[js.Any])
    if (onemptied != null) __obj.updateDynamic("onemptied")(onemptied.asInstanceOf[js.Any])
    if (onended != null) __obj.updateDynamic("onended")(onended.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(onerror.asInstanceOf[js.Any])
    if (onfocus != null) __obj.updateDynamic("onfocus")(onfocus.asInstanceOf[js.Any])
    if (oninput != null) __obj.updateDynamic("oninput")(oninput.asInstanceOf[js.Any])
    if (oninvalid != null) __obj.updateDynamic("oninvalid")(oninvalid.asInstanceOf[js.Any])
    if (onkeydown != null) __obj.updateDynamic("onkeydown")(onkeydown.asInstanceOf[js.Any])
    if (onkeypress != null) __obj.updateDynamic("onkeypress")(onkeypress.asInstanceOf[js.Any])
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(onkeyup.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(onload.asInstanceOf[js.Any])
    if (onloadeddata != null) __obj.updateDynamic("onloadeddata")(onloadeddata.asInstanceOf[js.Any])
    if (onloadedmetadata != null) __obj.updateDynamic("onloadedmetadata")(onloadedmetadata.asInstanceOf[js.Any])
    if (onloadend != null) __obj.updateDynamic("onloadend")(onloadend.asInstanceOf[js.Any])
    if (onloadstart != null) __obj.updateDynamic("onloadstart")(onloadstart.asInstanceOf[js.Any])
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown.asInstanceOf[js.Any])
    if (onmouseenter != null) __obj.updateDynamic("onmouseenter")(onmouseenter.asInstanceOf[js.Any])
    if (onmouseleave != null) __obj.updateDynamic("onmouseleave")(onmouseleave.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(onmousemove.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(onmouseup.asInstanceOf[js.Any])
    if (onmousewheel != null) __obj.updateDynamic("onmousewheel")(onmousewheel.asInstanceOf[js.Any])
    if (onpaste != null) __obj.updateDynamic("onpaste")(onpaste.asInstanceOf[js.Any])
    if (onpause != null) __obj.updateDynamic("onpause")(onpause.asInstanceOf[js.Any])
    if (onplay != null) __obj.updateDynamic("onplay")(onplay.asInstanceOf[js.Any])
    if (onplaying != null) __obj.updateDynamic("onplaying")(onplaying.asInstanceOf[js.Any])
    if (onpointercancel != null) __obj.updateDynamic("onpointercancel")(onpointercancel.asInstanceOf[js.Any])
    if (onpointerdown != null) __obj.updateDynamic("onpointerdown")(onpointerdown.asInstanceOf[js.Any])
    if (onpointerenter != null) __obj.updateDynamic("onpointerenter")(onpointerenter.asInstanceOf[js.Any])
    if (onpointerleave != null) __obj.updateDynamic("onpointerleave")(onpointerleave.asInstanceOf[js.Any])
    if (onpointermove != null) __obj.updateDynamic("onpointermove")(onpointermove.asInstanceOf[js.Any])
    if (onpointerout != null) __obj.updateDynamic("onpointerout")(onpointerout.asInstanceOf[js.Any])
    if (onpointerover != null) __obj.updateDynamic("onpointerover")(onpointerover.asInstanceOf[js.Any])
    if (onpointerup != null) __obj.updateDynamic("onpointerup")(onpointerup.asInstanceOf[js.Any])
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress.asInstanceOf[js.Any])
    if (onratechange != null) __obj.updateDynamic("onratechange")(onratechange.asInstanceOf[js.Any])
    if (onreset != null) __obj.updateDynamic("onreset")(onreset.asInstanceOf[js.Any])
    if (onscroll != null) __obj.updateDynamic("onscroll")(onscroll.asInstanceOf[js.Any])
    if (onseeked != null) __obj.updateDynamic("onseeked")(onseeked.asInstanceOf[js.Any])
    if (onseeking != null) __obj.updateDynamic("onseeking")(onseeking.asInstanceOf[js.Any])
    if (onselect != null) __obj.updateDynamic("onselect")(onselect.asInstanceOf[js.Any])
    if (onselectstart != null) __obj.updateDynamic("onselectstart")(onselectstart.asInstanceOf[js.Any])
    if (onstalled != null) __obj.updateDynamic("onstalled")(onstalled.asInstanceOf[js.Any])
    if (onsubmit != null) __obj.updateDynamic("onsubmit")(onsubmit.asInstanceOf[js.Any])
    if (onsuspend != null) __obj.updateDynamic("onsuspend")(onsuspend.asInstanceOf[js.Any])
    if (ontimeupdate != null) __obj.updateDynamic("ontimeupdate")(ontimeupdate.asInstanceOf[js.Any])
    if (onvolumechange != null) __obj.updateDynamic("onvolumechange")(onvolumechange.asInstanceOf[js.Any])
    if (onwaiting != null) __obj.updateDynamic("onwaiting")(onwaiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventAttrs]
  }
}


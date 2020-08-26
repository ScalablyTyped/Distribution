package typings.luminoVirtualdom.mod

import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
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

@js.native
trait ElementEventMap extends js.Object {
  var onabort: UIEvent = js.native
  var onauxclick: MouseEvent = js.native
  var onblur: FocusEvent = js.native
  var oncanplay: Event = js.native
  var oncanplaythrough: Event = js.native
  var onchange: Event = js.native
  var onclick: MouseEvent = js.native
  var oncontextmenu: PointerEvent = js.native
  var oncopy: ClipboardEvent = js.native
  var oncuechange: Event = js.native
  var oncut: ClipboardEvent = js.native
  var ondblclick: MouseEvent = js.native
  var ondrag: DragEvent = js.native
  var ondragend: DragEvent = js.native
  var ondragenter: DragEvent = js.native
  var ondragexit: DragEvent = js.native
  var ondragleave: DragEvent = js.native
  var ondragover: DragEvent = js.native
  var ondragstart: DragEvent = js.native
  var ondrop: DragEvent = js.native
  var ondurationchange: Event = js.native
  var onemptied: Event = js.native
  var onended: MediaStreamErrorEvent = js.native
  var onerror: ErrorEvent = js.native
  var onfocus: FocusEvent = js.native
  var oninput: Event = js.native
  var oninvalid: Event = js.native
  var onkeydown: KeyboardEvent = js.native
  var onkeypress: KeyboardEvent = js.native
  var onkeyup: KeyboardEvent = js.native
  var onload: Event = js.native
  var onloadeddata: Event = js.native
  var onloadedmetadata: Event = js.native
  var onloadend: Event = js.native
  var onloadstart: Event = js.native
  var onmousedown: MouseEvent = js.native
  var onmouseenter: MouseEvent = js.native
  var onmouseleave: MouseEvent = js.native
  var onmousemove: MouseEvent = js.native
  var onmouseout: MouseEvent = js.native
  var onmouseover: MouseEvent = js.native
  var onmouseup: MouseEvent = js.native
  var onmousewheel: WheelEvent = js.native
  var onpaste: ClipboardEvent = js.native
  var onpause: Event = js.native
  var onplay: Event = js.native
  var onplaying: Event = js.native
  var onpointercancel: PointerEvent = js.native
  var onpointerdown: PointerEvent = js.native
  var onpointerenter: PointerEvent = js.native
  var onpointerleave: PointerEvent = js.native
  var onpointermove: PointerEvent = js.native
  var onpointerout: PointerEvent = js.native
  var onpointerover: PointerEvent = js.native
  var onpointerup: PointerEvent = js.native
  var onprogress: ProgressEvent[EventTarget] = js.native
  var onratechange: Event = js.native
  var onreset: Event = js.native
  var onscroll: UIEvent = js.native
  var onseeked: Event = js.native
  var onseeking: Event = js.native
  var onselect: UIEvent = js.native
  var onselectstart: Event = js.native
  var onstalled: Event = js.native
  var onsubmit: Event = js.native
  var onsuspend: Event = js.native
  var ontimeupdate: Event = js.native
  var onvolumechange: Event = js.native
  var onwaiting: Event = js.native
}

object ElementEventMap {
  @scala.inline
  def apply(
    onabort: UIEvent,
    onauxclick: MouseEvent,
    onblur: FocusEvent,
    oncanplay: Event,
    oncanplaythrough: Event,
    onchange: Event,
    onclick: MouseEvent,
    oncontextmenu: PointerEvent,
    oncopy: ClipboardEvent,
    oncuechange: Event,
    oncut: ClipboardEvent,
    ondblclick: MouseEvent,
    ondrag: DragEvent,
    ondragend: DragEvent,
    ondragenter: DragEvent,
    ondragexit: DragEvent,
    ondragleave: DragEvent,
    ondragover: DragEvent,
    ondragstart: DragEvent,
    ondrop: DragEvent,
    ondurationchange: Event,
    onemptied: Event,
    onended: MediaStreamErrorEvent,
    onerror: ErrorEvent,
    onfocus: FocusEvent,
    oninput: Event,
    oninvalid: Event,
    onkeydown: KeyboardEvent,
    onkeypress: KeyboardEvent,
    onkeyup: KeyboardEvent,
    onload: Event,
    onloadeddata: Event,
    onloadedmetadata: Event,
    onloadend: Event,
    onloadstart: Event,
    onmousedown: MouseEvent,
    onmouseenter: MouseEvent,
    onmouseleave: MouseEvent,
    onmousemove: MouseEvent,
    onmouseout: MouseEvent,
    onmouseover: MouseEvent,
    onmouseup: MouseEvent,
    onmousewheel: WheelEvent,
    onpaste: ClipboardEvent,
    onpause: Event,
    onplay: Event,
    onplaying: Event,
    onpointercancel: PointerEvent,
    onpointerdown: PointerEvent,
    onpointerenter: PointerEvent,
    onpointerleave: PointerEvent,
    onpointermove: PointerEvent,
    onpointerout: PointerEvent,
    onpointerover: PointerEvent,
    onpointerup: PointerEvent,
    onprogress: ProgressEvent[EventTarget],
    onratechange: Event,
    onreset: Event,
    onscroll: UIEvent,
    onseeked: Event,
    onseeking: Event,
    onselect: UIEvent,
    onselectstart: Event,
    onstalled: Event,
    onsubmit: Event,
    onsuspend: Event,
    ontimeupdate: Event,
    onvolumechange: Event,
    onwaiting: Event
  ): ElementEventMap = {
    val __obj = js.Dynamic.literal(onabort = onabort.asInstanceOf[js.Any], onauxclick = onauxclick.asInstanceOf[js.Any], onblur = onblur.asInstanceOf[js.Any], oncanplay = oncanplay.asInstanceOf[js.Any], oncanplaythrough = oncanplaythrough.asInstanceOf[js.Any], onchange = onchange.asInstanceOf[js.Any], onclick = onclick.asInstanceOf[js.Any], oncontextmenu = oncontextmenu.asInstanceOf[js.Any], oncopy = oncopy.asInstanceOf[js.Any], oncuechange = oncuechange.asInstanceOf[js.Any], oncut = oncut.asInstanceOf[js.Any], ondblclick = ondblclick.asInstanceOf[js.Any], ondrag = ondrag.asInstanceOf[js.Any], ondragend = ondragend.asInstanceOf[js.Any], ondragenter = ondragenter.asInstanceOf[js.Any], ondragexit = ondragexit.asInstanceOf[js.Any], ondragleave = ondragleave.asInstanceOf[js.Any], ondragover = ondragover.asInstanceOf[js.Any], ondragstart = ondragstart.asInstanceOf[js.Any], ondrop = ondrop.asInstanceOf[js.Any], ondurationchange = ondurationchange.asInstanceOf[js.Any], onemptied = onemptied.asInstanceOf[js.Any], onended = onended.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onfocus = onfocus.asInstanceOf[js.Any], oninput = oninput.asInstanceOf[js.Any], oninvalid = oninvalid.asInstanceOf[js.Any], onkeydown = onkeydown.asInstanceOf[js.Any], onkeypress = onkeypress.asInstanceOf[js.Any], onkeyup = onkeyup.asInstanceOf[js.Any], onload = onload.asInstanceOf[js.Any], onloadeddata = onloadeddata.asInstanceOf[js.Any], onloadedmetadata = onloadedmetadata.asInstanceOf[js.Any], onloadend = onloadend.asInstanceOf[js.Any], onloadstart = onloadstart.asInstanceOf[js.Any], onmousedown = onmousedown.asInstanceOf[js.Any], onmouseenter = onmouseenter.asInstanceOf[js.Any], onmouseleave = onmouseleave.asInstanceOf[js.Any], onmousemove = onmousemove.asInstanceOf[js.Any], onmouseout = onmouseout.asInstanceOf[js.Any], onmouseover = onmouseover.asInstanceOf[js.Any], onmouseup = onmouseup.asInstanceOf[js.Any], onmousewheel = onmousewheel.asInstanceOf[js.Any], onpaste = onpaste.asInstanceOf[js.Any], onpause = onpause.asInstanceOf[js.Any], onplay = onplay.asInstanceOf[js.Any], onplaying = onplaying.asInstanceOf[js.Any], onpointercancel = onpointercancel.asInstanceOf[js.Any], onpointerdown = onpointerdown.asInstanceOf[js.Any], onpointerenter = onpointerenter.asInstanceOf[js.Any], onpointerleave = onpointerleave.asInstanceOf[js.Any], onpointermove = onpointermove.asInstanceOf[js.Any], onpointerout = onpointerout.asInstanceOf[js.Any], onpointerover = onpointerover.asInstanceOf[js.Any], onpointerup = onpointerup.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onratechange = onratechange.asInstanceOf[js.Any], onreset = onreset.asInstanceOf[js.Any], onscroll = onscroll.asInstanceOf[js.Any], onseeked = onseeked.asInstanceOf[js.Any], onseeking = onseeking.asInstanceOf[js.Any], onselect = onselect.asInstanceOf[js.Any], onselectstart = onselectstart.asInstanceOf[js.Any], onstalled = onstalled.asInstanceOf[js.Any], onsubmit = onsubmit.asInstanceOf[js.Any], onsuspend = onsuspend.asInstanceOf[js.Any], ontimeupdate = ontimeupdate.asInstanceOf[js.Any], onvolumechange = onvolumechange.asInstanceOf[js.Any], onwaiting = onwaiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventMap]
  }
  @scala.inline
  implicit class ElementEventMapOps[Self <: ElementEventMap] (val x: Self) extends AnyVal {
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
    def setOnabort(value: UIEvent): Self = this.set("onabort", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnauxclick(value: MouseEvent): Self = this.set("onauxclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnblur(value: FocusEvent): Self = this.set("onblur", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncanplay(value: Event): Self = this.set("oncanplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncanplaythrough(value: Event): Self = this.set("oncanplaythrough", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnchange(value: Event): Self = this.set("onchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnclick(value: MouseEvent): Self = this.set("onclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncontextmenu(value: PointerEvent): Self = this.set("oncontextmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncopy(value: ClipboardEvent): Self = this.set("oncopy", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncuechange(value: Event): Self = this.set("oncuechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncut(value: ClipboardEvent): Self = this.set("oncut", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndblclick(value: MouseEvent): Self = this.set("ondblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndrag(value: DragEvent): Self = this.set("ondrag", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndragend(value: DragEvent): Self = this.set("ondragend", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndragenter(value: DragEvent): Self = this.set("ondragenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndragexit(value: DragEvent): Self = this.set("ondragexit", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndragleave(value: DragEvent): Self = this.set("ondragleave", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndragover(value: DragEvent): Self = this.set("ondragover", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndragstart(value: DragEvent): Self = this.set("ondragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndrop(value: DragEvent): Self = this.set("ondrop", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndurationchange(value: Event): Self = this.set("ondurationchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnemptied(value: Event): Self = this.set("onemptied", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnended(value: MediaStreamErrorEvent): Self = this.set("onended", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnerror(value: ErrorEvent): Self = this.set("onerror", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnfocus(value: FocusEvent): Self = this.set("onfocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setOninput(value: Event): Self = this.set("oninput", value.asInstanceOf[js.Any])
    @scala.inline
    def setOninvalid(value: Event): Self = this.set("oninvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnkeydown(value: KeyboardEvent): Self = this.set("onkeydown", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnkeypress(value: KeyboardEvent): Self = this.set("onkeypress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnkeyup(value: KeyboardEvent): Self = this.set("onkeyup", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnload(value: Event): Self = this.set("onload", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnloadeddata(value: Event): Self = this.set("onloadeddata", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnloadedmetadata(value: Event): Self = this.set("onloadedmetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnloadend(value: Event): Self = this.set("onloadend", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnloadstart(value: Event): Self = this.set("onloadstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmousedown(value: MouseEvent): Self = this.set("onmousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmouseenter(value: MouseEvent): Self = this.set("onmouseenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmouseleave(value: MouseEvent): Self = this.set("onmouseleave", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmousemove(value: MouseEvent): Self = this.set("onmousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmouseout(value: MouseEvent): Self = this.set("onmouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmouseover(value: MouseEvent): Self = this.set("onmouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmouseup(value: MouseEvent): Self = this.set("onmouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmousewheel(value: WheelEvent): Self = this.set("onmousewheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpaste(value: ClipboardEvent): Self = this.set("onpaste", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpause(value: Event): Self = this.set("onpause", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnplay(value: Event): Self = this.set("onplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnplaying(value: Event): Self = this.set("onplaying", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpointercancel(value: PointerEvent): Self = this.set("onpointercancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpointerdown(value: PointerEvent): Self = this.set("onpointerdown", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpointerenter(value: PointerEvent): Self = this.set("onpointerenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpointerleave(value: PointerEvent): Self = this.set("onpointerleave", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpointermove(value: PointerEvent): Self = this.set("onpointermove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpointerout(value: PointerEvent): Self = this.set("onpointerout", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpointerover(value: PointerEvent): Self = this.set("onpointerover", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpointerup(value: PointerEvent): Self = this.set("onpointerup", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnprogress(value: ProgressEvent[EventTarget]): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnratechange(value: Event): Self = this.set("onratechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnreset(value: Event): Self = this.set("onreset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnscroll(value: UIEvent): Self = this.set("onscroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnseeked(value: Event): Self = this.set("onseeked", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnseeking(value: Event): Self = this.set("onseeking", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnselect(value: UIEvent): Self = this.set("onselect", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnselectstart(value: Event): Self = this.set("onselectstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnstalled(value: Event): Self = this.set("onstalled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsubmit(value: Event): Self = this.set("onsubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsuspend(value: Event): Self = this.set("onsuspend", value.asInstanceOf[js.Any])
    @scala.inline
    def setOntimeupdate(value: Event): Self = this.set("ontimeupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnvolumechange(value: Event): Self = this.set("onvolumechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnwaiting(value: Event): Self = this.set("onwaiting", value.asInstanceOf[js.Any])
  }
  
}


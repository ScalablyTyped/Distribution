package typings.linkifyjs.anon

import typings.linkifyjs.linkifyjsStrings.abort
import typings.std.AnimationEvent
import typings.std.DragEvent
import typings.std.Error
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.OnErrorEventHandler
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.GlobalEventHandlers> */
@js.native
trait PartialGlobalEventHandler extends js.Object {
  var addEventListener: js.UndefOr[
    js.Function2[
      abort, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _], 
      Unit
    ]
  ] = js.native
  var onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null] = js.native
  var onanimationcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  var onanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  var onanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  var onanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  var onauxclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onblur: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null] = js.native
  var oncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var oncanplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var oncanplaythrough: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onclose: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var oncontextmenu: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var oncuechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var ondblclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var ondrag: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondragend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondragenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondragexit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var ondragleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondragover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondragstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondrop: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  var ondurationchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onemptied: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onended: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onerror: js.UndefOr[OnErrorEventHandler] = js.native
  var onfocus: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null] = js.native
  var ongotpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var oninput: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var oninvalid: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onkeydown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null] = js.native
  var onkeypress: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null] = js.native
  var onkeyup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null] = js.native
  var onload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onloadeddata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onloadedmetadata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onloadstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onlostpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onmousedown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmouseenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmouseleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmousemove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmouseout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmouseover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onmouseup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  var onpause: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onplaying: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onpointercancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerdown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointermove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onpointerup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  var onprogress: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], _]) | Null
  ] = js.native
  var onratechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onreset: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onresize: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null] = js.native
  var onscroll: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onsecuritypolicyviolation: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]) | Null
  ] = js.native
  var onseeked: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onseeking: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onselect: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onselectionchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onselectstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onstalled: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onsubmit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onsuspend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var ontimeupdate: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var ontoggle: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontransitioncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  var ontransitionend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  var ontransitionrun: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  var ontransitionstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  var onvolumechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onwaiting: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  var onwheel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]) | Null] = js.native
  var removeEventListener: js.UndefOr[
    js.Function2[
      abort, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _], 
      Unit
    ]
  ] = js.native
}

object PartialGlobalEventHandler {
  @scala.inline
  def apply(): PartialGlobalEventHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGlobalEventHandler]
  }
  @scala.inline
  implicit class PartialGlobalEventHandlerOps[Self <: PartialGlobalEventHandler] (val x: Self) extends AnyVal {
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
    def setAddEventListener(
      value: (abort, /* listener */ js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _]) => Unit
    ): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddEventListener: Self = this.set("addEventListener", js.undefined)
    @scala.inline
    def setOnabort(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _]): Self = this.set("onabort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnabort: Self = this.set("onabort", js.undefined)
    @scala.inline
    def setOnabortNull: Self = this.set("onabort", null)
    @scala.inline
    def setOnanimationcancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _]): Self = this.set("onanimationcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationcancel: Self = this.set("onanimationcancel", js.undefined)
    @scala.inline
    def setOnanimationcancelNull: Self = this.set("onanimationcancel", null)
    @scala.inline
    def setOnanimationend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _]): Self = this.set("onanimationend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationend: Self = this.set("onanimationend", js.undefined)
    @scala.inline
    def setOnanimationendNull: Self = this.set("onanimationend", null)
    @scala.inline
    def setOnanimationiteration(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _]): Self = this.set("onanimationiteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationiteration: Self = this.set("onanimationiteration", js.undefined)
    @scala.inline
    def setOnanimationiterationNull: Self = this.set("onanimationiteration", null)
    @scala.inline
    def setOnanimationstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _]): Self = this.set("onanimationstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnanimationstart: Self = this.set("onanimationstart", js.undefined)
    @scala.inline
    def setOnanimationstartNull: Self = this.set("onanimationstart", null)
    @scala.inline
    def setOnauxclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("onauxclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnauxclick: Self = this.set("onauxclick", js.undefined)
    @scala.inline
    def setOnauxclickNull: Self = this.set("onauxclick", null)
    @scala.inline
    def setOnblur(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FocusEvent, _]): Self = this.set("onblur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    @scala.inline
    def setOnblurNull: Self = this.set("onblur", null)
    @scala.inline
    def setOncancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("oncancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncancel: Self = this.set("oncancel", js.undefined)
    @scala.inline
    def setOncancelNull: Self = this.set("oncancel", null)
    @scala.inline
    def setOncanplay(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("oncanplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncanplay: Self = this.set("oncanplay", js.undefined)
    @scala.inline
    def setOncanplayNull: Self = this.set("oncanplay", null)
    @scala.inline
    def setOncanplaythrough(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("oncanplaythrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncanplaythrough: Self = this.set("oncanplaythrough", js.undefined)
    @scala.inline
    def setOncanplaythroughNull: Self = this.set("oncanplaythrough", null)
    @scala.inline
    def setOnchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    @scala.inline
    def setOnchangeNull: Self = this.set("onchange", null)
    @scala.inline
    def setOnclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("onclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setOnclickNull: Self = this.set("onclick", null)
    @scala.inline
    def setOnclose(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onclose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    @scala.inline
    def setOncloseNull: Self = this.set("onclose", null)
    @scala.inline
    def setOncontextmenu(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("oncontextmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncontextmenu: Self = this.set("oncontextmenu", js.undefined)
    @scala.inline
    def setOncontextmenuNull: Self = this.set("oncontextmenu", null)
    @scala.inline
    def setOncuechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("oncuechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOncuechange: Self = this.set("oncuechange", js.undefined)
    @scala.inline
    def setOncuechangeNull: Self = this.set("oncuechange", null)
    @scala.inline
    def setOndblclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("ondblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndblclick: Self = this.set("ondblclick", js.undefined)
    @scala.inline
    def setOndblclickNull: Self = this.set("ondblclick", null)
    @scala.inline
    def setOndrag(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = this.set("ondrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndrag: Self = this.set("ondrag", js.undefined)
    @scala.inline
    def setOndragNull: Self = this.set("ondrag", null)
    @scala.inline
    def setOndragend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = this.set("ondragend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragend: Self = this.set("ondragend", js.undefined)
    @scala.inline
    def setOndragendNull: Self = this.set("ondragend", null)
    @scala.inline
    def setOndragenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = this.set("ondragenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragenter: Self = this.set("ondragenter", js.undefined)
    @scala.inline
    def setOndragenterNull: Self = this.set("ondragenter", null)
    @scala.inline
    def setOndragexit(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("ondragexit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragexit: Self = this.set("ondragexit", js.undefined)
    @scala.inline
    def setOndragexitNull: Self = this.set("ondragexit", null)
    @scala.inline
    def setOndragleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = this.set("ondragleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragleave: Self = this.set("ondragleave", js.undefined)
    @scala.inline
    def setOndragleaveNull: Self = this.set("ondragleave", null)
    @scala.inline
    def setOndragover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = this.set("ondragover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragover: Self = this.set("ondragover", js.undefined)
    @scala.inline
    def setOndragoverNull: Self = this.set("ondragover", null)
    @scala.inline
    def setOndragstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = this.set("ondragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndragstart: Self = this.set("ondragstart", js.undefined)
    @scala.inline
    def setOndragstartNull: Self = this.set("ondragstart", null)
    @scala.inline
    def setOndrop(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = this.set("ondrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndrop: Self = this.set("ondrop", js.undefined)
    @scala.inline
    def setOndropNull: Self = this.set("ondrop", null)
    @scala.inline
    def setOndurationchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("ondurationchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOndurationchange: Self = this.set("ondurationchange", js.undefined)
    @scala.inline
    def setOndurationchangeNull: Self = this.set("ondurationchange", null)
    @scala.inline
    def setOnemptied(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onemptied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnemptied: Self = this.set("onemptied", js.undefined)
    @scala.inline
    def setOnemptiedNull: Self = this.set("onemptied", null)
    @scala.inline
    def setOnended(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnended: Self = this.set("onended", js.undefined)
    @scala.inline
    def setOnendedNull: Self = this.set("onended", null)
    @scala.inline
    def setOnerror(
      value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any
    ): Self = this.set("onerror", js.Any.fromFunction5(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOnerrorNull: Self = this.set("onerror", null)
    @scala.inline
    def setOnfocus(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FocusEvent, _]): Self = this.set("onfocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnfocus: Self = this.set("onfocus", js.undefined)
    @scala.inline
    def setOnfocusNull: Self = this.set("onfocus", null)
    @scala.inline
    def setOngotpointercapture(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = this.set("ongotpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOngotpointercapture: Self = this.set("ongotpointercapture", js.undefined)
    @scala.inline
    def setOngotpointercaptureNull: Self = this.set("ongotpointercapture", null)
    @scala.inline
    def setOninput(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("oninput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOninput: Self = this.set("oninput", js.undefined)
    @scala.inline
    def setOninputNull: Self = this.set("oninput", null)
    @scala.inline
    def setOninvalid(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("oninvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOninvalid: Self = this.set("oninvalid", js.undefined)
    @scala.inline
    def setOninvalidNull: Self = this.set("oninvalid", null)
    @scala.inline
    def setOnkeydown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, _]): Self = this.set("onkeydown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeydown: Self = this.set("onkeydown", js.undefined)
    @scala.inline
    def setOnkeydownNull: Self = this.set("onkeydown", null)
    @scala.inline
    def setOnkeypress(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, _]): Self = this.set("onkeypress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeypress: Self = this.set("onkeypress", js.undefined)
    @scala.inline
    def setOnkeypressNull: Self = this.set("onkeypress", null)
    @scala.inline
    def setOnkeyup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, _]): Self = this.set("onkeyup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnkeyup: Self = this.set("onkeyup", js.undefined)
    @scala.inline
    def setOnkeyupNull: Self = this.set("onkeyup", null)
    @scala.inline
    def setOnload(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setOnloadNull: Self = this.set("onload", null)
    @scala.inline
    def setOnloadeddata(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onloadeddata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadeddata: Self = this.set("onloadeddata", js.undefined)
    @scala.inline
    def setOnloadeddataNull: Self = this.set("onloadeddata", null)
    @scala.inline
    def setOnloadedmetadata(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onloadedmetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadedmetadata: Self = this.set("onloadedmetadata", js.undefined)
    @scala.inline
    def setOnloadedmetadataNull: Self = this.set("onloadedmetadata", null)
    @scala.inline
    def setOnloadstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onloadstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadstart: Self = this.set("onloadstart", js.undefined)
    @scala.inline
    def setOnloadstartNull: Self = this.set("onloadstart", null)
    @scala.inline
    def setOnlostpointercapture(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = this.set("onlostpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlostpointercapture: Self = this.set("onlostpointercapture", js.undefined)
    @scala.inline
    def setOnlostpointercaptureNull: Self = this.set("onlostpointercapture", null)
    @scala.inline
    def setOnmousedown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("onmousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmousedown: Self = this.set("onmousedown", js.undefined)
    @scala.inline
    def setOnmousedownNull: Self = this.set("onmousedown", null)
    @scala.inline
    def setOnmouseenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("onmouseenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseenter: Self = this.set("onmouseenter", js.undefined)
    @scala.inline
    def setOnmouseenterNull: Self = this.set("onmouseenter", null)
    @scala.inline
    def setOnmouseleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("onmouseleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseleave: Self = this.set("onmouseleave", js.undefined)
    @scala.inline
    def setOnmouseleaveNull: Self = this.set("onmouseleave", null)
    @scala.inline
    def setOnmousemove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("onmousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmousemove: Self = this.set("onmousemove", js.undefined)
    @scala.inline
    def setOnmousemoveNull: Self = this.set("onmousemove", null)
    @scala.inline
    def setOnmouseout(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("onmouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    @scala.inline
    def setOnmouseoutNull: Self = this.set("onmouseout", null)
    @scala.inline
    def setOnmouseover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("onmouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    @scala.inline
    def setOnmouseoverNull: Self = this.set("onmouseover", null)
    @scala.inline
    def setOnmouseup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = this.set("onmouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseup: Self = this.set("onmouseup", js.undefined)
    @scala.inline
    def setOnmouseupNull: Self = this.set("onmouseup", null)
    @scala.inline
    def setOnpause(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onpause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpause: Self = this.set("onpause", js.undefined)
    @scala.inline
    def setOnpauseNull: Self = this.set("onpause", null)
    @scala.inline
    def setOnplay(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnplay: Self = this.set("onplay", js.undefined)
    @scala.inline
    def setOnplayNull: Self = this.set("onplay", null)
    @scala.inline
    def setOnplaying(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onplaying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnplaying: Self = this.set("onplaying", js.undefined)
    @scala.inline
    def setOnplayingNull: Self = this.set("onplaying", null)
    @scala.inline
    def setOnpointercancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = this.set("onpointercancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointercancel: Self = this.set("onpointercancel", js.undefined)
    @scala.inline
    def setOnpointercancelNull: Self = this.set("onpointercancel", null)
    @scala.inline
    def setOnpointerdown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = this.set("onpointerdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerdown: Self = this.set("onpointerdown", js.undefined)
    @scala.inline
    def setOnpointerdownNull: Self = this.set("onpointerdown", null)
    @scala.inline
    def setOnpointerenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = this.set("onpointerenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerenter: Self = this.set("onpointerenter", js.undefined)
    @scala.inline
    def setOnpointerenterNull: Self = this.set("onpointerenter", null)
    @scala.inline
    def setOnpointerleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = this.set("onpointerleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerleave: Self = this.set("onpointerleave", js.undefined)
    @scala.inline
    def setOnpointerleaveNull: Self = this.set("onpointerleave", null)
    @scala.inline
    def setOnpointermove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = this.set("onpointermove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointermove: Self = this.set("onpointermove", js.undefined)
    @scala.inline
    def setOnpointermoveNull: Self = this.set("onpointermove", null)
    @scala.inline
    def setOnpointerout(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = this.set("onpointerout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerout: Self = this.set("onpointerout", js.undefined)
    @scala.inline
    def setOnpointeroutNull: Self = this.set("onpointerout", null)
    @scala.inline
    def setOnpointerover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = this.set("onpointerover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerover: Self = this.set("onpointerover", js.undefined)
    @scala.inline
    def setOnpointeroverNull: Self = this.set("onpointerover", null)
    @scala.inline
    def setOnpointerup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = this.set("onpointerup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnpointerup: Self = this.set("onpointerup", js.undefined)
    @scala.inline
    def setOnpointerupNull: Self = this.set("onpointerup", null)
    @scala.inline
    def setOnprogress(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ ProgressEvent[EventTarget], _]): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
    @scala.inline
    def setOnprogressNull: Self = this.set("onprogress", null)
    @scala.inline
    def setOnratechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onratechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnratechange: Self = this.set("onratechange", js.undefined)
    @scala.inline
    def setOnratechangeNull: Self = this.set("onratechange", null)
    @scala.inline
    def setOnreset(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnreset: Self = this.set("onreset", js.undefined)
    @scala.inline
    def setOnresetNull: Self = this.set("onreset", null)
    @scala.inline
    def setOnresize(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _]): Self = this.set("onresize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnresize: Self = this.set("onresize", js.undefined)
    @scala.inline
    def setOnresizeNull: Self = this.set("onresize", null)
    @scala.inline
    def setOnscroll(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onscroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnscroll: Self = this.set("onscroll", js.undefined)
    @scala.inline
    def setOnscrollNull: Self = this.set("onscroll", null)
    @scala.inline
    def setOnsecuritypolicyviolation(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ SecurityPolicyViolationEvent, _]): Self = this.set("onsecuritypolicyviolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsecuritypolicyviolation: Self = this.set("onsecuritypolicyviolation", js.undefined)
    @scala.inline
    def setOnsecuritypolicyviolationNull: Self = this.set("onsecuritypolicyviolation", null)
    @scala.inline
    def setOnseeked(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onseeked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnseeked: Self = this.set("onseeked", js.undefined)
    @scala.inline
    def setOnseekedNull: Self = this.set("onseeked", null)
    @scala.inline
    def setOnseeking(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onseeking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnseeking: Self = this.set("onseeking", js.undefined)
    @scala.inline
    def setOnseekingNull: Self = this.set("onseeking", null)
    @scala.inline
    def setOnselect(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselect: Self = this.set("onselect", js.undefined)
    @scala.inline
    def setOnselectNull: Self = this.set("onselect", null)
    @scala.inline
    def setOnselectionchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onselectionchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselectionchange: Self = this.set("onselectionchange", js.undefined)
    @scala.inline
    def setOnselectionchangeNull: Self = this.set("onselectionchange", null)
    @scala.inline
    def setOnselectstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onselectstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnselectstart: Self = this.set("onselectstart", js.undefined)
    @scala.inline
    def setOnselectstartNull: Self = this.set("onselectstart", null)
    @scala.inline
    def setOnstalled(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onstalled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnstalled: Self = this.set("onstalled", js.undefined)
    @scala.inline
    def setOnstalledNull: Self = this.set("onstalled", null)
    @scala.inline
    def setOnsubmit(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onsubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsubmit: Self = this.set("onsubmit", js.undefined)
    @scala.inline
    def setOnsubmitNull: Self = this.set("onsubmit", null)
    @scala.inline
    def setOnsuspend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onsuspend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsuspend: Self = this.set("onsuspend", js.undefined)
    @scala.inline
    def setOnsuspendNull: Self = this.set("onsuspend", null)
    @scala.inline
    def setOntimeupdate(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("ontimeupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntimeupdate: Self = this.set("ontimeupdate", js.undefined)
    @scala.inline
    def setOntimeupdateNull: Self = this.set("ontimeupdate", null)
    @scala.inline
    def setOntoggle(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("ontoggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntoggle: Self = this.set("ontoggle", js.undefined)
    @scala.inline
    def setOntoggleNull: Self = this.set("ontoggle", null)
    @scala.inline
    def setOntouchcancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _]): Self = this.set("ontouchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchcancel: Self = this.set("ontouchcancel", js.undefined)
    @scala.inline
    def setOntouchcancelNull: Self = this.set("ontouchcancel", null)
    @scala.inline
    def setOntouchend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _]): Self = this.set("ontouchend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchend: Self = this.set("ontouchend", js.undefined)
    @scala.inline
    def setOntouchendNull: Self = this.set("ontouchend", null)
    @scala.inline
    def setOntouchmove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _]): Self = this.set("ontouchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchmove: Self = this.set("ontouchmove", js.undefined)
    @scala.inline
    def setOntouchmoveNull: Self = this.set("ontouchmove", null)
    @scala.inline
    def setOntouchstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _]): Self = this.set("ontouchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntouchstart: Self = this.set("ontouchstart", js.undefined)
    @scala.inline
    def setOntouchstartNull: Self = this.set("ontouchstart", null)
    @scala.inline
    def setOntransitioncancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _]): Self = this.set("ontransitioncancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitioncancel: Self = this.set("ontransitioncancel", js.undefined)
    @scala.inline
    def setOntransitioncancelNull: Self = this.set("ontransitioncancel", null)
    @scala.inline
    def setOntransitionend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitionend: Self = this.set("ontransitionend", js.undefined)
    @scala.inline
    def setOntransitionendNull: Self = this.set("ontransitionend", null)
    @scala.inline
    def setOntransitionrun(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionrun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitionrun: Self = this.set("ontransitionrun", js.undefined)
    @scala.inline
    def setOntransitionrunNull: Self = this.set("ontransitionrun", null)
    @scala.inline
    def setOntransitionstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOntransitionstart: Self = this.set("ontransitionstart", js.undefined)
    @scala.inline
    def setOntransitionstartNull: Self = this.set("ontransitionstart", null)
    @scala.inline
    def setOnvolumechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onvolumechange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnvolumechange: Self = this.set("onvolumechange", js.undefined)
    @scala.inline
    def setOnvolumechangeNull: Self = this.set("onvolumechange", null)
    @scala.inline
    def setOnwaiting(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _]): Self = this.set("onwaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnwaiting: Self = this.set("onwaiting", js.undefined)
    @scala.inline
    def setOnwaitingNull: Self = this.set("onwaiting", null)
    @scala.inline
    def setOnwheel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ WheelEvent, _]): Self = this.set("onwheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnwheel: Self = this.set("onwheel", js.undefined)
    @scala.inline
    def setOnwheelNull: Self = this.set("onwheel", null)
    @scala.inline
    def setRemoveEventListener(
      value: (abort, /* listener */ js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _]) => Unit
    ): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveEventListener: Self = this.set("removeEventListener", js.undefined)
  }
  
}


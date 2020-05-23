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
trait PartialGlobalEventHandler extends js.Object {
  var addEventListener: js.UndefOr[
    js.Function2[
      abort, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _], 
      Unit
    ]
  ] = js.undefined
  var onabort: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  var onanimationcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationiteration: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onauxclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onblur: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  var oncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncanplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onclose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var oncuechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ondblclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var ondrag: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragexit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ondragleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondrop: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onemptied: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onended: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onerror: js.UndefOr[OnErrorEventHandler] = js.undefined
  var onfocus: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  var ongotpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var oninput: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var oninvalid: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onkeydown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onkeypress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onkeyup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onload: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onloadstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onlostpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onmousedown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmousemove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onpause: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onplaying: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointermove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onprogress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], _]] = js.undefined
  var onratechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onreset: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onresize: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  var onscroll: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onsecuritypolicyviolation: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]] = js.undefined
  var onseeked: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onseeking: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onselect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onselectionchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onselectstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onstalled: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onsubmit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onsuspend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ontoggle: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var ontouchcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchmove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontransitioncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionrun: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onwaiting: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.undefined
  var removeEventListener: js.UndefOr[
    js.Function2[
      abort, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _], 
      Unit
    ]
  ] = js.undefined
}

object PartialGlobalEventHandler {
  @scala.inline
  def apply(
    addEventListener: (abort, /* listener */ js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _]) => Unit = null,
    onabort: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _] = null,
    onanimationcancel: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _] = null,
    onanimationend: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _] = null,
    onanimationiteration: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _] = null,
    onanimationstart: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _] = null,
    onauxclick: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    onblur: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FocusEvent, _] = null,
    oncancel: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    oncanplay: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    oncanplaythrough: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onchange: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onclick: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    onclose: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    oncontextmenu: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    oncuechange: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    ondblclick: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    ondrag: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _] = null,
    ondragend: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _] = null,
    ondragenter: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _] = null,
    ondragexit: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    ondragleave: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _] = null,
    ondragover: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _] = null,
    ondragstart: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _] = null,
    ondrop: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _] = null,
    ondurationchange: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onemptied: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onended: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onerror: js.UndefOr[
      Null | ((/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any)
    ] = js.undefined,
    onfocus: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FocusEvent, _] = null,
    ongotpointercapture: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _] = null,
    oninput: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    oninvalid: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onkeydown: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, _] = null,
    onkeypress: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, _] = null,
    onkeyup: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, _] = null,
    onload: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onloadeddata: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onloadedmetadata: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onloadstart: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onlostpointercapture: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _] = null,
    onmousedown: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    onmouseenter: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    onmouseleave: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    onmousemove: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    onmouseout: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    onmouseover: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    onmouseup: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _] = null,
    onpause: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onplay: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onplaying: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onpointercancel: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _] = null,
    onpointerdown: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _] = null,
    onpointerenter: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _] = null,
    onpointerleave: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _] = null,
    onpointermove: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _] = null,
    onpointerout: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _] = null,
    onpointerover: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _] = null,
    onpointerup: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _] = null,
    onprogress: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ ProgressEvent[EventTarget], _] = null,
    onratechange: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onreset: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onresize: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _] = null,
    onscroll: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onsecuritypolicyviolation: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ SecurityPolicyViolationEvent, _] = null,
    onseeked: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onseeking: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onselect: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onselectionchange: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onselectstart: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onstalled: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onsubmit: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onsuspend: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    ontimeupdate: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    ontoggle: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    ontouchcancel: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _] = null,
    ontouchend: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _] = null,
    ontouchmove: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _] = null,
    ontouchstart: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _] = null,
    ontransitioncancel: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _] = null,
    ontransitionend: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _] = null,
    ontransitionrun: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _] = null,
    ontransitionstart: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _] = null,
    onvolumechange: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onwaiting: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, _] = null,
    onwheel: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ WheelEvent, _] = null,
    removeEventListener: (abort, /* listener */ js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _]) => Unit = null
  ): PartialGlobalEventHandler = {
    val __obj = js.Dynamic.literal()
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2(addEventListener))
    if (onabort != null) __obj.updateDynamic("onabort")(onabort.asInstanceOf[js.Any])
    if (onanimationcancel != null) __obj.updateDynamic("onanimationcancel")(onanimationcancel.asInstanceOf[js.Any])
    if (onanimationend != null) __obj.updateDynamic("onanimationend")(onanimationend.asInstanceOf[js.Any])
    if (onanimationiteration != null) __obj.updateDynamic("onanimationiteration")(onanimationiteration.asInstanceOf[js.Any])
    if (onanimationstart != null) __obj.updateDynamic("onanimationstart")(onanimationstart.asInstanceOf[js.Any])
    if (onauxclick != null) __obj.updateDynamic("onauxclick")(onauxclick.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (oncancel != null) __obj.updateDynamic("oncancel")(oncancel.asInstanceOf[js.Any])
    if (oncanplay != null) __obj.updateDynamic("oncanplay")(oncanplay.asInstanceOf[js.Any])
    if (oncanplaythrough != null) __obj.updateDynamic("oncanplaythrough")(oncanplaythrough.asInstanceOf[js.Any])
    if (onchange != null) __obj.updateDynamic("onchange")(onchange.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (onclose != null) __obj.updateDynamic("onclose")(onclose.asInstanceOf[js.Any])
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu.asInstanceOf[js.Any])
    if (oncuechange != null) __obj.updateDynamic("oncuechange")(oncuechange.asInstanceOf[js.Any])
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
    if (!js.isUndefined(onerror)) __obj.updateDynamic("onerror")(if (onerror != null) js.Any.fromFunction5(onerror.asInstanceOf[(/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any]) else null)
    if (onfocus != null) __obj.updateDynamic("onfocus")(onfocus.asInstanceOf[js.Any])
    if (ongotpointercapture != null) __obj.updateDynamic("ongotpointercapture")(ongotpointercapture.asInstanceOf[js.Any])
    if (oninput != null) __obj.updateDynamic("oninput")(oninput.asInstanceOf[js.Any])
    if (oninvalid != null) __obj.updateDynamic("oninvalid")(oninvalid.asInstanceOf[js.Any])
    if (onkeydown != null) __obj.updateDynamic("onkeydown")(onkeydown.asInstanceOf[js.Any])
    if (onkeypress != null) __obj.updateDynamic("onkeypress")(onkeypress.asInstanceOf[js.Any])
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(onkeyup.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(onload.asInstanceOf[js.Any])
    if (onloadeddata != null) __obj.updateDynamic("onloadeddata")(onloadeddata.asInstanceOf[js.Any])
    if (onloadedmetadata != null) __obj.updateDynamic("onloadedmetadata")(onloadedmetadata.asInstanceOf[js.Any])
    if (onloadstart != null) __obj.updateDynamic("onloadstart")(onloadstart.asInstanceOf[js.Any])
    if (onlostpointercapture != null) __obj.updateDynamic("onlostpointercapture")(onlostpointercapture.asInstanceOf[js.Any])
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown.asInstanceOf[js.Any])
    if (onmouseenter != null) __obj.updateDynamic("onmouseenter")(onmouseenter.asInstanceOf[js.Any])
    if (onmouseleave != null) __obj.updateDynamic("onmouseleave")(onmouseleave.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(onmousemove.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(onmouseup.asInstanceOf[js.Any])
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
    if (onresize != null) __obj.updateDynamic("onresize")(onresize.asInstanceOf[js.Any])
    if (onscroll != null) __obj.updateDynamic("onscroll")(onscroll.asInstanceOf[js.Any])
    if (onsecuritypolicyviolation != null) __obj.updateDynamic("onsecuritypolicyviolation")(onsecuritypolicyviolation.asInstanceOf[js.Any])
    if (onseeked != null) __obj.updateDynamic("onseeked")(onseeked.asInstanceOf[js.Any])
    if (onseeking != null) __obj.updateDynamic("onseeking")(onseeking.asInstanceOf[js.Any])
    if (onselect != null) __obj.updateDynamic("onselect")(onselect.asInstanceOf[js.Any])
    if (onselectionchange != null) __obj.updateDynamic("onselectionchange")(onselectionchange.asInstanceOf[js.Any])
    if (onselectstart != null) __obj.updateDynamic("onselectstart")(onselectstart.asInstanceOf[js.Any])
    if (onstalled != null) __obj.updateDynamic("onstalled")(onstalled.asInstanceOf[js.Any])
    if (onsubmit != null) __obj.updateDynamic("onsubmit")(onsubmit.asInstanceOf[js.Any])
    if (onsuspend != null) __obj.updateDynamic("onsuspend")(onsuspend.asInstanceOf[js.Any])
    if (ontimeupdate != null) __obj.updateDynamic("ontimeupdate")(ontimeupdate.asInstanceOf[js.Any])
    if (ontoggle != null) __obj.updateDynamic("ontoggle")(ontoggle.asInstanceOf[js.Any])
    if (ontouchcancel != null) __obj.updateDynamic("ontouchcancel")(ontouchcancel.asInstanceOf[js.Any])
    if (ontouchend != null) __obj.updateDynamic("ontouchend")(ontouchend.asInstanceOf[js.Any])
    if (ontouchmove != null) __obj.updateDynamic("ontouchmove")(ontouchmove.asInstanceOf[js.Any])
    if (ontouchstart != null) __obj.updateDynamic("ontouchstart")(ontouchstart.asInstanceOf[js.Any])
    if (ontransitioncancel != null) __obj.updateDynamic("ontransitioncancel")(ontransitioncancel.asInstanceOf[js.Any])
    if (ontransitionend != null) __obj.updateDynamic("ontransitionend")(ontransitionend.asInstanceOf[js.Any])
    if (ontransitionrun != null) __obj.updateDynamic("ontransitionrun")(ontransitionrun.asInstanceOf[js.Any])
    if (ontransitionstart != null) __obj.updateDynamic("ontransitionstart")(ontransitionstart.asInstanceOf[js.Any])
    if (onvolumechange != null) __obj.updateDynamic("onvolumechange")(onvolumechange.asInstanceOf[js.Any])
    if (onwaiting != null) __obj.updateDynamic("onwaiting")(onwaiting.asInstanceOf[js.Any])
    if (onwheel != null) __obj.updateDynamic("onwheel")(onwheel.asInstanceOf[js.Any])
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[PartialGlobalEventHandler]
  }
}


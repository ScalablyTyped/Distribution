package typings.linkifyjs

import typings.linkifyjs.linkifyjsStrings.abort
import typings.std.AnimationEvent
import typings.std.DragEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.OnErrorEventHandler
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<std.GlobalEventHandlers> */
  trait PartialGlobalEventHandler extends StObject {
    
    var addEventListener: js.UndefOr[
        js.Function2[
          abort, 
          /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any], 
          Unit
        ]
      ] = js.undefined
    
    var onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]) | Null] = js.undefined
    
    var onanimationcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onauxclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onblur: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]) | Null] = js.undefined
    
    var oncanplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var oncanplaythrough: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onclose: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var oncontextmenu: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var oncuechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ondblclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var ondrag: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondrop: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondurationchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onemptied: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onended: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onerror: js.UndefOr[OnErrorEventHandler] = js.undefined
    
    var onfocus: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]) | Null] = js.undefined
    
    var onformdata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]) | Null] = js.undefined
    
    var ongotpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var oninput: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var oninvalid: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onkeydown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null] = js.undefined
    
    var onkeypress: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null] = js.undefined
    
    var onkeyup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null] = js.undefined
    
    var onload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onloadeddata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onloadedmetadata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onloadstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onlostpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onmousedown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmousemove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onpause: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onplaying: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onpointercancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerdown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointermove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onprogress: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]) | Null
      ] = js.undefined
    
    var onratechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onreset: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onresize: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]) | Null] = js.undefined
    
    var onscroll: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onsecuritypolicyviolation: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]) | Null
      ] = js.undefined
    
    var onseeked: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onseeking: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onselect: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onselectionchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onselectstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onslotchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onstalled: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onsubmit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]) | Null] = js.undefined
    
    var onsuspend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ontimeupdate: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ontoggle: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontransitioncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var ontransitionend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var ontransitionrun: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var ontransitionstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var onvolumechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwaiting: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkitanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkitanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkitanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkittransitionend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwheel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any]) | Null] = js.undefined
    
    var removeEventListener: js.UndefOr[
        js.Function2[
          abort, 
          /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any], 
          Unit
        ]
      ] = js.undefined
  }
  object PartialGlobalEventHandler {
    
    inline def apply(): PartialGlobalEventHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialGlobalEventHandler]
    }
    
    extension [Self <: PartialGlobalEventHandler](x: Self) {
      
      inline def setAddEventListener(
        value: (abort, /* listener */ js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, Any]) => Unit
      ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
      
      inline def setOnabort(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, Any]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      inline def setOnabortNull: Self = StObject.set(x, "onabort", null)
      
      inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      inline def setOnanimationcancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationcancel", value.asInstanceOf[js.Any])
      
      inline def setOnanimationcancelNull: Self = StObject.set(x, "onanimationcancel", null)
      
      inline def setOnanimationcancelUndefined: Self = StObject.set(x, "onanimationcancel", js.undefined)
      
      inline def setOnanimationend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationend", value.asInstanceOf[js.Any])
      
      inline def setOnanimationendNull: Self = StObject.set(x, "onanimationend", null)
      
      inline def setOnanimationendUndefined: Self = StObject.set(x, "onanimationend", js.undefined)
      
      inline def setOnanimationiteration(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationiteration", value.asInstanceOf[js.Any])
      
      inline def setOnanimationiterationNull: Self = StObject.set(x, "onanimationiteration", null)
      
      inline def setOnanimationiterationUndefined: Self = StObject.set(x, "onanimationiteration", js.undefined)
      
      inline def setOnanimationstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationstart", value.asInstanceOf[js.Any])
      
      inline def setOnanimationstartNull: Self = StObject.set(x, "onanimationstart", null)
      
      inline def setOnanimationstartUndefined: Self = StObject.set(x, "onanimationstart", js.undefined)
      
      inline def setOnauxclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
      
      inline def setOnauxclickNull: Self = StObject.set(x, "onauxclick", null)
      
      inline def setOnauxclickUndefined: Self = StObject.set(x, "onauxclick", js.undefined)
      
      inline def setOnblur(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FocusEvent, Any]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      inline def setOnblurNull: Self = StObject.set(x, "onblur", null)
      
      inline def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
      
      inline def setOncanplay(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
      
      inline def setOncanplayNull: Self = StObject.set(x, "oncanplay", null)
      
      inline def setOncanplayUndefined: Self = StObject.set(x, "oncanplay", js.undefined)
      
      inline def setOncanplaythrough(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
      
      inline def setOncanplaythroughNull: Self = StObject.set(x, "oncanplaythrough", null)
      
      inline def setOncanplaythroughUndefined: Self = StObject.set(x, "oncanplaythrough", js.undefined)
      
      inline def setOnchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
      
      inline def setOnchangeNull: Self = StObject.set(x, "onchange", null)
      
      inline def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
      
      inline def setOnclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      inline def setOnclickNull: Self = StObject.set(x, "onclick", null)
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setOnclose(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
      
      inline def setOncloseNull: Self = StObject.set(x, "onclose", null)
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setOncontextmenu(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
      
      inline def setOncontextmenuNull: Self = StObject.set(x, "oncontextmenu", null)
      
      inline def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
      
      inline def setOncuechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
      
      inline def setOncuechangeNull: Self = StObject.set(x, "oncuechange", null)
      
      inline def setOncuechangeUndefined: Self = StObject.set(x, "oncuechange", js.undefined)
      
      inline def setOndblclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
      
      inline def setOndblclickNull: Self = StObject.set(x, "ondblclick", null)
      
      inline def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
      
      inline def setOndrag(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
      
      inline def setOndragNull: Self = StObject.set(x, "ondrag", null)
      
      inline def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
      
      inline def setOndragend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
      
      inline def setOndragendNull: Self = StObject.set(x, "ondragend", null)
      
      inline def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
      
      inline def setOndragenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
      
      inline def setOndragenterNull: Self = StObject.set(x, "ondragenter", null)
      
      inline def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
      
      inline def setOndragleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
      
      inline def setOndragleaveNull: Self = StObject.set(x, "ondragleave", null)
      
      inline def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
      
      inline def setOndragover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
      
      inline def setOndragoverNull: Self = StObject.set(x, "ondragover", null)
      
      inline def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
      
      inline def setOndragstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
      
      inline def setOndragstartNull: Self = StObject.set(x, "ondragstart", null)
      
      inline def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
      
      inline def setOndrop(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
      
      inline def setOndropNull: Self = StObject.set(x, "ondrop", null)
      
      inline def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
      
      inline def setOndurationchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
      
      inline def setOndurationchangeNull: Self = StObject.set(x, "ondurationchange", null)
      
      inline def setOndurationchangeUndefined: Self = StObject.set(x, "ondurationchange", js.undefined)
      
      inline def setOnemptied(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
      
      inline def setOnemptiedNull: Self = StObject.set(x, "onemptied", null)
      
      inline def setOnemptiedUndefined: Self = StObject.set(x, "onemptied", js.undefined)
      
      inline def setOnended(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
      
      inline def setOnendedNull: Self = StObject.set(x, "onended", null)
      
      inline def setOnendedUndefined: Self = StObject.set(x, "onended", js.undefined)
      
      inline def setOnerror(
        value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => Any
      ): Self = StObject.set(x, "onerror", js.Any.fromFunction5(value))
      
      inline def setOnerrorNull: Self = StObject.set(x, "onerror", null)
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnfocus(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FocusEvent, Any]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      inline def setOnfocusNull: Self = StObject.set(x, "onfocus", null)
      
      inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
      
      inline def setOnformdata(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FormDataEvent, Any]): Self = StObject.set(x, "onformdata", value.asInstanceOf[js.Any])
      
      inline def setOnformdataNull: Self = StObject.set(x, "onformdata", null)
      
      inline def setOnformdataUndefined: Self = StObject.set(x, "onformdata", js.undefined)
      
      inline def setOngotpointercapture(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "ongotpointercapture", value.asInstanceOf[js.Any])
      
      inline def setOngotpointercaptureNull: Self = StObject.set(x, "ongotpointercapture", null)
      
      inline def setOngotpointercaptureUndefined: Self = StObject.set(x, "ongotpointercapture", js.undefined)
      
      inline def setOninput(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
      
      inline def setOninputNull: Self = StObject.set(x, "oninput", null)
      
      inline def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
      
      inline def setOninvalid(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      inline def setOninvalidNull: Self = StObject.set(x, "oninvalid", null)
      
      inline def setOninvalidUndefined: Self = StObject.set(x, "oninvalid", js.undefined)
      
      inline def setOnkeydown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
      
      inline def setOnkeydownNull: Self = StObject.set(x, "onkeydown", null)
      
      inline def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
      
      inline def setOnkeypress(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
      
      inline def setOnkeypressNull: Self = StObject.set(x, "onkeypress", null)
      
      inline def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
      
      inline def setOnkeyup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      inline def setOnkeyupNull: Self = StObject.set(x, "onkeyup", null)
      
      inline def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      inline def setOnload(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      inline def setOnloadNull: Self = StObject.set(x, "onload", null)
      
      inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      inline def setOnloadeddata(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
      
      inline def setOnloadeddataNull: Self = StObject.set(x, "onloadeddata", null)
      
      inline def setOnloadeddataUndefined: Self = StObject.set(x, "onloadeddata", js.undefined)
      
      inline def setOnloadedmetadata(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
      
      inline def setOnloadedmetadataNull: Self = StObject.set(x, "onloadedmetadata", null)
      
      inline def setOnloadedmetadataUndefined: Self = StObject.set(x, "onloadedmetadata", js.undefined)
      
      inline def setOnloadstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
      
      inline def setOnloadstartNull: Self = StObject.set(x, "onloadstart", null)
      
      inline def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
      
      inline def setOnlostpointercapture(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onlostpointercapture", value.asInstanceOf[js.Any])
      
      inline def setOnlostpointercaptureNull: Self = StObject.set(x, "onlostpointercapture", null)
      
      inline def setOnlostpointercaptureUndefined: Self = StObject.set(x, "onlostpointercapture", js.undefined)
      
      inline def setOnmousedown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
      
      inline def setOnmousedownNull: Self = StObject.set(x, "onmousedown", null)
      
      inline def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
      
      inline def setOnmouseenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
      
      inline def setOnmouseenterNull: Self = StObject.set(x, "onmouseenter", null)
      
      inline def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
      
      inline def setOnmouseleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
      
      inline def setOnmouseleaveNull: Self = StObject.set(x, "onmouseleave", null)
      
      inline def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
      
      inline def setOnmousemove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
      
      inline def setOnmousemoveNull: Self = StObject.set(x, "onmousemove", null)
      
      inline def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      inline def setOnmouseout(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
      
      inline def setOnmouseoutNull: Self = StObject.set(x, "onmouseout", null)
      
      inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      inline def setOnmouseover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
      
      inline def setOnmouseoverNull: Self = StObject.set(x, "onmouseover", null)
      
      inline def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
      
      inline def setOnmouseup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
      
      inline def setOnmouseupNull: Self = StObject.set(x, "onmouseup", null)
      
      inline def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
      
      inline def setOnpause(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      inline def setOnpauseNull: Self = StObject.set(x, "onpause", null)
      
      inline def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      inline def setOnplay(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
      
      inline def setOnplayNull: Self = StObject.set(x, "onplay", null)
      
      inline def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      inline def setOnplaying(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
      
      inline def setOnplayingNull: Self = StObject.set(x, "onplaying", null)
      
      inline def setOnplayingUndefined: Self = StObject.set(x, "onplaying", js.undefined)
      
      inline def setOnpointercancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
      
      inline def setOnpointercancelNull: Self = StObject.set(x, "onpointercancel", null)
      
      inline def setOnpointercancelUndefined: Self = StObject.set(x, "onpointercancel", js.undefined)
      
      inline def setOnpointerdown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
      
      inline def setOnpointerdownNull: Self = StObject.set(x, "onpointerdown", null)
      
      inline def setOnpointerdownUndefined: Self = StObject.set(x, "onpointerdown", js.undefined)
      
      inline def setOnpointerenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
      
      inline def setOnpointerenterNull: Self = StObject.set(x, "onpointerenter", null)
      
      inline def setOnpointerenterUndefined: Self = StObject.set(x, "onpointerenter", js.undefined)
      
      inline def setOnpointerleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
      
      inline def setOnpointerleaveNull: Self = StObject.set(x, "onpointerleave", null)
      
      inline def setOnpointerleaveUndefined: Self = StObject.set(x, "onpointerleave", js.undefined)
      
      inline def setOnpointermove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
      
      inline def setOnpointermoveNull: Self = StObject.set(x, "onpointermove", null)
      
      inline def setOnpointermoveUndefined: Self = StObject.set(x, "onpointermove", js.undefined)
      
      inline def setOnpointerout(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
      
      inline def setOnpointeroutNull: Self = StObject.set(x, "onpointerout", null)
      
      inline def setOnpointeroutUndefined: Self = StObject.set(x, "onpointerout", js.undefined)
      
      inline def setOnpointerover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
      
      inline def setOnpointeroverNull: Self = StObject.set(x, "onpointerover", null)
      
      inline def setOnpointeroverUndefined: Self = StObject.set(x, "onpointerover", js.undefined)
      
      inline def setOnpointerup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
      
      inline def setOnpointerupNull: Self = StObject.set(x, "onpointerup", null)
      
      inline def setOnpointerupUndefined: Self = StObject.set(x, "onpointerup", js.undefined)
      
      inline def setOnprogress(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ ProgressEvent[EventTarget], Any]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
      
      inline def setOnprogressNull: Self = StObject.set(x, "onprogress", null)
      
      inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      inline def setOnratechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
      
      inline def setOnratechangeNull: Self = StObject.set(x, "onratechange", null)
      
      inline def setOnratechangeUndefined: Self = StObject.set(x, "onratechange", js.undefined)
      
      inline def setOnreset(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
      
      inline def setOnresetNull: Self = StObject.set(x, "onreset", null)
      
      inline def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      inline def setOnresize(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, Any]): Self = StObject.set(x, "onresize", value.asInstanceOf[js.Any])
      
      inline def setOnresizeNull: Self = StObject.set(x, "onresize", null)
      
      inline def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
      
      inline def setOnscroll(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
      
      inline def setOnscrollNull: Self = StObject.set(x, "onscroll", null)
      
      inline def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
      
      inline def setOnsecuritypolicyviolation(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ SecurityPolicyViolationEvent, Any]): Self = StObject.set(x, "onsecuritypolicyviolation", value.asInstanceOf[js.Any])
      
      inline def setOnsecuritypolicyviolationNull: Self = StObject.set(x, "onsecuritypolicyviolation", null)
      
      inline def setOnsecuritypolicyviolationUndefined: Self = StObject.set(x, "onsecuritypolicyviolation", js.undefined)
      
      inline def setOnseeked(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
      
      inline def setOnseekedNull: Self = StObject.set(x, "onseeked", null)
      
      inline def setOnseekedUndefined: Self = StObject.set(x, "onseeked", js.undefined)
      
      inline def setOnseeking(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
      
      inline def setOnseekingNull: Self = StObject.set(x, "onseeking", null)
      
      inline def setOnseekingUndefined: Self = StObject.set(x, "onseeking", js.undefined)
      
      inline def setOnselect(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
      
      inline def setOnselectNull: Self = StObject.set(x, "onselect", null)
      
      inline def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
      
      inline def setOnselectionchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onselectionchange", value.asInstanceOf[js.Any])
      
      inline def setOnselectionchangeNull: Self = StObject.set(x, "onselectionchange", null)
      
      inline def setOnselectionchangeUndefined: Self = StObject.set(x, "onselectionchange", js.undefined)
      
      inline def setOnselectstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
      
      inline def setOnselectstartNull: Self = StObject.set(x, "onselectstart", null)
      
      inline def setOnselectstartUndefined: Self = StObject.set(x, "onselectstart", js.undefined)
      
      inline def setOnslotchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onslotchange", value.asInstanceOf[js.Any])
      
      inline def setOnslotchangeNull: Self = StObject.set(x, "onslotchange", null)
      
      inline def setOnslotchangeUndefined: Self = StObject.set(x, "onslotchange", js.undefined)
      
      inline def setOnstalled(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
      
      inline def setOnstalledNull: Self = StObject.set(x, "onstalled", null)
      
      inline def setOnstalledUndefined: Self = StObject.set(x, "onstalled", js.undefined)
      
      inline def setOnsubmit(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ SubmitEvent, Any]): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      inline def setOnsubmitNull: Self = StObject.set(x, "onsubmit", null)
      
      inline def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      inline def setOnsuspend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
      
      inline def setOnsuspendNull: Self = StObject.set(x, "onsuspend", null)
      
      inline def setOnsuspendUndefined: Self = StObject.set(x, "onsuspend", js.undefined)
      
      inline def setOntimeupdate(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
      
      inline def setOntimeupdateNull: Self = StObject.set(x, "ontimeupdate", null)
      
      inline def setOntimeupdateUndefined: Self = StObject.set(x, "ontimeupdate", js.undefined)
      
      inline def setOntoggle(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "ontoggle", value.asInstanceOf[js.Any])
      
      inline def setOntoggleNull: Self = StObject.set(x, "ontoggle", null)
      
      inline def setOntoggleUndefined: Self = StObject.set(x, "ontoggle", js.undefined)
      
      inline def setOntouchcancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchcancel", value.asInstanceOf[js.Any])
      
      inline def setOntouchcancelNull: Self = StObject.set(x, "ontouchcancel", null)
      
      inline def setOntouchcancelUndefined: Self = StObject.set(x, "ontouchcancel", js.undefined)
      
      inline def setOntouchend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchend", value.asInstanceOf[js.Any])
      
      inline def setOntouchendNull: Self = StObject.set(x, "ontouchend", null)
      
      inline def setOntouchendUndefined: Self = StObject.set(x, "ontouchend", js.undefined)
      
      inline def setOntouchmove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchmove", value.asInstanceOf[js.Any])
      
      inline def setOntouchmoveNull: Self = StObject.set(x, "ontouchmove", null)
      
      inline def setOntouchmoveUndefined: Self = StObject.set(x, "ontouchmove", js.undefined)
      
      inline def setOntouchstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchstart", value.asInstanceOf[js.Any])
      
      inline def setOntouchstartNull: Self = StObject.set(x, "ontouchstart", null)
      
      inline def setOntouchstartUndefined: Self = StObject.set(x, "ontouchstart", js.undefined)
      
      inline def setOntransitioncancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitioncancel", value.asInstanceOf[js.Any])
      
      inline def setOntransitioncancelNull: Self = StObject.set(x, "ontransitioncancel", null)
      
      inline def setOntransitioncancelUndefined: Self = StObject.set(x, "ontransitioncancel", js.undefined)
      
      inline def setOntransitionend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitionend", value.asInstanceOf[js.Any])
      
      inline def setOntransitionendNull: Self = StObject.set(x, "ontransitionend", null)
      
      inline def setOntransitionendUndefined: Self = StObject.set(x, "ontransitionend", js.undefined)
      
      inline def setOntransitionrun(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitionrun", value.asInstanceOf[js.Any])
      
      inline def setOntransitionrunNull: Self = StObject.set(x, "ontransitionrun", null)
      
      inline def setOntransitionrunUndefined: Self = StObject.set(x, "ontransitionrun", js.undefined)
      
      inline def setOntransitionstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitionstart", value.asInstanceOf[js.Any])
      
      inline def setOntransitionstartNull: Self = StObject.set(x, "ontransitionstart", null)
      
      inline def setOntransitionstartUndefined: Self = StObject.set(x, "ontransitionstart", js.undefined)
      
      inline def setOnvolumechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
      
      inline def setOnvolumechangeNull: Self = StObject.set(x, "onvolumechange", null)
      
      inline def setOnvolumechangeUndefined: Self = StObject.set(x, "onvolumechange", js.undefined)
      
      inline def setOnwaiting(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
      
      inline def setOnwaitingNull: Self = StObject.set(x, "onwaiting", null)
      
      inline def setOnwaitingUndefined: Self = StObject.set(x, "onwaiting", js.undefined)
      
      inline def setOnwebkitanimationend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkitanimationend", value.asInstanceOf[js.Any])
      
      inline def setOnwebkitanimationendNull: Self = StObject.set(x, "onwebkitanimationend", null)
      
      inline def setOnwebkitanimationendUndefined: Self = StObject.set(x, "onwebkitanimationend", js.undefined)
      
      inline def setOnwebkitanimationiteration(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkitanimationiteration", value.asInstanceOf[js.Any])
      
      inline def setOnwebkitanimationiterationNull: Self = StObject.set(x, "onwebkitanimationiteration", null)
      
      inline def setOnwebkitanimationiterationUndefined: Self = StObject.set(x, "onwebkitanimationiteration", js.undefined)
      
      inline def setOnwebkitanimationstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkitanimationstart", value.asInstanceOf[js.Any])
      
      inline def setOnwebkitanimationstartNull: Self = StObject.set(x, "onwebkitanimationstart", null)
      
      inline def setOnwebkitanimationstartUndefined: Self = StObject.set(x, "onwebkitanimationstart", js.undefined)
      
      inline def setOnwebkittransitionend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkittransitionend", value.asInstanceOf[js.Any])
      
      inline def setOnwebkittransitionendNull: Self = StObject.set(x, "onwebkittransitionend", null)
      
      inline def setOnwebkittransitionendUndefined: Self = StObject.set(x, "onwebkittransitionend", js.undefined)
      
      inline def setOnwheel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ WheelEvent, Any]): Self = StObject.set(x, "onwheel", value.asInstanceOf[js.Any])
      
      inline def setOnwheelNull: Self = StObject.set(x, "onwheel", null)
      
      inline def setOnwheelUndefined: Self = StObject.set(x, "onwheel", js.undefined)
      
      inline def setRemoveEventListener(
        value: (abort, /* listener */ js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, Any]) => Unit
      ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      inline def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, string | (href : string): string>> */
  trait PartialRecordLinkEntityTy extends StObject {
    
    var email: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.undefined
    
    var hashtag: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.undefined
    
    var mention: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.undefined
    
    var url: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.undefined
  }
  object PartialRecordLinkEntityTy {
    
    inline def apply(): PartialRecordLinkEntityTy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordLinkEntityTy]
    }
    
    extension [Self <: PartialRecordLinkEntityTy](x: Self) {
      
      inline def setEmail(value: String | (js.Function1[/* href */ String, String])): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailFunction1(value: /* href */ String => String): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHashtag(value: String | (js.Function1[/* href */ String, String])): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      inline def setHashtagFunction1(value: /* href */ String => String): Self = StObject.set(x, "hashtag", js.Any.fromFunction1(value))
      
      inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      inline def setMention(value: String | (js.Function1[/* href */ String, String])): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      inline def setMentionFunction1(value: /* href */ String => String): Self = StObject.set(x, "mention", js.Any.fromFunction1(value))
      
      inline def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      inline def setUrl(value: String | (js.Function1[/* href */ String, String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction1(value: /* href */ String => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, (href : string): string>> */
  trait PartialRecordLinkEntityTyEmail extends StObject {
    
    var email: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    var hashtag: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    var mention: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    var url: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  }
  object PartialRecordLinkEntityTyEmail {
    
    inline def apply(): PartialRecordLinkEntityTyEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordLinkEntityTyEmail]
    }
    
    extension [Self <: PartialRecordLinkEntityTyEmail](x: Self) {
      
      inline def setEmail(value: /* value */ String => String): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHashtag(value: /* value */ String => String): Self = StObject.set(x, "hashtag", js.Any.fromFunction1(value))
      
      inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      inline def setMention(value: /* value */ String => String): Self = StObject.set(x, "mention", js.Any.fromFunction1(value))
      
      inline def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      inline def setUrl(value: /* value */ String => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, string>> */
  trait PartialRecordLinkEntityTyHashtag extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var hashtag: js.UndefOr[String] = js.undefined
    
    var mention: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object PartialRecordLinkEntityTyHashtag {
    
    inline def apply(): PartialRecordLinkEntityTyHashtag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordLinkEntityTyHashtag]
    }
    
    extension [Self <: PartialRecordLinkEntityTyHashtag](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      inline def setMention(value: String): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      inline def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, string | null>> */
  trait PartialRecordLinkEntityTyMention extends StObject {
    
    var email: js.UndefOr[String | Null] = js.undefined
    
    var hashtag: js.UndefOr[String | Null] = js.undefined
    
    var mention: js.UndefOr[String | Null] = js.undefined
    
    var url: js.UndefOr[String | Null] = js.undefined
  }
  object PartialRecordLinkEntityTyMention {
    
    inline def apply(): PartialRecordLinkEntityTyMention = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordLinkEntityTyMention]
    }
    
    extension [Self <: PartialRecordLinkEntityTyMention](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailNull: Self = StObject.set(x, "email", null)
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      inline def setHashtagNull: Self = StObject.set(x, "hashtag", null)
      
      inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      inline def setMention(value: String): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      inline def setMentionNull: Self = StObject.set(x, "mention", null)
      
      inline def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, (href : string): boolean>> */
  trait PartialRecordLinkEntityTyUrl extends StObject {
    
    var email: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
    
    var hashtag: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
    
    var mention: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
    
    var url: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
  }
  object PartialRecordLinkEntityTyUrl {
    
    inline def apply(): PartialRecordLinkEntityTyUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordLinkEntityTyUrl]
    }
    
    extension [Self <: PartialRecordLinkEntityTyUrl](x: Self) {
      
      inline def setEmail(value: /* href */ String => Boolean): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHashtag(value: /* href */ String => Boolean): Self = StObject.set(x, "hashtag", js.Any.fromFunction1(value))
      
      inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      inline def setMention(value: /* href */ String => Boolean): Self = StObject.set(x, "mention", js.Any.fromFunction1(value))
      
      inline def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      inline def setUrl(value: /* href */ String => Boolean): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait V extends StObject {
    
    var v: String
  }
  object V {
    
    inline def apply(v: String): V = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[V]
    }
    
    extension [Self <: V](x: Self) {
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait VArray extends StObject {
    
    var v: js.Array[V]
  }
  object VArray {
    
    inline def apply(v: js.Array[V]): VArray = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[VArray]
    }
    
    extension [Self <: VArray](x: Self) {
      
      inline def setV(value: js.Array[V]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVVarargs(value: V*): Self = StObject.set(x, "v", js.Array(value*))
    }
  }
}

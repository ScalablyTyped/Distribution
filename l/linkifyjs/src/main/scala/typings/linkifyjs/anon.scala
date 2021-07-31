package typings.linkifyjs

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<std.GlobalEventHandlers> */
  trait PartialGlobalEventHandler extends StObject {
    
    var addEventListener: js.UndefOr[
        js.Function2[
          abort, 
          /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, js.Any], 
          Unit
        ]
      ] = js.undefined
    
    var onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, js.Any]) | Null] = js.undefined
    
    var onanimationcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
    
    var onanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
    
    var onanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
    
    var onanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
    
    var onauxclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var onblur: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, js.Any]) | Null] = js.undefined
    
    var oncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var oncanplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var oncanplaythrough: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var onclose: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var oncontextmenu: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var oncuechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var ondblclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var ondrag: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
    
    var ondragend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
    
    var ondragenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
    
    var ondragexit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var ondragleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
    
    var ondragover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
    
    var ondragstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
    
    var ondrop: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
    
    var ondurationchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onemptied: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onended: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onerror: js.UndefOr[OnErrorEventHandler] = js.undefined
    
    var onfocus: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, js.Any]) | Null] = js.undefined
    
    var ongotpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
    
    var oninput: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var oninvalid: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onkeydown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, js.Any]) | Null] = js.undefined
    
    var onkeypress: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, js.Any]) | Null] = js.undefined
    
    var onkeyup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, js.Any]) | Null] = js.undefined
    
    var onload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onloadeddata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onloadedmetadata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onloadstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onlostpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
    
    var onmousedown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var onmouseenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var onmouseleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var onmousemove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var onmouseout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var onmouseover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var onmouseup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
    
    var onpause: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onplaying: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onpointercancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
    
    var onpointerdown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
    
    var onpointerenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
    
    var onpointerleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
    
    var onpointermove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
    
    var onpointerout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
    
    var onpointerover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
    
    var onpointerup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
    
    var onprogress: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], js.Any]) | Null
      ] = js.undefined
    
    var onratechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onreset: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onresize: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, js.Any]) | Null] = js.undefined
    
    var onscroll: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onsecuritypolicyviolation: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, js.Any]) | Null
      ] = js.undefined
    
    var onseeked: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onseeking: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onselect: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onselectionchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onselectstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onstalled: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onsubmit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onsuspend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var ontimeupdate: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var ontoggle: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
    
    var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
    
    var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
    
    var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
    
    var ontransitioncancel: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
      ] = js.undefined
    
    var ontransitionend: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
      ] = js.undefined
    
    var ontransitionrun: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
      ] = js.undefined
    
    var ontransitionstart: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
      ] = js.undefined
    
    var onvolumechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onwaiting: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
    
    var onwheel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, js.Any]) | Null] = js.undefined
    
    var removeEventListener: js.UndefOr[
        js.Function2[
          abort, 
          /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, js.Any], 
          Unit
        ]
      ] = js.undefined
  }
  object PartialGlobalEventHandler {
    
    @scala.inline
    def apply(): PartialGlobalEventHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialGlobalEventHandler]
    }
    
    @scala.inline
    implicit class PartialGlobalEventHandlerMutableBuilder[Self <: PartialGlobalEventHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(
        value: (abort, /* listener */ js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, js.Any]) => Unit
      ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
      
      @scala.inline
      def setOnabort(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnabortNull: Self = StObject.set(x, "onabort", null)
      
      @scala.inline
      def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      @scala.inline
      def setOnanimationcancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationcancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnanimationcancelNull: Self = StObject.set(x, "onanimationcancel", null)
      
      @scala.inline
      def setOnanimationcancelUndefined: Self = StObject.set(x, "onanimationcancel", js.undefined)
      
      @scala.inline
      def setOnanimationend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnanimationendNull: Self = StObject.set(x, "onanimationend", null)
      
      @scala.inline
      def setOnanimationendUndefined: Self = StObject.set(x, "onanimationend", js.undefined)
      
      @scala.inline
      def setOnanimationiteration(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationiteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnanimationiterationNull: Self = StObject.set(x, "onanimationiteration", null)
      
      @scala.inline
      def setOnanimationiterationUndefined: Self = StObject.set(x, "onanimationiteration", js.undefined)
      
      @scala.inline
      def setOnanimationstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnanimationstartNull: Self = StObject.set(x, "onanimationstart", null)
      
      @scala.inline
      def setOnanimationstartUndefined: Self = StObject.set(x, "onanimationstart", js.undefined)
      
      @scala.inline
      def setOnauxclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnauxclickNull: Self = StObject.set(x, "onauxclick", null)
      
      @scala.inline
      def setOnauxclickUndefined: Self = StObject.set(x, "onauxclick", js.undefined)
      
      @scala.inline
      def setOnblur(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FocusEvent, js.Any]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnblurNull: Self = StObject.set(x, "onblur", null)
      
      @scala.inline
      def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
      
      @scala.inline
      def setOncancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncancelNull: Self = StObject.set(x, "oncancel", null)
      
      @scala.inline
      def setOncancelUndefined: Self = StObject.set(x, "oncancel", js.undefined)
      
      @scala.inline
      def setOncanplay(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncanplayNull: Self = StObject.set(x, "oncanplay", null)
      
      @scala.inline
      def setOncanplayUndefined: Self = StObject.set(x, "oncanplay", js.undefined)
      
      @scala.inline
      def setOncanplaythrough(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncanplaythroughNull: Self = StObject.set(x, "oncanplaythrough", null)
      
      @scala.inline
      def setOncanplaythroughUndefined: Self = StObject.set(x, "oncanplaythrough", js.undefined)
      
      @scala.inline
      def setOnchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnchangeNull: Self = StObject.set(x, "onchange", null)
      
      @scala.inline
      def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
      
      @scala.inline
      def setOnclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnclickNull: Self = StObject.set(x, "onclick", null)
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setOnclose(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncloseNull: Self = StObject.set(x, "onclose", null)
      
      @scala.inline
      def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      @scala.inline
      def setOncontextmenu(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncontextmenuNull: Self = StObject.set(x, "oncontextmenu", null)
      
      @scala.inline
      def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
      
      @scala.inline
      def setOncuechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncuechangeNull: Self = StObject.set(x, "oncuechange", null)
      
      @scala.inline
      def setOncuechangeUndefined: Self = StObject.set(x, "oncuechange", js.undefined)
      
      @scala.inline
      def setOndblclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndblclickNull: Self = StObject.set(x, "ondblclick", null)
      
      @scala.inline
      def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
      
      @scala.inline
      def setOndrag(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragNull: Self = StObject.set(x, "ondrag", null)
      
      @scala.inline
      def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
      
      @scala.inline
      def setOndragend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragendNull: Self = StObject.set(x, "ondragend", null)
      
      @scala.inline
      def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
      
      @scala.inline
      def setOndragenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragenterNull: Self = StObject.set(x, "ondragenter", null)
      
      @scala.inline
      def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
      
      @scala.inline
      def setOndragexit(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "ondragexit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragexitNull: Self = StObject.set(x, "ondragexit", null)
      
      @scala.inline
      def setOndragexitUndefined: Self = StObject.set(x, "ondragexit", js.undefined)
      
      @scala.inline
      def setOndragleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragleaveNull: Self = StObject.set(x, "ondragleave", null)
      
      @scala.inline
      def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
      
      @scala.inline
      def setOndragover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragoverNull: Self = StObject.set(x, "ondragover", null)
      
      @scala.inline
      def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
      
      @scala.inline
      def setOndragstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragstartNull: Self = StObject.set(x, "ondragstart", null)
      
      @scala.inline
      def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
      
      @scala.inline
      def setOndrop(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndropNull: Self = StObject.set(x, "ondrop", null)
      
      @scala.inline
      def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
      
      @scala.inline
      def setOndurationchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndurationchangeNull: Self = StObject.set(x, "ondurationchange", null)
      
      @scala.inline
      def setOndurationchangeUndefined: Self = StObject.set(x, "ondurationchange", js.undefined)
      
      @scala.inline
      def setOnemptied(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnemptiedNull: Self = StObject.set(x, "onemptied", null)
      
      @scala.inline
      def setOnemptiedUndefined: Self = StObject.set(x, "onemptied", js.undefined)
      
      @scala.inline
      def setOnended(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnendedNull: Self = StObject.set(x, "onended", null)
      
      @scala.inline
      def setOnendedUndefined: Self = StObject.set(x, "onended", js.undefined)
      
      @scala.inline
      def setOnerror(
        value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any
      ): Self = StObject.set(x, "onerror", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnerrorNull: Self = StObject.set(x, "onerror", null)
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setOnfocus(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FocusEvent, js.Any]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnfocusNull: Self = StObject.set(x, "onfocus", null)
      
      @scala.inline
      def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
      
      @scala.inline
      def setOngotpointercapture(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "ongotpointercapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOngotpointercaptureNull: Self = StObject.set(x, "ongotpointercapture", null)
      
      @scala.inline
      def setOngotpointercaptureUndefined: Self = StObject.set(x, "ongotpointercapture", js.undefined)
      
      @scala.inline
      def setOninput(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOninputNull: Self = StObject.set(x, "oninput", null)
      
      @scala.inline
      def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
      
      @scala.inline
      def setOninvalid(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOninvalidNull: Self = StObject.set(x, "oninvalid", null)
      
      @scala.inline
      def setOninvalidUndefined: Self = StObject.set(x, "oninvalid", js.undefined)
      
      @scala.inline
      def setOnkeydown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeydownNull: Self = StObject.set(x, "onkeydown", null)
      
      @scala.inline
      def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
      
      @scala.inline
      def setOnkeypress(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeypressNull: Self = StObject.set(x, "onkeypress", null)
      
      @scala.inline
      def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
      
      @scala.inline
      def setOnkeyup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeyupNull: Self = StObject.set(x, "onkeyup", null)
      
      @scala.inline
      def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      @scala.inline
      def setOnload(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadNull: Self = StObject.set(x, "onload", null)
      
      @scala.inline
      def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      @scala.inline
      def setOnloadeddata(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadeddataNull: Self = StObject.set(x, "onloadeddata", null)
      
      @scala.inline
      def setOnloadeddataUndefined: Self = StObject.set(x, "onloadeddata", js.undefined)
      
      @scala.inline
      def setOnloadedmetadata(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadedmetadataNull: Self = StObject.set(x, "onloadedmetadata", null)
      
      @scala.inline
      def setOnloadedmetadataUndefined: Self = StObject.set(x, "onloadedmetadata", js.undefined)
      
      @scala.inline
      def setOnloadstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadstartNull: Self = StObject.set(x, "onloadstart", null)
      
      @scala.inline
      def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
      
      @scala.inline
      def setOnlostpointercapture(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onlostpointercapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlostpointercaptureNull: Self = StObject.set(x, "onlostpointercapture", null)
      
      @scala.inline
      def setOnlostpointercaptureUndefined: Self = StObject.set(x, "onlostpointercapture", js.undefined)
      
      @scala.inline
      def setOnmousedown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousedownNull: Self = StObject.set(x, "onmousedown", null)
      
      @scala.inline
      def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
      
      @scala.inline
      def setOnmouseenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseenterNull: Self = StObject.set(x, "onmouseenter", null)
      
      @scala.inline
      def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
      
      @scala.inline
      def setOnmouseleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseleaveNull: Self = StObject.set(x, "onmouseleave", null)
      
      @scala.inline
      def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
      
      @scala.inline
      def setOnmousemove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousemoveNull: Self = StObject.set(x, "onmousemove", null)
      
      @scala.inline
      def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      @scala.inline
      def setOnmouseout(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseoutNull: Self = StObject.set(x, "onmouseout", null)
      
      @scala.inline
      def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      @scala.inline
      def setOnmouseover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseoverNull: Self = StObject.set(x, "onmouseover", null)
      
      @scala.inline
      def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
      
      @scala.inline
      def setOnmouseup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseupNull: Self = StObject.set(x, "onmouseup", null)
      
      @scala.inline
      def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
      
      @scala.inline
      def setOnpause(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpauseNull: Self = StObject.set(x, "onpause", null)
      
      @scala.inline
      def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      @scala.inline
      def setOnplay(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnplayNull: Self = StObject.set(x, "onplay", null)
      
      @scala.inline
      def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      @scala.inline
      def setOnplaying(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnplayingNull: Self = StObject.set(x, "onplaying", null)
      
      @scala.inline
      def setOnplayingUndefined: Self = StObject.set(x, "onplaying", js.undefined)
      
      @scala.inline
      def setOnpointercancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointercancelNull: Self = StObject.set(x, "onpointercancel", null)
      
      @scala.inline
      def setOnpointercancelUndefined: Self = StObject.set(x, "onpointercancel", js.undefined)
      
      @scala.inline
      def setOnpointerdown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerdownNull: Self = StObject.set(x, "onpointerdown", null)
      
      @scala.inline
      def setOnpointerdownUndefined: Self = StObject.set(x, "onpointerdown", js.undefined)
      
      @scala.inline
      def setOnpointerenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerenterNull: Self = StObject.set(x, "onpointerenter", null)
      
      @scala.inline
      def setOnpointerenterUndefined: Self = StObject.set(x, "onpointerenter", js.undefined)
      
      @scala.inline
      def setOnpointerleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerleaveNull: Self = StObject.set(x, "onpointerleave", null)
      
      @scala.inline
      def setOnpointerleaveUndefined: Self = StObject.set(x, "onpointerleave", js.undefined)
      
      @scala.inline
      def setOnpointermove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointermoveNull: Self = StObject.set(x, "onpointermove", null)
      
      @scala.inline
      def setOnpointermoveUndefined: Self = StObject.set(x, "onpointermove", js.undefined)
      
      @scala.inline
      def setOnpointerout(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointeroutNull: Self = StObject.set(x, "onpointerout", null)
      
      @scala.inline
      def setOnpointeroutUndefined: Self = StObject.set(x, "onpointerout", js.undefined)
      
      @scala.inline
      def setOnpointerover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointeroverNull: Self = StObject.set(x, "onpointerover", null)
      
      @scala.inline
      def setOnpointeroverUndefined: Self = StObject.set(x, "onpointerover", js.undefined)
      
      @scala.inline
      def setOnpointerup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerupNull: Self = StObject.set(x, "onpointerup", null)
      
      @scala.inline
      def setOnpointerupUndefined: Self = StObject.set(x, "onpointerup", js.undefined)
      
      @scala.inline
      def setOnprogress(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ ProgressEvent[EventTarget], js.Any]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnprogressNull: Self = StObject.set(x, "onprogress", null)
      
      @scala.inline
      def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      @scala.inline
      def setOnratechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnratechangeNull: Self = StObject.set(x, "onratechange", null)
      
      @scala.inline
      def setOnratechangeUndefined: Self = StObject.set(x, "onratechange", js.undefined)
      
      @scala.inline
      def setOnreset(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnresetNull: Self = StObject.set(x, "onreset", null)
      
      @scala.inline
      def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      @scala.inline
      def setOnresize(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onresize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnresizeNull: Self = StObject.set(x, "onresize", null)
      
      @scala.inline
      def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
      
      @scala.inline
      def setOnscroll(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnscrollNull: Self = StObject.set(x, "onscroll", null)
      
      @scala.inline
      def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
      
      @scala.inline
      def setOnsecuritypolicyviolation(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ SecurityPolicyViolationEvent, js.Any]): Self = StObject.set(x, "onsecuritypolicyviolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnsecuritypolicyviolationNull: Self = StObject.set(x, "onsecuritypolicyviolation", null)
      
      @scala.inline
      def setOnsecuritypolicyviolationUndefined: Self = StObject.set(x, "onsecuritypolicyviolation", js.undefined)
      
      @scala.inline
      def setOnseeked(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnseekedNull: Self = StObject.set(x, "onseeked", null)
      
      @scala.inline
      def setOnseekedUndefined: Self = StObject.set(x, "onseeked", js.undefined)
      
      @scala.inline
      def setOnseeking(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnseekingNull: Self = StObject.set(x, "onseeking", null)
      
      @scala.inline
      def setOnseekingUndefined: Self = StObject.set(x, "onseeking", js.undefined)
      
      @scala.inline
      def setOnselect(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnselectNull: Self = StObject.set(x, "onselect", null)
      
      @scala.inline
      def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
      
      @scala.inline
      def setOnselectionchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onselectionchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnselectionchangeNull: Self = StObject.set(x, "onselectionchange", null)
      
      @scala.inline
      def setOnselectionchangeUndefined: Self = StObject.set(x, "onselectionchange", js.undefined)
      
      @scala.inline
      def setOnselectstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnselectstartNull: Self = StObject.set(x, "onselectstart", null)
      
      @scala.inline
      def setOnselectstartUndefined: Self = StObject.set(x, "onselectstart", js.undefined)
      
      @scala.inline
      def setOnstalled(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnstalledNull: Self = StObject.set(x, "onstalled", null)
      
      @scala.inline
      def setOnstalledUndefined: Self = StObject.set(x, "onstalled", js.undefined)
      
      @scala.inline
      def setOnsubmit(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnsubmitNull: Self = StObject.set(x, "onsubmit", null)
      
      @scala.inline
      def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      @scala.inline
      def setOnsuspend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnsuspendNull: Self = StObject.set(x, "onsuspend", null)
      
      @scala.inline
      def setOnsuspendUndefined: Self = StObject.set(x, "onsuspend", js.undefined)
      
      @scala.inline
      def setOntimeupdate(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntimeupdateNull: Self = StObject.set(x, "ontimeupdate", null)
      
      @scala.inline
      def setOntimeupdateUndefined: Self = StObject.set(x, "ontimeupdate", js.undefined)
      
      @scala.inline
      def setOntoggle(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "ontoggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntoggleNull: Self = StObject.set(x, "ontoggle", null)
      
      @scala.inline
      def setOntoggleUndefined: Self = StObject.set(x, "ontoggle", js.undefined)
      
      @scala.inline
      def setOntouchcancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchcancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntouchcancelNull: Self = StObject.set(x, "ontouchcancel", null)
      
      @scala.inline
      def setOntouchcancelUndefined: Self = StObject.set(x, "ontouchcancel", js.undefined)
      
      @scala.inline
      def setOntouchend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntouchendNull: Self = StObject.set(x, "ontouchend", null)
      
      @scala.inline
      def setOntouchendUndefined: Self = StObject.set(x, "ontouchend", js.undefined)
      
      @scala.inline
      def setOntouchmove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchmove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntouchmoveNull: Self = StObject.set(x, "ontouchmove", null)
      
      @scala.inline
      def setOntouchmoveUndefined: Self = StObject.set(x, "ontouchmove", js.undefined)
      
      @scala.inline
      def setOntouchstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntouchstartNull: Self = StObject.set(x, "ontouchstart", null)
      
      @scala.inline
      def setOntouchstartUndefined: Self = StObject.set(x, "ontouchstart", js.undefined)
      
      @scala.inline
      def setOntransitioncancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitioncancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntransitioncancelNull: Self = StObject.set(x, "ontransitioncancel", null)
      
      @scala.inline
      def setOntransitioncancelUndefined: Self = StObject.set(x, "ontransitioncancel", js.undefined)
      
      @scala.inline
      def setOntransitionend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitionend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntransitionendNull: Self = StObject.set(x, "ontransitionend", null)
      
      @scala.inline
      def setOntransitionendUndefined: Self = StObject.set(x, "ontransitionend", js.undefined)
      
      @scala.inline
      def setOntransitionrun(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitionrun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntransitionrunNull: Self = StObject.set(x, "ontransitionrun", null)
      
      @scala.inline
      def setOntransitionrunUndefined: Self = StObject.set(x, "ontransitionrun", js.undefined)
      
      @scala.inline
      def setOntransitionstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitionstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntransitionstartNull: Self = StObject.set(x, "ontransitionstart", null)
      
      @scala.inline
      def setOntransitionstartUndefined: Self = StObject.set(x, "ontransitionstart", js.undefined)
      
      @scala.inline
      def setOnvolumechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnvolumechangeNull: Self = StObject.set(x, "onvolumechange", null)
      
      @scala.inline
      def setOnvolumechangeUndefined: Self = StObject.set(x, "onvolumechange", js.undefined)
      
      @scala.inline
      def setOnwaiting(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event, js.Any]): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnwaitingNull: Self = StObject.set(x, "onwaiting", null)
      
      @scala.inline
      def setOnwaitingUndefined: Self = StObject.set(x, "onwaiting", js.undefined)
      
      @scala.inline
      def setOnwheel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ WheelEvent, js.Any]): Self = StObject.set(x, "onwheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnwheelNull: Self = StObject.set(x, "onwheel", null)
      
      @scala.inline
      def setOnwheelUndefined: Self = StObject.set(x, "onwheel", js.undefined)
      
      @scala.inline
      def setRemoveEventListener(
        value: (abort, /* listener */ js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, js.Any]) => Unit
      ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
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
    
    @scala.inline
    def apply(): PartialRecordLinkEntityTy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordLinkEntityTy]
    }
    
    @scala.inline
    implicit class PartialRecordLinkEntityTyMutableBuilder[Self <: PartialRecordLinkEntityTy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String | (js.Function1[/* href */ String, String])): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailFunction1(value: /* href */ String => String): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setHashtag(value: String | (js.Function1[/* href */ String, String])): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagFunction1(value: /* href */ String => String): Self = StObject.set(x, "hashtag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setMention(value: String | (js.Function1[/* href */ String, String])): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionFunction1(value: /* href */ String => String): Self = StObject.set(x, "mention", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      @scala.inline
      def setUrl(value: String | (js.Function1[/* href */ String, String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlFunction1(value: /* href */ String => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    def apply(): PartialRecordLinkEntityTyEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordLinkEntityTyEmail]
    }
    
    @scala.inline
    implicit class PartialRecordLinkEntityTyEmailMutableBuilder[Self <: PartialRecordLinkEntityTyEmail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: /* value */ String => String): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setHashtag(value: /* value */ String => String): Self = StObject.set(x, "hashtag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setMention(value: /* value */ String => String): Self = StObject.set(x, "mention", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      @scala.inline
      def setUrl(value: /* value */ String => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    def apply(): PartialRecordLinkEntityTyHashtag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordLinkEntityTyHashtag]
    }
    
    @scala.inline
    implicit class PartialRecordLinkEntityTyHashtagMutableBuilder[Self <: PartialRecordLinkEntityTyHashtag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setMention(value: String): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    def apply(): PartialRecordLinkEntityTyMention = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordLinkEntityTyMention]
    }
    
    @scala.inline
    implicit class PartialRecordLinkEntityTyMentionMutableBuilder[Self <: PartialRecordLinkEntityTyMention] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailNull: Self = StObject.set(x, "email", null)
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagNull: Self = StObject.set(x, "hashtag", null)
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setMention(value: String): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionNull: Self = StObject.set(x, "mention", null)
      
      @scala.inline
      def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlNull: Self = StObject.set(x, "url", null)
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    def apply(): PartialRecordLinkEntityTyUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordLinkEntityTyUrl]
    }
    
    @scala.inline
    implicit class PartialRecordLinkEntityTyUrlMutableBuilder[Self <: PartialRecordLinkEntityTyUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: /* href */ String => Boolean): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setHashtag(value: /* href */ String => Boolean): Self = StObject.set(x, "hashtag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setMention(value: /* href */ String => Boolean): Self = StObject.set(x, "mention", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      @scala.inline
      def setUrl(value: /* href */ String => Boolean): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait V extends StObject {
    
    var v: String
  }
  object V {
    
    @scala.inline
    def apply(v: String): V = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[V]
    }
    
    @scala.inline
    implicit class VMutableBuilder[Self <: V] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait VArray extends StObject {
    
    var v: js.Array[V]
  }
  object VArray {
    
    @scala.inline
    def apply(v: js.Array[V]): VArray = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[VArray]
    }
    
    @scala.inline
    implicit class VArrayMutableBuilder[Self <: VArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setV(value: js.Array[V]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVVarargs(value: V*): Self = StObject.set(x, "v", js.Array(value :_*))
    }
  }
}

package typings.materialBase

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialBase.materialBaseStrings.abort
import typings.materialBase.materialBaseStrings.animationcancel
import typings.materialBase.materialBaseStrings.animationend
import typings.materialBase.materialBaseStrings.animationiteration
import typings.materialBase.materialBaseStrings.animationstart
import typings.materialBase.materialBaseStrings.auxclick
import typings.materialBase.materialBaseStrings.beforeinput
import typings.materialBase.materialBaseStrings.blur
import typings.materialBase.materialBaseStrings.canplay
import typings.materialBase.materialBaseStrings.canplaythrough
import typings.materialBase.materialBaseStrings.change
import typings.materialBase.materialBaseStrings.click
import typings.materialBase.materialBaseStrings.close
import typings.materialBase.materialBaseStrings.compositionend
import typings.materialBase.materialBaseStrings.compositionstart
import typings.materialBase.materialBaseStrings.compositionupdate
import typings.materialBase.materialBaseStrings.contextmenu
import typings.materialBase.materialBaseStrings.cuechange
import typings.materialBase.materialBaseStrings.dblclick
import typings.materialBase.materialBaseStrings.drag
import typings.materialBase.materialBaseStrings.dragend
import typings.materialBase.materialBaseStrings.dragenter
import typings.materialBase.materialBaseStrings.dragleave
import typings.materialBase.materialBaseStrings.dragover
import typings.materialBase.materialBaseStrings.dragstart
import typings.materialBase.materialBaseStrings.drop
import typings.materialBase.materialBaseStrings.durationchange
import typings.materialBase.materialBaseStrings.emptied
import typings.materialBase.materialBaseStrings.ended
import typings.materialBase.materialBaseStrings.error
import typings.materialBase.materialBaseStrings.focus
import typings.materialBase.materialBaseStrings.focusin
import typings.materialBase.materialBaseStrings.focusout
import typings.materialBase.materialBaseStrings.formdata
import typings.materialBase.materialBaseStrings.gotpointercapture
import typings.materialBase.materialBaseStrings.input
import typings.materialBase.materialBaseStrings.invalid
import typings.materialBase.materialBaseStrings.keydown
import typings.materialBase.materialBaseStrings.keypress
import typings.materialBase.materialBaseStrings.keyup
import typings.materialBase.materialBaseStrings.load
import typings.materialBase.materialBaseStrings.loadeddata
import typings.materialBase.materialBaseStrings.loadedmetadata
import typings.materialBase.materialBaseStrings.loadstart
import typings.materialBase.materialBaseStrings.lostpointercapture
import typings.materialBase.materialBaseStrings.mousedown
import typings.materialBase.materialBaseStrings.mouseenter
import typings.materialBase.materialBaseStrings.mouseleave
import typings.materialBase.materialBaseStrings.mousemove
import typings.materialBase.materialBaseStrings.mouseout
import typings.materialBase.materialBaseStrings.mouseover
import typings.materialBase.materialBaseStrings.mouseup
import typings.materialBase.materialBaseStrings.pause
import typings.materialBase.materialBaseStrings.play
import typings.materialBase.materialBaseStrings.playing
import typings.materialBase.materialBaseStrings.pointercancel
import typings.materialBase.materialBaseStrings.pointerdown
import typings.materialBase.materialBaseStrings.pointerenter
import typings.materialBase.materialBaseStrings.pointerleave
import typings.materialBase.materialBaseStrings.pointermove
import typings.materialBase.materialBaseStrings.pointerout
import typings.materialBase.materialBaseStrings.pointerover
import typings.materialBase.materialBaseStrings.pointerup
import typings.materialBase.materialBaseStrings.progress
import typings.materialBase.materialBaseStrings.ratechange
import typings.materialBase.materialBaseStrings.reset
import typings.materialBase.materialBaseStrings.resize
import typings.materialBase.materialBaseStrings.scroll
import typings.materialBase.materialBaseStrings.securitypolicyviolation
import typings.materialBase.materialBaseStrings.seeked
import typings.materialBase.materialBaseStrings.seeking
import typings.materialBase.materialBaseStrings.select
import typings.materialBase.materialBaseStrings.selectionchange
import typings.materialBase.materialBaseStrings.selectstart
import typings.materialBase.materialBaseStrings.slotchange
import typings.materialBase.materialBaseStrings.stalled
import typings.materialBase.materialBaseStrings.submit
import typings.materialBase.materialBaseStrings.suspend
import typings.materialBase.materialBaseStrings.timeupdate
import typings.materialBase.materialBaseStrings.toggle
import typings.materialBase.materialBaseStrings.touchcancel
import typings.materialBase.materialBaseStrings.touchend
import typings.materialBase.materialBaseStrings.touchmove
import typings.materialBase.materialBaseStrings.touchstart
import typings.materialBase.materialBaseStrings.transitioncancel
import typings.materialBase.materialBaseStrings.transitionend
import typings.materialBase.materialBaseStrings.transitionrun
import typings.materialBase.materialBaseStrings.transitionstart
import typings.materialBase.materialBaseStrings.volumechange
import typings.materialBase.materialBaseStrings.waiting
import typings.materialBase.materialBaseStrings.webkitanimationend
import typings.materialBase.materialBaseStrings.webkitanimationiteration
import typings.materialBase.materialBaseStrings.webkitanimationstart
import typings.materialBase.materialBaseStrings.webkittransitionend
import typings.materialBase.materialBaseStrings.wheel
import typings.materialBase.typesMod.CustomEventListener
import typings.materialBase.typesMod.SpecificEventListener
import typings.std.AddEventListenerOptions
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/base/component", JSImport.Default)
  @js.native
  open class default[FoundationType /* <: MDCFoundation[js.Object] */] protected () extends MDCComponent[FoundationType] {
    def this(root: Element, foundation: FoundationType, args: Any*) = this()
    def this(root: Element, foundation: Unit, args: Any*) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/base/component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): MDCComponent[MDCFoundation[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCComponent[MDCFoundation[js.Object]]]
  }
  
  @JSImport("@material/base/component", "MDCComponent")
  @js.native
  open class MDCComponent[FoundationType /* <: MDCFoundation[js.Object] */] protected () extends StObject {
    def this(root: Element, foundation: FoundationType, args: Any*) = this()
    def this(root: Element, foundation: Unit, args: Any*) = this()
    
    def destroy(): Unit = js.native
    
    /**
      * Fires a cross-browser-compatible custom event from the component root of the given type, with the given data.
      */
    def emit[T /* <: js.Object */](evtType: String, evtData: T): Unit = js.native
    def emit[T /* <: js.Object */](evtType: String, evtData: T, shouldBubble: Boolean): Unit = js.native
    
    /* protected */ var foundation: FoundationType = js.native
    
    def getDefaultFoundation(): FoundationType = js.native
    
    def initialSyncWithDOM(): Unit = js.native
    
    def initialize(_args: Any*): Unit = js.native
    
    def listen[E /* <: Event */](evtType: String, handler: CustomEventListener[E]): Unit = js.native
    def listen[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: Boolean): Unit = js.native
    def listen[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: AddEventListenerOptions): Unit = js.native
    /**
      * Wrapper method to add an event listener to the component's root element. This is most useful when
      * listening for custom events.
      */
    @JSName("listen")
    def listen_abort(evtType: abort, handler: SpecificEventListener[abort]): Unit = js.native
    @JSName("listen")
    def listen_abort(evtType: abort, handler: SpecificEventListener[abort], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_abort(evtType: abort, handler: SpecificEventListener[abort], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel]): Unit = js.native
    @JSName("listen")
    def listen_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationcancel(
      evtType: animationcancel,
      handler: SpecificEventListener[animationcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_animationend(evtType: animationend, handler: SpecificEventListener[animationend]): Unit = js.native
    @JSName("listen")
    def listen_animationend(evtType: animationend, handler: SpecificEventListener[animationend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationend(
      evtType: animationend,
      handler: SpecificEventListener[animationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration]): Unit = js.native
    @JSName("listen")
    def listen_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationiteration(
      evtType: animationiteration,
      handler: SpecificEventListener[animationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart]): Unit = js.native
    @JSName("listen")
    def listen_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationstart(
      evtType: animationstart,
      handler: SpecificEventListener[animationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick]): Unit = js.native
    @JSName("listen")
    def listen_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_beforeinput(evtType: beforeinput, handler: SpecificEventListener[beforeinput]): Unit = js.native
    @JSName("listen")
    def listen_beforeinput(evtType: beforeinput, handler: SpecificEventListener[beforeinput], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_beforeinput(
      evtType: beforeinput,
      handler: SpecificEventListener[beforeinput],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_blur(evtType: blur, handler: SpecificEventListener[blur]): Unit = js.native
    @JSName("listen")
    def listen_blur(evtType: blur, handler: SpecificEventListener[blur], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_blur(evtType: blur, handler: SpecificEventListener[blur], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_canplay(evtType: canplay, handler: SpecificEventListener[canplay]): Unit = js.native
    @JSName("listen")
    def listen_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough]): Unit = js.native
    @JSName("listen")
    def listen_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_canplaythrough(
      evtType: canplaythrough,
      handler: SpecificEventListener[canplaythrough],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_change(evtType: change, handler: SpecificEventListener[change]): Unit = js.native
    @JSName("listen")
    def listen_change(evtType: change, handler: SpecificEventListener[change], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_change(evtType: change, handler: SpecificEventListener[change], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_click(evtType: click, handler: SpecificEventListener[click]): Unit = js.native
    @JSName("listen")
    def listen_click(evtType: click, handler: SpecificEventListener[click], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_click(evtType: click, handler: SpecificEventListener[click], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_close(evtType: close, handler: SpecificEventListener[close]): Unit = js.native
    @JSName("listen")
    def listen_close(evtType: close, handler: SpecificEventListener[close], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_close(evtType: close, handler: SpecificEventListener[close], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_compositionend(evtType: compositionend, handler: SpecificEventListener[compositionend]): Unit = js.native
    @JSName("listen")
    def listen_compositionend(evtType: compositionend, handler: SpecificEventListener[compositionend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_compositionend(
      evtType: compositionend,
      handler: SpecificEventListener[compositionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_compositionstart(evtType: compositionstart, handler: SpecificEventListener[compositionstart]): Unit = js.native
    @JSName("listen")
    def listen_compositionstart(evtType: compositionstart, handler: SpecificEventListener[compositionstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_compositionstart(
      evtType: compositionstart,
      handler: SpecificEventListener[compositionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_compositionupdate(evtType: compositionupdate, handler: SpecificEventListener[compositionupdate]): Unit = js.native
    @JSName("listen")
    def listen_compositionupdate(evtType: compositionupdate, handler: SpecificEventListener[compositionupdate], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_compositionupdate(
      evtType: compositionupdate,
      handler: SpecificEventListener[compositionupdate],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu]): Unit = js.native
    @JSName("listen")
    def listen_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_contextmenu(
      evtType: contextmenu,
      handler: SpecificEventListener[contextmenu],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange]): Unit = js.native
    @JSName("listen")
    def listen_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick]): Unit = js.native
    @JSName("listen")
    def listen_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_drag(evtType: drag, handler: SpecificEventListener[drag]): Unit = js.native
    @JSName("listen")
    def listen_drag(evtType: drag, handler: SpecificEventListener[drag], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_drag(evtType: drag, handler: SpecificEventListener[drag], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragend(evtType: dragend, handler: SpecificEventListener[dragend]): Unit = js.native
    @JSName("listen")
    def listen_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter]): Unit = js.native
    @JSName("listen")
    def listen_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave]): Unit = js.native
    @JSName("listen")
    def listen_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragover(evtType: dragover, handler: SpecificEventListener[dragover]): Unit = js.native
    @JSName("listen")
    def listen_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart]): Unit = js.native
    @JSName("listen")
    def listen_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_drop(evtType: drop, handler: SpecificEventListener[drop]): Unit = js.native
    @JSName("listen")
    def listen_drop(evtType: drop, handler: SpecificEventListener[drop], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_drop(evtType: drop, handler: SpecificEventListener[drop], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange]): Unit = js.native
    @JSName("listen")
    def listen_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_durationchange(
      evtType: durationchange,
      handler: SpecificEventListener[durationchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_emptied(evtType: emptied, handler: SpecificEventListener[emptied]): Unit = js.native
    @JSName("listen")
    def listen_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_ended(evtType: ended, handler: SpecificEventListener[ended]): Unit = js.native
    @JSName("listen")
    def listen_ended(evtType: ended, handler: SpecificEventListener[ended], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_ended(evtType: ended, handler: SpecificEventListener[ended], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_error(evtType: error, handler: SpecificEventListener[error]): Unit = js.native
    @JSName("listen")
    def listen_error(evtType: error, handler: SpecificEventListener[error], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_error(evtType: error, handler: SpecificEventListener[error], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_focus(evtType: focus, handler: SpecificEventListener[focus]): Unit = js.native
    @JSName("listen")
    def listen_focus(evtType: focus, handler: SpecificEventListener[focus], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_focus(evtType: focus, handler: SpecificEventListener[focus], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_focusin(evtType: focusin, handler: SpecificEventListener[focusin]): Unit = js.native
    @JSName("listen")
    def listen_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_focusout(evtType: focusout, handler: SpecificEventListener[focusout]): Unit = js.native
    @JSName("listen")
    def listen_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_formdata(evtType: formdata, handler: SpecificEventListener[formdata]): Unit = js.native
    @JSName("listen")
    def listen_formdata(evtType: formdata, handler: SpecificEventListener[formdata], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_formdata(evtType: formdata, handler: SpecificEventListener[formdata], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture]): Unit = js.native
    @JSName("listen")
    def listen_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_gotpointercapture(
      evtType: gotpointercapture,
      handler: SpecificEventListener[gotpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_input(evtType: input, handler: SpecificEventListener[input]): Unit = js.native
    @JSName("listen")
    def listen_input(evtType: input, handler: SpecificEventListener[input], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_input(evtType: input, handler: SpecificEventListener[input], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_invalid(evtType: invalid, handler: SpecificEventListener[invalid]): Unit = js.native
    @JSName("listen")
    def listen_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_keydown(evtType: keydown, handler: SpecificEventListener[keydown]): Unit = js.native
    @JSName("listen")
    def listen_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_keypress(evtType: keypress, handler: SpecificEventListener[keypress]): Unit = js.native
    @JSName("listen")
    def listen_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_keyup(evtType: keyup, handler: SpecificEventListener[keyup]): Unit = js.native
    @JSName("listen")
    def listen_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_load(evtType: load, handler: SpecificEventListener[load]): Unit = js.native
    @JSName("listen")
    def listen_load(evtType: load, handler: SpecificEventListener[load], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_load(evtType: load, handler: SpecificEventListener[load], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata]): Unit = js.native
    @JSName("listen")
    def listen_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata]): Unit = js.native
    @JSName("listen")
    def listen_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_loadedmetadata(
      evtType: loadedmetadata,
      handler: SpecificEventListener[loadedmetadata],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart]): Unit = js.native
    @JSName("listen")
    def listen_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture]): Unit = js.native
    @JSName("listen")
    def listen_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_lostpointercapture(
      evtType: lostpointercapture,
      handler: SpecificEventListener[lostpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown]): Unit = js.native
    @JSName("listen")
    def listen_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter]): Unit = js.native
    @JSName("listen")
    def listen_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave]): Unit = js.native
    @JSName("listen")
    def listen_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove]): Unit = js.native
    @JSName("listen")
    def listen_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout]): Unit = js.native
    @JSName("listen")
    def listen_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover]): Unit = js.native
    @JSName("listen")
    def listen_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup]): Unit = js.native
    @JSName("listen")
    def listen_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_pause(evtType: pause, handler: SpecificEventListener[pause]): Unit = js.native
    @JSName("listen")
    def listen_pause(evtType: pause, handler: SpecificEventListener[pause], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pause(evtType: pause, handler: SpecificEventListener[pause], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_play(evtType: play, handler: SpecificEventListener[play]): Unit = js.native
    @JSName("listen")
    def listen_play(evtType: play, handler: SpecificEventListener[play], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_play(evtType: play, handler: SpecificEventListener[play], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_playing(evtType: playing, handler: SpecificEventListener[playing]): Unit = js.native
    @JSName("listen")
    def listen_playing(evtType: playing, handler: SpecificEventListener[playing], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_playing(evtType: playing, handler: SpecificEventListener[playing], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel]): Unit = js.native
    @JSName("listen")
    def listen_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointercancel(
      evtType: pointercancel,
      handler: SpecificEventListener[pointercancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown]): Unit = js.native
    @JSName("listen")
    def listen_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerdown(
      evtType: pointerdown,
      handler: SpecificEventListener[pointerdown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter]): Unit = js.native
    @JSName("listen")
    def listen_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerenter(
      evtType: pointerenter,
      handler: SpecificEventListener[pointerenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave]): Unit = js.native
    @JSName("listen")
    def listen_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerleave(
      evtType: pointerleave,
      handler: SpecificEventListener[pointerleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove]): Unit = js.native
    @JSName("listen")
    def listen_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointermove(
      evtType: pointermove,
      handler: SpecificEventListener[pointermove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout]): Unit = js.native
    @JSName("listen")
    def listen_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover]): Unit = js.native
    @JSName("listen")
    def listen_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerover(
      evtType: pointerover,
      handler: SpecificEventListener[pointerover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup]): Unit = js.native
    @JSName("listen")
    def listen_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_progress(evtType: progress, handler: SpecificEventListener[progress]): Unit = js.native
    @JSName("listen")
    def listen_progress(evtType: progress, handler: SpecificEventListener[progress], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_progress(evtType: progress, handler: SpecificEventListener[progress], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange]): Unit = js.native
    @JSName("listen")
    def listen_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_reset(evtType: reset, handler: SpecificEventListener[reset]): Unit = js.native
    @JSName("listen")
    def listen_reset(evtType: reset, handler: SpecificEventListener[reset], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_reset(evtType: reset, handler: SpecificEventListener[reset], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_resize(evtType: resize, handler: SpecificEventListener[resize]): Unit = js.native
    @JSName("listen")
    def listen_resize(evtType: resize, handler: SpecificEventListener[resize], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_resize(evtType: resize, handler: SpecificEventListener[resize], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_scroll(evtType: scroll, handler: SpecificEventListener[scroll]): Unit = js.native
    @JSName("listen")
    def listen_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(evtType: securitypolicyviolation, handler: SpecificEventListener[securitypolicyviolation]): Unit = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: Boolean
    ): Unit = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_seeked(evtType: seeked, handler: SpecificEventListener[seeked]): Unit = js.native
    @JSName("listen")
    def listen_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_seeking(evtType: seeking, handler: SpecificEventListener[seeking]): Unit = js.native
    @JSName("listen")
    def listen_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_select(evtType: select, handler: SpecificEventListener[select]): Unit = js.native
    @JSName("listen")
    def listen_select(evtType: select, handler: SpecificEventListener[select], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_select(evtType: select, handler: SpecificEventListener[select], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange]): Unit = js.native
    @JSName("listen")
    def listen_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_selectionchange(
      evtType: selectionchange,
      handler: SpecificEventListener[selectionchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart]): Unit = js.native
    @JSName("listen")
    def listen_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_selectstart(
      evtType: selectstart,
      handler: SpecificEventListener[selectstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange]): Unit = js.native
    @JSName("listen")
    def listen_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_stalled(evtType: stalled, handler: SpecificEventListener[stalled]): Unit = js.native
    @JSName("listen")
    def listen_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_submit(evtType: submit, handler: SpecificEventListener[submit]): Unit = js.native
    @JSName("listen")
    def listen_submit(evtType: submit, handler: SpecificEventListener[submit], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_submit(evtType: submit, handler: SpecificEventListener[submit], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_suspend(evtType: suspend, handler: SpecificEventListener[suspend]): Unit = js.native
    @JSName("listen")
    def listen_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate]): Unit = js.native
    @JSName("listen")
    def listen_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_toggle(evtType: toggle, handler: SpecificEventListener[toggle]): Unit = js.native
    @JSName("listen")
    def listen_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel]): Unit = js.native
    @JSName("listen")
    def listen_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchcancel(
      evtType: touchcancel,
      handler: SpecificEventListener[touchcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_touchend(evtType: touchend, handler: SpecificEventListener[touchend]): Unit = js.native
    @JSName("listen")
    def listen_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove]): Unit = js.native
    @JSName("listen")
    def listen_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart]): Unit = js.native
    @JSName("listen")
    def listen_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel]): Unit = js.native
    @JSName("listen")
    def listen_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitioncancel(
      evtType: transitioncancel,
      handler: SpecificEventListener[transitioncancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend]): Unit = js.native
    @JSName("listen")
    def listen_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitionend(
      evtType: transitionend,
      handler: SpecificEventListener[transitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun]): Unit = js.native
    @JSName("listen")
    def listen_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitionrun(
      evtType: transitionrun,
      handler: SpecificEventListener[transitionrun],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart]): Unit = js.native
    @JSName("listen")
    def listen_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitionstart(
      evtType: transitionstart,
      handler: SpecificEventListener[transitionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange]): Unit = js.native
    @JSName("listen")
    def listen_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_volumechange(
      evtType: volumechange,
      handler: SpecificEventListener[volumechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_waiting(evtType: waiting, handler: SpecificEventListener[waiting]): Unit = js.native
    @JSName("listen")
    def listen_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationend(evtType: webkitanimationend, handler: SpecificEventListener[webkitanimationend]): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationend(evtType: webkitanimationend, handler: SpecificEventListener[webkitanimationend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationend(
      evtType: webkitanimationend,
      handler: SpecificEventListener[webkitanimationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationiteration(evtType: webkitanimationiteration, handler: SpecificEventListener[webkitanimationiteration]): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationiteration(
      evtType: webkitanimationiteration,
      handler: SpecificEventListener[webkitanimationiteration],
      options: Boolean
    ): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationiteration(
      evtType: webkitanimationiteration,
      handler: SpecificEventListener[webkitanimationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationstart(evtType: webkitanimationstart, handler: SpecificEventListener[webkitanimationstart]): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationstart(
      evtType: webkitanimationstart,
      handler: SpecificEventListener[webkitanimationstart],
      options: Boolean
    ): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationstart(
      evtType: webkitanimationstart,
      handler: SpecificEventListener[webkitanimationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_webkittransitionend(evtType: webkittransitionend, handler: SpecificEventListener[webkittransitionend]): Unit = js.native
    @JSName("listen")
    def listen_webkittransitionend(
      evtType: webkittransitionend,
      handler: SpecificEventListener[webkittransitionend],
      options: Boolean
    ): Unit = js.native
    @JSName("listen")
    def listen_webkittransitionend(
      evtType: webkittransitionend,
      handler: SpecificEventListener[webkittransitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_wheel(evtType: wheel, handler: SpecificEventListener[wheel]): Unit = js.native
    @JSName("listen")
    def listen_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: AddEventListenerOptions): Unit = js.native
    
    var root: Element = js.native
    
    def unlisten[E /* <: Event */](evtType: String, handler: CustomEventListener[E]): Unit = js.native
    def unlisten[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: Boolean): Unit = js.native
    def unlisten[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: AddEventListenerOptions): Unit = js.native
    /**
      * Wrapper method to remove an event listener to the component's root element. This is most useful when
      * unlistening for custom events.
      */
    @JSName("unlisten")
    def unlisten_abort(evtType: abort, handler: SpecificEventListener[abort]): Unit = js.native
    @JSName("unlisten")
    def unlisten_abort(evtType: abort, handler: SpecificEventListener[abort], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_abort(evtType: abort, handler: SpecificEventListener[abort], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationcancel(
      evtType: animationcancel,
      handler: SpecificEventListener[animationcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationend(evtType: animationend, handler: SpecificEventListener[animationend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationend(evtType: animationend, handler: SpecificEventListener[animationend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationend(
      evtType: animationend,
      handler: SpecificEventListener[animationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationiteration(
      evtType: animationiteration,
      handler: SpecificEventListener[animationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationstart(
      evtType: animationstart,
      handler: SpecificEventListener[animationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick]): Unit = js.native
    @JSName("unlisten")
    def unlisten_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_beforeinput(evtType: beforeinput, handler: SpecificEventListener[beforeinput]): Unit = js.native
    @JSName("unlisten")
    def unlisten_beforeinput(evtType: beforeinput, handler: SpecificEventListener[beforeinput], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_beforeinput(
      evtType: beforeinput,
      handler: SpecificEventListener[beforeinput],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_blur(evtType: blur, handler: SpecificEventListener[blur]): Unit = js.native
    @JSName("unlisten")
    def unlisten_blur(evtType: blur, handler: SpecificEventListener[blur], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_blur(evtType: blur, handler: SpecificEventListener[blur], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplay(evtType: canplay, handler: SpecificEventListener[canplay]): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough]): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplaythrough(
      evtType: canplaythrough,
      handler: SpecificEventListener[canplaythrough],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_change(evtType: change, handler: SpecificEventListener[change]): Unit = js.native
    @JSName("unlisten")
    def unlisten_change(evtType: change, handler: SpecificEventListener[change], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_change(evtType: change, handler: SpecificEventListener[change], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_click(evtType: click, handler: SpecificEventListener[click]): Unit = js.native
    @JSName("unlisten")
    def unlisten_click(evtType: click, handler: SpecificEventListener[click], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_click(evtType: click, handler: SpecificEventListener[click], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_close(evtType: close, handler: SpecificEventListener[close]): Unit = js.native
    @JSName("unlisten")
    def unlisten_close(evtType: close, handler: SpecificEventListener[close], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_close(evtType: close, handler: SpecificEventListener[close], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionend(evtType: compositionend, handler: SpecificEventListener[compositionend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionend(evtType: compositionend, handler: SpecificEventListener[compositionend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionend(
      evtType: compositionend,
      handler: SpecificEventListener[compositionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionstart(evtType: compositionstart, handler: SpecificEventListener[compositionstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionstart(evtType: compositionstart, handler: SpecificEventListener[compositionstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionstart(
      evtType: compositionstart,
      handler: SpecificEventListener[compositionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionupdate(evtType: compositionupdate, handler: SpecificEventListener[compositionupdate]): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionupdate(evtType: compositionupdate, handler: SpecificEventListener[compositionupdate], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionupdate(
      evtType: compositionupdate,
      handler: SpecificEventListener[compositionupdate],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu]): Unit = js.native
    @JSName("unlisten")
    def unlisten_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_contextmenu(
      evtType: contextmenu,
      handler: SpecificEventListener[contextmenu],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_drag(evtType: drag, handler: SpecificEventListener[drag]): Unit = js.native
    @JSName("unlisten")
    def unlisten_drag(evtType: drag, handler: SpecificEventListener[drag], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_drag(evtType: drag, handler: SpecificEventListener[drag], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragend(evtType: dragend, handler: SpecificEventListener[dragend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragover(evtType: dragover, handler: SpecificEventListener[dragover]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_drop(evtType: drop, handler: SpecificEventListener[drop]): Unit = js.native
    @JSName("unlisten")
    def unlisten_drop(evtType: drop, handler: SpecificEventListener[drop], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_drop(evtType: drop, handler: SpecificEventListener[drop], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_durationchange(
      evtType: durationchange,
      handler: SpecificEventListener[durationchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_emptied(evtType: emptied, handler: SpecificEventListener[emptied]): Unit = js.native
    @JSName("unlisten")
    def unlisten_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_ended(evtType: ended, handler: SpecificEventListener[ended]): Unit = js.native
    @JSName("unlisten")
    def unlisten_ended(evtType: ended, handler: SpecificEventListener[ended], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_ended(evtType: ended, handler: SpecificEventListener[ended], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_error(evtType: error, handler: SpecificEventListener[error]): Unit = js.native
    @JSName("unlisten")
    def unlisten_error(evtType: error, handler: SpecificEventListener[error], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_error(evtType: error, handler: SpecificEventListener[error], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_focus(evtType: focus, handler: SpecificEventListener[focus]): Unit = js.native
    @JSName("unlisten")
    def unlisten_focus(evtType: focus, handler: SpecificEventListener[focus], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_focus(evtType: focus, handler: SpecificEventListener[focus], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusin(evtType: focusin, handler: SpecificEventListener[focusin]): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusout(evtType: focusout, handler: SpecificEventListener[focusout]): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_formdata(evtType: formdata, handler: SpecificEventListener[formdata]): Unit = js.native
    @JSName("unlisten")
    def unlisten_formdata(evtType: formdata, handler: SpecificEventListener[formdata], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_formdata(evtType: formdata, handler: SpecificEventListener[formdata], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture]): Unit = js.native
    @JSName("unlisten")
    def unlisten_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_gotpointercapture(
      evtType: gotpointercapture,
      handler: SpecificEventListener[gotpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_input(evtType: input, handler: SpecificEventListener[input]): Unit = js.native
    @JSName("unlisten")
    def unlisten_input(evtType: input, handler: SpecificEventListener[input], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_input(evtType: input, handler: SpecificEventListener[input], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_invalid(evtType: invalid, handler: SpecificEventListener[invalid]): Unit = js.native
    @JSName("unlisten")
    def unlisten_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_keydown(evtType: keydown, handler: SpecificEventListener[keydown]): Unit = js.native
    @JSName("unlisten")
    def unlisten_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_keypress(evtType: keypress, handler: SpecificEventListener[keypress]): Unit = js.native
    @JSName("unlisten")
    def unlisten_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_keyup(evtType: keyup, handler: SpecificEventListener[keyup]): Unit = js.native
    @JSName("unlisten")
    def unlisten_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_load(evtType: load, handler: SpecificEventListener[load]): Unit = js.native
    @JSName("unlisten")
    def unlisten_load(evtType: load, handler: SpecificEventListener[load], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_load(evtType: load, handler: SpecificEventListener[load], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata]): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata]): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadedmetadata(
      evtType: loadedmetadata,
      handler: SpecificEventListener[loadedmetadata],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture]): Unit = js.native
    @JSName("unlisten")
    def unlisten_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_lostpointercapture(
      evtType: lostpointercapture,
      handler: SpecificEventListener[lostpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_pause(evtType: pause, handler: SpecificEventListener[pause]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pause(evtType: pause, handler: SpecificEventListener[pause], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pause(evtType: pause, handler: SpecificEventListener[pause], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_play(evtType: play, handler: SpecificEventListener[play]): Unit = js.native
    @JSName("unlisten")
    def unlisten_play(evtType: play, handler: SpecificEventListener[play], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_play(evtType: play, handler: SpecificEventListener[play], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_playing(evtType: playing, handler: SpecificEventListener[playing]): Unit = js.native
    @JSName("unlisten")
    def unlisten_playing(evtType: playing, handler: SpecificEventListener[playing], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_playing(evtType: playing, handler: SpecificEventListener[playing], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointercancel(
      evtType: pointercancel,
      handler: SpecificEventListener[pointercancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerdown(
      evtType: pointerdown,
      handler: SpecificEventListener[pointerdown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerenter(
      evtType: pointerenter,
      handler: SpecificEventListener[pointerenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerleave(
      evtType: pointerleave,
      handler: SpecificEventListener[pointerleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointermove(
      evtType: pointermove,
      handler: SpecificEventListener[pointermove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerover(
      evtType: pointerover,
      handler: SpecificEventListener[pointerover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_progress(evtType: progress, handler: SpecificEventListener[progress]): Unit = js.native
    @JSName("unlisten")
    def unlisten_progress(evtType: progress, handler: SpecificEventListener[progress], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_progress(evtType: progress, handler: SpecificEventListener[progress], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_reset(evtType: reset, handler: SpecificEventListener[reset]): Unit = js.native
    @JSName("unlisten")
    def unlisten_reset(evtType: reset, handler: SpecificEventListener[reset], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_reset(evtType: reset, handler: SpecificEventListener[reset], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_resize(evtType: resize, handler: SpecificEventListener[resize]): Unit = js.native
    @JSName("unlisten")
    def unlisten_resize(evtType: resize, handler: SpecificEventListener[resize], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_resize(evtType: resize, handler: SpecificEventListener[resize], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_scroll(evtType: scroll, handler: SpecificEventListener[scroll]): Unit = js.native
    @JSName("unlisten")
    def unlisten_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_securitypolicyviolation(evtType: securitypolicyviolation, handler: SpecificEventListener[securitypolicyviolation]): Unit = js.native
    @JSName("unlisten")
    def unlisten_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: Boolean
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeked(evtType: seeked, handler: SpecificEventListener[seeked]): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeking(evtType: seeking, handler: SpecificEventListener[seeking]): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_select(evtType: select, handler: SpecificEventListener[select]): Unit = js.native
    @JSName("unlisten")
    def unlisten_select(evtType: select, handler: SpecificEventListener[select], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_select(evtType: select, handler: SpecificEventListener[select], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectionchange(
      evtType: selectionchange,
      handler: SpecificEventListener[selectionchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectstart(
      evtType: selectstart,
      handler: SpecificEventListener[selectstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_stalled(evtType: stalled, handler: SpecificEventListener[stalled]): Unit = js.native
    @JSName("unlisten")
    def unlisten_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_submit(evtType: submit, handler: SpecificEventListener[submit]): Unit = js.native
    @JSName("unlisten")
    def unlisten_submit(evtType: submit, handler: SpecificEventListener[submit], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_submit(evtType: submit, handler: SpecificEventListener[submit], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_suspend(evtType: suspend, handler: SpecificEventListener[suspend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate]): Unit = js.native
    @JSName("unlisten")
    def unlisten_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_toggle(evtType: toggle, handler: SpecificEventListener[toggle]): Unit = js.native
    @JSName("unlisten")
    def unlisten_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchcancel(
      evtType: touchcancel,
      handler: SpecificEventListener[touchcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchend(evtType: touchend, handler: SpecificEventListener[touchend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitioncancel(
      evtType: transitioncancel,
      handler: SpecificEventListener[transitioncancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionend(
      evtType: transitionend,
      handler: SpecificEventListener[transitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionrun(
      evtType: transitionrun,
      handler: SpecificEventListener[transitionrun],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionstart(
      evtType: transitionstart,
      handler: SpecificEventListener[transitionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_volumechange(
      evtType: volumechange,
      handler: SpecificEventListener[volumechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_waiting(evtType: waiting, handler: SpecificEventListener[waiting]): Unit = js.native
    @JSName("unlisten")
    def unlisten_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationend(evtType: webkitanimationend, handler: SpecificEventListener[webkitanimationend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationend(evtType: webkitanimationend, handler: SpecificEventListener[webkitanimationend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationend(
      evtType: webkitanimationend,
      handler: SpecificEventListener[webkitanimationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationiteration(evtType: webkitanimationiteration, handler: SpecificEventListener[webkitanimationiteration]): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationiteration(
      evtType: webkitanimationiteration,
      handler: SpecificEventListener[webkitanimationiteration],
      options: Boolean
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationiteration(
      evtType: webkitanimationiteration,
      handler: SpecificEventListener[webkitanimationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationstart(evtType: webkitanimationstart, handler: SpecificEventListener[webkitanimationstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationstart(
      evtType: webkitanimationstart,
      handler: SpecificEventListener[webkitanimationstart],
      options: Boolean
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationstart(
      evtType: webkitanimationstart,
      handler: SpecificEventListener[webkitanimationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkittransitionend(evtType: webkittransitionend, handler: SpecificEventListener[webkittransitionend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkittransitionend(
      evtType: webkittransitionend,
      handler: SpecificEventListener[webkittransitionend],
      options: Boolean
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkittransitionend(
      evtType: webkittransitionend,
      handler: SpecificEventListener[webkittransitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_wheel(evtType: wheel, handler: SpecificEventListener[wheel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: AddEventListenerOptions): Unit = js.native
  }
  /* static members */
  object MDCComponent {
    
    @JSImport("@material/base/component", "MDCComponent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): MDCComponent[MDCFoundation[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCComponent[MDCFoundation[js.Object]]]
  }
}

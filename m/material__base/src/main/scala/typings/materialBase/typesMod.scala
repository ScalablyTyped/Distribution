package typings.materialBase

import org.scalablytyped.runtime.Instantiable1
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Constructor[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
  
  type CustomEventListener[E /* <: Event */] = js.Function1[/* evt */ E, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialBase.materialBaseStrings.abort
    - typings.materialBase.materialBaseStrings.animationcancel
    - typings.materialBase.materialBaseStrings.animationend
    - typings.materialBase.materialBaseStrings.animationiteration
    - typings.materialBase.materialBaseStrings.animationstart
    - typings.materialBase.materialBaseStrings.auxclick
    - typings.materialBase.materialBaseStrings.beforeinput
    - typings.materialBase.materialBaseStrings.blur
    - typings.materialBase.materialBaseStrings.cancel
    - typings.materialBase.materialBaseStrings.canplay
    - typings.materialBase.materialBaseStrings.canplaythrough
    - typings.materialBase.materialBaseStrings.change
    - typings.materialBase.materialBaseStrings.click
    - typings.materialBase.materialBaseStrings.close
    - typings.materialBase.materialBaseStrings.compositionend
    - typings.materialBase.materialBaseStrings.compositionstart
    - typings.materialBase.materialBaseStrings.compositionupdate
    - typings.materialBase.materialBaseStrings.contextmenu
    - typings.materialBase.materialBaseStrings.copy
    - typings.materialBase.materialBaseStrings.cuechange
    - typings.materialBase.materialBaseStrings.cut
    - typings.materialBase.materialBaseStrings.dblclick
    - typings.materialBase.materialBaseStrings.drag
    - typings.materialBase.materialBaseStrings.dragend
    - typings.materialBase.materialBaseStrings.dragenter
    - typings.materialBase.materialBaseStrings.dragleave
    - typings.materialBase.materialBaseStrings.dragover
    - typings.materialBase.materialBaseStrings.dragstart
    - typings.materialBase.materialBaseStrings.drop
    - typings.materialBase.materialBaseStrings.durationchange
    - typings.materialBase.materialBaseStrings.emptied
    - typings.materialBase.materialBaseStrings.ended
    - typings.materialBase.materialBaseStrings.error
    - typings.materialBase.materialBaseStrings.focus
    - typings.materialBase.materialBaseStrings.focusin
    - typings.materialBase.materialBaseStrings.focusout
    - typings.materialBase.materialBaseStrings.formdata
    - typings.materialBase.materialBaseStrings.gotpointercapture
    - typings.materialBase.materialBaseStrings.input
    - typings.materialBase.materialBaseStrings.invalid
    - typings.materialBase.materialBaseStrings.keydown
    - typings.materialBase.materialBaseStrings.keypress
    - typings.materialBase.materialBaseStrings.keyup
    - typings.materialBase.materialBaseStrings.load
    - typings.materialBase.materialBaseStrings.loadeddata
    - typings.materialBase.materialBaseStrings.loadedmetadata
    - typings.materialBase.materialBaseStrings.loadstart
    - typings.materialBase.materialBaseStrings.lostpointercapture
    - typings.materialBase.materialBaseStrings.mousedown
    - typings.materialBase.materialBaseStrings.mouseenter
    - typings.materialBase.materialBaseStrings.mouseleave
    - typings.materialBase.materialBaseStrings.mousemove
    - typings.materialBase.materialBaseStrings.mouseout
    - typings.materialBase.materialBaseStrings.mouseover
    - typings.materialBase.materialBaseStrings.mouseup
    - typings.materialBase.materialBaseStrings.paste
    - typings.materialBase.materialBaseStrings.pause
    - typings.materialBase.materialBaseStrings.play
    - typings.materialBase.materialBaseStrings.playing
    - typings.materialBase.materialBaseStrings.pointercancel
    - typings.materialBase.materialBaseStrings.pointerdown
    - typings.materialBase.materialBaseStrings.pointerenter
    - typings.materialBase.materialBaseStrings.pointerleave
    - typings.materialBase.materialBaseStrings.pointermove
    - typings.materialBase.materialBaseStrings.pointerout
    - typings.materialBase.materialBaseStrings.pointerover
    - typings.materialBase.materialBaseStrings.pointerup
    - typings.materialBase.materialBaseStrings.progress
    - typings.materialBase.materialBaseStrings.ratechange
    - typings.materialBase.materialBaseStrings.reset
    - typings.materialBase.materialBaseStrings.resize
    - typings.materialBase.materialBaseStrings.scroll
    - typings.materialBase.materialBaseStrings.securitypolicyviolation
    - typings.materialBase.materialBaseStrings.seeked
    - typings.materialBase.materialBaseStrings.seeking
    - typings.materialBase.materialBaseStrings.select
    - typings.materialBase.materialBaseStrings.selectionchange
    - typings.materialBase.materialBaseStrings.selectstart
    - typings.materialBase.materialBaseStrings.slotchange
    - typings.materialBase.materialBaseStrings.stalled
    - typings.materialBase.materialBaseStrings.submit
    - typings.materialBase.materialBaseStrings.suspend
    - typings.materialBase.materialBaseStrings.timeupdate
    - typings.materialBase.materialBaseStrings.toggle
    - typings.materialBase.materialBaseStrings.touchcancel
    - typings.materialBase.materialBaseStrings.touchend
    - typings.materialBase.materialBaseStrings.touchmove
    - typings.materialBase.materialBaseStrings.touchstart
    - typings.materialBase.materialBaseStrings.transitioncancel
    - typings.materialBase.materialBaseStrings.transitionend
    - typings.materialBase.materialBaseStrings.transitionrun
    - typings.materialBase.materialBaseStrings.transitionstart
    - typings.materialBase.materialBaseStrings.volumechange
    - typings.materialBase.materialBaseStrings.waiting
    - typings.materialBase.materialBaseStrings.webkitanimationend
    - typings.materialBase.materialBaseStrings.webkitanimationiteration
    - typings.materialBase.materialBaseStrings.webkitanimationstart
    - typings.materialBase.materialBaseStrings.webkittransitionend
    - typings.materialBase.materialBaseStrings.wheel
  */
  trait EventType extends StObject
  
  type SpecificEventListener[K /* <: EventType */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.GlobalEventHandlersEventMap[K] */ /* evt */ js.Any, 
    Unit
  ]
  
  type SpecificWindowEventListener[K /* <: WindowEventType */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.WindowEventMap[K] */ /* evt */ js.Any, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialBase.materialBaseStrings.DOMContentLoaded
    - typings.materialBase.materialBaseStrings.devicemotion
    - typings.materialBase.materialBaseStrings.deviceorientation
    - typings.materialBase.materialBaseStrings.gamepadconnected
    - typings.materialBase.materialBaseStrings.gamepaddisconnected
    - typings.materialBase.materialBaseStrings.orientationchange
  */
  trait WindowEventType extends StObject
}

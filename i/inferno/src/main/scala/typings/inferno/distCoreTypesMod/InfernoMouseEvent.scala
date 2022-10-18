package typings.inferno.distCoreTypesMod

import typings.std.EventTarget
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.std.UIEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined detail, which, view, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent
- typings.std.MouseEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined x, metaKey, shiftKey, screenY, y, altKey, offsetX, clientY, pageY, screenX, ctrlKey, movementY, movementX, buttons, button, offsetY, pageX, clientX, relatedTarget, getModifierState, initMouseEvent, initMouseEvent */ @js.native
trait InfernoMouseEvent[T]
  extends StObject
     with SemiSyntheticEvent[T] {
  
  /* standard dom */
  val altKey: Boolean = js.native
  
  /* standard dom */
  val button: Double = js.native
  
  /* standard dom */
  val buttons: Double = js.native
  
  /* standard dom */
  val clientX: Double = js.native
  
  /* standard dom */
  val clientY: Double = js.native
  
  /* standard dom */
  val ctrlKey: Boolean = js.native
  
  /* standard dom */
  val detail: Double = js.native
  
  /* standard dom */
  def getModifierState(keyArg: String): Boolean = js.native
  
  /** @deprecated */
  /* standard dom */
  def initMouseEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double
  ): Unit = js.native
  def initMouseEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double,
    relatedTargetArg: EventTarget
  ): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def initUIEvent(typeArg: String): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: Null, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: Unit, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: Window): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: Window, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: Null, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: Unit, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: Window): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: Window, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: Null, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: Unit, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: Window): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: Window, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Null, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Unit, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Window): Unit = js.native
  def initUIEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Window, detailArg: Double): Unit = js.native
  
  /* standard dom */
  val metaKey: Boolean = js.native
  
  /* standard dom */
  val movementX: Double = js.native
  
  /* standard dom */
  val movementY: Double = js.native
  
  /* standard dom */
  val offsetX: Double = js.native
  
  /* standard dom */
  val offsetY: Double = js.native
  
  /* standard dom */
  val pageX: Double = js.native
  
  /* standard dom */
  val pageY: Double = js.native
  
  /* standard dom */
  val relatedTarget: EventTarget | Null = js.native
  
  /* standard dom */
  val screenX: Double = js.native
  
  /* standard dom */
  val screenY: Double = js.native
  
  /* standard dom */
  val shiftKey: Boolean = js.native
  
  /* standard dom */
  val view: Window | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  val which: Double = js.native
  
  /* standard dom */
  val x: Double = js.native
  
  /* standard dom */
  val y: Double = js.native
}

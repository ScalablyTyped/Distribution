package typings.inferno.typesMod

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.std.UIEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined detail, which, view, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent
- typings.std.KeyboardEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined metaKey, DOM_KEY_LOCATION_LEFT, shiftKey, key, altKey, keyCode, charCode, repeat, DOM_KEY_LOCATION_NUMPAD, ctrlKey, location, isComposing, DOM_KEY_LOCATION_RIGHT, DOM_KEY_LOCATION_STANDARD, code, getModifierState, initKeyboardEvent */ @js.native
trait InfernoKeyboardEvent[T]
  extends StObject
     with SemiSyntheticEvent[T] {
  
  /* standard dom */
  val DOM_KEY_LOCATION_LEFT: Double = js.native
  
  /* standard dom */
  val DOM_KEY_LOCATION_NUMPAD: Double = js.native
  
  /* standard dom */
  val DOM_KEY_LOCATION_RIGHT: Double = js.native
  
  /* standard dom */
  val DOM_KEY_LOCATION_STANDARD: Double = js.native
  
  /* standard dom */
  val altKey: Boolean = js.native
  
  /** @deprecated */
  /* standard dom */
  val charCode: Double = js.native
  
  /* standard dom */
  val code: String = js.native
  
  /* standard dom */
  val ctrlKey: Boolean = js.native
  
  /* standard dom */
  val detail: Double = js.native
  
  /* standard dom */
  def getModifierState(keyArg: String): Boolean = js.native
  
  /** @deprecated */
  /* standard dom */
  def initKeyboardEvent(
    typeArg: String,
    bubblesArg: js.UndefOr[Boolean],
    cancelableArg: js.UndefOr[Boolean],
    viewArg: js.UndefOr[Window | Null],
    keyArg: js.UndefOr[String],
    locationArg: js.UndefOr[Double],
    ctrlKey: js.UndefOr[Boolean],
    altKey: js.UndefOr[Boolean],
    shiftKey: js.UndefOr[Boolean],
    metaKey: js.UndefOr[Boolean]
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
  val isComposing: Boolean = js.native
  
  /* standard dom */
  val key: String = js.native
  
  /** @deprecated */
  /* standard dom */
  val keyCode: Double = js.native
  
  /* standard dom */
  val location: Double = js.native
  
  /* standard dom */
  val metaKey: Boolean = js.native
  
  /* standard dom */
  val repeat: Boolean = js.native
  
  /* standard dom */
  val shiftKey: Boolean = js.native
  
  /* standard dom */
  val view: Window | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  val which: Double = js.native
}

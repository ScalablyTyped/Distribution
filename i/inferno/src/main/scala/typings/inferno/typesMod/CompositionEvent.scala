package typings.inferno.typesMod

import typings.std.Window
import typings.std.WindowProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.std.UIEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined detail, which, view, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent, initUIEvent
- typings.std.CompositionEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined data, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent, initCompositionEvent */ @js.native
trait CompositionEvent[T]
  extends StObject
     with SemiSyntheticEvent[T] {
  
  /* standard dom */
  val data: String = js.native
  
  /* standard dom */
  val detail: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  def initCompositionEvent(typeArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Boolean): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: Null, dataArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: Unit, dataArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Boolean, viewArg: WindowProxy): Unit = js.native
  def initCompositionEvent(
    typeArg: String,
    bubblesArg: Boolean,
    cancelableArg: Boolean,
    viewArg: WindowProxy,
    dataArg: String
  ): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: Null, dataArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: Unit, dataArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: WindowProxy): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Boolean, cancelableArg: Unit, viewArg: WindowProxy, dataArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: Null, dataArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: Unit, dataArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: WindowProxy): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Boolean, viewArg: WindowProxy, dataArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Null, dataArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Unit, dataArg: String): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: WindowProxy): Unit = js.native
  def initCompositionEvent(typeArg: String, bubblesArg: Unit, cancelableArg: Unit, viewArg: WindowProxy, dataArg: String): Unit = js.native
  
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
  val view: Window | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  val which: Double = js.native
}

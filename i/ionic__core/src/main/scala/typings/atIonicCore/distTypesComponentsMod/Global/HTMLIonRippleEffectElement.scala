package typings.atIonicCore.distTypesComponentsMod.Global

import org.scalablytyped.runtime.Instantiable0
import typings.atIonicCore.atIonicCoreStrings.bounded
import typings.atIonicCore.atIonicCoreStrings.unbounded
import typings.atIonicCore.distTypesComponentsMod.ComponentsNs.IonRippleEffect
import typings.atIonicCore.distTypesStencilDotCoreMod.HTMLStencilElement
import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIonRippleEffectElement
  extends HTMLStencilElement
     with IonRippleEffect {
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * 
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * 
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * 
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * 
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    * 
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
}

@JSGlobal("HTMLIonRippleEffectElement")
@js.native
class HTMLIonRippleEffectElementCls () extends HTMLIonRippleEffectElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /* CompleteClass */
  override var innerHTML: String = js.native
  /* CompleteClass */
  override var inputMode: String = js.native
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /**
    * Sets the type of ripple-effect:  - `bounded`: the ripple effect expands from the user's click position - `unbounded`: the ripple effect expands from the center of the button and overflows the container.  NOTE: Surfaces for bounded ripples should have the overflow property set to hidden, while surfaces for unbounded ripples should have it set to visible.
    */
  /* CompleteClass */
  override var `type`: bounded | unbounded = js.native
  /**
    * Adds the ripple effect to the parent element.
    * @param x The horizontal coordinate of where the ripple should start.
    * @param y The vertical coordinate of where the ripple should start.
    */
  /* CompleteClass */
  override def addRipple(x: Double, y: Double): js.Promise[js.Function0[Unit]] = js.native
}

@JSGlobal("HTMLIonRippleEffectElement")
@js.native
object HTMLIonRippleEffectElement extends Instantiable0[HTMLIonRippleEffectElement]


package typings.atIonicCore.distTypesComponentsMod.Global

import org.scalablytyped.runtime.Instantiable0
import typings.atIonicCore.distTypesComponentsMod.ComponentsNs.IonRange
import typings.atIonicCore.distTypesComponentsRangeRangeDashInterfaceMod.RangeValue
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
trait HTMLIonRangeElement
  extends HTMLStencilElement
     with IonRange {
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * The options argument sets listener-specific options. For compatibility this can be a
    * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
    * be removed.
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

@JSGlobal("HTMLIonRangeElement")
@js.native
class HTMLIonRangeElementCls () extends HTMLIonRangeElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value.
    */
  /* CompleteClass */
  override var debounce: Double = js.native
  /**
    * If `true`, the user cannot interact with the range.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  /**
    * Show two knobs.
    */
  /* CompleteClass */
  override var dualKnobs: Boolean = js.native
  /* CompleteClass */
  override var innerHTML: String = js.native
  /* CompleteClass */
  override var inputMode: String = js.native
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  /**
    * Maximum integer value of the range.
    */
  /* CompleteClass */
  override var max: Double = js.native
  /**
    * Minimum integer value of the range.
    */
  /* CompleteClass */
  override var min: Double = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  /* CompleteClass */
  override var pin: Boolean = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  /* CompleteClass */
  override var snaps: Boolean = js.native
  /**
    * Specifies the value granularity.
    */
  /* CompleteClass */
  override var step: Double = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  /* CompleteClass */
  override var ticks: Boolean = js.native
  /**
    * the value of the range.
    */
  /* CompleteClass */
  override var value: RangeValue = js.native
}

@JSGlobal("HTMLIonRangeElement")
@js.native
object HTMLIonRangeElement extends Instantiable0[HTMLIonRangeElement]


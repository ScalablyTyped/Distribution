package typings.ionicCore.componentsMod.global

import typings.ionicCore.rangeInterfaceMod.RangeValue
import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLSlotElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("HTMLIonRangeElement")
@js.native
class HTMLIonRangeElementCls ()
  extends StObject
     with HTMLIonRangeElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  
  /* CompleteClass */
  var contentEditable: String = js.native
  
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  /* CompleteClass */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the range.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /**
    * Show two knobs.
    */
  /* CompleteClass */
  var dualKnobs: Boolean = js.native
  
  /* CompleteClass */
  var enterKeyHint: String = js.native
  
  /* CompleteClass */
  var innerHTML: String = js.native
  
  /* CompleteClass */
  var inputMode: String = js.native
  
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  
  /**
    * Maximum integer value of the range.
    */
  /* CompleteClass */
  var max: Double = js.native
  
  /**
    * Minimum integer value of the range.
    */
  /* CompleteClass */
  var min: Double = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  /* CompleteClass */
  var pin: Boolean = js.native
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  /* CompleteClass */
  var snaps: Boolean = js.native
  
  /**
    * Specifies the value granularity.
    */
  /* CompleteClass */
  var step: Double = js.native
  
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  /* CompleteClass */
  var ticks: Boolean = js.native
  
  /**
    * the value of the range.
    */
  /* CompleteClass */
  var value: RangeValue = js.native
}

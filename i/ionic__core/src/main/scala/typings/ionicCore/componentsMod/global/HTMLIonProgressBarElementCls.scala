package typings.ionicCore.componentsMod.global

import typings.ionicCore.ionicCoreStrings.determinate
import typings.ionicCore.ionicCoreStrings.indeterminate
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
@JSGlobal("HTMLIonProgressBarElement")
@js.native
class HTMLIonProgressBarElementCls ()
  extends StObject
     with HTMLIonProgressBarElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  
  /**
    * If the buffer and value are smaller than 1, the buffer circles will show. The buffer should be between [0, 1].
    */
  /* CompleteClass */
  var buffer: Double = js.native
  
  /* CompleteClass */
  var contentEditable: String = js.native
  
  /* CompleteClass */
  var enterKeyHint: String = js.native
  
  /* CompleteClass */
  var innerHTML: String = js.native
  
  /* CompleteClass */
  var inputMode: String = js.native
  
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
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * If true, reverse the progress bar direction.
    */
  /* CompleteClass */
  var reversed: Boolean = js.native
  
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  
  /**
    * The state of the progress bar, based on if the time the process takes is known or not. Default options are: `"determinate"` (no animation), `"indeterminate"` (animate from left to right).
    */
  /* CompleteClass */
  var `type`: determinate | indeterminate = js.native
  
  /**
    * The value determines how much of the active bar should display when the `type` is `"determinate"`. The value should be between [0, 1].
    */
  /* CompleteClass */
  var value: Double = js.native
}

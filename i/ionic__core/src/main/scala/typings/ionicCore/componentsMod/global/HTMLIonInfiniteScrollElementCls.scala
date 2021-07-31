package typings.ionicCore.componentsMod.global

import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.top
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
@JSGlobal("HTMLIonInfiniteScrollElement")
@js.native
class HTMLIonInfiniteScrollElementCls ()
  extends StObject
     with HTMLIonInfiniteScrollElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  
  /**
    * Call `complete()` within the `ionInfinite` output event handler when your async operation has completed. For example, the `loading` state is while the app is performing an asynchronous operation, such as receiving more data from an AJAX request to add more items to a data list. Once the data has been received and UI updated, you then call this method to signify that the loading has completed. This method will change the infinite scroll's state from `loading` to `enabled`.
    */
  /* CompleteClass */
  override def complete(): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  var contentEditable: String = js.native
  
  /**
    * If `true`, the infinite scroll will be hidden and scroll event listeners will be removed.  Set this to true to disable the infinite scroll from actively trying to receive new data while scrolling. This is useful when it is known that there is no more data that can be added, and the infinite scroll is no longer needed.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
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
    * The position of the infinite scroll element. The value can be either `top` or `bottom`.
    */
  /* CompleteClass */
  var position: top | bottom = js.native
  
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
  
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  
  /**
    * The threshold distance from the bottom of the content to call the `infinite` output event when scrolled. The threshold value can be either a percent, or in pixels. For example, use the value of `10%` for the `infinite` output event to get called when the user has scrolled 10% from the bottom of the page. Use the value `100px` when the scroll is within 100 pixels from the bottom of the page.
    */
  /* CompleteClass */
  var threshold: String = js.native
}

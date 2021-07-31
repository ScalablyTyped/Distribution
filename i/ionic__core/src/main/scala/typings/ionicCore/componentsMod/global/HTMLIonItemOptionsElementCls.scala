package typings.ionicCore.componentsMod.global

import typings.ionicCore.mod.Side
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
@JSGlobal("HTMLIonItemOptionsElement")
@js.native
class HTMLIonItemOptionsElementCls ()
  extends StObject
     with HTMLIonItemOptionsElement {
  
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
  
  /* CompleteClass */
  var enterKeyHint: String = js.native
  
  /* CompleteClass */
  override def fireSwipeEvent(): js.Promise[Unit] = js.native
  
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
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  /* CompleteClass */
  var side: Side = js.native
  
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

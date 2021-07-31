package typings.ionicCore.componentsMod.global

import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLSlotElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("HTMLIonTextareaElement")
@js.native
class HTMLIonTextareaElementCls ()
  extends StObject
     with HTMLIonTextareaElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  
  /**
    * If `true`, the element height will increase based on the value.
    */
  /* CompleteClass */
  var autoGrow: Boolean = js.native
  
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  /* CompleteClass */
  var autocapitalize: String = js.native
  
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  /* CompleteClass */
  var autofocus: Boolean = js.native
  
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  /* CompleteClass */
  var clearOnEdit: Boolean = js.native
  
  /* CompleteClass */
  var contentEditable: String = js.native
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  /* CompleteClass */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* CompleteClass */
  var enterKeyHint: String = js.native
  
  /**
    * This is required for a WebKit bug which requires us to blur and focus an input to properly focus the input in an item with delegatesFocus. It will no longer be needed with iOS 14.
    */
  /* CompleteClass */
  var fireFocusEvents: Boolean = js.native
  
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[HTMLTextAreaElement] = js.native
  
  /* CompleteClass */
  var innerHTML: String = js.native
  
  /* CompleteClass */
  var inputMode: String = js.native
  
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  
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
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  
  /**
    * If `true`, the user cannot modify the value.
    */
  /* CompleteClass */
  var readonly: Boolean = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  /* CompleteClass */
  var required: Boolean = js.native
  
  /**
    * Sets blur on the native `textarea` in `ion-textarea`. Use this method instead of the global `textarea.blur()`.
    */
  /* CompleteClass */
  override def setBlur(): js.Promise[Unit] = js.native
  
  /**
    * Sets focus on the native `textarea` in `ion-textarea`. Use this method instead of the global `textarea.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  /* CompleteClass */
  var spellcheck: Boolean = js.native
  
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

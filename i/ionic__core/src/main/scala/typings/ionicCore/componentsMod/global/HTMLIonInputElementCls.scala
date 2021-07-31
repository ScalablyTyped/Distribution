package typings.ionicCore.componentsMod.global

import typings.ionicCore.ionicCoreStrings.off
import typings.ionicCore.ionicCoreStrings.on
import typings.ionicCore.mod.AutocompleteTypes
import typings.ionicCore.mod.TextFieldTypes
import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLInputElement
import typings.std.HTMLSlotElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("HTMLIonInputElement")
@js.native
class HTMLIonInputElementCls ()
  extends StObject
     with HTMLIonInputElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  /* CompleteClass */
  var autocapitalize: String = js.native
  
  /**
    * Indicates whether the value of the control can be automatically completed by the browser.
    */
  /* CompleteClass */
  var autocomplete: AutocompleteTypes = js.native
  
  /**
    * Whether auto correction should be enabled when the user is entering/editing the text value.
    */
  /* CompleteClass */
  var autocorrect: on | off = js.native
  
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  /* CompleteClass */
  var autofocus: Boolean = js.native
  
  /**
    * If `true`, a clear icon will appear in the input when there is a value. Clicking it clears the input.
    */
  /* CompleteClass */
  var clearInput: Boolean = js.native
  
  /* CompleteClass */
  var contentEditable: String = js.native
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  /* CompleteClass */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the input.
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
    * Returns the native `<input>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[HTMLInputElement] = js.native
  
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
    * Sets blur on the native `input` in `ion-input`. Use this method instead of the global `input.blur()`.
    */
  /* CompleteClass */
  override def setBlur(): js.Promise[Unit] = js.native
  
  /**
    * Sets focus on the native `input` in `ion-input`. Use this method instead of the global `input.focus()`.
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
  
  /**
    * The type of control to display. The default type is text.
    */
  /* CompleteClass */
  var `type`: TextFieldTypes = js.native
}

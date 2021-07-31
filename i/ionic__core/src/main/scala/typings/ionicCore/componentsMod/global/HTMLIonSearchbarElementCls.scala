package typings.ionicCore.componentsMod.global

import typings.ionicCore.ionicCoreStrings.always
import typings.ionicCore.ionicCoreStrings.email
import typings.ionicCore.ionicCoreStrings.focus
import typings.ionicCore.ionicCoreStrings.never
import typings.ionicCore.ionicCoreStrings.number
import typings.ionicCore.ionicCoreStrings.off
import typings.ionicCore.ionicCoreStrings.on
import typings.ionicCore.ionicCoreStrings.password
import typings.ionicCore.ionicCoreStrings.search
import typings.ionicCore.ionicCoreStrings.tel
import typings.ionicCore.ionicCoreStrings.text
import typings.ionicCore.ionicCoreStrings.url
import typings.ionicCore.mod.AutocompleteTypes
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
@JSGlobal("HTMLIonSearchbarElement")
@js.native
class HTMLIonSearchbarElementCls ()
  extends StObject
     with HTMLIonSearchbarElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /**
    * If `true`, enable searchbar animation.
    */
  /* CompleteClass */
  var animated: Boolean = js.native
  
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  
  /**
    * Set the input's autocomplete property.
    */
  /* CompleteClass */
  var autocomplete: AutocompleteTypes = js.native
  
  /**
    * Set the input's autocorrect property.
    */
  /* CompleteClass */
  var autocorrect: on | off = js.native
  
  /**
    * Set the cancel button icon. Only applies to `md` mode. Defaults to `"arrow-back-sharp"`.
    */
  /* CompleteClass */
  var cancelButtonIcon: String = js.native
  
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  /* CompleteClass */
  var cancelButtonText: String = js.native
  
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
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  /* CompleteClass */
  var placeholder: String = js.native
  
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
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[Unit] = js.native
  
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  /* CompleteClass */
  var showCancelButton: never | focus | always = js.native
  
  /**
    * If `true`, enable spellcheck on the input.
    */
  /* CompleteClass */
  var spellcheck: Boolean = js.native
  
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  
  /**
    * Set the type of the input.
    */
  /* CompleteClass */
  var `type`: text | password | email | number | search | tel | url = js.native
}

package typings.atIonicCore.distTypesComponentsMod.Global

import org.scalablytyped.runtime.Instantiable0
import typings.atIonicCore.atIonicCoreStrings.email
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.atIonicCoreStrings.number
import typings.atIonicCore.atIonicCoreStrings.off
import typings.atIonicCore.atIonicCoreStrings.on
import typings.atIonicCore.atIonicCoreStrings.password
import typings.atIonicCore.atIonicCoreStrings.search
import typings.atIonicCore.atIonicCoreStrings.tel
import typings.atIonicCore.atIonicCoreStrings.text
import typings.atIonicCore.atIonicCoreStrings.url
import typings.atIonicCore.distTypesInterfaceMod.Color
import typings.atIonicCore.distTypesStencilDotCoreMod.HTMLStencilElement
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atIonicCore.distTypesComponentsMod.ComponentsNs.IonSearchbar because var conflicts: spellcheck. Inlined animated, autocomplete, autocorrect, cancelButtonIcon, cancelButtonText, clearIcon, color, debounce, disabled, getInputElement, mode, placeholder, searchIcon, setFocus, showCancelButton, `type`, value */ @js.native
trait HTMLIonSearchbarElement extends HTMLStencilElement {
  /**
    * If `true`, enable searchbar animation.
    */
  var animated: Boolean = js.native
  /**
    * Set the input's autocomplete property.
    */
  var autocomplete: on | off = js.native
  /**
    * Set the input's autocorrect property.
    */
  var autocorrect: on | off = js.native
  /**
    * Set the cancel button icon. Only applies to `md` mode.
    */
  var cancelButtonIcon: String = js.native
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  var cancelButtonText: String = js.native
  /**
    * Set the clear icon. Defaults to `"close-circle"` for `ios` and `"close"` for `md`.
    */
  var clearIcon: js.UndefOr[String] = js.native
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: Double = js.native
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: Boolean = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var placeholder: String = js.native
  /**
    * The icon to use as the search icon.
    */
  var searchIcon: String = js.native
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  var showCancelButton: Boolean | String = js.native
  /**
    * Set the type of the input.
    */
  var `type`: text | password | email | number | search | tel | url = js.native
  /**
    * the value of the searchbar.
    */
  var value: js.UndefOr[String | Null] = js.native
  /**
    * Returns the native `<input>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLInputElement] = js.native
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): js.Promise[Unit] = js.native
}

@JSGlobal("HTMLIonSearchbarElement")
@js.native
class HTMLIonSearchbarElementCls () extends HTMLIonSearchbarElement {
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
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLIonSearchbarElement")
@js.native
object HTMLIonSearchbarElement extends Instantiable0[HTMLIonSearchbarElement]


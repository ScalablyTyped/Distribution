package typings
package atIonicCoreLib.distTypesComponentsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonSearchbar because var conflicts: spellcheck. Inlined animated, autocomplete, autocorrect, cancelButtonIcon, cancelButtonText, clearIcon, color, debounce, disabled, getInputElement, mode, placeholder, searchIcon, setFocus, showCancelButton, `type`, value */ @js.native
trait HTMLIonSearchbarElement
  extends atIonicCoreLib.distTypesStencilDotCoreMod.Global.HTMLStencilElement {
  /**
    * If `true`, enable searchbar animation.
    */
  var animated: scala.Boolean = js.native
  /**
    * Set the input's autocomplete property.
    */
  var autocomplete: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off = js.native
  /**
    * Set the input's autocorrect property.
    */
  var autocorrect: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off = js.native
  /**
    * Set the cancel button icon. Only applies to `md` mode.
    */
  var cancelButtonIcon: java.lang.String = js.native
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  var cancelButtonText: java.lang.String = js.native
  /**
    * Set the clear icon. Defaults to `"close-circle"` for `ios` and `"close"` for `md`.
    */
  var clearIcon: js.UndefOr[java.lang.String] = js.native
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: scala.Double = js.native
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: scala.Boolean = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = js.native
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var placeholder: java.lang.String = js.native
  /**
    * The icon to use as the search icon.
    */
  var searchIcon: java.lang.String = js.native
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  var showCancelButton: scala.Boolean | java.lang.String = js.native
  /**
    * Set the type of the input.
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.text | atIonicCoreLib.atIonicCoreLibStrings.password | atIonicCoreLib.atIonicCoreLibStrings.email | atIonicCoreLib.atIonicCoreLibStrings.number | atIonicCoreLib.atIonicCoreLibStrings.search | atIonicCoreLib.atIonicCoreLibStrings.tel | atIonicCoreLib.atIonicCoreLibStrings.url = js.native
  /**
    * the value of the searchbar.
    */
  var value: js.UndefOr[java.lang.String | scala.Null] = js.native
  /**
    * Returns the native `<input>` element used under the hood.
    */
  def getInputElement(): js.Promise[stdLib.HTMLInputElement] = js.native
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): scala.Unit = js.native
}

@JSGlobal("HTMLIonSearchbarElement")
@js.native
class HTMLIonSearchbarElementCls () extends HTMLIonSearchbarElement {
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLIonSearchbarElement")
@js.native
object HTMLIonSearchbarElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLIonSearchbarElement]


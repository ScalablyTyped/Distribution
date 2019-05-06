package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSearchbar extends js.Object {
  /**
    * If `true`, enable searchbar animation.
    */
  var animated: scala.Boolean
  /**
    * Set the input's autocomplete property.
    */
  var autocomplete: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off
  /**
    * Set the input's autocorrect property.
    */
  var autocorrect: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off
  /**
    * Set the cancel button icon. Only applies to `md` mode.
    */
  var cancelButtonIcon: java.lang.String
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  var cancelButtonText: java.lang.String
  /**
    * Set the clear icon. Defaults to `"close-circle"` for `ios` and `"close"` for `md`.
    */
  var clearIcon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: scala.Double
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var placeholder: java.lang.String
  /**
    * The icon to use as the search icon.
    */
  var searchIcon: java.lang.String
  /**
    * If `true`, show the cancel button.
    */
  var showCancelButton: scala.Boolean
  /**
    * If `true`, enable spellcheck on the input.
    */
  var spellcheck: scala.Boolean
  /**
    * Set the type of the input.
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.text | atIonicCoreLib.atIonicCoreLibStrings.password | atIonicCoreLib.atIonicCoreLibStrings.email | atIonicCoreLib.atIonicCoreLibStrings.number | atIonicCoreLib.atIonicCoreLibStrings.search | atIonicCoreLib.atIonicCoreLibStrings.tel | atIonicCoreLib.atIonicCoreLibStrings.url
  /**
    * the value of the searchbar.
    */
  var value: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Returns the native `<input>` element used under the hood.
    */
  def getInputElement(): js.Promise[stdLib.HTMLInputElement]
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): scala.Unit
}

object IonSearchbar {
  @scala.inline
  def apply(
    animated: scala.Boolean,
    autocomplete: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off,
    autocorrect: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off,
    cancelButtonIcon: java.lang.String,
    cancelButtonText: java.lang.String,
    debounce: scala.Double,
    getInputElement: () => js.Promise[stdLib.HTMLInputElement],
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    placeholder: java.lang.String,
    searchIcon: java.lang.String,
    setFocus: () => scala.Unit,
    showCancelButton: scala.Boolean,
    spellcheck: scala.Boolean,
    `type`: atIonicCoreLib.atIonicCoreLibStrings.text | atIonicCoreLib.atIonicCoreLibStrings.password | atIonicCoreLib.atIonicCoreLibStrings.email | atIonicCoreLib.atIonicCoreLibStrings.number | atIonicCoreLib.atIonicCoreLibStrings.search | atIonicCoreLib.atIonicCoreLibStrings.tel | atIonicCoreLib.atIonicCoreLibStrings.url,
    clearIcon: java.lang.String = null,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    value: java.lang.String = null
  ): IonSearchbar = {
    val __obj = js.Dynamic.literal(animated = animated, autocomplete = autocomplete.asInstanceOf[js.Any], autocorrect = autocorrect.asInstanceOf[js.Any], cancelButtonIcon = cancelButtonIcon, cancelButtonText = cancelButtonText, debounce = debounce, getInputElement = js.Any.fromFunction0(getInputElement), mode = mode, placeholder = placeholder, searchIcon = searchIcon, setFocus = js.Any.fromFunction0(setFocus), showCancelButton = showCancelButton, spellcheck = spellcheck)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon)
    if (color != null) __obj.updateDynamic("color")(color)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonSearchbar]
  }
}


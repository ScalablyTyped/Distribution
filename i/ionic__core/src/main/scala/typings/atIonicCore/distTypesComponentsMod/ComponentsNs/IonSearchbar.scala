package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import typings.atIonicCore.atIonicCoreStrings.decimal
import typings.atIonicCore.atIonicCoreStrings.email
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.atIonicCoreStrings.none
import typings.atIonicCore.atIonicCoreStrings.number
import typings.atIonicCore.atIonicCoreStrings.numeric
import typings.atIonicCore.atIonicCoreStrings.off
import typings.atIonicCore.atIonicCoreStrings.on
import typings.atIonicCore.atIonicCoreStrings.password
import typings.atIonicCore.atIonicCoreStrings.search
import typings.atIonicCore.atIonicCoreStrings.tel
import typings.atIonicCore.atIonicCoreStrings.text
import typings.atIonicCore.atIonicCoreStrings.url
import typings.atIonicCore.distTypesInterfaceMod.Color
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSearchbar extends js.Object {
  /**
    * If `true`, enable searchbar animation.
    */
  var animated: Boolean
  /**
    * Set the input's autocomplete property.
    */
  var autocomplete: on | off
  /**
    * Set the input's autocorrect property.
    */
  var autocorrect: on | off
  /**
    * Set the cancel button icon. Only applies to `md` mode.
    */
  var cancelButtonIcon: String
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  var cancelButtonText: String
  /**
    * Set the clear icon. Defaults to `"close-circle"` for `ios` and `"close"` for `md`.
    */
  var clearIcon: js.UndefOr[String] = js.undefined
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: Double
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: Boolean
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: none | text | tel | url | email | numeric | decimal | search
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var placeholder: String
  /**
    * The icon to use as the search icon.
    */
  var searchIcon: String
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  var showCancelButton: Boolean | String
  /**
    * If `true`, enable spellcheck on the input.
    */
  var spellcheck: Boolean
  /**
    * Set the type of the input.
    */
  var `type`: text | password | email | number | search | tel | url
  /**
    * the value of the searchbar.
    */
  var value: js.UndefOr[String | Null] = js.undefined
  /**
    * Returns the native `<input>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLInputElement]
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): js.Promise[Unit]
}

object IonSearchbar {
  @scala.inline
  def apply(
    animated: Boolean,
    autocomplete: on | off,
    autocorrect: on | off,
    cancelButtonIcon: String,
    cancelButtonText: String,
    debounce: Double,
    disabled: Boolean,
    getInputElement: () => js.Promise[HTMLInputElement],
    inputmode: none | text | tel | url | email | numeric | decimal | search,
    placeholder: String,
    searchIcon: String,
    setFocus: () => js.Promise[Unit],
    showCancelButton: Boolean | String,
    spellcheck: Boolean,
    `type`: text | password | email | number | search | tel | url,
    clearIcon: String = null,
    color: Color = null,
    mode: ios | md = null,
    value: String = null
  ): IonSearchbar = {
    val __obj = js.Dynamic.literal(animated = animated, autocomplete = autocomplete.asInstanceOf[js.Any], autocorrect = autocorrect.asInstanceOf[js.Any], cancelButtonIcon = cancelButtonIcon, cancelButtonText = cancelButtonText, debounce = debounce, disabled = disabled, getInputElement = js.Any.fromFunction0(getInputElement), inputmode = inputmode.asInstanceOf[js.Any], placeholder = placeholder, searchIcon = searchIcon, setFocus = js.Any.fromFunction0(setFocus), showCancelButton = showCancelButton.asInstanceOf[js.Any], spellcheck = spellcheck)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonSearchbar]
  }
}


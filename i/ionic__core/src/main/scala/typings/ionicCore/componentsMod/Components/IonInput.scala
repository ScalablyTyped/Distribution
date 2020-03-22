package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.decimal
import typings.ionicCore.ionicCoreStrings.email
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.none
import typings.ionicCore.ionicCoreStrings.numeric
import typings.ionicCore.ionicCoreStrings.off
import typings.ionicCore.ionicCoreStrings.on
import typings.ionicCore.ionicCoreStrings.search
import typings.ionicCore.ionicCoreStrings.tel
import typings.ionicCore.ionicCoreStrings.text
import typings.ionicCore.ionicCoreStrings.url
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.TextFieldTypes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonInput extends js.Object {
  /**
    * If the value of the type attribute is `"file"`, then this attribute will indicate the types of files that the server accepts, otherwise it will be ignored. The value must be a comma-separated list of unique content type specifiers.
    */
  var accept: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  var autocapitalize: String
  /**
    * Indicates whether the value of the control can be automatically completed by the browser.
    */
  var autocomplete: on | off
  /**
    * Whether auto correction should be enabled when the user is entering/editing the text value.
    */
  var autocorrect: on | off
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: Boolean
  /**
    * If `true`, a clear icon will appear in the input when there is a value. Clicking it clears the input.
    */
  var clearInput: Boolean
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: js.UndefOr[Boolean] = js.undefined
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
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  /**
    * The maximum value, which must not be less than its minimum (min attribute) value.
    */
  var max: js.UndefOr[String] = js.undefined
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
    */
  var maxlength: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value, which must not be greater than its maximum (max attribute) value.
    */
  var min: js.UndefOr[String] = js.undefined
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
    */
  var minlength: js.UndefOr[Double] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * If `true`, the user can enter more than one value. This attribute applies when the type attribute is set to `"email"` or `"file"`, otherwise it is ignored.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String
  /**
    * A regular expression that the value is checked against. The pattern must match the entire value, not just some subset. Use the title attribute to describe the pattern to help the user. This attribute applies when the value of the type attribute is `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, or `"password"`, otherwise it is ignored.
    */
  var pattern: js.UndefOr[String] = js.undefined
  /**
    * Instructional text that shows before the input has a value.
    */
  var placeholder: js.UndefOr[String | Null] = js.undefined
  /**
    * If `true`, the user cannot modify the value.
    */
  var readonly: Boolean
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  var required: Boolean
  /**
    * The initial size of the control. This value is in pixels unless the value of the type attribute is `"text"` or `"password"`, in which case it is an integer number of characters. This attribute applies only when the `type` attribute is set to `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, or `"password"`, otherwise it is ignored.
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  var spellcheck: Boolean
  /**
    * Works with the min and max attributes to limit the increments at which a value can be set. Possible values are: `"any"` or a positive floating point number.
    */
  var step: js.UndefOr[String] = js.undefined
  /**
    * The type of control to display. The default type is text.
    */
  var `type`: TextFieldTypes
  /**
    * The value of the input.
    */
  var value: js.UndefOr[String | Double | Null] = js.undefined
  /**
    * Returns the native `<input>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLInputElement]
  /**
    * Sets focus on the specified `ion-input`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): js.Promise[Unit]
}

object IonInput {
  @scala.inline
  def apply(
    autocapitalize: String,
    autocomplete: on | off,
    autocorrect: on | off,
    autofocus: Boolean,
    clearInput: Boolean,
    debounce: Double,
    disabled: Boolean,
    getInputElement: () => js.Promise[HTMLInputElement],
    name: String,
    readonly: Boolean,
    required: Boolean,
    setFocus: () => js.Promise[Unit],
    spellcheck: Boolean,
    `type`: TextFieldTypes,
    accept: String = null,
    clearOnEdit: js.UndefOr[Boolean] = js.undefined,
    color: Color = null,
    inputmode: none | text | tel | url | email | numeric | decimal | search = null,
    max: String = null,
    maxlength: Int | Double = null,
    min: String = null,
    minlength: Int | Double = null,
    mode: ios | md = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    pattern: String = null,
    placeholder: String = null,
    size: Int | Double = null,
    step: String = null,
    value: String | Double = null
  ): IonInput = {
    val __obj = js.Dynamic.literal(autocapitalize = autocapitalize.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autocorrect = autocorrect.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], clearInput = clearInput.asInstanceOf[js.Any], debounce = debounce.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], getInputElement = js.Any.fromFunction0(getInputElement), name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setFocus = js.Any.fromFunction0(setFocus), spellcheck = spellcheck.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnEdit)) __obj.updateDynamic("clearOnEdit")(clearOnEdit.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonInput]
  }
}


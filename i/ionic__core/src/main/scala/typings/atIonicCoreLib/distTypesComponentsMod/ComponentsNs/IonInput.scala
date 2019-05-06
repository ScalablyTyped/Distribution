package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonInput extends js.Object {
  /**
    * If the value of the type attribute is `"file"`, then this attribute will indicate the types of files that the server accepts, otherwise it will be ignored. The value must be a comma-separated list of unique content type specifiers.
    */
  var accept: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  var autocapitalize: java.lang.String
  /**
    * Indicates whether the value of the control can be automatically completed by the browser.
    */
  var autocomplete: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off
  /**
    * Whether auto correction should be enabled when the user is entering/editing the text value.
    */
  var autocorrect: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: scala.Boolean
  /**
    * If `true`, a clear icon will appear in the input when there is a value. Clicking it clears the input.
    */
  var clearInput: scala.Boolean
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: js.UndefOr[scala.Boolean] = js.undefined
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
    * If `true`, the user cannot interact with the input.
    */
  var disabled: scala.Boolean
  /**
    * A hint to the browser for which keyboard to display. This attribute applies when the value of the type attribute is `"text"`, `"password"`, `"email"`, or `"url"`. Possible values are: `"verbatim"`, `"latin"`, `"latin-name"`, `"latin-prose"`, `"full-width-latin"`, `"kana"`, `"katakana"`, `"numeric"`, `"tel"`, `"email"`, `"url"`.
    */
  var inputmode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum value, which must not be less than its minimum (min attribute) value.
    */
  var max: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
    */
  var maxlength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum value, which must not be greater than its maximum (max attribute) value.
    */
  var min: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
    */
  var minlength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * If `true`, the user can enter more than one value. This attribute applies when the type attribute is set to `"email"` or `"file"`, otherwise it is ignored.
    */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: java.lang.String
  /**
    * A regular expression that the value is checked against. The pattern must match the entire value, not just some subset. Use the title attribute to describe the pattern to help the user. This attribute applies when the value of the type attribute is `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, or `"password"`, otherwise it is ignored.
    */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Instructional text that shows before the input has a value.
    */
  var placeholder: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * If `true`, the user cannot modify the value.
    */
  var readonly: scala.Boolean
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  var required: scala.Boolean
  /**
    * The initial size of the control. This value is in pixels unless the value of the type attribute is `"text"` or `"password"`, in which case it is an integer number of characters. This attribute applies only when the `type` attribute is set to `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, or `"password"`, otherwise it is ignored.
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  var spellcheck: scala.Boolean
  /**
    * Works with the min and max attributes to limit the increments at which a value can be set. Possible values are: `"any"` or a positive floating point number.
    */
  var step: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of control to display. The default type is text.
    */
  var `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextFieldTypes */ js.Any
  /**
    * The value of the input.
    */
  var value: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Returns the native `<input>` element used under the hood.
    */
  def getInputElement(): js.Promise[stdLib.HTMLInputElement]
  /**
    * Sets focus on the specified `ion-input`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): scala.Unit
}

object IonInput {
  @scala.inline
  def apply(
    autocapitalize: java.lang.String,
    autocomplete: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off,
    autocorrect: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off,
    autofocus: scala.Boolean,
    clearInput: scala.Boolean,
    debounce: scala.Double,
    disabled: scala.Boolean,
    getInputElement: () => js.Promise[stdLib.HTMLInputElement],
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    name: java.lang.String,
    readonly: scala.Boolean,
    required: scala.Boolean,
    setFocus: () => scala.Unit,
    spellcheck: scala.Boolean,
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextFieldTypes */ js.Any,
    accept: java.lang.String = null,
    clearOnEdit: js.UndefOr[scala.Boolean] = js.undefined,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    inputmode: java.lang.String = null,
    max: java.lang.String = null,
    maxlength: scala.Int | scala.Double = null,
    min: java.lang.String = null,
    minlength: scala.Int | scala.Double = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: java.lang.String = null,
    placeholder: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    step: java.lang.String = null,
    value: java.lang.String = null
  ): IonInput = {
    val __obj = js.Dynamic.literal(autocapitalize = autocapitalize, autocomplete = autocomplete.asInstanceOf[js.Any], autocorrect = autocorrect.asInstanceOf[js.Any], autofocus = autofocus, clearInput = clearInput, debounce = debounce, disabled = disabled, getInputElement = js.Any.fromFunction0(getInputElement), mode = mode, name = name, readonly = readonly, required = required, setFocus = js.Any.fromFunction0(setFocus), spellcheck = spellcheck)
    __obj.updateDynamic("type")(`type`)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (!js.isUndefined(clearOnEdit)) __obj.updateDynamic("clearOnEdit")(clearOnEdit)
    if (color != null) __obj.updateDynamic("color")(color)
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode)
    if (max != null) __obj.updateDynamic("max")(max)
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min)
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonInput]
  }
}


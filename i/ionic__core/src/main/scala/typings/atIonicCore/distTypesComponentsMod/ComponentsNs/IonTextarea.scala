package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import typings.atIonicCore.atIonicCoreStrings.hard
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.atIonicCoreStrings.off
import typings.atIonicCore.atIonicCoreStrings.soft
import typings.atIonicCore.distTypesInterfaceMod.Color
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTextarea extends js.Object {
  /**
    * If `true`, the element height will increase based on the value.
    */
  var autoGrow: Boolean
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  var autocapitalize: String
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: Boolean
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * The visible width of the text control, in average character widths. If it is specified, it must be a positive integer.
    */
  var cols: js.UndefOr[Double] = js.undefined
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: Double
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  var disabled: Boolean
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
    */
  var maxlength: js.UndefOr[Double] = js.undefined
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
    */
  var minlength: js.UndefOr[Double] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String
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
    * The number of visible text lines for the control.
    */
  var rows: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  var spellcheck: Boolean
  /**
    * The value of the textarea.
    */
  var value: js.UndefOr[String | Null] = js.undefined
  /**
    * Indicates how the control wraps text.
    */
  var wrap: js.UndefOr[hard | soft | off] = js.undefined
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLTextAreaElement]
  /**
    * Sets focus on the specified `ion-textarea`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): js.Promise[Unit]
}

object IonTextarea {
  @scala.inline
  def apply(
    autoGrow: Boolean,
    autocapitalize: String,
    autofocus: Boolean,
    clearOnEdit: Boolean,
    debounce: Double,
    disabled: Boolean,
    getInputElement: () => js.Promise[HTMLTextAreaElement],
    name: String,
    readonly: Boolean,
    required: Boolean,
    setFocus: () => js.Promise[Unit],
    spellcheck: Boolean,
    color: Color = null,
    cols: Int | Double = null,
    maxlength: Int | Double = null,
    minlength: Int | Double = null,
    mode: ios | md = null,
    placeholder: String = null,
    rows: Int | Double = null,
    value: String = null,
    wrap: hard | soft | off = null
  ): IonTextarea = {
    val __obj = js.Dynamic.literal(autoGrow = autoGrow, autocapitalize = autocapitalize, autofocus = autofocus, clearOnEdit = clearOnEdit, debounce = debounce, disabled = disabled, getInputElement = js.Any.fromFunction0(getInputElement), name = name, readonly = readonly, required = required, setFocus = js.Any.fromFunction0(setFocus), spellcheck = spellcheck)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTextarea]
  }
}


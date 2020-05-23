package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.decimal
import typings.ionicCore.ionicCoreStrings.done
import typings.ionicCore.ionicCoreStrings.email
import typings.ionicCore.ionicCoreStrings.enter
import typings.ionicCore.ionicCoreStrings.go
import typings.ionicCore.ionicCoreStrings.hard
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.next
import typings.ionicCore.ionicCoreStrings.none
import typings.ionicCore.ionicCoreStrings.numeric
import typings.ionicCore.ionicCoreStrings.off
import typings.ionicCore.ionicCoreStrings.previous
import typings.ionicCore.ionicCoreStrings.search
import typings.ionicCore.ionicCoreStrings.send
import typings.ionicCore.ionicCoreStrings.soft
import typings.ionicCore.ionicCoreStrings.tel
import typings.ionicCore.ionicCoreStrings.text
import typings.ionicCore.ionicCoreStrings.url
import typings.ionicCore.mod.Color
import typings.ionicCore.textareaInterfaceMod.TextareaChangeEventDetail
import typings.std.CustomEvent
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTextarea extends js.Object {
  /**
    * If `true`, the element height will increase based on the value.
    */
  var autoGrow: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  var autocapitalize: js.UndefOr[String] = js.undefined
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: js.UndefOr[Boolean] = js.undefined
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
  var debounce: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A hint to the browser for which enter key to display. Possible values: `"enter"`, `"done"`, `"go"`, `"next"`, `"previous"`, `"search"`, and `"send"`.
    */
  var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
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
  var name: js.UndefOr[String] = js.undefined
  /**
    * Emitted when the input loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the input value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[TextareaChangeEventDetail], Unit]] = js.undefined
  /**
    * Emitted when the input has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when a keyboard input occurred.
    */
  var onIonInput: js.UndefOr[js.Function1[/* event */ CustomEvent[KeyboardEvent], Unit]] = js.undefined
  /**
    * Instructional text that shows before the input has a value.
    */
  var placeholder: js.UndefOr[String | Null] = js.undefined
  /**
    * If `true`, the user cannot modify the value.
    */
  var readonly: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of visible text lines for the control.
    */
  var rows: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of the textarea.
    */
  var value: js.UndefOr[String | Null] = js.undefined
  /**
    * Indicates how the control wraps text.
    */
  var wrap: js.UndefOr[hard | soft | off] = js.undefined
}

object IonTextarea {
  @scala.inline
  def apply(
    autoGrow: js.UndefOr[Boolean] = js.undefined,
    autocapitalize: String = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    clearOnEdit: js.UndefOr[Boolean] = js.undefined,
    color: Color = null,
    cols: js.UndefOr[Double] = js.undefined,
    debounce: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enterkeyhint: enter | done | go | next | previous | search | send = null,
    inputmode: none | text | tel | url | email | numeric | decimal | search = null,
    maxlength: js.UndefOr[Double] = js.undefined,
    minlength: js.UndefOr[Double] = js.undefined,
    mode: ios | md = null,
    name: String = null,
    onIonBlur: /* event */ CustomEvent[Unit] => Unit = null,
    onIonChange: /* event */ CustomEvent[TextareaChangeEventDetail] => Unit = null,
    onIonFocus: /* event */ CustomEvent[Unit] => Unit = null,
    onIonInput: /* event */ CustomEvent[KeyboardEvent] => Unit = null,
    placeholder: js.UndefOr[Null | String] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Null | String] = js.undefined,
    wrap: hard | soft | off = null
  ): IonTextarea = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoGrow)) __obj.updateDynamic("autoGrow")(autoGrow.get.asInstanceOf[js.Any])
    if (autocapitalize != null) __obj.updateDynamic("autocapitalize")(autocapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnEdit)) __obj.updateDynamic("clearOnEdit")(clearOnEdit.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debounce)) __obj.updateDynamic("debounce")(debounce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (enterkeyhint != null) __obj.updateDynamic("enterkeyhint")(enterkeyhint.asInstanceOf[js.Any])
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode.asInstanceOf[js.Any])
    if (!js.isUndefined(maxlength)) __obj.updateDynamic("maxlength")(maxlength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minlength)) __obj.updateDynamic("minlength")(minlength.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onIonBlur != null) __obj.updateDynamic("onIonBlur")(js.Any.fromFunction1(onIonBlur))
    if (onIonChange != null) __obj.updateDynamic("onIonChange")(js.Any.fromFunction1(onIonChange))
    if (onIonFocus != null) __obj.updateDynamic("onIonFocus")(js.Any.fromFunction1(onIonFocus))
    if (onIonInput != null) __obj.updateDynamic("onIonInput")(js.Any.fromFunction1(onIonInput))
    if (!js.isUndefined(placeholder)) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTextarea]
  }
}


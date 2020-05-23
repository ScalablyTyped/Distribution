package typings.ionicCore.componentsMod.Components

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
    cols: js.UndefOr[Double] = js.undefined,
    enterkeyhint: enter | done | go | next | previous | search | send = null,
    inputmode: none | text | tel | url | email | numeric | decimal | search = null,
    maxlength: js.UndefOr[Double] = js.undefined,
    minlength: js.UndefOr[Double] = js.undefined,
    mode: ios | md = null,
    placeholder: js.UndefOr[Null | String] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Null | String] = js.undefined,
    wrap: hard | soft | off = null
  ): IonTextarea = {
    val __obj = js.Dynamic.literal(autoGrow = autoGrow.asInstanceOf[js.Any], autocapitalize = autocapitalize.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], clearOnEdit = clearOnEdit.asInstanceOf[js.Any], debounce = debounce.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], getInputElement = js.Any.fromFunction0(getInputElement), name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setFocus = js.Any.fromFunction0(setFocus), spellcheck = spellcheck.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (enterkeyhint != null) __obj.updateDynamic("enterkeyhint")(enterkeyhint.asInstanceOf[js.Any])
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode.asInstanceOf[js.Any])
    if (!js.isUndefined(maxlength)) __obj.updateDynamic("maxlength")(maxlength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minlength)) __obj.updateDynamic("minlength")(minlength.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(placeholder)) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTextarea]
  }
}


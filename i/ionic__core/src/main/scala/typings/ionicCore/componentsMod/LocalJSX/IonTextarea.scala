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
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonTextarea extends js.Object {
  /**
    * If `true`, the element height will increase based on the value.
    */
  var autoGrow: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  var autocapitalize: js.UndefOr[String] = js.native
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: js.UndefOr[Boolean] = js.native
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * The visible width of the text control, in average character widths. If it is specified, it must be a positive integer.
    */
  var cols: js.UndefOr[Double] = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: js.UndefOr[Double] = js.native
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * A hint to the browser for which enter key to display. Possible values: `"enter"`, `"done"`, `"go"`, `"next"`, `"previous"`, `"search"`, and `"send"`.
    */
  var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
    */
  var maxlength: js.UndefOr[Double] = js.native
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
    */
  var minlength: js.UndefOr[Double] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Emitted when the input loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[FocusEvent], Unit]] = js.native
  /**
    * Emitted when the input value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[TextareaChangeEventDetail], Unit]] = js.native
  /**
    * Emitted when the input has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[FocusEvent], Unit]] = js.native
  /**
    * Emitted when a keyboard input occurred.
    */
  var onIonInput: js.UndefOr[js.Function1[/* event */ CustomEvent[KeyboardEvent], Unit]] = js.native
  /**
    * Instructional text that shows before the input has a value.
    */
  var placeholder: js.UndefOr[String | Null] = js.native
  /**
    * If `true`, the user cannot modify the value.
    */
  var readonly: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * The number of visible text lines for the control.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  var spellcheck: js.UndefOr[Boolean] = js.native
  /**
    * The value of the textarea.
    */
  var value: js.UndefOr[String | Null] = js.native
  /**
    * Indicates how the control wraps text.
    */
  var wrap: js.UndefOr[hard | soft | off] = js.native
}

object IonTextarea {
  @scala.inline
  def apply(): IonTextarea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonTextarea]
  }
  @scala.inline
  implicit class IonTextareaOps[Self <: IonTextarea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoGrow(value: Boolean): Self = this.set("autoGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGrow: Self = this.set("autoGrow", js.undefined)
    @scala.inline
    def setAutocapitalize(value: String): Self = this.set("autocapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocapitalize: Self = this.set("autocapitalize", js.undefined)
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    @scala.inline
    def setClearOnEdit(value: Boolean): Self = this.set("clearOnEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearOnEdit: Self = this.set("clearOnEdit", js.undefined)
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEnterkeyhint(value: enter | done | go | next | previous | search | send): Self = this.set("enterkeyhint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterkeyhint: Self = this.set("enterkeyhint", js.undefined)
    @scala.inline
    def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputmode: Self = this.set("inputmode", js.undefined)
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    @scala.inline
    def setMinlength(value: Double): Self = this.set("minlength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinlength: Self = this.set("minlength", js.undefined)
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnIonBlur(value: /* event */ CustomEvent[FocusEvent] => Unit): Self = this.set("onIonBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonBlur: Self = this.set("onIonBlur", js.undefined)
    @scala.inline
    def setOnIonChange(value: /* event */ CustomEvent[TextareaChangeEventDetail] => Unit): Self = this.set("onIonChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonChange: Self = this.set("onIonChange", js.undefined)
    @scala.inline
    def setOnIonFocus(value: /* event */ CustomEvent[FocusEvent] => Unit): Self = this.set("onIonFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonFocus: Self = this.set("onIonFocus", js.undefined)
    @scala.inline
    def setOnIonInput(value: /* event */ CustomEvent[KeyboardEvent] => Unit): Self = this.set("onIonInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonInput: Self = this.set("onIonInput", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    @scala.inline
    def setWrap(value: hard | soft | off): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}


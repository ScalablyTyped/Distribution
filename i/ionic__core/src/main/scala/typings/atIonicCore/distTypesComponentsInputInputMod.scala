package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.Color
import typings.atIonicCore.atIonicCoreMod.StyleEventDetail
import typings.atIonicCore.atIonicCoreMod.TextFieldTypes
import typings.atIonicCore.atIonicCoreStrings.decimal
import typings.atIonicCore.atIonicCoreStrings.email
import typings.atIonicCore.atIonicCoreStrings.none
import typings.atIonicCore.atIonicCoreStrings.numeric
import typings.atIonicCore.atIonicCoreStrings.off
import typings.atIonicCore.atIonicCoreStrings.on
import typings.atIonicCore.atIonicCoreStrings.search
import typings.atIonicCore.atIonicCoreStrings.tel
import typings.atIonicCore.atIonicCoreStrings.text
import typings.atIonicCore.atIonicCoreStrings.url
import typings.atIonicCore.distTypesComponentsInputInputDashInterfaceMod.InputChangeEventDetail
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/input/input", JSImport.Namespace)
@js.native
object distTypesComponentsInputInputMod extends js.Object {
  @js.native
  class Input () extends ComponentInterface {
    /**
      * If the value of the type attribute is `"file"`, then this attribute will indicate the types of files that the server accepts, otherwise it will be ignored. The value must be a comma-separated list of unique content type specifiers.
      */
    var accept: js.UndefOr[String] = js.native
    /**
      * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
      */
    var autocapitalize: String = js.native
    /**
      * Indicates whether the value of the control can be automatically completed by the browser.
      */
    var autocomplete: on | off = js.native
    /**
      * Whether auto correction should be enabled when the user is entering/editing the text value.
      */
    var autocorrect: on | off = js.native
    /**
      * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
      */
    var autofocus: Boolean = js.native
    /**
      * If `true`, a clear icon will appear in the input when there is a value. Clicking it clears the input.
      */
    var clearInput: Boolean = js.native
    /**
      * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
      */
    var clearOnEdit: js.UndefOr[Boolean] = js.native
    var clearTextInput: js.Any = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
      */
    var debounce: Double = js.native
    var didBlurAfterEdit: js.Any = js.native
    /**
      * If `true`, the user cannot interact with the input.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    var emitStyle: js.Any = js.native
    var focusChanged: js.Any = js.native
    var getValue: js.Any = js.native
    var hasFocus: Boolean = js.native
    var hasValue: js.Any = js.native
    var inputId: js.Any = js.native
    /**
      * A hint to the browser for which keyboard to display.
      * Possible values: `"none"`, `"text"`, `"tel"`, `"url"`,
      * `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
      */
    var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    /**
      * Emitted when the input loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[InputChangeEventDetail] = js.native
    /**
      * Emitted when the input has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    /**
      * Emitted when a keyboard input ocurred.
      */
    var ionInput: EventEmitter[KeyboardEvent] = js.native
    /**
      * Emitted when the input has been created.
      * @internal
      */
    var ionInputDidLoad: EventEmitter[Unit] = js.native
    /**
      * Emitted when the input has been removed.
      * @internal
      */
    var ionInputDidUnload: EventEmitter[Unit] = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    /**
      * The maximum value, which must not be less than its minimum (min attribute) value.
      */
    var max: js.UndefOr[String] = js.native
    /**
      * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
      */
    var maxlength: js.UndefOr[Double] = js.native
    /**
      * The minimum value, which must not be greater than its maximum (max attribute) value.
      */
    var min: js.UndefOr[String] = js.native
    /**
      * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
      */
    var minlength: js.UndefOr[Double] = js.native
    /**
      * If `true`, the user can enter more than one value. This attribute applies when the type attribute is set to `"email"` or `"file"`, otherwise it is ignored.
      */
    var multiple: js.UndefOr[Boolean] = js.native
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    var nativeInput: js.UndefOr[js.Any] = js.native
    var onBlur: js.Any = js.native
    var onFocus: js.Any = js.native
    var onInput: js.Any = js.native
    var onKeydown: js.Any = js.native
    /**
      * A regular expression that the value is checked against. The pattern must match the entire value, not just some subset. Use the title attribute to describe the pattern to help the user. This attribute applies when the value of the type attribute is `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, or `"password"`, otherwise it is ignored.
      */
    var pattern: js.UndefOr[String] = js.native
    /**
      * Instructional text that shows before the input has a value.
      */
    var placeholder: js.UndefOr[String | Null] = js.native
    /**
      * If `true`, the user cannot modify the value.
      */
    var readonly: Boolean = js.native
    /**
      * If `true`, the user must fill in a value before submitting a form.
      */
    var required: Boolean = js.native
    var shouldClearOnEdit: js.Any = js.native
    /**
      * The initial size of the control. This value is in pixels unless the value of the type attribute is `"text"` or `"password"`, in which case it is an integer number of characters. This attribute applies only when the `type` attribute is set to `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, or `"password"`, otherwise it is ignored.
      */
    var size: js.UndefOr[Double] = js.native
    /**
      * If `true`, the element will have its spelling and grammar checked.
      */
    var spellcheck: Boolean = js.native
    /**
      * Works with the min and max attributes to limit the increments at which a value can be set.
      * Possible values are: `"any"` or a positive floating point number.
      */
    var step: js.UndefOr[String] = js.native
    /**
      * The type of control to display. The default type is text.
      */
    var `type`: TextFieldTypes = js.native
    /**
      * The value of the input.
      */
    var value: js.UndefOr[String | Null] = js.native
    @JSName("connectedCallback")
    def connectedCallback_MInput(): Unit = js.native
    /* protected */ def debounceChanged(): Unit = js.native
    /* protected */ def disabledChanged(): Unit = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MInput(): Unit = js.native
    /**
      * Returns the native `<input>` element used under the hood.
      */
    def getInputElement(): js.Promise[HTMLInputElement] = js.native
    @JSName("render")
    def render_MInput(): js.Any = js.native
    /**
      * Sets focus on the specified `ion-input`. Use this method instead of the global
      * `input.focus()`.
      */
    def setFocus(): js.Promise[Unit] = js.native
    /**
      * Update the native input element when the value changes
      */
    /* protected */ def valueChanged(): Unit = js.native
  }
  
}


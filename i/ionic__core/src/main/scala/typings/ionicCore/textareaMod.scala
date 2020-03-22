package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.hard
import typings.ionicCore.ionicCoreStrings.off
import typings.ionicCore.ionicCoreStrings.soft
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.stencilCoreMod.ComponentInterface
import typings.ionicCore.stencilCoreMod.EventEmitter
import typings.ionicCore.textareaInterfaceMod.TextareaChangeEventDetail
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/textarea/textarea", JSImport.Namespace)
@js.native
object textareaMod extends js.Object {
  @js.native
  class Textarea () extends ComponentInterface {
    /**
      * If `true`, the element height will increase based on the value.
      */
    var autoGrow: Boolean = js.native
    /**
      * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
      */
    var autocapitalize: String = js.native
    /**
      * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
      */
    var autofocus: Boolean = js.native
    /**
      * Check if we need to clear the text input if clearOnEdit is enabled
      */
    var checkClearOnEdit: js.Any = js.native
    /**
      * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
      */
    var clearOnEdit: Boolean = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * The visible width of the text control, in average character widths. If it is specified, it must be a positive integer.
      */
    var cols: js.UndefOr[Double] = js.native
    /**
      * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
      */
    var debounce: Double = js.native
    var didBlurAfterEdit: js.Any = js.native
    /**
      * If `true`, the user cannot interact with the textarea.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    var emitStyle: js.Any = js.native
    var focusChange: js.Any = js.native
    var getValue: js.Any = js.native
    var hasFocus: Boolean = js.native
    var hasValue: js.Any = js.native
    var inputId: js.Any = js.native
    /**
      * Emitted when the input loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    /**
      * Emitted when the input value has changed.
      */
    var ionChange: EventEmitter[TextareaChangeEventDetail] = js.native
    /**
      * Emitted when the input has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    /**
      * Emitted when a keyboard input occurred.
      */
    var ionInput: EventEmitter[KeyboardEvent] = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    /**
      * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
      */
    var maxlength: js.UndefOr[Double] = js.native
    /**
      * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
      */
    var minlength: js.UndefOr[Double] = js.native
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    var nativeInput: js.UndefOr[js.Any] = js.native
    var onBlur: js.Any = js.native
    var onFocus: js.Any = js.native
    var onInput: js.Any = js.native
    var onKeyDown: js.Any = js.native
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
    /**
      * The number of visible text lines for the control.
      */
    var rows: js.UndefOr[Double] = js.native
    var runAutoGrow: js.Any = js.native
    /**
      * If `true`, the element will have its spelling and grammar checked.
      */
    var spellcheck: Boolean = js.native
    /**
      * The value of the textarea.
      */
    var value: js.UndefOr[String | Null] = js.native
    /**
      * Indicates how the control wraps text.
      */
    var wrap: js.UndefOr[hard | soft | off] = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MTextarea(): Unit = js.native
    @JSName("connectedCallback")
    def connectedCallback_MTextarea(): Unit = js.native
    /* protected */ def debounceChanged(): Unit = js.native
    /* protected */ def disabledChanged(): Unit = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MTextarea(): Unit = js.native
    /**
      * Returns the native `<textarea>` element used under the hood.
      */
    def getInputElement(): js.Promise[HTMLTextAreaElement] = js.native
    @JSName("render")
    def render_MTextarea(): js.Any = js.native
    /**
      * Sets focus on the specified `ion-textarea`. Use this method instead of the global
      * `input.focus()`.
      */
    def setFocus(): js.Promise[Unit] = js.native
    /**
      * Update the native input element when the value changes
      */
    /* protected */ def valueChanged(): Unit = js.native
  }
  
}


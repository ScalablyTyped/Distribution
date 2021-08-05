package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.decimal
import typings.ionicCore.ionicCoreStrings.done
import typings.ionicCore.ionicCoreStrings.email
import typings.ionicCore.ionicCoreStrings.enter
import typings.ionicCore.ionicCoreStrings.go
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.next
import typings.ionicCore.ionicCoreStrings.none
import typings.ionicCore.ionicCoreStrings.numeric
import typings.ionicCore.ionicCoreStrings.off
import typings.ionicCore.ionicCoreStrings.on
import typings.ionicCore.ionicCoreStrings.previous
import typings.ionicCore.ionicCoreStrings.search
import typings.ionicCore.ionicCoreStrings.send
import typings.ionicCore.ionicCoreStrings.tel
import typings.ionicCore.ionicCoreStrings.text
import typings.ionicCore.ionicCoreStrings.url
import typings.ionicCore.mod.AutocompleteTypes
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.TextFieldTypes
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonInput extends StObject {
  
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
  var autocomplete: AutocompleteTypes
  
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
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  var debounce: Double
  
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: Boolean
  
  /**
    * A hint to the browser for which enter key to display. Possible values: `"enter"`, `"done"`, `"go"`, `"next"`, `"previous"`, `"search"`, and `"send"`.
    */
  var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
  
  /**
    * This is required for a WebKit bug which requires us to blur and focus an input to properly focus the input in an item with delegatesFocus. It will no longer be needed with iOS 14.
    */
  var fireFocusEvents: Boolean
  
  /**
    * Returns the native `<input>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLInputElement]
  
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
    * A regular expression that the value is checked against. The pattern must match the entire value, not just some subset. Use the title attribute to describe the pattern to help the user. This attribute applies when the value of the type attribute is `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, `"date"`, or `"password"`, otherwise it is ignored. When the type attribute is `"date"`, `pattern` will only be used in browsers that do not support the `"date"` input type natively. See https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/date for more information.
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
    * Sets blur on the native `input` in `ion-input`. Use this method instead of the global `input.blur()`.
    */
  def setBlur(): js.Promise[Unit]
  
  /**
    * Sets focus on the native `input` in `ion-input`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): js.Promise[Unit]
  
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
}
object IonInput {
  
  inline def apply(
    autocapitalize: String,
    autocomplete: AutocompleteTypes,
    autocorrect: on | off,
    autofocus: Boolean,
    clearInput: Boolean,
    debounce: Double,
    disabled: Boolean,
    fireFocusEvents: Boolean,
    getInputElement: () => js.Promise[HTMLInputElement],
    name: String,
    readonly: Boolean,
    required: Boolean,
    setBlur: () => js.Promise[Unit],
    setFocus: () => js.Promise[Unit],
    spellcheck: Boolean,
    `type`: TextFieldTypes
  ): IonInput = {
    val __obj = js.Dynamic.literal(autocapitalize = autocapitalize.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autocorrect = autocorrect.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], clearInput = clearInput.asInstanceOf[js.Any], debounce = debounce.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], fireFocusEvents = fireFocusEvents.asInstanceOf[js.Any], getInputElement = js.Any.fromFunction0(getInputElement), name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setBlur = js.Any.fromFunction0(setBlur), setFocus = js.Any.fromFunction0(setFocus), spellcheck = spellcheck.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonInput]
  }
  
  extension [Self <: IonInput](x: Self) {
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setAutocapitalize(value: String): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutocomplete(value: AutocompleteTypes): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocorrect(value: on | off): Self = StObject.set(x, "autocorrect", value.asInstanceOf[js.Any])
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setClearInput(value: Boolean): Self = StObject.set(x, "clearInput", value.asInstanceOf[js.Any])
    
    inline def setClearOnEdit(value: Boolean): Self = StObject.set(x, "clearOnEdit", value.asInstanceOf[js.Any])
    
    inline def setClearOnEditUndefined: Self = StObject.set(x, "clearOnEdit", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setEnterkeyhint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterkeyhint", value.asInstanceOf[js.Any])
    
    inline def setEnterkeyhintUndefined: Self = StObject.set(x, "enterkeyhint", js.undefined)
    
    inline def setFireFocusEvents(value: Boolean): Self = StObject.set(x, "fireFocusEvents", value.asInstanceOf[js.Any])
    
    inline def setGetInputElement(value: () => js.Promise[HTMLInputElement]): Self = StObject.set(x, "getInputElement", js.Any.fromFunction0(value))
    
    inline def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
    
    inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSetBlur(value: () => js.Promise[Unit]): Self = StObject.set(x, "setBlur", js.Any.fromFunction0(value))
    
    inline def setSetFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setType(value: TextFieldTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

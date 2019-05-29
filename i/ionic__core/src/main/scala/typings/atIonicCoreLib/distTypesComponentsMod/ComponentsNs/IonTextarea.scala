package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTextarea extends js.Object {
  /**
    * If `true`, the element height will increase based on the value.
    */
  var autoGrow: scala.Boolean
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  var autocapitalize: java.lang.String
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: scala.Boolean
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: scala.Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * The visible width of the text control, in average character widths. If it is specified, it must be a positive integer.
    */
  var cols: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: scala.Double
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  var disabled: scala.Boolean
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
    */
  var maxlength: js.UndefOr[scala.Double] = js.undefined
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
    */
  var minlength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: java.lang.String
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
    * The number of visible text lines for the control.
    */
  var rows: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  var spellcheck: scala.Boolean
  /**
    * The value of the textarea.
    */
  var value: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Indicates how the control wraps text.
    */
  var wrap: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.hard | atIonicCoreLib.atIonicCoreLibStrings.soft | atIonicCoreLib.atIonicCoreLibStrings.off
  ] = js.undefined
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  def getInputElement(): js.Promise[stdLib.HTMLTextAreaElement]
  /**
    * Sets focus on the specified `ion-textarea`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): scala.Unit
}

object IonTextarea {
  @scala.inline
  def apply(
    autoGrow: scala.Boolean,
    autocapitalize: java.lang.String,
    autofocus: scala.Boolean,
    clearOnEdit: scala.Boolean,
    debounce: scala.Double,
    disabled: scala.Boolean,
    getInputElement: () => js.Promise[stdLib.HTMLTextAreaElement],
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    name: java.lang.String,
    readonly: scala.Boolean,
    required: scala.Boolean,
    setFocus: () => scala.Unit,
    spellcheck: scala.Boolean,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    cols: scala.Int | scala.Double = null,
    maxlength: scala.Int | scala.Double = null,
    minlength: scala.Int | scala.Double = null,
    placeholder: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    value: java.lang.String = null,
    wrap: atIonicCoreLib.atIonicCoreLibStrings.hard | atIonicCoreLib.atIonicCoreLibStrings.soft | atIonicCoreLib.atIonicCoreLibStrings.off = null
  ): IonTextarea = {
    val __obj = js.Dynamic.literal(autoGrow = autoGrow, autocapitalize = autocapitalize, autofocus = autofocus, clearOnEdit = clearOnEdit, debounce = debounce, disabled = disabled, getInputElement = js.Any.fromFunction0(getInputElement), mode = mode, name = name, readonly = readonly, required = required, setFocus = js.Any.fromFunction0(setFocus), spellcheck = spellcheck)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTextarea]
  }
}


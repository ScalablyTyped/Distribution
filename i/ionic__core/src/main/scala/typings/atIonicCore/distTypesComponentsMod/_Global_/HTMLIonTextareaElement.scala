package typings.atIonicCore.distTypesComponentsMod._Global_

import org.scalablytyped.runtime.Instantiable0
import typings.atIonicCore.atIonicCoreStrings.hard
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.atIonicCoreStrings.off
import typings.atIonicCore.atIonicCoreStrings.soft
import typings.atIonicCore.distTypesStencilDotCoreMod.HTMLStencilElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atIonicCore.distTypesComponentsMod.Components.IonTextarea because var conflicts: autocapitalize, spellcheck. Inlined autoGrow, autofocus, clearOnEdit, color, cols, debounce, disabled, getInputElement, maxlength, minlength, mode, name, placeholder, readonly, required, rows, setFocus, value, wrap */ @js.native
trait HTMLIonTextareaElement extends HTMLStencilElement {
  /**
    * If `true`, the element height will increase based on the value.
    */
  var autoGrow: Boolean = js.native
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: Boolean = js.native
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: Boolean = js.native
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.native
  /**
    * The visible width of the text control, in average character widths. If it is specified, it must be a positive integer.
    */
  var cols: js.UndefOr[Double] = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: Double = js.native
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  var disabled: Boolean = js.native
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
  var name: String = js.native
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
  /**
    * The value of the textarea.
    */
  var value: js.UndefOr[String | Null] = js.native
  /**
    * Indicates how the control wraps text.
    */
  var wrap: js.UndefOr[hard | soft | off] = js.native
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLTextAreaElement] = js.native
  /**
    * Sets focus on the specified `ion-textarea`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): js.Promise[Unit] = js.native
}

@JSGlobal("HTMLIonTextareaElement")
@js.native
object HTMLIonTextareaElement extends Instantiable0[HTMLIonTextareaElement]


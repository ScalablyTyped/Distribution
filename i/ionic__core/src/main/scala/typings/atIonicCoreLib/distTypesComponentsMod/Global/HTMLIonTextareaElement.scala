package typings
package atIonicCoreLib.distTypesComponentsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonTextarea because var conflicts: autocapitalize, spellcheck. Inlined autoGrow, autofocus, clearOnEdit, color, cols, debounce, disabled, getInputElement, maxlength, minlength, mode, name, placeholder, readonly, required, rows, setFocus, value, wrap */ @js.native
trait HTMLIonTextareaElement
  extends atIonicCoreLib.distTypesStencilDotCoreMod.Global.HTMLStencilElement {
  /**
    * If `true`, the element height will increase based on the value.
    */
  var autoGrow: scala.Boolean = js.native
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: scala.Boolean = js.native
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: scala.Boolean = js.native
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.native
  /**
    * The visible width of the text control, in average character widths. If it is specified, it must be a positive integer.
    */
  var cols: js.UndefOr[scala.Double] = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: scala.Double = js.native
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  var disabled: scala.Boolean = js.native
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
    */
  var maxlength: js.UndefOr[scala.Double] = js.native
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
    */
  var minlength: js.UndefOr[scala.Double] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: java.lang.String = js.native
  /**
    * Instructional text that shows before the input has a value.
    */
  var placeholder: js.UndefOr[java.lang.String | scala.Null] = js.native
  /**
    * If `true`, the user cannot modify the value.
    */
  var readonly: scala.Boolean = js.native
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  var required: scala.Boolean = js.native
  /**
    * The number of visible text lines for the control.
    */
  var rows: js.UndefOr[scala.Double] = js.native
  /**
    * The value of the textarea.
    */
  var value: js.UndefOr[java.lang.String | scala.Null] = js.native
  /**
    * Indicates how the control wraps text.
    */
  var wrap: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.hard | atIonicCoreLib.atIonicCoreLibStrings.soft | atIonicCoreLib.atIonicCoreLibStrings.off
  ] = js.native
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  def getInputElement(): js.Promise[stdLib.HTMLTextAreaElement] = js.native
  /**
    * Sets focus on the specified `ion-textarea`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): scala.Unit = js.native
}

@JSGlobal("HTMLIonTextareaElement")
@js.native
class HTMLIonTextareaElementCls () extends HTMLIonTextareaElement {
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLIonTextareaElement")
@js.native
object HTMLIonTextareaElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLIonTextareaElement]


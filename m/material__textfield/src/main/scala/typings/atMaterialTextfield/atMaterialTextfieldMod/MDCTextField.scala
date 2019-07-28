package typings.atMaterialTextfield.atMaterialTextfieldMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialFloatingDashLabel.atMaterialFloatingDashLabelMod.MDCFloatingLabel
import typings.atMaterialLineDashRipple.atMaterialLineDashRippleMod.MDCLineRipple
import typings.atMaterialNotchedDashOutline.atMaterialNotchedDashOutlineMod.MDCNotchedOutline
import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.atMaterialRipple.atMaterialRippleMod.MDCRippleFoundation
import typings.atMaterialTextfield.adapterMod.MDCTextFieldAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield", "MDCTextField")
@js.native
class MDCTextField ()
  extends default[MDCTextFieldAdapter, typings.atMaterialTextfield.foundationMod.default] {
  var disabled: Boolean = js.native
  var helperTextContent: String = js.native
  var max: String = js.native
  var maxLength: Double = js.native
  var min: String = js.native
  var minLength: Double = js.native
  var pattern: String = js.native
  var required: Boolean = js.native
  var step: String = js.native
  /**
    * Ideally we would use a 'writeonly' modifier here since this is a setter,
    * but such a thing does not exist.
    * https://github.com/Microsoft/TypeScript/issues/4839
    * https://github.com/Microsoft/TypeScript/issues/21759
    */
  var useNativeValidation: Boolean = js.native
  var valid: Boolean = js.native
  var value: String = js.native
  /**
    * Initiliazes the Text Field's internal state based on the environment's
    * state.
    */
  def initialSyncWithDom(): Unit = js.native
  def initialize(
    rippleFactory: js.UndefOr[js.Function2[/* el */ Element, /* foundation */ MDCRippleFoundation, MDCRipple]],
    lineRippleFactory: js.UndefOr[js.Function1[/* el */ Element, MDCLineRipple]],
    helperTextFactory: js.UndefOr[
      js.Function1[
        /* el */ Element, 
        typings.atMaterialTextfield.helperDashTextMod.MDCTextFieldHelperText
      ]
    ],
    iconFactory: js.UndefOr[
      js.Function1[/* el */ Element, typings.atMaterialTextfield.iconMod.MDCTextFieldIcon]
    ],
    labelFactory: js.UndefOr[js.Function1[/* el */ Element, MDCFloatingLabel]],
    outlineFactory: js.UndefOr[js.Function1[/* el */ Element, MDCNotchedOutline]]
  ): Unit = js.native
  /**
    * Recomputes the outline SVG path for the outline element.
    */
  def layout(): Unit = js.native
}

/* static members */
@JSImport("@material/textfield", "MDCTextField")
@js.native
object MDCTextField extends js.Object {
  def attachTo(root: Element): MDCTextField = js.native
}


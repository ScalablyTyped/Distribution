package typings
package atMaterialTextfieldLib.atMaterialTextfieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield", "MDCTextField")
@js.native
class MDCTextField ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialTextfieldLib.adapterMod.MDCTextFieldAdapter, 
      atMaterialTextfieldLib.foundationMod.default
    ] {
  var disabled: scala.Boolean = js.native
  var helperTextContent: java.lang.String = js.native
  var max: java.lang.String = js.native
  var maxLength: scala.Double = js.native
  var min: java.lang.String = js.native
  var minLength: scala.Double = js.native
  var pattern: java.lang.String = js.native
  var required: scala.Boolean = js.native
  var step: java.lang.String = js.native
  /**
    * Ideally we would use a 'writeonly' modifier here since this is a setter,
    * but such a thing does not exist.
    * https://github.com/Microsoft/TypeScript/issues/4839
    * https://github.com/Microsoft/TypeScript/issues/21759
    */
  var useNativeValidation: scala.Boolean = js.native
  var valid: scala.Boolean = js.native
  var value: java.lang.String = js.native
  /**
    * Initiliazes the Text Field's internal state based on the environment's
    * state.
    */
  def initialSyncWithDom(): scala.Unit = js.native
  def initialize(
    rippleFactory: js.UndefOr[
      js.Function2[
        /* el */ stdLib.Element, 
        /* foundation */ atMaterialRippleLib.atMaterialRippleMod.MDCRippleFoundation, 
        atMaterialRippleLib.atMaterialRippleMod.MDCRipple
      ]
    ],
    lineRippleFactory: js.UndefOr[
      js.Function1[
        /* el */ stdLib.Element, 
        atMaterialLineDashRippleLib.atMaterialLineDashRippleMod.MDCLineRipple
      ]
    ],
    helperTextFactory: js.UndefOr[
      js.Function1[
        /* el */ stdLib.Element, 
        atMaterialTextfieldLib.helperDashTextMod.MDCTextFieldHelperText
      ]
    ],
    iconFactory: js.UndefOr[
      js.Function1[/* el */ stdLib.Element, atMaterialTextfieldLib.iconMod.MDCTextFieldIcon]
    ],
    labelFactory: js.UndefOr[
      js.Function1[
        /* el */ stdLib.Element, 
        atMaterialFloatingDashLabelLib.atMaterialFloatingDashLabelMod.MDCFloatingLabel
      ]
    ],
    outlineFactory: js.UndefOr[
      js.Function1[
        /* el */ stdLib.Element, 
        atMaterialNotchedDashOutlineLib.atMaterialNotchedDashOutlineMod.MDCNotchedOutline
      ]
    ]
  ): scala.Unit = js.native
  /**
    * Recomputes the outline SVG path for the outline element.
    */
  def layout(): scala.Unit = js.native
}

/* static members */
@JSImport("@material/textfield", "MDCTextField")
@js.native
object MDCTextField extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialTextfieldLib.atMaterialTextfieldMod.MDCTextField = js.native
}


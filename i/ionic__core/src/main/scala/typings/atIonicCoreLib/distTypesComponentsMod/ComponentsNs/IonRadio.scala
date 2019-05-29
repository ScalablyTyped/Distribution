package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRadio extends js.Object {
  /**
    * If `true`, the radio is selected.
    */
  var checked: scala.Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * If `true`, the user cannot interact with the radio.
    */
  var disabled: scala.Boolean
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: java.lang.String
  /**
    * the value of the radio.
    */
  var value: js.UndefOr[js.Any | scala.Null] = js.undefined
}

object IonRadio {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    disabled: scala.Boolean,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    name: java.lang.String,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    value: js.Any = null
  ): IonRadio = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, mode = mode, name = name)
    if (color != null) __obj.updateDynamic("color")(color)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonRadio]
  }
}


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
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.undefined
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
    name: java.lang.String,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null,
    value: js.Any = null
  ): IonRadio = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, name = name)
    if (color != null) __obj.updateDynamic("color")(color)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonRadio]
  }
}


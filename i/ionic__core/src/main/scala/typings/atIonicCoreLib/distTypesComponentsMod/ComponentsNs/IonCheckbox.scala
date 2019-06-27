package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonCheckbox extends js.Object {
  /**
    * If `true`, the checkbox is selected.
    */
  var checked: scala.Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * If `true`, the user cannot interact with the checkbox.
    */
  var disabled: scala.Boolean
  /**
    * If `true`, the checkbox will visually appear as indeterminate.
    */
  var indeterminate: scala.Boolean
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
    * The value of the toggle does not mean if it's checked or not, use the `checked` property for that.  The value of a toggle is analogous to the value of a `<input type="checkbox">`, it's only used when the toggle participates in a native `<form>`.
    */
  var value: java.lang.String
}

object IonCheckbox {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    disabled: scala.Boolean,
    indeterminate: scala.Boolean,
    name: java.lang.String,
    value: java.lang.String,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null
  ): IonCheckbox = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, indeterminate = indeterminate, name = name, value = value)
    if (color != null) __obj.updateDynamic("color")(color)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonCheckbox]
  }
}


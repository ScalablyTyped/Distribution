package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesInterfaceMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonCheckbox extends js.Object {
  /**
    * If `true`, the checkbox is selected.
    */
  var checked: Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * If `true`, the user cannot interact with the checkbox.
    */
  var disabled: Boolean
  /**
    * If `true`, the checkbox will visually appear as indeterminate.
    */
  var indeterminate: Boolean
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String
  /**
    * The value of the toggle does not mean if it's checked or not, use the `checked` property for that.  The value of a toggle is analogous to the value of a `<input type="checkbox">`, it's only used when the toggle participates in a native `<form>`.
    */
  var value: String
}

object IonCheckbox {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    indeterminate: Boolean,
    name: String,
    value: String,
    color: Color = null,
    mode: ios | md = null
  ): IonCheckbox = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, indeterminate = indeterminate, name = name, value = value)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonCheckbox]
  }
}


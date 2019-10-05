package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesInterfaceMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonToggle extends js.Object {
  /**
    * If `true`, the toggle is selected.
    */
  var checked: Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * If `true`, the user cannot interact with the toggle.
    */
  var disabled: Boolean
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
  var value: js.UndefOr[String | Null] = js.undefined
}

object IonToggle {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    name: String,
    color: Color = null,
    mode: ios | md = null,
    value: String = null
  ): IonToggle = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, name = name)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonToggle]
  }
}


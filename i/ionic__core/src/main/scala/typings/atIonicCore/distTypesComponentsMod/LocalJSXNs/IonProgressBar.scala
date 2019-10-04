package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.atIonicCoreStrings.determinate
import typings.atIonicCore.atIonicCoreStrings.indeterminate
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesInterfaceMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonProgressBar extends js.Object {
  /**
    * If the buffer and value are smaller than 1, the buffer circles will show. The buffer should be between [0, 1].
    */
  var buffer: js.UndefOr[Double] = js.undefined
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * If true, reverse the progress bar direction.
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  /**
    * The state of the progress bar, based on if the time the process takes is known or not. Default options are: `"determinate"` (no animation), `"indeterminate"` (animate from left to right).
    */
  var `type`: js.UndefOr[determinate | indeterminate] = js.undefined
  /**
    * The value determines how much of the active bar should display when the `type` is `"determinate"`. The value should be between [0, 1].
    */
  var value: js.UndefOr[Double] = js.undefined
}

object IonProgressBar {
  @scala.inline
  def apply(
    buffer: Int | Double = null,
    color: Color = null,
    mode: ios | md = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    `type`: determinate | indeterminate = null,
    value: Int | Double = null
  ): IonProgressBar = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonProgressBar]
  }
}


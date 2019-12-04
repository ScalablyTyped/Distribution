package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.atIonicCoreMod.Color
import typings.atIonicCore.distTypesComponentsSpinnerSpinnerDashConfigsMod.SpinnerTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSpinner extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Duration of the spinner animation in milliseconds. The default varies based on the spinner.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The name of the SVG spinner to use. If a name is not provided, the platform's default spinner will be used.
    */
  var name: js.UndefOr[SpinnerTypes] = js.undefined
  /**
    * If `true`, the spinner's animation will be paused.
    */
  var paused: js.UndefOr[Boolean] = js.undefined
}

object IonSpinner {
  @scala.inline
  def apply(
    color: Color = null,
    duration: Int | Double = null,
    name: SpinnerTypes = null,
    paused: js.UndefOr[Boolean] = js.undefined
  ): IonSpinner = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSpinner]
  }
}


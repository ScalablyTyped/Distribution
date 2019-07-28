package typings.atIonicCore.distTypesComponentsPickerPickerDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerColumnOption extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PickerColumnOption {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    transform: String = null,
    value: js.Any = null
  ): PickerColumnOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (text != null) __obj.updateDynamic("text")(text)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PickerColumnOption]
  }
}


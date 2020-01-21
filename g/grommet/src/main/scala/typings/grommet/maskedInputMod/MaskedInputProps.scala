package typings.grommet.maskedInputMod

import typings.grommet.AnonFixed
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.react.mod.FocusEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputProps extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[js.Array[AnonFixed]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[Element], _]] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object MaskedInputProps {
  @scala.inline
  def apply(
    id: String = null,
    mask: js.Array[AnonFixed] = null,
    name: String = null,
    onBlur: /* event */ FocusEvent[Element] => _ = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | String = null,
    value: String | Double = null
  ): MaskedInputProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedInputProps]
  }
}


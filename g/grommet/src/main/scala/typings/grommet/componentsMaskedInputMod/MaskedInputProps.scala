package typings.grommet.componentsMaskedInputMod

import typings.grommet.Anon_Fixed
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputProps extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[js.Array[Anon_Fixed]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object MaskedInputProps {
  @scala.inline
  def apply(
    id: String = null,
    mask: js.Array[Anon_Fixed] = null,
    name: String = null,
    onBlur: /* repeated */ js.Any => _ = null,
    onChange: /* repeated */ js.Any => _ = null,
    size: small | medium | large | xlarge | String = null,
    value: String = null
  ): MaskedInputProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MaskedInputProps]
  }
}


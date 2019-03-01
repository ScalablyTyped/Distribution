package typings
package grommetLib.componentsMaskedInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputProps extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var mask: js.UndefOr[js.Array[grommetLib.Anon_Fixed]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object MaskedInputProps {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    mask: js.Array[grommetLib.Anon_Fixed] = null,
    name: java.lang.String = null,
    onBlur: js.Function1[/* repeated */ js.Any, _] = null,
    onChange: js.Function1[/* repeated */ js.Any, _] = null,
    size: grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    value: java.lang.String = null
  ): MaskedInputProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MaskedInputProps]
  }
}


package typings.materialUiCore.nativeSelectInputMod

import typings.materialUiCore.AnonNode
import typings.materialUiCore.materialUiCoreStrings.filled
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.standard
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeSelectInputProps extends js.Object {
  var IconComponent: js.UndefOr[ReactType[_]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | AnonNode, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode, Unit]
  ] = js.native
  var value: js.UndefOr[(js.Array[String | Double | Boolean]) | String | Double | Boolean] = js.native
  var variant: js.UndefOr[standard | outlined | filled] = js.native
}

object NativeSelectInputProps {
  @scala.inline
  def apply(
    IconComponent: ReactType[_] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLSelectElement | AnonNode => Unit = null,
    name: String = null,
    onChange: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode) => Unit = null,
    value: (js.Array[String | Double | Boolean]) | String | Double | Boolean = null,
    variant: standard | outlined | filled = null
  ): NativeSelectInputProps = {
    val __obj = js.Dynamic.literal()
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeSelectInputProps]
  }
}


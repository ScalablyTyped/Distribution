package typings.atMaterialDashUiCore.nativeSelectNativeSelectInputMod

import typings.atMaterialDashUiCore.Anon_Node
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeSelectInputProps extends js.Object {
  var IconComponent: js.UndefOr[ReactType[_]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Anon_Node, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode, Unit]
  ] = js.undefined
  var value: js.UndefOr[(js.Array[String | Double | Boolean]) | String | Double | Boolean] = js.undefined
  var variant: js.UndefOr[standard | outlined | filled] = js.undefined
}

object NativeSelectInputProps {
  @scala.inline
  def apply(
    IconComponent: ReactType[_] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLSelectElement | Anon_Node => Unit = null,
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


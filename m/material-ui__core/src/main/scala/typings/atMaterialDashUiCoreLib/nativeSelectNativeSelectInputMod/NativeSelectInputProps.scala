package typings
package atMaterialDashUiCoreLib.nativeSelectNativeSelectInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeSelectInputProps extends js.Object {
  var IconComponent: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputRef: js.UndefOr[
    js.Function1[/* ref */ stdLib.HTMLSelectElement | atMaterialDashUiCoreLib.Anon_Node, scala.Unit]
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLSelectElement], 
      /* child */ reactLib.reactMod.ReactNode, 
      scala.Unit
    ]
  ] = js.undefined
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean
  ] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

object NativeSelectInputProps {
  @scala.inline
  def apply(
    IconComponent: reactLib.reactMod.ReactType[_] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    inputRef: /* ref */ stdLib.HTMLSelectElement | atMaterialDashUiCoreLib.Anon_Node => scala.Unit = null,
    name: java.lang.String = null,
    onChange: (/* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLSelectElement], /* child */ reactLib.reactMod.ReactNode) => scala.Unit = null,
    value: (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled = null
  ): NativeSelectInputProps = {
    val __obj = js.Dynamic.literal()
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeSelectInputProps]
  }
}


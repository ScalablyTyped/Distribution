package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.Anon_Node
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typings.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.NativeSelectInputProps
import typings.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.default
import typings.react.reactMod.ChangeEvent
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: name, disabled, value */
object NativeSelectInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.default].asInstanceOf[String | js.Object]
  def apply(
    IconComponent: ReactComponentClass[_] = null,
    inputRef: /* ref */ HTMLSelectElement | Anon_Node => Unit = null,
    onChange: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit = null,
    variant: standard | outlined | filled = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NativeSelectInputProps
}


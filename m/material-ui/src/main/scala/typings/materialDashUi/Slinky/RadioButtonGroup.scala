package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.materialDashUiStrings.left
import typings.materialDashUi.materialDashUiStrings.right
import typings.materialDashUi.radioButtonRadioButtonGroupMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.SwitchesNs.RadioButtonGroupProps
import typings.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: name, style, className */
object RadioButtonGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.radioButtonRadioButtonGroupMod.default].asInstanceOf[String | js.Object]
  def apply(
    defaultSelected: js.Any = null,
    labelPosition: left | right = null,
    onChange: (/* e */ FormEvent[js.Object], /* selected */ String) => Unit = null,
    valueSelected: js.Any = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (valueSelected != null) __obj.updateDynamic("valueSelected")(valueSelected)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RadioButtonGroupProps
}


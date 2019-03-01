package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonGroupProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultSelected: js.UndefOr[js.Any] = js.undefined
  var labelPosition: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right
  ] = js.undefined
  var name: java.lang.String
  var onChange: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.FormEvent[js.Object], 
      /* selected */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var valueSelected: js.UndefOr[js.Any] = js.undefined
}

object RadioButtonGroupProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    className: java.lang.String = null,
    defaultSelected: js.Any = null,
    labelPosition: materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right = null,
    onChange: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.FormEvent[js.Object], 
      /* selected */ java.lang.String, 
      scala.Unit
    ] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    valueSelected: js.Any = null
  ): RadioButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (style != null) __obj.updateDynamic("style")(style)
    if (valueSelected != null) __obj.updateDynamic("valueSelected")(valueSelected)
    __obj.asInstanceOf[RadioButtonGroupProps]
  }
}


package typings
package atMaterialDashUiCoreLib.radiogroupRadioGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/FormGroup.FormGroupProps, 'classes' | 'onChange'> ]: @material-ui/core.@material-ui/core/FormGroup.FormGroupProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/FormGroup.FormGroupProps, @material-ui/core.@material-ui/core/RadioGroup/RadioGroup.RadioGroupClassKey, 'onChange'>) */ trait RadioGroupProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[RadioGroupClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* value */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RadioGroupProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[RadioGroupClassKey]] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    name: java.lang.String = null,
    onChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* value */ java.lang.String, 
      scala.Unit
    ] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: java.lang.String = null
  ): RadioGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioGroupProps]
  }
}


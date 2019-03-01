package typings
package atMaterialDashUiCoreLib.circularprogressCircularProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/CircularProgress/CircularProgress.CircularProgressClassKey, never>) */ trait CircularProgressProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[CircularProgressClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit
  ] = js.undefined
  var disableShrink: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var thickness: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.determinate | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.indeterminate | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.static
  ] = js.undefined
}

object CircularProgressProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[CircularProgressClassKey]
    ] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit = null,
    disableShrink: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    size: scala.Double | java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    thickness: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.determinate | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.indeterminate | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.static = null
  ): CircularProgressProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disableShrink)) __obj.updateDynamic("disableShrink")(disableShrink)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularProgressProps]
  }
}


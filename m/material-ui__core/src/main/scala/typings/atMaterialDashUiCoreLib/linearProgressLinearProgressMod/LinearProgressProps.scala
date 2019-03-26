package typings
package atMaterialDashUiCoreLib.linearProgressLinearProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.React.HTMLAttributes<std.HTMLDivElement>[P]} */ trait LinearProgressProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[LinearProgressClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary
  ] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var valueBuffer: js.UndefOr[scala.Double] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.determinate | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.indeterminate | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.buffer | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.query
  ] = js.undefined
}

object LinearProgressProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[LinearProgressClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: scala.Int | scala.Double = null,
    valueBuffer: scala.Int | scala.Double = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.determinate | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.indeterminate | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.buffer | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.query = null
  ): LinearProgressProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueBuffer != null) __obj.updateDynamic("valueBuffer")(valueBuffer.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearProgressProps]
  }
}


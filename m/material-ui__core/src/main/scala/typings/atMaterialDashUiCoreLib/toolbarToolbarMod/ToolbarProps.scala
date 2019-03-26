package typings
package atMaterialDashUiCoreLib.toolbarToolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.React.HTMLAttributes<std.HTMLDivElement>[P]} */ trait ToolbarProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ToolbarClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var disableGutters: js.UndefOr[scala.Boolean] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.regular | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dense
  ] = js.undefined
}

object ToolbarProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ToolbarClassKey]] = null,
    disableGutters: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.regular | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dense = null
  ): ToolbarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableGutters)) __obj.updateDynamic("disableGutters")(disableGutters)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarProps]
  }
}


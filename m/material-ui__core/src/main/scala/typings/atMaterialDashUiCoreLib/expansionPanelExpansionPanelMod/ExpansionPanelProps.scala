package typings
package atMaterialDashUiCoreLib.expansionPanelExpansionPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Paper/Paper.PaperProps, 'classes' | 'onChange'> ]: @material-ui/core.@material-ui/core/Paper/Paper.PaperProps[P]} */ trait ExpansionPanelProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ExpansionPanelClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var CollapseProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.collapseCollapseMod.CollapseProps]] = js.undefined
  var defaultExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* expanded */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
}

object ExpansionPanelProps {
  @scala.inline
  def apply(
    CollapseProps: stdLib.Partial[atMaterialDashUiCoreLib.collapseCollapseMod.CollapseProps] = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ExpansionPanelClassKey]] = null,
    defaultExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    onChange: (/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], /* expanded */ scala.Boolean) => scala.Unit = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ExpansionPanelProps = {
    val __obj = js.Dynamic.literal()
    if (CollapseProps != null) __obj.updateDynamic("CollapseProps")(CollapseProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(defaultExpanded)) __obj.updateDynamic("defaultExpanded")(defaultExpanded)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ExpansionPanelProps]
  }
}


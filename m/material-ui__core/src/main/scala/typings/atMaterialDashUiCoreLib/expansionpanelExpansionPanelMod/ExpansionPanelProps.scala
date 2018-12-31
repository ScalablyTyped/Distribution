package typings
package atMaterialDashUiCoreLib.expansionpanelExpansionPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<@material-ui/core.@material-ui/core/Paper.PaperProps, std.Exclude<keyof @material-ui/core.@material-ui/core/Paper.PaperProps, 'classes' | 'onChange'>>, @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Paper.PaperProps, @material-ui/core.@material-ui/core/ExpansionPanel/ExpansionPanel.ExpansionPanelClassKey, 'onChange'>) */ trait ExpansionPanelProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ExpansionPanelClassKey] {
  var CollapseProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.collapseCollapseMod.CollapseProps]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
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
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}


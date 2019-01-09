package typings
package atMaterialDashUiLabLib.togglebuttongroupToggleButtonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | 'onChange'> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]} */ trait ToggleButtonGroupProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ToggleButtonGroupClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}


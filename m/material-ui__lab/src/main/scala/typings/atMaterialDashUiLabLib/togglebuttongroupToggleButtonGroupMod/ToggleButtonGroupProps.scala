package typings
package atMaterialDashUiLabLib.togglebuttongroupToggleButtonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick) */ 
trait ToggleButtonGroupProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ToggleButtonGroupClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}


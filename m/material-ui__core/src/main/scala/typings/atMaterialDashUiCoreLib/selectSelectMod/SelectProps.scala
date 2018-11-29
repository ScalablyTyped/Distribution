package typings
package atMaterialDashUiCoreLib.selectSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 4 members from Set(std.Pick, @material-ui/core.@material-ui/core.StandardProps) */ 
trait SelectProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SelectClassKey] {
  var IconComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var MenuProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.menuMenuMod.MenuProps]] = js.undefined
  var SelectDisplayProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]] = js.undefined
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var displayEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var input: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var native: js.UndefOr[scala.Boolean] = js.undefined
  var onClose: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var onOpen: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var renderValue: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[
        (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
      ], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
  ] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

